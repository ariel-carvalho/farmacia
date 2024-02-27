package br.com.alura_senac.farmacia.service;

import br.com.alura_senac.farmacia.dao.ProdutoDAO;
import br.com.alura_senac.farmacia.modelo.Produto;
import br.com.alura_senac.farmacia.dao.ConectionFactory;

import java.sql.Connection;
import java.util.Set;

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
        new ProdutoDAO(conn).salvar(produto);
    }

    public Set<Produto> listarProdutos()
    {
        Connection conn = connection.recuperarConexao();
        return new ProdutoDAO(conn).listar();
    }

    public void alterarPreco(Produto produto, double novoPreco)
    {
        Connection conn = connection.recuperarConexao();
        new ProdutoDAO(conn).alterarPreco(produto.getId(), novoPreco);
    }

    public Produto buscarPorId(Integer id)
    {
        Connection conn = connection.recuperarConexao();
        return new ProdutoDAO(conn).buscarPorId(id);
    }
}
