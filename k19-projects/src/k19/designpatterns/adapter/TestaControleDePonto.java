package k19.designpatterns.adapter;

public class TestaControleDePonto
{

	public static void main( String[] args ) throws InterruptedException
	{
//		ControleDePonto controleDePonto = new ControleDePonto();
		ControleDePonto controleDePonto = new ControleDePontoAdapter();
		Funcionario funcionario = new Funcionario( "Marcelo Martins" );
		controleDePonto.registraEntrada( funcionario );
		Thread.sleep( 3000 );
		controleDePonto.registraSaida( funcionario );
		
	}

}
