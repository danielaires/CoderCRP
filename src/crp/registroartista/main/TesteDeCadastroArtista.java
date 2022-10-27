package crp.registroartista.main;

import java.util.Scanner;
import java.util.function.BiPredicate;

import crp.registroartista.controller.AlbumController;
import crp.registroartista.model.Album;

public class TesteDeCadastroArtista {

	public static void main(String[] args) {
		AlbumController a = new AlbumController();
		Album album;
		Scanner ler = new Scanner(System.in);
		int opcaoEscolhida = 0; //var responsavel por controlar os switch case
		int id = 0; //variavel responsavel por pegar os ids para editar e remover
		//VARIAVEIS ==================================================================
		menu();
		opcaoEscolhida = ler.nextInt();
		//MANTEM O SISTEMA RODANDO ==================================================================
		while (opcaoEscolhida > 0) {
			switch (opcaoEscolhida) {

			case 1:

				album = cadrastarAlbum(album = new Album());
				a.insert(album);

				menu();
				opcaoEscolhida = ler.nextInt();

				break;
			case 2:

				a.getListAlbum().forEach(alb -> {
					System.out.println(alb.toString());
				});

				menu();
				opcaoEscolhida = ler.nextInt();

				break;
			case 3:

				id = 0;
				System.out.println("Escoha o id do usuario que deseja editar : ");
				id = ler.nextInt();

				a.update(update(a.getListAlbum().get(id)));
				menu();
				opcaoEscolhida = ler.nextInt();

				break;
			case 4:

				id = 0;
				System.out.println("Escoha o id do usuario que deseja deletar : ");
				id = ler.nextInt();

				a.delete(a.getListAlbum().get(id));
			    menu();
				opcaoEscolhida = ler.nextInt();	

				break;
			case 5:

				id = 0;
				System.out.println("Digite o id que deseja buscar : ");
				id = ler.nextInt();

				System.out.println(a.select(id));
				menu();
				opcaoEscolhida = ler.nextInt();

				break;
			case 0:

				menu();
				
				break;

			default:
				break;
			}
		}
	}
	//METODOS DOS SITEMA ==================================================================
	public static Album cadrastarAlbum(Album a) {

		Scanner ler = new Scanner(System.in);

		System.out.println("Nome do album : ");
		a.setNome(ler.next());

		System.out.println("Endereço URL da capa : ");
		a.setCapa(ler.next());

		return a;
	}

	public static Album update(Album a) {

		Scanner ler = new Scanner(System.in);

		System.out.println("Nome do album : ");
		String aux  =  ler.next();

		if(aux.equals("pular") ){
			
		}else {
			a.setNome(aux);
		}

		System.out.println("Endereço URL da capa : ");
		aux =  ler.next();

		if(aux.equals("pular") ){
			
		}else {
			a.setCapa(aux);
		}

		return a;
	}

	public static void menu() {

		System.out.println(" 1 - insert ");
		System.out.println(" 2 - select ");
		System.out.println(" 3 - update ");
		System.out.println(" 4 - remove");
		System.out.println(" 5 - Bucar por id");
		System.out.println(" 0 - menu ");
		System.out.println("PARA SAIR DIGITE UM VALOR MENOS QUE 0");

	}
}
