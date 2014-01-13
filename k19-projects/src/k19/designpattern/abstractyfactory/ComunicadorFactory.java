package k19.designpattern.abstractyfactory;

public interface ComunicadorFactory
{
	Emissor createEmissor();
	Receptor createReceptor();
}
