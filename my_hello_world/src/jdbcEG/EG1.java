package jdbcEG;
import java.sql.*;
public class EG1 {
	public static void main(String[] args) {
		String url, id, pass;
		url="jdbc:mysql://localhost:3306/AK";
		id="root";
		pass="qwe123";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, id, pass);
			
			String query = "INSERT INTO Kaushik VALUES(1002, 'FIRST')";
			Statement myState = con.createStatement();
			
			int res = myState.executeUpdate(query);
			
			System.out.println(res);
//			while(res.next()) {
//				System.out.println(res.getInt(0) + res.getString(1));
//			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}
