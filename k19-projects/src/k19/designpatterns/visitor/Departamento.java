package k19.designpatterns.visitor;

import java.util.ArrayList;
import java.util.List;

public class Departamento
{
	private String nome;
	private List<Funcionario> funcionarios = new ArrayList<>();
	
	public Departamento(String nome)
	{
		this.nome = nome;
	}
	
	public String  getNome()
	{
		return nome;
	}
	
	public List<Funcionario> getFuncionarios()
	{
		return funcionarios;
	}
	
	public void aceita(AtualizadorDeFuncionario atualizador)
	{
		for(Funcionario f : this.funcionarios)
		{
			f.aceita( atualizador );
		}
	}

}
