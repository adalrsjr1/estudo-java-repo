package k19.designpatterns.bridge;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class GeradorDeArquivoTXT implements GeradorDeArquivo
{

	@Override
	public void gera( String conteudo )
	{
		try
		{
			PrintStream saida = new PrintStream( "./src/k19/designpatterns/bridge/arquivo.txt" );
			saida.println(conteudo);
			saida.close();
		}
		catch ( FileNotFoundException e )
		{
			e.printStackTrace();
		}
	}

}
