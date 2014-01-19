package k19.designpatterns.templatemethod;

public class ContaPoupanca extends Conta
{

	@Override
	public double calculaTaxa()
	{
		return 1;
	}

}
