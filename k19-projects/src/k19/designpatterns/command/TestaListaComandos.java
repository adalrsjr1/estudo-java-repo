package k19.designpatterns.command;

public class TestaListaComandos
{
	public static void main( String[] args )
	{
		Player player = new Player();
		ListaDeComandos lista = new ListaDeComandos();
		
		lista.adiciona( new TocaMusicaComando( player, "musica1.mp3" ) )
			 .adiciona( new AumentaVolumeComando( player, 3 ) )
			 .adiciona( new TocaMusicaComando( player, "musica2.mp3" ) )
			 .adiciona( new DimuniuVolumeComando( player, 3 ) )
			 .adiciona( new TocaMusicaComando( player, "musica3.mp3" ) );
		
		lista.executa();
	}
}
