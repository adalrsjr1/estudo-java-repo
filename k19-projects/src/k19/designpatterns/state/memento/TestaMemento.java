package k19.designpatterns.state.memento;

import k19.designpatterns.state.Bandeira;
import k19.designpatterns.state.Bandeira1;
import k19.designpatterns.state.Bandeira2;
import k19.designpatterns.state.Taximetro;

public class TestaMemento
{
	public static void main( String[] args )
	{
		Bandeira b1 = new Bandeira1();
		Bandeira b2 = new Bandeira2();
		
		Taximetro taximetro = new Taximetro( b1 );
		MementoTaximentro memento = new MementoTaximentro(taximetro);
		
		double valor1 = taximetro.calculaValorDaCorrida( 10, 20 );
		System.out.println( "Valor da corrida em bandeira 1: " + valor1);
		
		taximetro.setBandeira( b2 );
		memento.updateState( taximetro );
		
		double valor2 = taximetro.calculaValorDaCorrida( 10,20 );
		System.out.println( "Valor da corrida em bandeira 2: " + valor2);
		
		taximetro.setBandeira( b1 );
		memento.updateState( taximetro );
		
		taximetro.setBandeira( b1 );
		memento.updateState( taximetro );
		
		taximetro.setBandeira( b2 );
		memento.updateState( taximetro );
		
		System.out.println( memento.getState().toString() );
		memento.undo();
		System.out.println( memento.getState().toString() );
		memento.undo();
		System.out.println( memento.getState().toString() );
		memento.undo();
		System.out.println( memento.getState().toString() );
		memento.undo();
		System.out.println( memento.getState().toString() );
		memento.undo();
		
		System.out.println();
		
		memento.redo();
		System.out.println( memento.getState().toString() );
		memento.redo();
		System.out.println( memento.getState().toString() );
		memento.redo();
		System.out.println( memento.getState().toString() );
		memento.redo();
		System.out.println( memento.getState().toString() );
		memento.redo();
		System.out.println( memento.getState().toString() );
		memento.redo();
		System.out.println( memento.getState().toString() );
		
	}
}
