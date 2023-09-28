
public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {


	//classe iphone  vai  implementar as  interfaces 
	
	@Override
	public void tocar() {

		System.out.println("Iphone tocando");
	}

	@Override
	public void pausar() {
		System.out.println("Iphone Pausar");

	}

	@Override
	public void selecionarMusica() {

		System.out.println("Selecionar Musica  do Iphone");

	}

	@Override
	public void exibirPagina() {
		System.out.println("ExibirPagina  do Iphone");

	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Adicionar Nova Aba do Iphone");

	}

	@Override
	public void atualizarPagina() {
		System.out.println("Atualizando  Pagina  do Iphone");

	}

	@Override
	public void ligar() {

		System.out.println("Ligando  Iphone");

	}

	@Override
	public void atender() {

		System.out.println("Atendendo  Iphone");

	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("Iniciando Correiodevoz");

	}

}
