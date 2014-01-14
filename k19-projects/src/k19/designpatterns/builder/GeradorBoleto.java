package k19.designpatterns.builder;

import java.util.Calendar;

public class GeradorBoleto
{
	private BoletoBuilder boletoBuilder;

	public GeradorBoleto( BoletoBuilder boletoBuilder )
	{
		this.boletoBuilder = boletoBuilder;
	}
	
	public Boleto geraBoleto()
	{
		this.boletoBuilder.buildSacado( "José Pereira" );
		this.boletoBuilder.buildCedente( "Padaria do Seu João" );
		this.boletoBuilder.buildValor( 100.54 );
		Calendar vencimento = Calendar.getInstance();
		vencimento.add( Calendar.DATE, 30 );
		this.boletoBuilder.buildVencimento( vencimento );
		this.boletoBuilder.buildNossoNumero( 12345 );
		
		Boleto boleto = this.boletoBuilder.getBoleto();
		return boleto;
	}
}
