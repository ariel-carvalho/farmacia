package br.com.alura_senac.farmacia.app;

import br.com.alura_senac.farmacia.service.ProdutoService;

import java.util.Scanner;

public class EditarDados
{
    private static final ProdutoService service = new ProdutoService();
    Scanner leitura = new Scanner(System.in).useDelimiter("\n");

    public void EditarPreco()
    {
        System.out.println("Digite o ID do produto");
        int id = leitura.nextInt();
        var produto = service.buscarPorId(id);

        System.out.println("Digite o novo preço:");
        double preco = leitura.nextDouble();

        service.alterarPreco(produto, preco);

        System.out.println("Preço alterado com sucesso!");

        System.out.println("Pressione ENTER para voltar ao menu");
        leitura.next();
    }
}
