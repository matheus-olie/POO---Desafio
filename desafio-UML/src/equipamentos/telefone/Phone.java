package equipamentos.telefone;

public class Phone implements AparelhoTelefonico {
    public void ligar() {
        System.out.println("Ligando via Phone");
    }
    public void atender() {
        System.out.println("Atendendo ligação via Phone");
    }
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando Correio de Voz via Phone");
    }
    
}
