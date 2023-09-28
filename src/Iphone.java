
public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {

	private NavegadorInternet navegadorInternet;
	private ReprodutorMusical reprodutormusical;
	
	private AparelhoTelefonico aparelhotelefonico;
	
	
	Iphone(){
		
	}
	
	
	
	
	public AparelhoTelefonico getAparelhotelefonico() {
		return aparelhotelefonico;
	}

	public NavegadorInternet getNavegadorInternet() {
		return navegadorInternet;
	}

	public ReprodutorMusical getReprodutormusical() {
		return reprodutormusical;
	}

	
	
	
	
	
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
