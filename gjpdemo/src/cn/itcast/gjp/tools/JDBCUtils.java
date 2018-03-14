package cn.itcast.gjp.tools;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;

public class JDBCUtils {
	private static BasicDataSource datasource = new BasicDataSource();
	private static String driverClass;
	private static String url;
	private static String username;
	private static String password;
	
	private JDBCUtils() {}
	static{
		try {
			getConfig();
			datasource.setDriverClassName(driverClass);
			datasource.setUrl(url);
			datasource.setUsername(username);
			datasource.setPassword(password);
		} catch (IOException e) {
			throw new RuntimeException("连接数据库失败");
		}
		
	}
	
	private static void getConfig() throws IOException {
		Properties pro = new Properties();
		InputStream is = JDBCUtils.class.getClassLoader().getResourceAsStream("database.properties");
		pro.load(is);
		driverClass = pro.getProperty("driverClass");
		url = pro.getProperty("url");
		username = pro.getProperty("username");
		password = pro.getProperty("password");
	}
	
	public static DataSource getDataSource() {
		return datasource;
	}
}
