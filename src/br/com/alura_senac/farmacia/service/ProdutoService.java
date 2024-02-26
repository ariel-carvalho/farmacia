package br.com.alura_senac.farmacia.service;

import br.com.alura_senac.farmacia.dao.ProdutoDao;
import br.com.alura_senac.farmacia.modelo.Produto;
import br.com.alura_senac.farmacia.dao.ConectionFactory;

import java.sql.Connection;

public class ProdutoService
{
    private ConectionFactory connection;
    public ProdutoService()
    {
        this.connection = new ConectionFactory();
    }

    public void criarProduto(Produto produto)
    {
        Connection conn = connection.recuperarConexao();
        new ProdutoDao(conn).salvar(produto);
    }
}
