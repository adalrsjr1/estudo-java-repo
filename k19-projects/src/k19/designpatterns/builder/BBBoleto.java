package k19.designpatterns.builder;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class BBBoleto implements Boleto
{

	private String sacado;
	private String cedente;
	private double valor;
	private Calendar vencimento;
	private int nossoNumero;
	
	public BBBoleto( String sacado, String cedente, double valor,
			Calendar vencimento, int nossoNumero )
	{
		this.sacado = sacado;
		this.cedente = cedente;
		this.valor = valor;
		this.vencimento = vencimento;
		this.nossoNumero = nossoNumero;
	}

	@Override
	public String getSacado()
	{
		return this.sacado;
	}

	@Override
	public String getCedente()
	{
		return this.cedente;
	}

	@Override
	public double getValor()
	{
		return this.valor;
	}

	@Override
	public Calendar getVencimento()
	{
		return this.vencimento;
	}

	@Override
	public int getNossoNumero()
	{
		return this.nossoNumero;
	}

	public String toString()
	{
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		String format = sdf.format( this.vencimento.getTime() );
		
		StringBuilder sb = new StringBuilder();
		
		sb.append( "Boleto BB\n" )
		  .append( "Sacado: " + this.sacado + "\n" )
		  .append( "Cedente: " + this.cedente + "\n" )
		  .append( "Valor: " + this.valor + "\n" )
		  .append( "Vencimento: " + format + "\n" )
		  .append( "Nosso Numero: " + this.nossoNumero + "\n" );
		
		return sb.toString();
	}
	
}
