package k19.designpatterns.objectpool;

public class TestaFuncionarioPool
{

	public static void main( String[] args )
	{
		Pool< Funcionario > funcionarioPool = new FuncionarioPool();
		Funcionario funcionario = funcionarioPool.acquire();
		
		while ( funcionario != null )
		{
			System.out.println(funcionario.getNome());
			funcionario = funcionarioPool.acquire();
		}
		
	}

}
