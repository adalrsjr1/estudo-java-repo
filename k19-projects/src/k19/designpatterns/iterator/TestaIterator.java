package k19.designpatterns.iterator;

import java.util.Iterator;

public class TestaIterator
{

	public static void main( String[] args )
	{
		String[] nomes = new String[4];
		nomes[0] = "Rafel";
		nomes[1] = "Marcelo";
		nomes[2] = "Jonas";
		nomes[3] = "Solange";
		
		ListaDeNomes listaDeNomes = new ListaDeNomes( nomes );
		Iterator< String > iterator = listaDeNomes.iterator();
		iterator.hasNext();
		iterator.remove();
		
		while(iterator.hasNext())
		{
			String nome = iterator.next();
			System.out.println(nome);
		}
		
		System.out.println("----------");
		System.out.println("Testando o foreach");
		for(String nome : listaDeNomes)
		{
			System.out.println(nome);
		}
	}

}
