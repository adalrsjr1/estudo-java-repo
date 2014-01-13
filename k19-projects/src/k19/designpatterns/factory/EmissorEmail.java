package k19.designpatterns.factory;

public class EmissorEmail implements Emissor
{

	@Override
	public void envia( String msg )
	{
		System.out.println("Enviando Email");
		System.out.println(msg);
	}

}
