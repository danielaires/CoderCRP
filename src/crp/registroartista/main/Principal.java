package crp.registroartista.main;



import java.sql.Date;

import crp.registroartista.model.Album;
import crp.registroartista.model.Artista;
import crp.registroartista.model.Nacionalidade;
import crp.registroartista.model.Sexo;
import crp.registroartista.model.Telefone;
import crp.registroartista.model.Tipo;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Telefone tel = new Telefone(63,"99286-3214");
		Nacionalidade nac = new Nacionalidade(1,"Brasileiro");
		Date data = new Date(2022,10,25);
	
		Artista artista = new Artista(1,"Daniel",Sexo.MASCULINO, null, tel, nac, Tipo.AUTOR, null);
		Album alb = new Album(1,"Joao","https://localhost:8080", artista);
		artista.setAlbum(alb);
		
		System.out.println(artista.toString());
	}
//5522
}
