package generalFunctions;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;
import java.util.logging.Logger;


public class Database_Connect {

	public static Logger log = Logger.getLogger(Database_Connect.class.getName());
	public Connection conn;
	public Statement stmt;
	String url=new String();
	boolean flag=false;

	/*
	 * Method to get the values from GBQIS1SDA01DWHBKR Database 
	 */

	public HashMap<List<String>, List<String>> GBQIS1SDA01DWHBKR(String Query,String DBColumnName) throws IOException {
		ResultSet rs =null;
		String value = null;
		HashMap<List<String>,List<String>> DBValues = new HashMap<List<String>,List<String>>();
		List<String> columnValues=new ArrayList<String>();
		List<String> listvalues=new ArrayList<String>();
		FileReader reader = new FileReader(System.getProperty("user.dir")+"\\src\\main\\resources\\config.properties");
		Properties properties=new Properties();
		properties.load(reader);
		url=properties.getProperty("url");
		if(url.contains("CEAWD06440")) {
			url = "jdbc:sqlserver://CEAWD06440.EMEA.ZURICH.CORP:1282;databaseName=GBQIS1SDA01DWHBKR;integratedSecurity=true;";	
		}else if(url.contains("DEAWD05718")) {
			url = "jdbc:sqlserver://DEAWD05718.EMEA.ZURICH.DEV:1282;databaseName=GBQDS1SDA01DWHBKR;integratedSecurity=true";
		}
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			conn = DriverManager.getConnection(url);
			log.info("DB Connected");
			stmt = conn.createStatement();
			rs = stmt.executeQuery(Query);
			ResultSetMetaData rsmd =rs.getMetaData();
			if(DBColumnName.equals("")) {
				while (rs.next()) {
					int IdValue=rs.getInt("ID");
					if(IdValue>0) {
						for(int j=1;j<=rsmd.getColumnCount();j++)
						{
							DBColumnName=rsmd.getColumnName(j);
							value=rs.getString(rsmd.getColumnName(j));
							if(IdValue==1) {
								columnValues.add(DBColumnName);
							}
							columnValues.add(DBColumnName);
							listvalues.add(value);	
						}
					}else {
						System.out.println("ID Value is less than 1");
					}	
				}
				DBValues.put(columnValues, listvalues);
				System.out.println(DBValues);
			}else {
				log.info("DB ColumnName is not given");
				flag=false;
			}
			conn.close();
			log.info("Results:"+DBValues);
		} catch (Exception e) {
			System.out.println("Error Messgae Caught while connecting to DB GBQIS1SDA01DWHBKR :"+ e);
		}
		return DBValues; 
	}

	/*
	 * Method to get the values from GBQDS1SDA01DWHCLM Database 
	 */

	public HashMap<List<String>, List<String>> GBQDS1SDA01DWHCLM(String Query,String DBColumnName) throws IOException {
		ResultSet rs =null;
		String value = null;
		HashMap<List<String>,List<String>> DBValues = new HashMap<List<String>,List<String>>();
		List<String> columnValues=new ArrayList<String>();
		List<String> listvalues=new ArrayList<String>();
		FileReader reader = new FileReader(System.getProperty("user.dir")+"\\src\\main\\resources\\config.properties");
		Properties properties=new Properties();
		properties.load(reader);
		url=properties.getProperty("url");
		if(url.contains("CEAWD06440")) {
			url = "jdbc:sqlserver://CEAWD06440.EMEA.ZURICH.CORP:1282;databaseName=GBQIS1SDA01DWHBKR;integratedSecurity=true;";	
		}else if(url.contains("DEAWD05718")) {
			url = "jdbc:sqlserver://DEAWD05718.EMEA.ZURICH.DEV:1282;databaseName=GBQDS1SDA01DWHBKR;integratedSecurity=true";
		}
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			conn = DriverManager.getConnection(url);
			log.info("DB Connected");
			stmt = conn.createStatement();
			rs = stmt.executeQuery(Query);
			ResultSetMetaData rsmd =rs.getMetaData();
			if(DBColumnName.equals("")) {
				while (rs.next()) {
					int IdValue=rs.getInt("ID");
					if(IdValue>0) {
						for(int j=1;j<=rsmd.getColumnCount();j++)
						{
							DBColumnName=rsmd.getColumnName(j);
							value=rs.getString(rsmd.getColumnName(j));
							if(IdValue==1) {
								columnValues.add(DBColumnName);
							}
							columnValues.add(DBColumnName);
							listvalues.add(value);	
						}
					}else {
						System.out.println("ID Value is less than 1");
					}	
				}
				DBValues.put(columnValues, listvalues);
				System.out.println(DBValues);
			}else {
				log.info("DB ColumnName is not given");
				flag=false;
			}
			conn.close();
			log.info("Results:"+DBValues);
		} catch (Exception e) {
			System.out.println("Error Messgae Caught while connecting to DB GBQIS1SDA01DWHBKR :"+ e);
		}
		return DBValues; 

	}

	/*
	 * Method to get the values from GBQDS1SDA01DWHCLM Database 
	 */

	public HashMap<List<String>, List<String>> GBQDS1SDA01DWHPOL(String Query,String DBColumnName) throws IOException {
		ResultSet rs =null;
		DBColumnName="";
		String value = null;
		HashMap<List<String>,List<String>> DBValues = new HashMap<List<String>,List<String>>();
		List<String> columnValues=new ArrayList<String>();
		List<String> listvalues=new ArrayList<String>();
		FileReader reader = new FileReader(System.getProperty("user.dir")+"\\src\\main\\resources\\config.properties");
		Properties properties=new Properties();
		properties.load(reader);
		url=properties.getProperty("url");
		if(url.contains("CEAWD06440")) {
			url = "jdbc:sqlserver://CEAWD06440.EMEA.ZURICH.CORP:1282;databaseName=GBQIS1SDA01DWHBKR;integratedSecurity=true;";	
		}else if(url.contains("DEAWD05718")) {
			url = "jdbc:sqlserver://DEAWD05718.EMEA.ZURICH.DEV:1282;databaseName=GBQDS1SDA01DWHBKR;integratedSecurity=true";
		}
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			conn = DriverManager.getConnection(url);
			log.info("DB Connected");
			stmt = conn.createStatement();
			rs = stmt.executeQuery(Query);
			ResultSetMetaData rsmd =rs.getMetaData();
			if(DBColumnName.equals("")) {
				while (rs.next()) {
					int IdValue=rs.getInt("ID");
					if(IdValue>0) {
						for(int j=1;j<=rsmd.getColumnCount();j++)
						{
							DBColumnName=rsmd.getColumnName(j);
							value=rs.getString(rsmd.getColumnName(j));
							if(IdValue==1) {
								columnValues.add(DBColumnName);
							}
							columnValues.add(DBColumnName);
							listvalues.add(value);	
						}
					}else {
						System.out.println("ID Value is less than 1");
					}	
				}
				DBValues.put(columnValues, listvalues);
				System.out.println(DBValues);
			}else {
				log.info("DB ColumnName is not given");
				flag=false;
			}
			conn.close();
			log.info("Results:"+DBValues);
		} catch (Exception e) {
			System.out.println("Error Messgae Caught while connecting to DB GBQIS1SDA01DWHPOL :"+ e);
		}
		return DBValues; 
	}
}
