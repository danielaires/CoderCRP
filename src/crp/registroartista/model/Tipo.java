package crp.registroartista.model;

public enum Tipo {
	
	AUTOR(1,"Autor"),COMPOSITOR(2,"Compositor"),INTERPRESTES(3,"Interprestes");
	
	private int id;
	private String label;
	
	Tipo(int id, String label){
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
