package br.com.alura_senac.farmacia.modelo;

public class Produto
{
    private int id;
    private float preco;
    private String nome;
    private String fabricante;

    public Produto(float preco, String nome, String fabricante)
    {

        this.preco = preco;
        this.nome = nome;
        this.fabricante = fabricante;
    }

    public int getId()
    {
        return id;
    }

    public float getPreco()
    {
        return preco;
    }

    public String getNome()
    {
        return nome;
    }

    public String getFabricante()
    {
        return fabricante;
    }
}
