package br.com.alura_senac.farmacia.app;

import br.com.alura_senac.farmacia.service.ProdutoService;

import java.util.Scanner;

public class DeletarProduto
{
    private static final ProdutoService service = new ProdutoService();
    Scanner leitura = new Scanner(System.in).useDelimiter("\n");

    public void DeletarProduto()
    {
        System.out.println("Digite o ID do produto");
        int id = leitura.nextInt();

        service.deletarProduto(id);

        System.out.println("Produt deletado com sucesso!");

        System.out.println("Pressione ENTER para sair");
        leitura.next();

    }
}
