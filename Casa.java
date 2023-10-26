// Questão 3 - Crie três portas e coloque-as na casa; abra e feche as mesmas como desejar. 
// Utilize o método quantasPortasEstaoAbertas para imprimir o número de portas abertas.

public class Casa {
    String cor;
    Porta porta1;
    Porta porta2;
    Porta porta3;

    public void corAtual(String cor) {
        this.cor = cor;
    }

    public void porta1(Porta porta) {
        this.porta1 = porta;
    }

    public void porta2(Porta porta) {
        this.porta2 = porta;
    }

    public void porta3(Porta porta) {
        this.porta3 = porta;
    }

    public void abrirPorta1() {
        porta1.abrir();
    }

    public void fecharPorta1() {
        porta1.fechar();
    }

    public void abrirPorta2() {
        porta2.abrir();
    }

    public void fecharPorta2() {
        porta2.fechar();
    }

    public void abrirPorta3() {
        porta3.abrir();
    }

    public void fecharPorta3() {
        porta3.fechar();
    }

    public int quantasPortasEstaoAbertas() {
        int cont = 0;
        if (porta1 != null && porta1.estaAberta()) {
            cont++;
        }
        if (porta2 != null && porta2.estaAberta()) {
            cont++;
        }
        if (porta3 != null && porta3.estaAberta()) {
            cont++;
        }
        return cont;
    }

}
