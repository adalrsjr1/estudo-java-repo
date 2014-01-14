package k19.designpatterns.facade;

public class Pedido
{
	private String produto;
	private String cliente;
	private String endDeEntrega;
	
	public Pedido( String produto, String cliente, String endDeEntrega )
	{
		super();
		this.produto = produto;
		this.cliente = cliente;
		this.endDeEntrega = endDeEntrega;
	}

	public String getProduto()
	{
		return produto;
	}

	public String getCliente()
	{
		return cliente;
	}

	public String getEndDeEntrega()
	{
		return endDeEntrega;
	}
	
	
}
