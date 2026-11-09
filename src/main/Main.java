package main;

import utils.Input;

public class Main
{
    public void main(String[] args)
    {
        Serie serie1 = new Serie("Steel Ball Run", "Netflix");
        Serie serie2 = new Serie("Black Horse");

        System.out.println(serie1.getNome());
        serie1.setNota(Input.db("Informe uma nota: "));
        System.out.println(serie2.getNome());
        serie2.setNota(Input.db("Informe uma nota: "));

        System.out.println(serie1.toString());
        System.out.println(serie2.toString());
    }
}