package facadepattern;

import java.sql.Connection;

public class HelperFacade {
	
	public static void generateReport(DBTypes dbtype,ReportTypes reportType,String tableName) {
		Connection con=null;
		switch(dbtype) {
		case MYSQL:
			con=MySqlHelper.getMySqlConnection();
			MySqlHelper mysqlHelper=new MySqlHelper();
			switch (reportType) {
			case HTML: 
				mysqlHelper.generateMySqlHTMLReport(tableName, con);
				break;
			case PDF:
				mysqlHelper.generateMySqlPDFReport(tableName, con);
			    break;
			}
			break;
		case ORACLE:
			con=OracleHelper.getOracleConnection();
			OracleHelper oracleHelper=new OracleHelper();
			switch(reportType) {
			case HTML:
				oracleHelper.generateMySqlHTMLReport(tableName, con);
				break;
			case PDF:
				oracleHelper.generateOraclePDFReport(tableName, con);
				break;
			}
			break;
		}
	}

}
