public class PortaMain {
    public static void main(String [] args) {
        Porta porta = new Porta();

        porta.cor = "Azul";
        porta.dimensaoX = 1;
        porta.dimensaoY = 2;
        porta.dimensaoZ = 3;

        porta.fechar();
        porta.estaAberta();
        porta.pintar();
        porta.abrir();
        porta.estaAberta();
        porta.dimensoes();

    }
}
