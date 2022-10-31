package crp.registroartista.comparator;

import java.util.Comparator;

import crp.registroartista.model.Musica;

public class MusicaComparator implements Comparator<Musica> {

    @Override
    public int compare(Musica arg0, Musica arg1) {
        return arg0.getNome().compareTo(arg1.getNome());
    }
    
}
