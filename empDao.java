package pro;
import java.sql.*;
import java.util.*;
import java.lang.*;


public class empDao {
 
		  
		public static Connection getConnection(){  
		    Connection con=null;  
		    try{  
		        Class.forName("com.mysql.cj.jdbc.Driver");  
		        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/b","root","password");  
		    }catch(Exception e){System.out.println(e);}  
		    return con;  
		}  
		
		public static int save(emp u){  
		    int status=0;  
		    try{  
		        Connection con=getConnection();  
		        PreparedStatement ps=con.prepareStatement(  
		"insert into register values(?,?,?)");  
		        ps.setInt(1,u.getId());  
		        ps.setString(2,u.getName());  
		        ps.setDouble(3,u.getSal());  
		        
		        status=ps.executeUpdate();  
		    }catch(Exception e){System.out.println(e);}  
		    return status;  
		}  
		public static int update(emp u){  
		    int status=0;  
		    try{  
		        Connection con=getConnection();  
		        PreparedStatement ps=con.prepareStatement(  
		"update register set name=?,sal=? where id=?");  
		        ps.setString(1,u.getName());  
		        ps.setDouble(2,u.getSal());  
		        ps.setInt(3,u.getId());  
		        status=ps.executeUpdate();  
		    }catch(Exception e){System.out.println(e);}  
		    return status;  
		}  
		public static int delete(emp u){  
		    int status=0;  
		    try{  
		        Connection con=getConnection();  
		        PreparedStatement ps=con.prepareStatement("delete from register where id=?");  
		        ps.setInt(1,u.getId());  
		        status=ps.executeUpdate();  
		    }catch(Exception e){System.out.println(e);}  
		  
		    return status;  
		}  
		public static List<emp> getAllRecords(){  
		    List<emp> list=new ArrayList<emp>();  
		      
		    try{  
		        Connection con=getConnection();  
		        PreparedStatement ps=con.prepareStatement("select * from register");  
		        ResultSet rs=ps.executeQuery();  
		        while(rs.next()){  
		            emp u=new emp();  
		            u.setId(rs.getInt("id"));  
		            u.setName(rs.getString("name"));  
		            u.setSal(rs.getDouble("sal"));
		            list.add(u);  
		        }  
		    }catch(Exception e){System.out.println(e);}  
		    return list;  
		}  
		public static emp getRecordById(int id){  
		    emp u=null;  
		    try{  
		        Connection con=getConnection();  
		        PreparedStatement ps=con.prepareStatement("select * from register where id=?");  
		        ps.setInt(1,id);  
		        ResultSet rs=ps.executeQuery();  
		        while(rs.next()){  
		            u=new emp();  
		            u.setId(rs.getInt("id"));  
		            u.setName(rs.getString("name"));  
		            u.setSal(rs.getDouble("sal"));
		        }  
		    }catch(Exception e){System.out.println(e);}  
		    return u;  
		}  
		}  

