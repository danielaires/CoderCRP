package crp.registroartista.controller;

import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

import crp.registroartista.model.Artista;
import crp.registroartista.model.Genero;
import crp.registroartista.model.Musica;

public class MusicaController {
    private List<Musica> listMusica;
    private static Integer cont;

    public MusicaController() {
        if(listMusica == null)
            listMusica = new ArrayList<Musica>();
        
        if(cont == null)
            cont = 0;
    }

    public boolean insert(Musica musica) {
        musica.setId(cont);
        if (this.listMusica.add(musica)) {
            cont++;
            return true;
        }
        return false;
    }

    public boolean update(Musica musica) {
        int index = this.listMusica.indexOf(musica);
        if (index > 0) {
            if (this.listMusica.contains(musica)) {// se ja contem o obj ele insere novamente
                return true;
            }
            this.listMusica.add(index, musica);
            return true;
        }
        return false;
    }

    public boolean delete(Musica musica) {
        if (this.listMusica.remove(musica))
            return true;
        return false;

    }

    public void read() {
        this.listMusica.forEach(m -> System.out.println(m.toString()));
      
    }

    public void findByName(String name) {
        this.listMusica.forEach(m -> {
            if (m.getNome().equals(name)) {
                m.toString();
                return;
            }
        });
    }

    public List<Musica> getListMusica() {
        return listMusica;
    }

    public void setListMusica(List<Musica> listMusica) {
        this.listMusica = listMusica;
    }

    public static Integer getCont() {
        return cont;
    }

    public static void main(String[] args) {
        MusicaController mc = new MusicaController();
       Musica  musica1 = new Musica(0, "Musica 1", null, new Genero(), new ArrayList<Artista>());
       Musica musica2 = new Musica(1, "Musica 2", null, new Genero(), new ArrayList<Artista>());
       Musica musica3 = new Musica(2, "Musica 3", null, new Genero(), new ArrayList<Artista>());
     //inserindo musica
       System.out.println("====Teste de INSERT====");
       mc.insert(musica1); 
        mc.read();
     //alterando
        System.out.println("====Teste de UPDATE====");
       musica1.setNome("novo nome");
       mc.update(musica1);
       mc.read();
       System.out.println("====Teste de READ====");
       mc.read();
       System.out.println("====Teste de DELETE====");
       mc.delete(musica1);
       mc.read();
    }
}
