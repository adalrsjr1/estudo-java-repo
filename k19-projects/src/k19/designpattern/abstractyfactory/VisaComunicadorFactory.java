package k19.designpattern.abstractyfactory;

public class VisaComunicadorFactory implements ComunicadorFactory
{

	private EmissorCreator emissorCreator = new EmissorCreator();
	private ReceptorCreator receptorCreator = new ReceptorCreator();
	
	@Override
	public Emissor createEmissor()
	{
		return emissorCreator.create( TipoEmissor.VISA );
	}

	@Override
	public Receptor createReceptor()
	{
		return receptorCreator.create( TipoReceptor.VISA );
	}

}
