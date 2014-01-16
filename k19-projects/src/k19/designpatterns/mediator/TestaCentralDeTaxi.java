package k19.designpatterns.mediator;

public class TestaCentralDeTaxi
{

	public static void main( String[] args )
	{
		CentralDeTaxi central = new CentralDeTaxi();
		
		Passageiro p1 = new Passageiro( "Rafael", central );
		Passageiro p2 = new Passageiro( "Marcelo", central );
		Passageiro p3 = new Passageiro( "Jonas", central );
		
		Taxi t1 = new Taxi( central );
		central.adicionaTaxiDisponivel( t1 );
		
		Taxi t2 = new Taxi( central );
		central.adicionaTaxiDisponivel( t2 );
		
		new Thread( p1 ).start();
		new Thread( p2 ).start();
		new Thread( p3 ).start();
	}

}
