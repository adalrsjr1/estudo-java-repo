package k19.designpatterns.factory;

public class TestaEmissores
{
	public static void main(String...args)
	{
		EmissorCreator creator = new EmissorCreator();
		
		Emissor emissor = creator.create( TypeMsg.SMS );
		emissor.envia( "teste emissor" );
		
		emissor = creator.create( TypeMsg.EMAIL );
		emissor.envia( "teste emissor" );
		
		emissor = creator.create( TypeMsg.JMS );
		emissor.envia( "teste emissor" );
	}
}
