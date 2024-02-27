package br.com.alura_senac.farmacia.modelo;

public class Produto
{
    private int id;
    private double preco;
    private String nome;
    private String fabricante;

    public Produto(double preco, String nome, String fabricante)
    {

        this.preco = preco;
        this.nome = nome;
        this.fabricante = fabricante;
    }

    public int getId()
    {
        return id;
    }

    public double getPreco()
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

    @Override
    public String toString()
    {
        return "Preço: " + this.getPreco() + " Nome: " + this.nome + " Fabricante: " + this.getFabricante();
    }
}