package br.com.AcademiaUltraFitness;

public class Atleta extends Pessoa {
	
	private String esporte;

	
	
	 public Atleta(String nome, float peso, float altura, int ano, String esporte) {
		super(nome, peso, altura, ano);
		this.esporte = esporte;
	}

	 public void Esporte() {
	   System.out.println("Esporte:"+esporte);
		 }
	
	  public float imc() {
	        float resultadoNormal = super.imc();  // usa cálculo da classe Pessoa
	        return resultadoNormal * 0.95f;       // reduz 5% para atleta
	    }
		 
	
	 public String getEsporte() {
		 return esporte;
	 }
	 public void setEsporte(String esporte) {
		 this.esporte = esporte;
	 }

	
}
	
		 
		 
	 