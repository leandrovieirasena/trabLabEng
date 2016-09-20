package gerestoque.persistence;

import java.util.List;

import gerestoque.model.Produto;

public interface ProdutoDAO {

	public void cadastrarProduto( Produto produto );
	public String excluirProduto( String codigoProduto );
	public Produto consultaProdutoPorNome( String nomeProduto );
	public void alterarProduto ( String nomeProduto );
	public List<Produto> consultarProdutosPorNome( String nomeProduto );
}
