
import java.util.Calendar;


public class Pessoa {
	
	Calendar c = Calendar.getInstance();
	int d = c.get(Calendar.DAY_OF_MONTH);
	int m = c.get(Calendar.MONTH);
	int y = c.get(Calendar.YEAR);
	
	
	private String nome;
	private String dataDeNascimento; // dd/mm/yyyy
	private double altura;
	private double peso;
	
	
	public Pessoa(String nome, String dataDeNascimento, double altura, double peso) {
		
		this.altura = altura;
		this.dataDeNascimento = dataDeNascimento;
		this.nome = nome;
		this.peso = peso;
	}

	
	public String getNome() {
		return nome;
	}

	public double getPeso() {
		return peso;
	}

	public String getAniversario() {
		return dataDeNascimento;
	}

	public double getAltura() {
		return altura;
	}
	
	public String toString() {
		return "O " + getNome() + " nasceu em " + this.dataDeNascimento + " e está com " + this.altura 
		+ " de altura e com " + this.peso + " kilos";
		
	}
	
	public int calculaIdade() {
		
		String x [] = this.dataDeNascimento.split("/"); 
		
		if (m+1 >= Integer.parseInt((x[1]))) {
			int idade = y - Integer.parseInt((x[2]));
			return idade;			
		} else {
			int idade = y - Integer.parseInt((x[2]));
			return idade - 1;	
			
		}
					
	}
	 
}
