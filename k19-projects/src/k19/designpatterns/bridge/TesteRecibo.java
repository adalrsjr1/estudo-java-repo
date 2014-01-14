package k19.designpatterns.bridge;

public class TesteRecibo
{
	public static void main( String[] args )
	{
		//Recibo recibo = new Recibo("Padaria do Joaquim", "Joaquim", 1000);
		Recibo recibo = new Recibo("Padaria do Joaquim", "Joaquim", 1000, 
				new GeradorDeArquivoTXT());
		recibo.geraArquivo();
	}
}
