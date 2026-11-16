package main;

public class Serie
{
    private String nome, plataforma;
    private double nota;

    public Serie(String nome, String plataforma)
    {
        this.nome = nome;
        this.plataforma = plataforma;
        this.nota = 0;
    }

    public Serie(String nome)
    {
        this.nome = nome;
        this.plataforma = "Plataforma Indefinida";
        this.nota = 0;
    }

    @Override
    public String toString()
    {
        return "Serie{" +
                "nome='" + nome + '\'' +
                ", plataforma='" + plataforma + '\'' +
                ", nota=" + nota +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public double getNota() {
        return nota;
    }

    public boolean setNota(double nota) {
        if (nota >= 0 && nota <= 10)
        {
            this.nota = nota;
            return true;
        }
        return false;
    }
}