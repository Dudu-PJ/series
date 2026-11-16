package main;

import java.util.ArrayList;

public class Catalogo
{
    private ArrayList<Serie> series = new ArrayList<>();

    public void addSerie(Serie serie)
    {
        this.series.add(serie);
    }

    public Serie buscarSerie(String nomeBusca)
    {
        for(Serie n : this.series)
        {
            if(n.getNome().equalsIgnoreCase(nomeBusca))
                return n;
        }

        return null;
    }
}