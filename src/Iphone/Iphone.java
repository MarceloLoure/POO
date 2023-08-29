package Iphone;

import recursos.aparelhoTelefonico.Telefone;
import recursos.navegadorInternet.Navegador;
import recursos.reprodutorMusical.Player;

public class Iphone implements Telefone, Navegador, Player {
    public void ligar() {
        System.out.println("Ligou do Iphone");
    }

    public void atender() {
        System.out.println("Atendeu do Iphone");
    }

    public void iniciarCorrerioVoz() {
        System.out.println("Iniciou correio de voz do Iphone");
    }

    public void adicionarNovaAba() {
        System.out.println("Abriu nova aba no Iphone");
    }

    public void exibirPagina() {
        System.out.println("Exibiu pagina no Iphone");
    }

    public void atualizarPagina() {
        System.out.println("Atualizou pagina no Iphone");
    }

    public void selecionarMusica() {
        System.out.println("Selecionou musica no Iphone");
    }

    public void tocar() {
        System.out.println("Tocou musica no Iphone");
    }

    public void pausar() {
        System.out.println("Pausou musica no Iphone");
    }
}
