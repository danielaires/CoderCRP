package crp.registroartista.model;

public enum Sexo {

	FEMENINO(1,"Femenino"),MASCULINO(2,"Masculino"), OUTROS(3,"Outros");
	private int id;
	private String label;
	
	Sexo(int id, String label){
		this.id = id;
		this.label = label;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}
	

}
