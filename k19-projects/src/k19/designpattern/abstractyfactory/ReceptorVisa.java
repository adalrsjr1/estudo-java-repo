package k19.designpattern.abstractyfactory;

public class ReceptorVisa implements Receptor
{

	@Override
	public String recebe()
	{
		System.out.println("Recebendo uma msg da Visa");
		String msg = "Mensagem Visa";
		return msg;
	}

}
