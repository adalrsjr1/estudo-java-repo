package k19.designpatterns.facade;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class PosVenda
{
	public void agendaContato(String cliente, String produto)
	{
		Calendar calendar = Calendar.getInstance();
		calendar.add( Calendar.DATE, 30 );
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		String format = sdf.format( calendar.getTime() );
		
		System.out.println("Entrar em contato com o " + cliente + 
				" sobre o produto " + produto + " no dia " + format);
	}
}
