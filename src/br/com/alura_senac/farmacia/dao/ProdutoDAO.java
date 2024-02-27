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
            preparedStatement.setDouble(2, produto.getPreco());
            preparedStatement.setString(3, produto.getNome());
            preparedStatement.setString(4, produto.getFabricante());

            preparedStatement.execute();
            preparedStatement.close();
            conn.close();
        }
        catch (SQLException e)
        {
            throw new RuntimeException(e);
        }
    }

    public Set<Produto> listar()
    {
        PreparedStatement preparedStatement;
        ResultSet resultSet;

        Set<Produto> produtos = new HashSet<>();

        String sql = "SELECT * FROM produto";

        try
        {
            preparedStatement = conn.prepareStatement(sql);
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next())
            {
                double preco = resultSet.getDouble(2);
                String nome = resultSet.getString(3);
                String fabricante = resultSet.getString(4);

                produtos.add(new Produto(preco, nome, fabricante));
            }

            preparedStatement.close();
            resultSet.close();
            conn.close();
        }
        catch (SQLException e)
        {
            throw new RuntimeException(e);
        }

        return produtos;
    }

    public void alterarPreco(int id, double preco)
    {
        PreparedStatement preparedStatement;
        String sql = "UPDATE produto SET preco = ? WHERE id = ?";

        try
        {
           preparedStatement = conn.prepareStatement(sql);
           preparedStatement.setDouble(1, preco);
           preparedStatement.setInt(2,id);

           preparedStatement.execute();
           preparedStatement.close();
           conn.close();
        }
        catch (SQLException e)
        {
            throw new RuntimeException(e);
        }
    }

    public Produto buscarPorId(int id)
    {

        PreparedStatement preparedStatement;
        ResultSet resultSet;
        Produto produto = null;

        String sql = "SELECT * FROM produto WHERE id = ?";

        try
        {
            preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next())
            {
               double preco = resultSet.getDouble(2);
                String nome = resultSet.getString(3);
                String fabricante = resultSet.getString(4);

                produto = new Produto(preco, nome, fabricante);
            }

            preparedStatement.close();
            resultSet.close();
            conn.close();
        }
        catch (SQLException e)
        {
            throw new RuntimeException(e);
        }

        return produto;
    }

    public Produto deletarProduto(int id)
    {
        PreparedStatement preparedStatement;
        Produto produto = null;

        String sql = "DELETE FROM produto WHERE id = ?";

        try
        {
            preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setInt(1, id);

            preparedStatement.execute();
            preparedStatement.close();
            conn.close();
        }
        catch (SQLException e)
        {
            throw new RuntimeException(e);
        }

        return produto;
    }

}
