public class CasaMain {
    public static void main(String[] args) {
        Casa casa = new Casa();

        casa.cor = "Azul";
        Porta porta1 = new Porta();
        Porta porta2 = new Porta();
        Porta porta3 = new Porta();

        casa.porta1(porta1);
        casa.porta2(porta2);
        casa.porta3(porta3);

        casa.abrirPorta1();
        casa.abrirPorta3();
        casa.abrirPorta2();
        
        System.out.println("Cor da casa: " + casa.cor);
        System.out.println("Número de portas abertas: " + casa.quantasPortasEstaoAbertas());
        System.out.println("\n------------------------------\n");

        casa.fecharPorta1();
        casa.abrirPorta3();
        casa.fecharPorta2();

        System.out.println("Cor da casa: " + casa.cor);
        System.out.println("Número de portas abertas: " + casa.quantasPortasEstaoAbertas());
        System.out.println("\n------------------------------\n");
    }
}
