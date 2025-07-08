public class Main 
{
    public static void main(String[] args) throws Exception {
        iPhone meuIPhone = new iPhone();

        //Imprimindo as funções do Reprodutor musical
        System.out.println("-- Reprodutor Musical: --\n");
        meuIPhone.selecionarMusica("See You Again - Tyler, The Creator");
        meuIPhone.tocar();
        meuIPhone.pausar();

        //Imprimindo as funções do Telefone
        System.out.println("-- Aparelho Telefônico: --\n");
        meuIPhone.ligar("34 99999-9999");
        meuIPhone.atender();
        meuIPhone.iniciarCorreioVoz();

        //Imprimindo as funções do Navegador
        System.out.println("-- Navegador na Internet: --\n");
        meuIPhone.exibirPagina("https://www.linkedin.com/in/gabryelhgb/");
        meuIPhone.adicionarNovaAba();
        meuIPhone.atualizarPagina();
    }
}