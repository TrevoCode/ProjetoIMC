package br.com.academiaultrafitness;

public class Pessoa {

    private String nome;
    private float peso;
    private float altura;
    private int idade;

    public Pessoa(String nome, float peso, float altura, int idade) {
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;
        this.idade = idade;
    }

    public void informacaoPessoa() {
        System.out.println("Nome: " + nome);
        System.out.println("Peso: " + peso);
        System.out.println("Altura: " + altura);
        System.out.println("Idade: " + idade);
    }

    public float imc() {
        return peso / (altura * altura);
    }

    // Getters e Setters
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public float getPeso() { return peso; }
    public void setPeso(float peso) { this.peso = peso; }

    public float getAltura() { return altura; }
    public void setAltura(float altura) { this.altura = altura; }

    public int getIdade() { return idade; }
    public void setIdade(int idade) { this.idade = idade; }
}
