package projetJDVC;

import java.sql.*;

public class DB {

	static String SelectByNomLike(String nomLike) throws ClassNotFoundException, SQLException {
		String str = "";
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cgi", "root", "root");

		String sql = "select * from personnes where nom like '%" + nomLike + "%'";
		Statement st = conn.createStatement();

		ResultSet rs = st.executeQuery(sql);
		str += "ID\tNOM\tPRENOM\n";
		while (rs.next()) {
			str += rs.getInt("id") + "\t" + rs.getString("nom") + "\t" + rs.getString("prenom") + "\n";
		}
		st.close();
		conn.close();
		return str;
	}

	static String Select() throws ClassNotFoundException, SQLException {
		String str = "";
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cgi", "root", "root");

		String sql = "select * from personnes";
		Statement st = conn.createStatement();

		ResultSet rs = st.executeQuery(sql);
		str += "ID\tNOM\tPRENOM\n";
		while (rs.next()) {
			str += rs.getInt("id") + "\t" + rs.getString("nom") + "\t" + rs.getString("prenom") + "\n";
		}
		st.close();
		conn.close();
		return str;
	}

	static void Request(String str) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cgi", "root", "root");

		String sql = str;
		Statement st = conn.createStatement();

		st.executeUpdate(sql);
		st.close();
		conn.close();
	}

	static void Insert(int id, String name, String surname) throws ClassNotFoundException, SQLException {
		String sql = "insert into personnes values(" + id + ", '" + name + "', '" + surname + "')";
		Request(sql);
	}

	static void Update(int id, String nom, String prenom) throws ClassNotFoundException, SQLException {
		String sql = "update personnes set nom = '" + nom + "', prenom = '" + prenom + "' where id = " + id;
		Request(sql);
	}

	static void Delete(int id) throws ClassNotFoundException, SQLException {
		String sql = "delete from personnes where id = " + id;
		Request(sql);
	}

	static void insertv2(int id, String name, String surname) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cgi", "root", "root");

		String sql = "insert into personnes values(?, ?, ?)";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setInt(1, id);
		ps.setString(2, name);
		ps.setString(3, surname);

		ps.executeUpdate();
		ps.close();
		conn.close();
	}

	static void updatev2(int id, String name, String surname) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cgi", "root", "root");

		String sql = "update personnes set nom = ?, prenom = ? where id = ?";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, name);
		ps.setString(2, surname);
		ps.setInt(3, id);

		ps.executeUpdate();
		ps.close();
		conn.close();
	}
}
