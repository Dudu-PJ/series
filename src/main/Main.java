package main;

import utils.Input;

public class Main
{
    public void main(String[] args)
    {
        Serie serie1 = new Serie("Steel Ball Run", "Netflix");
        Serie serie2 = new Serie("Black Horse");
        Serie serie3 = new Serie("Naruto", "Crunchyroll");

        Catalogo catalogo = new Catalogo();

        catalogo.addSerie(serie1);
        catalogo.addSerie(serie2);
        catalogo.addSerie(serie3);

        Serie serieEncontrada = catalogo.buscarSerie("naruto");

        System.out.println("A serie esta disponivel na ["+serieEncontrada.getPlataforma()+"] e tem nota ["+serieEncontrada.getNota()+"]");
    }
}
