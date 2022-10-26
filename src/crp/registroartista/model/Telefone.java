package crp.registroartista.model;

public class Telefone {

	private Integer id;
	private int ddd;
	private String numero;

	public Telefone() {

	}

	public Telefone(int ddd, String numero) {
		super();
		this.ddd = ddd;
		this.numero = numero;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public int getDdd() {
		return ddd;
	}

	public void setDdd(int ddd) {
		this.ddd = ddd;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	@Override
	public String toString() {
		return "Telefone [id=" + id + ", ddd=" + ddd + ", numero=" + numero + "]";
	}
	

}
