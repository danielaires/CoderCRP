package crp.registroartista.comparator;

import java.util.Comparator;

import crp.registroartista.model.Album;

public class AlbumComparator implements Comparator<Album>{

    @Override
    public int compare(Album arg0, Album arg1) {
        return arg0.getNome().compareTo(arg1.getNome());
    }
    
}
