package k19.designpatterns.factory;

enum TypeMsg {SMS, EMAIL, JMS};

public class EmissorCreator
{
	public Emissor create(TypeMsg type)
	{
		if(type == TypeMsg.SMS) return new EmissorSMS();
		else if(type == TypeMsg.EMAIL) return new EmissorEmail();
		else if(type == TypeMsg.JMS) return new EmissorJMS();
		else throw new IllegalArgumentException("Tipo não suportado");
	}
}
