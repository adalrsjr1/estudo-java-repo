package k19.designpattern.abstractyfactory;

enum TipoReceptor {VISA, MASTERCARD};

public class ReceptorCreator
{
	public Receptor create(TipoReceptor tipoReceptor)
	{
		if(tipoReceptor == TipoReceptor.VISA) return new ReceptorVisa();
		else if(tipoReceptor == TipoReceptor.MASTERCARD) return new ReceptorMasterCard();
		else throw new IllegalArgumentException( "Tipo não suportado" );
	}
}
