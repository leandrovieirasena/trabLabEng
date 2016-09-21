package gerestoque.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import gerestoque.model.Funcionario;
import gerestoque.model.Produto;
import gerestoque.persistence.FuncionarioDAO;
import gerestoque.persistence.FuncionarioDAOImpl;

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
		String txtSenha = request.getParameter("txtSenha");
		
//		Funcionario func = new Funcionario();
		FuncionarioDAO funcDAO = new FuncionarioDAOImpl();
		
//		func.setCpf(txtLogin);
//		func.setSenha(txtSenha);
		if(funcDAO.verificaLoginFuncionario(txtLogin, txtSenha) == false){
			System.out.println("aaa");
		}
		
		
	}

}
