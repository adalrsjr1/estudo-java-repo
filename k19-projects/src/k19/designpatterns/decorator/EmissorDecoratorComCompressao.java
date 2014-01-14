package k19.designpatterns.decorator;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;

public class EmissorDecoratorComCompressao extends EmissorDecorador
{

	public EmissorDecoratorComCompressao(Emissor emissor)
	{
		super(emissor);
	}
	
	@Override
	public void envia( String msg )
	{
		System.out.println("Enviando mensagem comprimida");
		String msgCmp;
		try
		{
			msgCmp = comprime( msg );
		}
		catch ( IOException e )
		{
			msgCmp = msg;
		}
		this.getEmissor().envia( msgCmp );
	}
	
	private String comprime(String msg) throws IOException
	{
		ByteArrayOutputStream out = new ByteArrayOutputStream();
		DeflaterOutputStream dout = new DeflaterOutputStream( out, new Deflater() );
		dout.write( msg.getBytes() );
		dout.close();
		return new String(out.toByteArray());
	}

}
