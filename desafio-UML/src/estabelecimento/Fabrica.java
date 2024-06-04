package estabelecimento;

import equipamentos.iphone.iPhone;
import equipamentos.reprodutormusical.ReprodutorMusical;
import equipamentos.navegador.NavegadorNaInternet;
import equipamentos.telefone.AparelhoTelefonico;
import equipamentos.telefone.Phone;

public class Fabrica {
    public static void main(String[] args) {
        iPhone apple = new iPhone();
        NavegadorNaInternet safari = apple;
        ReprodutorMusical spotify = apple;
        AparelhoTelefonico telefone = apple;

        safari.exibirPagina();
        spotify.tocar();
        telefone.atender();



    }
}
