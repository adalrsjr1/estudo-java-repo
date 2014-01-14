package k19.designpatterns.composite;

public class TestaCaminho
{

	public static void main( String[] args )
	{
		Trecho trecho1 = new TrechoAndando( 
				"V� at� o cruzamento da Av. Rebou�as com a Av. Brigadeiro Faria de Lima",
				500 );
		
		Trecho trecho2 = new TrechoDeCarro( 
				"V� at� o cruzamento da Av. Brigadeiro Faria de Lima com a Av. Cidade Jardim",
				1500 );
		
		Trecho trecho3 = new TrechoDeCarro( 
				"Vire a direita na Marginal Pinheiros",
				500 );
		
		Caminho caminho1 = new Caminho();
		caminho1.adiciona( trecho1 )
				.adiciona( trecho2 );
		
		System.out.println("Caminho1: ");
		caminho1.imprime();
		
		Caminho caminho2 = new Caminho();
		caminho2.adiciona( caminho1 )
				.adiciona( trecho3 );
		System.out.println("----------");
		System.out.println("Caminho2: ");
		caminho2.imprime();
		
	}

}
