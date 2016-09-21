package gerestoque.persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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
		Funcionario func = new Funcionario();
		String sql = "SELECT * FROM funcionarios WHERE "
				+ "cpf LIKE (?) AND senha LIKE (?)";
		try {
			PreparedStatement psmt = con.prepareStatement(sql);
			psmt.setString(1, login);
			psmt.setString(2, senha);
			ResultSet rs = psmt.executeQuery();
			while( rs.next() )
			{
				func.setNome(rs.getString("nome"));
				func.setRg(rs.getString("rg"));
				func.setCpf(rs.getString("cpf"));
				func.setEmail(rs.getString("email"));
				func.setAcesso(rs.getString("acesso").charAt(0));
				func.setTelefone(rs.getString("telefone"));
				func.setCelular(rs.getString("celular"));
				func.setDt_nascimento(rs.getDate("data_nascimento"));
			}
		} catch (SQLException e) {
			System.out.println("Erro SQL: "+e);
		}
		
		if( func.getNome() == null ){
			return false;
		} else 	if( func.getNome() != null ){
			return true;
		}
		return false;
	}

}
