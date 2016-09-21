package gerestoque.persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.sun.org.apache.xml.internal.utils.PrefixResolverDefault;

import gerestoque.model.Produto;

public class ProdutoDAOImpl implements ProdutoDAO {
	private Connection con;
	
	public ProdutoDAOImpl() {
		con = DBUtil.getInstance().getConn();
	}

	@Override
	public void cadastrarProduto(Produto prod) {
		String sql ="INSERT INTO produtos (nome) " + 
		"VALUES (?)";
		try {
			PreparedStatement psmt = con.prepareStatement(sql);
			psmt.setString(1, prod.getNome());
			psmt.executeUpdate();
			System.out.println("Incluido com sucesso");
		} catch (SQLException e) {
			System.out.println(e);
		}
		
	}

	@Override
	public String excluirProduto(String codigoProduto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Produto consultaProdutoPorNome(String nomeProduto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void alterarProduto(String nomeProduto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Produto> consultarProdutosPorNome(String nomeProduto) {
		// TODO Auto-generated method stub
		return null;
	}
	
	/* inserir comentários explicando essa classe e terminar crud */ 

}
