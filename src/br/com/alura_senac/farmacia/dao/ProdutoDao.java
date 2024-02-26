package br.com.alura_senac.farmacia.dao;

import br.com.alura_senac.farmacia.modelo.Produto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ProdutoDao
{
    private Connection conn;
    public ProdutoDao(Connection connection)
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
}
