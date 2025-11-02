package br.com.academiaultrafitness.main;

import br.com.academiaultrafitness.Atleta;
import br.com.academiaultrafitness.Pessoa;

public class Main {

    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa("Davi", 66.5f, 1.75f, 19);
        pessoa.informacaoPessoa();
        System.out.println("IMC da pessoa: " + String.format("%.2f", pessoa.imc()));

        System.out.println("\n============ Atleta ============");

        Atleta atleta = new Atleta("Lucas", 80.0f, 1.80f, 20, "Judo");
        atleta.informacaoPessoa();
        atleta.exibirEsporte();
        System.out.println("IMC do atleta ajustado: " + String.format("%.2f", atleta.imc()));
    }
}
