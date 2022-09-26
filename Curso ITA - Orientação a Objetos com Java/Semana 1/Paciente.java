
/** Entrar com peso em kg, e altura em metros no construtor.
 * 
 * @author Rafael Bessa
 *
 */

public class Paciente {
	
	private double peso;
	private double altura;

	public Paciente(double peso, double altura) {
		this.peso = peso;
		this.altura = altura;
	}
		

	double calculaIMC() {
		return this.peso/(this.altura*this.altura);
	}

	String diagnostico() {
		
		if(calculaIMC() < 16) {
			return "Baixo peso muito grave";
		}
		
		else if (calculaIMC() < 17) {
			return "Baixo peso grave";
		}
		
		else if (calculaIMC() < 18.50) {
			return "Baixo peso";
		}
		
		else if (calculaIMC() < 25) {
			return "Peso normal";
		}
		
		else if (calculaIMC() < 30) {
			return "Sobrepeso";
		}
		
		else if (calculaIMC() < 35) {
			return "Obesidade grau I";
		}
		
		else if (calculaIMC() < 40) {
			return "Obesidade grau II";
		}
		
		else {
			return "Obesidade grau III (obesidade mórbida)";
		}
		
		
	}
} 
