package br.com.alura_senac.farmacia.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConectionFactory
{
    public Connection recuperarConexao()
    {
        try
        {
            return DriverManager
                    .getConnection("jdbc:mysql://localhost:3306/farmacia?user=root&password=root");
        }
        catch (SQLException e)
        {
            throw new RuntimeException(e);
        }
    }
}
