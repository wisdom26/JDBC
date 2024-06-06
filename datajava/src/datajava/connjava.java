package datajava;
import java.sql.*;

public class connjava {

	public static void main(String[] args)throws ClassNotFoundException,SQLException {
		String url="jdbc:mysql://localhost:3306/nsti";
		String user="root";
		String pass="";
		String db="Show databases";
		String sql="create table adit(id int,name varchar(20),age int,email varchar(20)primary key)";
		String ints="insert into adit values(1,'vivek',25,'vm05400@gmail.com')";
		String ints="insert into adit values(2,'ravi',25,'vm05404@gmail.com'),(3,'rahul',24,'rahul67@gmail.com')";
		String froms="select * from adit";
		
		
//		database connection
		Connection conn=DriverManager.getConnection(url,user,pass);
       System.out.println("connected");
        Statement st=conn.createStatement();
        
//      create database
     st.executeUpdate("create database NSTI");
        
//      show database
     ResultSet rs=st.executeQuery(db);
     System.out.println(rs);
     while(rs.next()) {
	         System.out.println(rs.getString(1));
         }
        
        
//      create table
    st.executeUpdate(sql);
    System.out.println("table created  ");
        
        
        
//      insert data
    st.executeUpdate(ints);
    System.out.println("data insert  ");
        
//        table data view
       ResultSet rs=st.executeQuery(froms);
       while(rs.next()) {
	         System.out.println(rs.getString("id")+"-"+rs.getString("name")+"-"+rs.getString("age")+"-"+rs.getString("email"));
          }

	}   

}
