package com.mess.Mes.server;

import com.mess.Mes.client.GreetingService;
import com.mess.Mes.shared.FieldVerifier;
import com.mess.Mes.shared.Retrieve;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;

/**
 * The server-side implementation of the RPC service.
 */
@SuppressWarnings("serial")
public class GreetingServiceImpl extends RemoteServiceServlet implements GreetingService {
	Connection con = null;
	Statement st = null;
	ResultSet rs = null;
	Retrieve p[] = new Retrieve[30];
	int i;

	public void init() {

		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/alarm", "root", "abhay");
			st = con.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public String insert(String s1, String s2, String s3, String s4, String s5, String s6)
			throws IllegalArgumentException {
		// TODO Auto-generated method stub
		init();
		String ss = "No";
		int k = 0;

		try {
			k = st.executeUpdate("insert into kaluu values('" + s1 + "','" + s2 + "','" + s3 + "','" + s4 + "','" + s5
					+ "','" + s6 + "')");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			ss = e.getMessage();

		}

		if (k != 0)
			ss = "Message Sent !";

		return ss;
	}

	@Override
	public String rem(String s1, String s2, String s3) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		init();
		String ss = "no";
		int k = 0;
		try {
			k = st.executeUpdate("insert into alarms values ('" + s1 + "','" + s2 + "','" + s3 + "')");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			ss = e.getMessage();

		}
		if (k != 0)
			ss = "Alarm Set !";

		return ss;
	}

	@Override
	public String login(String s1, String s2) throws IllegalArgumentException {
		// TODO Auto-generated method stub

		return "Welcome";
	}

	@Override
	public Retrieve[] Contacts() throws IllegalArgumentException {
		// TODO Auto-generated method stub

		init();
		try {
			rs = st.executeQuery("select*from register where des='central'");
			i = 0;
			while (rs.next()) {
				p[i] = new Retrieve();
				p[i].setPhone(rs.getString("phone"));
				p[i].setName(rs.getString("name"));
				p[i].setDes(rs.getString("des"));
				i++;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return p;
	}

	@Override
	public String reg(String s1, String s2, String s3, String s4,String s5) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		init();
		String ss = "no";
		int k = 0;
		try {
			k = st.executeUpdate("insert into register values ('" + s1 + "','" + s2 + "','" + s3 + "','" + s4 + "','"+s5+"')");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			ss = e.getMessage();

		}
		if (k != 0)
			ss = "Registration Successful !";

		return ss;

	}

	@Override
	public String update(String s1, String s2, String s3) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		init();
		String ss = "No";
		int k = 0;

		try {
			k = st.executeUpdate("insert into contacts values ('" + s1 + "','" + s2 + "','" + s3 + "')");
					
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			ss = e.getMessage();

		}

		if (k != 0)
			ss = "Updated";

		return ss;
	}

	@Override
	public String delete(String s1, String s2, String s3) throws IllegalArgumentException {
		// TODO Auto-generated method stub
		init();
		String ss = "no";

		int k = 0;

		try {
			k = st.executeUpdate("delete from contacts where phone ='" + s1 + "'and name ='" + s2 + "'and des ='"+s3+"'");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			ss = e.getMessage();
		}
		if (k != 0) {
			ss = "DELETED";
		}
		return ss;
	
	}

	@Override
	public Retrieve[] state() throws IllegalArgumentException {
		// TODO Auto-generated method stub
		init();
		try {
			rs = st.executeQuery("select*from register where des='state'");
			i = 0;
			while (rs.next()) {
				p[i] = new Retrieve();
				p[i].setPhone(rs.getString("phone"));
				p[i].setName(rs.getString("name"));
				p[i].setDes(rs.getString("des"));
				i++;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return p;
	}

	@Override
	public Retrieve[] zone() throws IllegalArgumentException {
		// TODO Auto-generated method stub
		init();
		try {
			rs = st.executeQuery("select*from register where des='zone'");
			i = 0;
			while (rs.next()) {
				p[i] = new Retrieve();
				p[i].setPhone(rs.getString("phone"));
				p[i].setName(rs.getString("name"));
				p[i].setDes(rs.getString("des"));
				i++;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return p;
	}
	

	

	

}