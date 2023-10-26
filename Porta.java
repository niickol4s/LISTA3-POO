// Questão 2 - Crie uma porta, abra e feche a mesma, pinte-a de diversas cores, altere suas
// dimensões e use o metodo estaAberta para verificar se ela esta aberta.

public class Porta {
    boolean aberta;
    String cor;
    int dimensaoX;
    int dimensaoY;
    int dimensaoZ;

    public void abrir() {
        this.aberta = true;
        System.out.println("Porta aberta.");
    }

    public void fechar() {
        this.aberta = false;
        System.out.println("Porta fechada.");
    }

    public void pintar() {
        System.out.println("Cor da porta: " + this.cor);
    }

    public boolean estaAberta() {
        if (this.aberta == true) return this.aberta;
        else return this.aberta;
    }

    public void dimensoes() {
        System.out.println("Altura (Y): " + this.dimensaoY);
        System.out.println("Largura (X): " + this.dimensaoX);
        System.out.println("Profundidade (Z): " + this.dimensaoZ);
    }
}
