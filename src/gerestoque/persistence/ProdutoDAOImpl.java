package gerestoque.persistence;

import java.sql.Connection;
import java.util.List;

import gerestoque.model.Produto;

public class ProdutoDAOImpl implements ProdutoDAO {
	private Connection con;
	
	public ProdutoDAOImpl() {
		con = DBUtil.getInstance().getConn();
	}

	@Override
	public void cadastrarProduto(Produto produto) {
		// TODO Auto-generated method stub
		
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
