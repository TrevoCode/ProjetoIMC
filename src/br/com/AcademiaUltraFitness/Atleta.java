package br.com.academiaultrafitness;

public class Atleta extends Pessoa {

    private String esporte;

    public Atleta(String nome, float peso, float altura, int idade, String esporte) {
        super(nome, peso, altura, idade);
        this.esporte = esporte;
    }

    public void exibirEsporte() {
        System.out.println("Esporte: " + esporte);
    }

    @Override
    public float imc() {
        return super.imc() * 0.95f; // IMC ajustado para atleta
    }

    // Getter e Setter
    public String getEsporte() { return esporte; }
    public void setEsporte(String esporte) { this.esporte = esporte; }
}

		 
		 
	 
