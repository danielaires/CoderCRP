package crp.registroartista.model;

import java.util.List;

public class Album {

	private Integer id;
	private String nome;
	private String capa;
	private List<Artista> artista;

	public Album() {

	}

	

	public Album(Integer id, String nome, String capa, List<Artista> artista) {
		super();
		this.id = id;
		this.nome = nome;
		this.capa = capa;
		this.artista = artista;
	}



	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getCapa() {
		return capa;
	}



	public void setCapa(String capa) {
		this.capa = capa;
	}



	public List<Artista> getArtista() {
		return artista;
	}



	public void setArtista(List<Artista> artista) {
		this.artista = artista;
	}



	@Override
	public String toString() {
		return "Album [id=" + id + ", nome=" + nome + ", capa=" + capa + ", artista=" + artista + "]";
	}


}
