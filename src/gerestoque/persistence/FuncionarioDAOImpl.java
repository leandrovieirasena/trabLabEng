package gerestoque.persistence;

import java.sql.Connection;
import java.util.List;

import gerestoque.model.Funcionario;

public class FuncionarioDAOImpl implements FuncionarioDAO {
	private Connection con;
	
	public FuncionarioDAOImpl() {
		con = DBUtil.getInstance().getConn();
	}
	
	@Override
	public void cadastrarFuncionario(Funcionario func) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void excluirFuncionario(String codigoFuncionario) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void alterarFuncionario(String nome) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Funcionario consultaFuncionarioPorNome(String nome) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Funcionario> consultaFuncionarios(String nome) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean verificaLoginFuncionario(String login, String senha) {
		String sql = "SELECT cpf, senha, acesso FROM funcionarios WHERE"
				+ "cpf = (?) AND senha = (?)";
		
		
		return false;
	}

}
