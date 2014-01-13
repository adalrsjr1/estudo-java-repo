package k19.designpattern.abstractyfactory;

import java.util.Scanner;

public class TestaComunicadorFactory
{
	public static void main( String... args ) throws InstantiationException, IllegalAccessException, ClassNotFoundException
	{
		Scanner scn = new Scanner( System.in );
		String type = scn.nextLine();
		
		ComunicadorFactory comunicadorFactory = ( ComunicadorFactory ) Class.forName( "k19.designpattern.abstractyfactory." + type + "ComunicadorFactory" ).newInstance();
		
		String transacao = "Valor=560;Senha=123";
		
		Emissor emissor = comunicadorFactory.createEmissor();
		emissor.envia( transacao );
		
		Receptor receptor = comunicadorFactory.createReceptor();
		String msg = receptor.recebe();
		
		System.out.println( msg );
	}
}
