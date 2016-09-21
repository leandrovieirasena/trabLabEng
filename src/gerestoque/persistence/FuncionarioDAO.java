package gerestoque.persistence;

import java.util.List;

import gerestoque.model.Funcionario;

public interface FuncionarioDAO {
	
	public void cadastrarFuncionario( Funcionario func );
	public void excluirFuncionario( String codigoFuncionario );
	public void alterarFuncionario( String nome );
	public Funcionario consultaFuncionarioPorNome( String nome );
	public List<Funcionario> consultaFuncionarios( String nome );
	public boolean verificaLoginFuncionario( String login, String senha );
}
