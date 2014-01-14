package k19.designpatterns.decorator;

public abstract class EmissorDecorador implements Emissor
{

	private Emissor emissor;
	
	public EmissorDecorador( Emissor emissor )
	{
		super();
		this.emissor = emissor;
	}

	@Override
	public abstract void envia( String msg );
	
	public Emissor getEmissor() 
	{
		return this.emissor;
	}

}
