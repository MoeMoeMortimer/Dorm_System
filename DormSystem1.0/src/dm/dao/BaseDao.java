package dm.dao;

import java.sql.*;
import java.util.List;

import org.apache.commons.dbutils.DbUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;


public class BaseDao {
	public static Connection getCon() {
        PreparedStatement ps=null;     
        Connection ct=null;
        ResultSet rs=null;
        try {

        	String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
            String url="jdbc:sqlserver://localhost:1433;databaseName=Dorm_System";
            String user="sa";
            String password="0000";
            Class.forName(driver);

            ct=DriverManager.getConnection(url,user,password);
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }finally{
            try {
                if(rs!=null){
                    rs.close();
                }
                if(ps!=null){
                    ps.close();
                }
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        return ct;
    }

    public boolean update(String sql,Object[] params) {
        Connection conn = null;
        boolean flag = false;
        try {
            conn = getCon();
            QueryRunner qRunner = new QueryRunner();
            int i = qRunner.update(conn,sql,params);
            if (i > 0) {
                flag = true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DbUtils.closeQuietly(conn);
        }
        return flag;
    }

	public List query(String sql, Class clazz) {
        List beans = null;
        Connection conn = null;
        try {
            conn = getCon();
            QueryRunner qRunner = new QueryRunner();
            beans =
                (List) qRunner.query(
                    conn,
                    sql,
                    new BeanListHandler(clazz));

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DbUtils.closeQuietly(conn);
        }
        return beans;
    }

    public List query(String sql, Class clazz,Object[] params) {
        List beans = null;
        Connection conn = null;
        try {
            conn = getCon();
            QueryRunner qRunner = new QueryRunner();
            beans = (List)qRunner.query(conn,sql, new BeanListHandler(clazz) ,params);
   
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DbUtils.closeQuietly(conn);
        }
        return beans;
    }

    public Object get(String sql, Class clazz) {
        Object obj = null;
        Connection conn = null;
        try {
            conn = getCon();
            QueryRunner qRunner = new QueryRunner();
            obj = qRunner.query(conn, sql,new BeanHandler(clazz));
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DbUtils.closeQuietly(conn);
        }
        return obj;
    }

    public Object get(String sql, Class clazz,Object[] params) {
        Object obj = null;
        Connection conn = null;
        try {
            conn = getCon();
            QueryRunner qRunner = new QueryRunner();
            obj = qRunner.query(conn, sql, new BeanHandler(clazz),params);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DbUtils.closeQuietly(conn);
        }
        return obj;
    }
    
    
}

