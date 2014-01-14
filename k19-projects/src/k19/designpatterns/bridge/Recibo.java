package k19.designpatterns.bridge;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Recibo implements Documento
{

	private String emissor;
	private String favorecido;
	private double valor;
	private GeradorDeArquivo geradorDeArquivo;
	
	public Recibo( String emissor, String favorecido, double valor,
			GeradorDeArquivo geradorDeArquivo )
	{
		super();
		this.emissor = emissor;
		this.favorecido = favorecido;
		this.valor = valor;
		this.geradorDeArquivo = geradorDeArquivo;
	}

	public Recibo( String emissor, String favorecido, double valor )
	{
		super();
		this.emissor = emissor;
		this.favorecido = favorecido;
		this.valor = valor;
	}

	@Override
	public void geraArquivo()
	{
//		try
//		{
//			PrintStream saida = new PrintStream( "./src/k19/designpatterns/bridge/recibo.txt" );
//			saida.println("Recibo: ");
//			saida.println("Empresa: " + this.emissor);
//			saida.println("Cliente:" + this.favorecido);
//			saida.println("Valor:" + this.valor);
//			saida.close();
//		}
//		catch( FileNotFoundException e )
//		{
//			e.printStackTrace();
//		}
		
		StringBuffer buffer = new StringBuffer();
		buffer.append( "Recibo: " )
			  .append( "\n" )
			  .append( "Empresa: " + this.emissor )
			  .append( "\n" )
			  .append( "Cliente: " + this.favorecido )
			  .append( "\n" )
			  .append( "Valor: " + this.valor )
			  .append( "\n" );
		this.geradorDeArquivo.gera( buffer.toString()  );
	}

}
