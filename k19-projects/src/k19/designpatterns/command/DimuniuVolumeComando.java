package k19.designpatterns.command;

public class DimuniuVolumeComando implements Comando
{
	private Player player;
	private int levels;
	
	public DimuniuVolumeComando( Player player, int levels )
	{
		super();
		this.player = player;
		this.levels = levels;
	}

	@Override
	public void executa( )
	{
		this.player.decreaseVolume( levels );
	}

}
