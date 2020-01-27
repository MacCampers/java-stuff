package model;

import java.sql.*;

public class DB {
	
	public static String selectAll() throws SQLException, ClassNotFoundException {
		String str = "";
		Class.forName("com.mysql.jdbc.Driver");

		String sql = "select * from articles";

		try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbarticle", "root", "root");
				Statement st = conn.createStatement()) {

			ResultSet rs = st.executeQuery(sql);
			str += "ID\tNOM\tPRENOM\n";
			while (rs.next()) {
				str += rs.getInt("id") + "\t" + rs.getString("marque") + "\t" + rs.getString("description") + "\n";
			}
			st.close();
			conn.close();
		} catch (SQLException e) {
			throw new RuntimeException("Error executing sql:\n" + sql, e);
		}
		return str;
	}

	public static String selectById(int id) throws SQLException, ClassNotFoundException {
		String str = "";
		Class.forName("com.mysql.jdbc.Driver");

		String sql = "select * from articles where id = " + id;

		try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbarticle", "root", "root");
				Statement st = conn.createStatement()) {

			ResultSet rs = st.executeQuery(sql);
			str += "ID\tNOM\tPRENOM\n";
			while (rs.next()) {
				if (rs.getString("marque") != null)
				str += rs.getInt("id") + "\t" + rs.getString("marque") + "\t" + rs.getString("description") + "\n";
			}
			st.close();
			conn.close();
		} catch (SQLException e) {
			throw new RuntimeException("Error executing sql:\n" + sql, e);
		}
		return str;
	}

	public static void insert(String marque, String desc) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");

		String sql = "insert into articles (marque, description) values( ?, ?)";

		try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbarticle", "root", "root");
				PreparedStatement ps = conn.prepareStatement(sql)) {
			ps.setString(1, marque);
			ps.setString(2, desc);

			ps.executeUpdate();
			ps.close();
			conn.close();
		} catch (SQLException e) {
			throw new RuntimeException("Error executing sql:\n" + sql, e);
		}
	}

	public static void update(int id, String marque, String desc) throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.jdbc.Driver");

		String sql = "update articles set marque = ?, description = ? where id = ?";

		try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbarticle", "root", "root");
				PreparedStatement ps = conn.prepareStatement(sql)) {
			ps.setString(1, marque);
			ps.setString(2, desc);
			ps.setInt(3, id);

			ps.executeUpdate();
			ps.close();
			conn.close();
		} catch (SQLException e) {
			throw new RuntimeException("Error executing sql:\n" + sql, e);
		}
	}

	public static void delete(int id) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");

		String sql = "delete from articles where id = " + id;

		try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbarticle", "root", "root");
				Statement st = conn.createStatement()) {
			st.execute(sql);
			st.executeUpdate(sql);
			st.close();
			conn.close();
		} catch (SQLException e) {
			throw new RuntimeException("Error executing sql:\n" + sql, e);
		}
	}
}
