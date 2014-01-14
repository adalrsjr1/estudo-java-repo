package k19.designpatterns.abstractyfactory;

public class EmissorMasterCard implements Emissor
{

	@Override
	public void envia( String msg )
	{
		System.out.println("Enviando a seguinte msg para a MasterCard");
		System.out.println(msg);
	}

}
