
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class TestePaciente {


	@Test
	public void testIMC() {
		
		double tolerancia = 0.01;    // 1%
			
			
		//Baixo peso muito grave = IMC abaixo de 16 kg/m²	
		Paciente primeiro = new Paciente(55.0, 1.9);
		assertEquals(15.23, primeiro.calculaIMC(), tolerancia, "Algo deu errado");
		assertEquals("Baixo peso muito grave", primeiro.diagnostico());
		
	
		//Baixo peso grave = IMC entre 16 e 16,99 kg/m²
		Paciente segundo = new Paciente(60.0, 1.9);
		assertEquals(16.62, segundo.calculaIMC(), tolerancia, "Algo deu errado");
		assertEquals("Baixo peso grave", segundo.diagnostico());
		
		
		//Baixo peso = IMC entre 17 e 18,49 kg/m²
		Paciente terceiro = new Paciente(60.0, 1.82);
		assertEquals(18.11, terceiro.calculaIMC(), tolerancia, "Algo deu errado");
		assertEquals("Baixo peso", terceiro.diagnostico());
		
		
		//Peso normal = IMC entre 18,50 e 24,99 kg/m²
		Paciente quarto = new Paciente(80.0, 1.9);
		assertEquals(22.16, quarto.calculaIMC(), tolerancia, "Algo deu errado");
		assertEquals("Peso normal", quarto.diagnostico());

		
		//Sobrepeso = IMC entre 25 e 29,99 kg/m²
		Paciente quinto = new Paciente(80.0, 1.72);
		assertEquals(27.04, quinto.calculaIMC(), tolerancia, "Algo deu errado");
		assertEquals("Sobrepeso", quinto.diagnostico());
		
		
		//Obesidade grau I = IMC entre 30 e 34,99 kg/m²
		Paciente sexto = new Paciente(80.0, 1.58);
		assertEquals(32.04, sexto.calculaIMC(), tolerancia, "Algo deu errado");
		assertEquals("Obesidade grau I", sexto.diagnostico());
		
		
		//Obesidade grau II = IMC entre 35 e 39,99 kg/m²
		Paciente setimo = new Paciente(80.0, 1.47);
		assertEquals(37.02, setimo.calculaIMC(), tolerancia, "Algo deu errado");
		assertEquals("Obesidade grau II", setimo.diagnostico());
		
		
		//Obesidade grau III (obesidade mórbida) = IMC maior que 40 kg/m²
		Paciente oitavo = new Paciente(80.0, 1.3);
		assertEquals(47.33, oitavo.calculaIMC(), tolerancia, "Algo deu errado");
		assertEquals("Obesidade grau III (obesidade mórbida)", oitavo.diagnostico());
		
	}
	
	
}

