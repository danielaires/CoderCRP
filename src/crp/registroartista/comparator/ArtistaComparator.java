package crp.registroartista.comparator;

import java.util.Comparator;

import crp.registroartista.model.Artista;

public class ArtistaComparator implements Comparator<Artista>{

    @Override
    public int compare(Artista arg0, Artista arg1) {
       
        return arg0.getNome().compareTo(arg1.getNome());

    }
    
}
