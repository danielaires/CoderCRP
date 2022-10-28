package crp.registroartista.controller;

import java.util.ArrayList;
import java.util.List;

import crp.registroartista.model.Artista;

public class ArtistaController {
	
	
	List<Artista> lista = new ArrayList();
	
	
	public void buscarPorNome(String nome) {
		
		lista.forEach(a -> {
		    if(a.getNome().equals(nome)) {
		        a.toString();
		    }
		});
	}
	
	public void adicionarArtista(Artista artista) {
		
		System.out.println(lista.add(artista));
	}
	
	
	public void removerArtista(Artista artista) {
		
		if(artista.getId()!= null && artista.getId()>0) {
			
			lista.remove(artista);
			System.out.println("Artista excluindo com sucesso!!");
		}
		
	}
	
	public void alterarArtista(Artista artista) {
		
		if(artista.getId() != null && artista.getId()>0) {
			
			int index = lista.indexOf(artista);
			lista.add(index, artista);
			
			return;
			
		}
	
	}
	
}
