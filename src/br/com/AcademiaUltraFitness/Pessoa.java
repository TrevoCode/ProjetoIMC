package br.com.AcademiaUltraFitness;

public class Pessoa {
	private String nome ;
	private float peso;
	private float altura;
	private int ano ;
	
	
	
	
	
	public Pessoa(String nome, float peso, float altura, int ano) {
		super();
		this.nome = nome;
		this.peso = peso;
		this.altura = altura;
		this.ano = ano;
	}
	public void informacaoPessoa() {
		System.out.println("Nome:"+nome);	
		System.out.println("Peso:"+peso);
		System.out.println("Altura:"+altura);
		System.out.println("Ano:"+ano);
		
	}
	public float imc() {
        return peso / (altura * altura);
    }

		
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public float Imc() {
		// TODO Auto-generated method stub
		return 0;
	}

	
	

}
