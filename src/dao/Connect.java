package dao;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;


public class Connect {

	private String url = "jdbc:mysql://localhost:3306/arayiav1";
	private String user = "root";
	private String passwd = "";
	private Connection conn ;
	private static Connect mycnx ;


	public static int exec(String req) throws SQLException {
		  Connection conn =  Connect.connectionFactory().getConn();
			Statement state = (Statement) conn.createStatement();
			return state.executeUpdate(req);
	}

	public static ResultSet loadAll(String request) throws SQLException{
		Connection conn =  Connect.connectionFactory().getConn();
		Statement state = (Statement) conn.createStatement();
		ResultSet beans = state.executeQuery(request);
		return beans;
	}
	public static Connect connectionFactory(){
		if(mycnx == null )
			mycnx =  new Connect();

		return mycnx;
	}


	private Connect(){

		try {
		Class.forName("com.mysql.jdbc.Driver");
		conn = (Connection) DriverManager.getConnection(url, user, passwd);

	} catch (Exception e) {
		e.printStackTrace();
	}
}


	public void loadAssocietedAccount(int id){


	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public Connection getConn() {
		return conn;
	}

	public void setConn(Connection conn) {
		this.conn = conn;
	}




	public Connect(String url, String user, String passwd) {
		super();
		this.url = url;
		this.user = user;
		this.passwd = passwd;
	}

}
