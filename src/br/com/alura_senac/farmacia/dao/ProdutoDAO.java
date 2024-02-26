package br.com.alura_senac.farmacia.dao;

import br.com.alura_senac.farmacia.modelo.Produto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;

public class ProdutoDAO
{
    private Connection conn;
    public ProdutoDAO(Connection connection)
    {
        this.conn = connection;
    }

    public void salvar(Produto produto)
    {
        String sql = "INSERT INTO produto (id, preco, nome, fabricante)" + "VALUES (?, ?, ?, ?)";

        try
        {
            PreparedStatement preparedStatement = conn.prepareStatement(sql);

            preparedStatement.setInt(1, produto.getId());
            preparedStatement.setFloat(2, produto.getPreco());
            preparedStatement.setString(3, produto.getNome());
            preparedStatement.setString(4, produto.getFabricante());

            preparedStatement.execute();
        }

        catch (SQLException e)
        {
            throw new RuntimeException(e);
        }
    }

    public Set<Produto> listar()
    {
        Set<Produto> produtos = new HashSet<>();

        String sql = "SELECT * FROM produto";

        try
        {
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet resultSet = ps.executeQuery();

            while (resultSet.next())
            {
                Float preco = resultSet.getFloat(2);
                String nome = resultSet.getString(3);
                String fabricante = resultSet.getString(4);

                produtos.add(new Produto(preco, nome, fabricante));
            }
        }
        catch (SQLException e)
        {
            throw new RuntimeException(e);
        }

        return produtos;
    }
}
