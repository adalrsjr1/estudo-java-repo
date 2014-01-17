package k19.designpatterns.state;

public class Taximetro
{
	private Bandeira bandeira;
	
	public Taximetro( Bandeira bandeira )
	{
		this.bandeira = bandeira;
	}
	
	public void setBandeira( Bandeira bandeira )
	{
		this.bandeira = bandeira;
	}
	
	public double calculaValorDaCorrida(double tempo, double distancia)
	{
		return this.bandeira.calculaValorDaCorrida( tempo, distancia );
	}
	
	public Taximetro clone()
	{
		return new Taximetro(this.bandeira);
	}
	
	public String toString()
	{
		return bandeira.toString();
	}
}
