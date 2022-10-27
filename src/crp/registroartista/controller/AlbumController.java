package crp.registroartista.controller;

import java.util.ArrayList;
import java.util.List;

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

	public Album select(Album a) {
		return this.listAlbum.get(this.listAlbum.indexOf(a));
	}

	public boolean delete(Album a) {
		int index = this.listAlbum.indexOf(a);
		if (index > 0)
			this.listAlbum.remove(index);
		return true;
	}

	public boolean validateAlbum(Album a) { // por enquanto vamos valida apenas se o album tem um nome
		if (a.getNome().equals(null)) {
			return false;
		}
		return true;
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

}
