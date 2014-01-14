package k19.designpatterns.decorator;

public class EmissorBasico implements Emissor
{

	@Override
	public void envia( String msg )
	{
		System.out.println("Enviando uma mensagem: ");
		System.out.println(msg);
	}

}
