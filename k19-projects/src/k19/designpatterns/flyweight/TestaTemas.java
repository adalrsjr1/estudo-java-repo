package k19.designpatterns.flyweight;

public class TestaTemas
{
	public static void main( String[] args )
	{
		Apresentacao a = new Apresentacao();
		a.adicionaSlide( new Slide( TemaFlyweightFactory.
				getTema( TemaFlyweightFactory.K19 ), "Teste K19", "bla bla bla" ) );
		
		a.adicionaSlide( new Slide( TemaFlyweightFactory.
				getTema( TemaFlyweightFactory.ASTERISCO ), "Teste K19", "bla bla bla" ) );
		
		a.adicionaSlide( new Slide( TemaFlyweightFactory.
				getTema( TemaFlyweightFactory.HIFEN), "Teste K19", "bla bla bla" ) );
		
		a.imprime();
	}
}
