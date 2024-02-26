package br.com.alura_senac.farmacia.app;

import br.com.alura_senac.farmacia.modelo.Produto;
import br.com.alura_senac.farmacia.service.ProdutoService;

import java.util.Scanner;

public class CriarProduto
{
    private static ProdutoService service = new ProdutoService();
    Scanner leitura = new Scanner(System.in).useDelimiter("\n");
    public void criarProduto()
    {
        System.out.println("Digite o preço do produto");
        float preco = leitura.nextFloat();

        System.out.println("Digite o nome do produto:");
        String nome = leitura.next();

        System.out.println("Digite o nome do fabricante:");
        String fabricante = leitura.next();

        service.criarProduto(new Produto(preco, nome, fabricante));

        System.out.println("Produto cadastrado com sucesso!");
    }
}
