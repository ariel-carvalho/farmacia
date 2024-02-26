package br.com.alura_senac.farmacia.app;

public class FarmaciaApplication
{
    public static void main(String[] args)
    {
        CriarProduto criarProduto = new CriarProduto();
        criarProduto.criarProduto();
        System.out.println(criarProduto);
    }
}
