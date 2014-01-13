package k19.designpatterns.factory;

public class EmissorSMS implements Emissor {

	@Override
	public void envia(String msg) 
	{
		System.out.println("Enviando SMS");
		System.out.println(msg);
	}

}
