package k19.designpatterns.builder;

public class TestaGeradorDeBoleto
{

	public static void main( String[] args )
	{
		BoletoBuilder boletoBuilder = new BBBoletoBuilder();
		GeradorBoleto geradorDeBoleto = new GeradorBoleto( boletoBuilder );
		Boleto boleto = geradorDeBoleto.geraBoleto();
		System.out.println(boleto);
	}

}
