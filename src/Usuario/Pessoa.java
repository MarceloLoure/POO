package Usuario;

import Iphone.Iphone;

public class Pessoa extends Iphone {
    public static void main(String[] args) {
        Iphone iphone12 = new Iphone();

        iphone12.ligar();
        iphone12.atender();
        iphone12.iniciarCorrerioVoz();

        iphone12.selecionarMusica();
        iphone12.tocar();
        iphone12.pausar();

        iphone12.adicionarNovaAba();
        iphone12.atualizarPagina();
        iphone12.exibirPagina();
    }
}
