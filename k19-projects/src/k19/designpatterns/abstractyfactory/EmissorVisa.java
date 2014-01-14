package k19.designpatterns.abstractyfactory;

public class EmissorVisa implements Emissor
{

	@Override
	public void envia( String msg )
	{
		System.out.println("Enviando a seguinte msg para a Visa");
		System.out.println(msg);
	}

}
