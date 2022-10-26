package crp.registroartista.model;

import java.sql.Date;

public class Artista {
	
	private Integer id;
	private String nome;
	private Sexo sexo;
	private Date dataNascimento;
	private Telefone telefone;
	private Nacionalidade nacionalidade;
	private Tipo tipo;
	private Album album;

	public Artista() {

	}

	public Artista(Integer id,String nome, Sexo sexo, Date dataNascimento, Telefone telefone, Nacionalidade nacionalidade,
			Tipo tipo, Album album) {
		super();
		this.id = id;
		this.nome = nome;
		this.sexo = sexo;
		this.dataNascimento = dataNascimento;
		this.telefone = telefone;
		this.nacionalidade = nacionalidade;
		this.tipo = tipo;
		this.album = album;
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

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public Telefone getTelefone() {
		return telefone;
	}

	public void setTelefone(Telefone telefone) {
		this.telefone = telefone;
	}

	public Nacionalidade getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(Nacionalidade nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}

	public Album getAlbum() {
		return album;
	}

	public void setAlbum(Album album) {
		this.album = album;
	}

	@Override
	public String toString() {
		return "Artista [id=" + id + ", nome=" + nome + ", sexo=" + sexo + ", dataNascimento=" + dataNascimento
				+ ", telefone=" + telefone + ", nacionalidade=" + nacionalidade + ", tipo=" + tipo + ", album=" + album
				+ "]";
	}



}
