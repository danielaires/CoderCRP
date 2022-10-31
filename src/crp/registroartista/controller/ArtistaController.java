package crp.registroartista.controller;

import java.util.ArrayList;
import java.util.List;

import crp.registroartista.comparator.ArtistaComparator;
import crp.registroartista.model.Artista;
import crp.registroartista.model.Sexo;
import crp.registroartista.model.Tipo;

public class ArtistaController {
	
	
	List<Artista> lista = new ArrayList();
	
	
	public void buscarPorNome(String nome) {
		
		lista.forEach(a -> {
		    if(a.getNome().equals(nome)) {
		        a.toString();
				return;
		    }
		});
	}
	
	public void adicionarArtista(Artista artista) {
		
		lista.add(artista);
	}
	
	
	public void removerArtista(Artista artista) {
		
		if(artista.getId()!= null && artista.getId()>0) {
			
			lista.remove(artista);
			System.out.println("Artista excluindo com sucesso!!");
		}
		
	}
	
	public boolean alterarArtista(Artista artista) {
		
		int index = this.lista.indexOf(artista);
        if (index > 0) {
            if (this.lista.contains(lista)) {// se ja contem o obj ele insere novamente
                return true;
            }
            this.lista.add(index, artista);
            return true;
        }
        return false;
	}
	public void read(){
		this.lista.forEach(a -> System.out.println(a.toString()));
	}
	public void filterByName(){
		this.lista.sort(new ArtistaComparator());
	}
	public static void main(String[] args) {

		ArtistaController ac= new ArtistaController();

		Artista artista1 = new Artista(1,"Daniel",Sexo.MASCULINO,null,null,null,null,null);
		Artista artista2 = new Artista(2,"Mateus",Sexo.MASCULINO,null,null,null,null,null);
		Artista artista3 = new Artista(3,"Rafael",Sexo.MASCULINO,null,null,null,null,null);
		Artista artista4 = new Artista(4,"Carla",Sexo.FEMENINO,null,null,null,null,null);

		//inserindo musica
		System.out.println("====Teste de INSERT====");
		ac.adicionarArtista(artista1); 
		ac.read();
	  //alterando
		System.out.println("====Teste de UPDATE====");
		artista1.setNome("Novo nome");
		ac.alterarArtista(artista1);
		ac.read();
		System.out.println("====Teste de READ====");
		ac.read();
		System.out.println("====Teste de DELETE====");
		ac.removerArtista(artista1);
		ac.read();
		System.out.println("====Teste de ORDENAÇÃO====");
		System.out.println("====INSERINDO NOVAMENTE NA LISTA====");
		ac.adicionarArtista(artista1); 
		ac.adicionarArtista(artista2); 
		ac.adicionarArtista(artista3);
		ac.adicionarArtista(artista4); 
		ac.read();
		System.out.println("==========RESULTADO========");
		ac.filterByName();
		ac.read();

	}
	
}
