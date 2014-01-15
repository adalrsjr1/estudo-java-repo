package k19.designpatterns.command;

public class AumentaVolumeComando implements Comando
{

	private Player player;
	private int levels;
	
	public AumentaVolumeComando( Player player, int levels )
	{
		super();
		this.player = player;
		this.levels = levels;
	}

	@Override
	public void executa( )
	{
		this.player.increaseVolume( this.levels );
	}

}
