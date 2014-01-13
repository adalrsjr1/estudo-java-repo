package k19.designpatterns.factory;

public class EmissorJMS implements Emissor
{

	@Override
	public void envia( String msg )
	{
		System.out.println("Enviando JMS");
		System.out.println(msg);
	}

}
