package recursos.aparelhoTelefonico;

public interface Telefone{

    public default void atender() {
        System.out.println("Atendeu pelo telefone");
    }

    public default void ligar() {
        System.out.println("Ligou pelo telefone");
    }

    public default void iniciarCorrerioVoz() {
        System.out.println("Iniciou correio de voz pelo telefone");
    }
}
