package k19.designpatterns.abstractyfactory;

public class MasterCardComunicadorFactory implements ComunicadorFactory
{

	private EmissorCreator emissorCreator = new EmissorCreator();
	private ReceptorCreator receptorCreator = new ReceptorCreator();
	
	@Override
	public Emissor createEmissor()
	{
		return emissorCreator.create( TipoEmissor.MASTERCARD );
	}

	@Override
	public Receptor createReceptor()
	{
		return receptorCreator.create( TipoReceptor.MASTERCARD );
	}

}
