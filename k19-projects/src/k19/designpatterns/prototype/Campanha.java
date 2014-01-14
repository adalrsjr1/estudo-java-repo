package k19.designpatterns.prototype;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;

public class Campanha implements Prototype< Campanha >
{
	private String nome;
	private Calendar vencimento;
	private Set< String > palavrasChave;
	
	public Campanha( String nome, Calendar vencimento,
			Set< String > palavrasChave )
	{
		super();
		this.nome = nome;
		this.vencimento = vencimento;
		this.palavrasChave = palavrasChave;
	}

	public String getNome()
	{
		return nome;
	}

	public Calendar getVencimento()
	{
		return vencimento;
	}

	public Set< String > getPalavrasChave()
	{
		return palavrasChave;
	}
	
	public Campanha clone()
	{
		String nome = "Cópia da Campanha: " + this.nome;
		Calendar vencimento = (Calendar) this.vencimento.clone();
		Set< String > palavrasChave = new HashSet<>( this.palavrasChave );
		Campanha campanha = new Campanha( nome, vencimento, palavrasChave );
		
		return campanha;
	}
	
	public String toString()
	{
		StringBuffer buffer = new StringBuffer();
		buffer.append( "---------------" )
			  .append("\n")
			  .append( "Nome da Campanha: " )
			  .append( this.nome )
			  .append( "\n" );
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		String format = sdf.format( this.vencimento.getTime() );
		buffer.append( "Vencimento: " + format )
			  .append( "\n" )
			  .append( "Palavras-chave: \n" );
		for( String palavraChave: this.palavrasChave )
		{
			buffer.append( " - " + palavraChave )
				  .append( "\n" );
		}
		buffer.append( "-----------" )
			  .append( "\n" );
		return buffer.toString();
	}
	
}
