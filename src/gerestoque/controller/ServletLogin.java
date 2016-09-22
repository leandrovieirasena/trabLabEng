package gerestoque.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

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

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String txtLogin = request.getParameter("txtLogin");
		String txtSenha = request.getParameter("txtSenha");
		
		FuncionarioDAO funcDAO = new FuncionarioDAOImpl();

		if(funcDAO.verificaLoginFuncionario(txtLogin, txtSenha) == false){
			System.out.println("Login Incorreto.");
			response.sendRedirect("index.jsp");
		} else if(funcDAO.verificaLoginFuncionario(txtLogin, txtSenha) == true){
			System.out.println("Login Correto.");
    		HttpSession session = request.getSession();
   		    session.setAttribute("usuario", txtLogin);
   		    session.setAttribute("codigo", 5);
			response.sendRedirect("dashboard.jsp");
		}		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
