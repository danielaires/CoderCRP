package crp.registroartista.main;

import java.util.Scanner;

import crp.registroartista.controller.AlbumController;
import crp.registroartista.model.Album;

public class TesteDeCadastroArtista {

	public static void main(String[] args) {
		AlbumController a = new AlbumController();
		Album album;
		Scanner ler = new Scanner(System.in);
		int opcaoEscolhida = 0;
		menu();
		opcaoEscolhida = ler.nextInt();
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
				int id = 0;
				System.out.println("Escoha o id do usuario que deseja editar : ");
				id = ler.nextInt();
				a.update(update(a.getListAlbum().get(id)));
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
		System.out.println(" 0 - menu ");
	}
}
