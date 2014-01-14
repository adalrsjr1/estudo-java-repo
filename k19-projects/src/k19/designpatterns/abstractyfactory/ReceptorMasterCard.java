package k19.designpatterns.abstractyfactory;

public class ReceptorMasterCard implements Receptor
{

	@Override
	public String recebe()
	{
		System.out.println("Recebendo uma msg da MasterCard");
		String msg = "Mensagem MasterCard";
		return msg;
	}

}
