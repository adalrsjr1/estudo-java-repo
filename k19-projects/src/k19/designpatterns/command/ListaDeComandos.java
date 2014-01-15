package k19.designpatterns.command;

import java.util.ArrayList;
import java.util.List;

public class ListaDeComandos
{
	private List<Comando> comandos = new ArrayList<>();
	
	public ListaDeComandos adiciona(Comando comando)
	{
		this.comandos.add( comando );
		return this;
	}
	
	public void executa()
	{
		for(Comando comando : this.comandos)
		{
			comando.executa();
		}
	}
}
