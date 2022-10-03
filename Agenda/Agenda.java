//Crie uma classe Agenda que pode armazenar 10 pessoas e que seja capaz de realizar as
//seguintes operações:
//void armazenaPessoa(String nome, int idade, float altura);
//void removePessoa(String nome);
//int buscaPessoa(String nome); // informa em que posição da agenda está a pessoa
//void imprimeAgenda(); // imprime os dados de todas as pessoas da agenda
//void imprimePessoa(int index); // imprime os dados da pessoa que está na posição “i” da
//agenda.

import java.util.ArrayList;
import java.util.List;


public class Agenda {
	
	
	List<Pessoas> lista = new ArrayList<>();

	
	public void armazenaPessoa(String nome, int idade, float altura) {
		if(lista.size() >= 10) {
			System.out.println("Lista está lotada");
		}else {
			
			lista.add(new Pessoas(nome, idade, altura));
		}
		
	};
		
	public void removePessoa(String nome) {
		
		if(buscaPessoa(nome) != -1) {
			lista.remove(buscaPessoa(nome));
		}
		
		else {
			System.out.println("Esta pessoa não está na lista, sorry");
		}
		
	}
		
	public int buscaPessoa(String nome) {
		int index = -1;
		
		for(Pessoas buscador: lista) {
			
			if(buscador.getNome() == nome) {
				  return lista.indexOf(buscador);					 
				  //System.out.println(index);
				}
				
			}
		return index;
		}
					
	public void imprimeAgenda() {
		System.out.println(lista);
	}
	
	public void imprimePessoa(int index) {
		System.out.println(lista.get(index));
	}
	
	
public static void main(String[] args) {

	Agenda agenda = new Agenda();
	
	agenda.armazenaPessoa("Rafael", 30, 1.78f);
	agenda.armazenaPessoa("Rafael2", 30, 1.78f);
	agenda.armazenaPessoa("Rafael3", 30, 1.78f);
	agenda.armazenaPessoa("Rafael4", 30, 1.78f);
	agenda.armazenaPessoa("Rafael5", 30, 1.78f);
	agenda.armazenaPessoa("Rafael6", 30, 1.78f);
	agenda.armazenaPessoa("Rafael7", 30, 1.78f);

	
	
	agenda.imprimeAgenda();
	agenda.removePessoa("Rafael3");
	agenda.imprimeAgenda();
	System.out.println(agenda.buscaPessoa("Rafael6"));
	agenda.imprimePessoa(5);
	agenda.removePessoa("Rafael");
	agenda.imprimeAgenda();
}
	
	


		

}
	
	
	
	


