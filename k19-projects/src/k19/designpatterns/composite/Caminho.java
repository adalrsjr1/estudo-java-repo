package k19.designpatterns.composite;

import java.util.ArrayList;
import java.util.List;

public class Caminho implements Trecho
{

	private List< Trecho > trechos;
	
	public Caminho()
	{
		this.trechos = new ArrayList<>();
	}
	
	public Caminho adiciona(Trecho trecho)
	{
		this.trechos.add( trecho );
		return this;
	}
	
	public Caminho remove(Trecho trecho)
	{
		this.trechos.remove( trecho );
		return this;
	}
	
	@Override
	public void imprime()
	{
		for(Trecho trecho : this.trechos)
		{
			trecho.imprime();
		}
	}

}
