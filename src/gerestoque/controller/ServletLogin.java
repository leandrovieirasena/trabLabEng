package gerestoque.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import gerestoque.model.Produto;
import gerestoque.persistence.ProdutoDAO;
import gerestoque.persistence.ProdutoDAOImpl;

@WebServlet("/ServletLogin")
public class ServletLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ServletLogin() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String txtLogin = request.getParameter("txtLogin");

		Produto prod = new Produto();
		ProdutoDAO prodDAO = new ProdutoDAOImpl();
		prod.setNome(txtLogin);
		
		prodDAO.cadastrarProduto(prod);
		
		response.sendRedirect("./index.jsp");
		
	}

}
