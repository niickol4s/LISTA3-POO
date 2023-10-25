public class PessoaMain {
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
