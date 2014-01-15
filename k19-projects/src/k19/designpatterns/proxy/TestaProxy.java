package k19.designpatterns.proxy;

public class TestaProxy
{
	public static void main( String[] args )
	{
		Conta contaPadrao = new ContaPadrao();
		Conta contaProxy = new ContaProxy( contaPadrao );
		
		contaProxy.deposita( 100 );
		contaProxy.saca( 59 );
		System.out.println("Saldo: " + contaProxy.getSaldo());
	}
}
