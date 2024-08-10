import aparelhoTelefonico.AparelhoTelefonico;
import navegadorInternet.NavegadorInternet;
import reprodutorMusical.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, ReprodutorMusical, NavegadorInternet{
    public void main(String[] args) throws Exception {
        System.out.println("Musica:");
        tocar();
        pausar();
        selecionarMusica("Roberto Carlos | Calhambeque");
        System.out.println("Telefone: ");
        ligar("+41 91234-5678");
        atender();
        iniciarCorreioVoz();
        System.out.println("Navegador: ");
        exibirPagina("www.github.com/pedroquack");
        adicionarNovaAba();
        atualizarPagina();
    }

    //Musica
    @Override
    public void tocar() {
        System.out.println("Tocando");
    }
    @Override
    public void pausar() {
        System.out.println("Pausando");
    }
    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Tocando: " + musica);
    }

    //Telefone

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para: " + numero);
    }

    @Override
    public void atender() {
        System.out.println("atendendo");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Correio de voz");
    }
    //Navegador

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("atualizando");
    }
}
