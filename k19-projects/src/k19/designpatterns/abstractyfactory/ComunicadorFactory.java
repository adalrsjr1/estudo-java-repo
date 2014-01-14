package k19.designpatterns.abstractyfactory;

public interface ComunicadorFactory
{
	Emissor createEmissor();
	Receptor createReceptor();
}
