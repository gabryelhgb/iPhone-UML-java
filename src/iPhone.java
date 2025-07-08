public class iPhone implements ReprodutorMusical, NavegadorDeInternet, AparelhoTelefonico
{
    private String musica;
    private String numero;
    private String url;

    //Reprodutor musical
    @Override
    public void tocar(){
        System.out.println("Tocando a música: " + this.musica);
    }

    @Override
    public void pausar(){
        System.out.println("Pausando a música: " + this.musica + "\n");
    }

    @Override
    public void selecionarMusica(String musica){
        this.musica = musica;
    }

    //Aparelho Telefonico
    @Override
    public void ligar(String numero){
        this.numero = numero;
        System.out.println("Ligando para: " + this.numero);
    }

    @Override
    public void atender(){
        System.out.println("Atendendo ligação de: " + this.numero);
    }

    @Override
    public void iniciarCorreioVoz(){
        System.out.println("Iniciando correio de voz\n");
    }

    //Navegador de Internet
    @Override
    public void exibirPagina(String url){
        this.url = url;
        System.out.println("Exibindo página: " + this.url);
    }

    @Override
    public void adicionarNovaAba(){
        System.out.println("Adicionando nova aba");
    }

    @Override
    public void atualizarPagina(){
        System.out.println("Atualizando página: " + this.url + "\n");
    }

}