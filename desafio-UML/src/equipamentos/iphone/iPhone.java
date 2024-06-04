package equipamentos.iphone;

import equipamentos.reprodutormusical.ReprodutorMusical;
import equipamentos.navegador.NavegadorNaInternet;
import equipamentos.telefone.AparelhoTelefonico;

public class iPhone implements NavegadorNaInternet, ReprodutorMusical, AparelhoTelefonico {
    public void exibirPagina() {
        System.out.println("Exibindo página do Safari via Iphone");
    }
    public void adicionarNovaAba() {
        System.out.println("Adicionando uma nova aba ao Safari via Iphone");
    }
    public void atualizarPagina() {
        System.out.println("Atualizando Pagina do Safari via Iphone");
    }
    public void tocar() {
        System.out.println("Tocando música no Spotify via Iphone");
    }
    public void pausar() {
        System.out.println("Pausando música no Spotify via Iphone");
    }
    public void selecionarMusica() {
        System.out.println("Selecionando música no Spotify via Iphone");
    }
    public void ligar() {
        System.out.println("Ligando via Iphone");
    }
    public void atender() {
        System.out.println("Atendendo ligação via Iphone");
    }
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando Correio de Voz do Iphone");
    }
}
