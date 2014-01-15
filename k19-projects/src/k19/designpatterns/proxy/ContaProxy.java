package k19.designpatterns.proxy;

public class ContaProxy implements Conta
{

	Conta conta;
	
	public ContaProxy(Conta conta)
	{
		this.conta = conta;
	}
	
	@Override
	public void deposita( double valor )
	{
		System.out.println("Efetuando o depósito de R$ " + valor + " ...");
		this.conta.deposita( valor );
	}

	@Override
	public void saca( double valor )
	{
		System.out.println("Efetuando o saque de R$ " + valor + " ...");
		this.conta.saca( valor );
	}

	@Override
	public double getSaldo()
	{
		System.out.println("Verificando o saldo...");
		return this.conta.getSaldo();
	}

}
