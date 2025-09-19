package br.com.AcademiaUltraFitness.main;

import br.com.AcademiaUltraFitness.Atleta;
import br.com.AcademiaUltraFitness.Pessoa;

public class Main {
                                                                

	public static void main(String[] args) {
		
		Pessoa objnormal =new Pessoa ("Davi",(float)66.5,(float)1.75,19);
		objnormal.informacaoPessoa();
		 System.out.printf("IMC da pessoa: %.2f%n", objnormal.imc());
		 
		System.out.println("============Atleta==============");
		
		Atleta objjudoca =new Atleta ("Lucas",(float) 80,(float) 1.80, 20, "Judo");
		objjudoca.informacaoPessoa();
		objjudoca.Esporte();
		System.out.printf("IMC do atleta ajustado: %.2f%n", objjudoca.imc());
		
		

	}

}
