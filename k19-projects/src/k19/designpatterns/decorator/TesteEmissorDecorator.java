package k19.designpatterns.decorator;

public class TesteEmissorDecorator
{
	public static void main( String[] args )
	{
		String msg = "Esta é uma mensagem de teste";
		
		Emissor emissorCript = new EmissorDecoradorComCriptografia( new EmissorBasico() );
		emissorCript.envia( msg );
		
		Emissor emissorCompr = new EmissorDecoratorComCompressao( new EmissorBasico() );
		emissorCompr.envia( msg );
		
		Emissor emissorCriptCompr = new EmissorDecoradorComCriptografia( 
									  new EmissorDecoratorComCompressao(new EmissorBasico()));
		emissorCriptCompr.envia( msg );
		
	}
}
