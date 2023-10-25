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

    public static void main(String [] args) {
        Pessoa pessoa = new Pessoa();

        pessoa.nome = "Leandro Feitosa";
        pessoa.idade = 20;

        pessoa.imprimir();
        pessoa.fazAniversario(20);
        pessoa.imprimir();
        pessoa.fazAniversario(20);
        pessoa.imprimir();
    }

}