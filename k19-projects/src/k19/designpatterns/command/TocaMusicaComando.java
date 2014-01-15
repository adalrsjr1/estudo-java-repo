package k19.designpatterns.command;

public class TocaMusicaComando implements Comando
{

	private Player player;
	private String file;
		
	public TocaMusicaComando( Player player, String file )
	{
		super();
		this.player = player;
		this.file = file;
	}

	@Override
	public void executa( )
	{
		try
		{
			this.player.play( this.file );
		}
		catch ( InterruptedException e )
		{
			e.printStackTrace();
		}
		
	}

}
