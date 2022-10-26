package crp.registroartista.model;

public class Nacionalidade {
	
	private Integer id;
	private String nacionalidade;
	
	public Nacionalidade() {
		
	}
	public Nacionalidade(Integer id, String nacionalidade) {
		super();
		this.id = id;
		this.nacionalidade = nacionalidade;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	@Override
	public String toString() {
		return "Nacionalidade [id=" + id + ", nacionalidade=" + nacionalidade + "]";
	}
	

}
