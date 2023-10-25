// Questão 1 - Crie uma pessoa, coloque seu nome e idade inicial, 
// faça alguns aniversários (aumentando a idade) e imprima seu nome e sua idade.

public class Pessoa {
    String nome;
    int idade;

    public int fazAniversario(int idade) {
        this.idade += 1;

        return this.idade;
    }

    public void imprimir() {
        System.out.println("Nome: " + this.nome + " Idade: " + this.idade);
    }

}