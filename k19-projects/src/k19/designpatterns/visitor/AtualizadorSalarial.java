package k19.designpatterns.visitor;

public class AtualizadorSalarial implements AtualizadorDeFuncionario
{

	@Override
	public void atualiza( Gerente g )
	{
		g.setSalario( g.getSalario() * 1.43 );
	}

	@Override
	public void atualiza( Telefonista t )
	{
		t.setSalario( t.getSalario() * 1.27 );
	}

}
