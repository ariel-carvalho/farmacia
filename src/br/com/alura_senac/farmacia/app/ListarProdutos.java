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
        produtos.forEach(System.out::println);

        System.out.println("Pressione ENTER para voltar ao menu");
        leitura.next();
    }

    public void buscarPorId()
    {
        System.out.println("Digite o ID do produto");
        int id = leitura.nextInt();
        var produto = service.buscarPorId(id);
        System.out.println(produto);

        System.out.println("Pressione ENTER para voltar ao menu");
        leitura.next();
    }
}
