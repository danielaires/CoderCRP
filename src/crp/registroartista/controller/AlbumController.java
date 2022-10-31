package crp.registroartista.controller;

import java.util.ArrayList;
import java.util.List;

import crp.registroartista.comparator.AlbumComparator;
import crp.registroartista.model.Album;

public class AlbumController {

	private List<Album> listAlbum; // lista que vai guardar os objetos de albuns inseridos na memoria
	private static Integer cont;

	public AlbumController() {
		if (listAlbum == null)
			listAlbum = new ArrayList<Album>(); // Aqui ele vai instanciar a lista caso ela seja nula
		if (cont == null)// aqui eu inicio o contador usado para inserir os id
			cont = 0;
	}

	public boolean insert(Album a) {
		if (validateAlbum(a)) {
			a.setId(cont);
			this.listAlbum.add(a);
			cont++;
			return false;
		}

		return false;
	}

	public boolean update(Album a) {
		int index = this.listAlbum.indexOf(a);
		if (index > 0) {
			if(this.listAlbum.contains(a)) {//se ja contem o obj ele insere novamente
				return true;
			}
			this.listAlbum.add(index, a);
			return true;
		}
		return false;
	}

	public boolean delete(Album a) {
		int index = this.listAlbum.indexOf(a);
		if (index >= 0)
			this.listAlbum.remove(index);
		return true;
	}

	public boolean validateAlbum(Album a) { // por enquanto vamos valida apenas se o album tem um nome
		if (a.getNome().equals(null)) {
			return false;
		}
		return true;
	}

	public void read() {
		this.listAlbum.forEach(a -> System.out.println(a.toString()));
	}

	public void fyndByName(String name){
		this.listAlbum.forEach(a -> {
			if(a.getNome().equals(name)){
				a.toString();
				return;
			}
		});
	}

	public void filterByName(){
		this.listAlbum.sort(new AlbumComparator());
	}
	public List<Album> getListAlbum() {
		return listAlbum;
	}

	public void setListAlbum(List<Album> listAlbum) {
		this.listAlbum = listAlbum;
	}

	public static Integer getCont() {
		return cont;
	}

	public static void main(String[] args) {
        AlbumController ac = new AlbumController();
       Album alb1 = new Album(0, "Album 1", "capaURL", null, null);
       Album alb2 = new Album(1, "Album 2", "capaURL", null, null);
       Album alb3 = new Album(2, "Album 3", "capaURL", null, null);
     //inserindo musica
       System.out.println("====Teste de INSERT====");
       ac.insert(alb1); 
       ac.read();
     //alterando
        System.out.println("====Teste de UPDATE====");
       alb1.setNome("novo nome");
       ac.update(alb1);
       ac.read();
       System.out.println("====Teste de READ====");
       ac.read();
       System.out.println("====Teste de DELETE====");
       ac.delete(alb1);
       ac.read();
       System.out.println("====Teste de ORDENAÇÃO====");
       System.out.println("====INSERINDO NOVAMENTE NA LISTA====");
       ac.insert(alb1); 
       ac.insert(alb2); 
       ac.insert(alb3); 
       ac.read();
       System.out.println("==========RESULTADO========");
       ac.filterByName();
       ac.read();
    }

}
