package main;

public class Serie
{
    private String nome, plataforma;
    private double nota;

    public Serie(String nome, String plataforma)
    {
        this.nome = nome;
        this.plataforma = plataforma;
    }

    public Serie(String nome)
    {
        this.nome = nome;
        this.plataforma = "Plataforma Indefinida";
    }

    @Override
    public String toString() {
        return "Serie{" +
                "nome='" + nome + '\'' +
                ", plataforma='" + plataforma + "}";
    }
}