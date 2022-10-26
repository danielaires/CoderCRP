package crp.registroartista.model;

import java.sql.Time;

public class Musica {

	private Integer id;
	private String nome;
	private Time duracao;
	private Genero genero;
	private Artista artista;

	public Musica() {

	}

	public Musica(Integer id, String nome, Time duracao, Genero genero, Artista artista) {
		super();
		this.id = id;
		this.nome = nome;
		this.duracao = duracao;
		this.genero = genero;
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

	public Time getDuracao() {
		return duracao;
	}

	public void setDuracao(Time duracao) {
		this.duracao = duracao;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	public Artista getArtista() {
		return artista;
	}

	public void setArtista(Artista artista) {
		this.artista = artista;
	}

	@Override
	public String toString() {
		return "Musica [id=" + id + ", nome=" + nome + ", duracao=" + duracao + ", genero=" + genero + ", artista="
				+ artista + "]";
	}

}
