package k19.designpatterns.facade;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Estoque
{
	public void enviaProduto(String produto, String endDeEntrega)
	{
		Calendar calendar = Calendar.getInstance();
		calendar.add( Calendar.DATE, 2 );
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		String format = sdf.format( calendar.getTime() );
		
		System.out.println("O produto " + produto 
				+ " ser� entregue no endere�o " + endDeEntrega 
				+ " at� �s 18h do dia " + format);
	}
}
