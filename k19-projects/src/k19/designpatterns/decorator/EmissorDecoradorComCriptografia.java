package k19.designpatterns.decorator;

public class EmissorDecoradorComCriptografia extends EmissorDecorador
{
	public EmissorDecoradorComCriptografia(Emissor emissor)
	{
		super(emissor);
	}

	@Override
	public void envia( String msg )
	{
		System.out.println("Enviando mensagem criptografada: ");
		this.getEmissor().envia( criptografa(msg) );
	}
	
	private String criptografa(String msg)
	{
		String msgCript = new StringBuilder(msg).reverse().toString();
		return msgCript;
	}

}
