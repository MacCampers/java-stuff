package projetJDVC;

import java.sql.*;

public class Test {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
//		testConnection();
//		testInsert();
//		testUpdate();
//		testDelete();
//		testInsertv2();
//		testUpdatev2();
//		testSelect();
		testSelectByNomLike();
	}
	static void testSelectByNomLike() throws ClassNotFoundException, SQLException {
		System.out.println(DB.SelectByNomLike("up"));
	}
	static void testSelect() throws ClassNotFoundException, SQLException {
		System.out.println(DB.Select());
	}
	
	static void testInsertv2() throws ClassNotFoundException, SQLException {
		DB.insertv2(9, "aaaaa", "bbbbbbb");
	}
	static void testUpdatev2() throws ClassNotFoundException, SQLException {
		DB.updatev2(9, "aezaeaaaaa", "bbbezaezabbbb");
	}
	
	static void testInsert() throws ClassNotFoundException, SQLException {
		DB.Insert(15, "aaaaa", "bbbbbbb");
		DB.Insert(6, "ezaesqd", "ezadxvfsdfedfxvc");
	}
	
	static void testUpdate() throws ClassNotFoundException, SQLException {
		DB.Update(1, "aaezaaaa", "bbbbbezaebb");
	}
	
	static void testDelete() throws ClassNotFoundException, SQLException {
		DB.Delete(10);
	}

	static void testConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cgi", "root", "root");
		conn.close();
	}

	

}
