package gerestoque.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	
	/* verificar com os valores feitos na conexao usada na maquina */
	
	private static final String URL = "jdbc:mysql://localhost:3535/gerestoque?autoReconnect=true&useSSL=false";
	private static final String USER="root";
	private static final String PASS="manager";
	private static final String DRIVER="com.mysql.jdbc.Driver";
	
	private static DBUtil dbUtil = null;
	
	private Connection con = null;
	
	private DBUtil(){
		try {
			Class.forName(DRIVER);
			con = DriverManager.getConnection(URL, USER, PASS);
		} catch (ClassNotFoundException e) {
			System.out.print("ERRO ClassFound: "+e);
		} catch (SQLException e) {
			System.out.print("ERRO SQL: "+e);
		}
	}
	
	public static DBUtil getInstance(){
		if (dbUtil == null) {
			dbUtil = new DBUtil();
		}
		return dbUtil;	
	}
	
	public Connection getConn() { 
		return con;
	}

	/* ajustar comentarios dessa classe explicando o que ela faz */
	
}
