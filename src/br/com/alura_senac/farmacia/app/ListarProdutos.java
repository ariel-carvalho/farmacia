package br.com.alura_senac.farmacia.app;

import br.com.alura_senac.farmacia.service.ProdutoService;

import java.util.Scanner;

public class ListarProdutos
{
    private static ProdutoService service = new ProdutoService();
    Scanner leitura = new Scanner(System.in).useDelimiter("\n");

    public void listarProdutos()
    {
        System.out.println("Produtos cadastrados:");
        var produtos = service.listarProdutos();
        produtos.stream().forEach(System.out::println);
    }
}
