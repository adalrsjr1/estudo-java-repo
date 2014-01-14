package k19.designpatterns.singleton;

public class TestaSingleton
{
	public static void main( String[] args )
	{
		Configuracao configuracao = Configuracao.getInstance();
		System.out.println( configuracao.getPropriedades( "time-zone" ) );
	}
}
