package k19.designpatterns.state.memento;

import java.util.ArrayDeque;
import java.util.Deque;

import k19.designpatterns.state.Taximetro;

public class MementoTaximentro
{
	private Deque< Taximetro > undoData = new ArrayDeque<>();
	private Deque< Taximetro > redoData = new ArrayDeque<>();
		
	public MementoTaximentro(Taximetro taximetro)
	{
		updateState( taximetro );
	}
	
	public Taximetro getState()
	{
		return undoData.getFirst();
	}
	
	public void updateState(Taximetro state)
	{
		undoData.push( state.clone() );
		redoData.clear();
	}
	
	public void undo( )
	{
		if(undoData.size() == 0)
			throw new IllegalAccessError( "Pilha de estados 'undo' vazia" );
		redoData.push( undoData.pop().clone() );
	}
	
	public void redo()
	{
		if(redoData.size() == 0)
			throw new IllegalAccessError( "Pilha de estados 'redo' vazia" );
		undoData.push( redoData.pop().clone() );
		
	}
}
