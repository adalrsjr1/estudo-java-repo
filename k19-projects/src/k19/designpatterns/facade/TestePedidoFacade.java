package k19.designpatterns.facade;

public class TestePedidoFacade
{

	public static void main( String[] args )
	{
		Estoque e = new Estoque();
		Financeiro f = new Financeiro();
		PosVenda pv = new PosVenda();
		
		PedidoFacade facade = new PedidoFacade( e, f, pv );
		Pedido p = new Pedido("Notebook", "Rafael", "Av 1, 1234, São Paulo, SP");
		facade.registraRedido( p );
	}

}
