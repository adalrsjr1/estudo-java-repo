package k19.designpattern.abstractyfactory;

enum TipoEmissor {VISA, MASTERCARD};

public class EmissorCreator
{
	public Emissor create(TipoEmissor tipoEmissor)
	{
		if(tipoEmissor == TipoEmissor.VISA) return new EmissorVisa();
		else if(tipoEmissor == TipoEmissor.MASTERCARD) return new EmissorMasterCard();
		else throw new IllegalArgumentException( "Tipo não suportado" );
	}
}
