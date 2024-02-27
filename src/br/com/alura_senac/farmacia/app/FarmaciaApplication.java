package br.com.alura_senac.farmacia.app;

import java.util.Scanner;

public class FarmaciaApplication
{
    public static void main(String[] args)
    {
        var opcao = exibirMenu();

        while (opcao != 6)
        {
            switch (opcao)
            {
                case 1:
                    CriarProduto criarProduto = new CriarProduto();
                    criarProduto.criarProduto();
                    break;
                case 2:
                    ListarProdutos listarProdutos = new ListarProdutos();
                    listarProdutos.listarProdutos();
                    break;
                case 3:
                    ListarProdutos listarProduto = new ListarProdutos();
                    listarProduto.buscarPorId();
                    break;
                case 4:
                    EditarDados editarDados = new EditarDados();
                    editarDados.EditarPreco();
                    break;
                case 5:
                    DeletarProduto deletarProduto = new DeletarProduto();
                    deletarProduto.DeletarProduto();
                    break;
            }

            opcao = exibirMenu();
        }

        System.out.println("Finalizando a aplicação.");
    }

    private static int exibirMenu()
    {
        Scanner leitura = new Scanner(System.in).useDelimiter("\n");

        System.out.println("""
                FARMACIA - ESCOLHA UMA OPÇÃO:
                1 - Criar produto
                2 - Listar Produtos
                3 - Listar produto por ID
                4 - Editar produto
                5 - Apagar produto
                6 - Sair
                """);
        return leitura.nextInt();
    }

}


