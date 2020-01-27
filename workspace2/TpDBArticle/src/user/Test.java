package user;

import java.sql.SQLException;

import model.DB;

public class Test {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
//		System.out.println(DB.selectAll());
		System.out.println(DB.selectById(2));
//		DB.insert("dddd", "ddddddd");
//		DB.update(4, "aaaaaaaaaaa", "zzzzzzzzzz");
//		DB.delete(5);
	}

}
