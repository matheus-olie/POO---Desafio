
package equipamentos.reprodutormusical;

public class iPod implements ReprodutorMusical {
    public void tocar() {
        System.out.println("Tocando música no Ipod");
    }
    public void pausar() {
        System.out.println("Pausando música no Ipod");
    }
    public void selecionarMusica() {
        System.out.println("Selecionando música no Ipod");
    }
}
