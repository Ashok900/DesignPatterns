package facadepattern;

import java.sql.Connection;

public class FacadePatternTest {
	public static void main(String[] args) {
		String tableName="Employee";
		
		//generating MySql HTML report and Oracle PDF report without using Facade
				Connection con = MySqlHelper.getMySqlConnection();
				MySqlHelper mySqlHelper = new MySqlHelper();
				mySqlHelper.generateMySqlHTMLReport(tableName, con);
				
				Connection con1 = OracleHelper.getOracleConnection();
				OracleHelper oracleHelper = new OracleHelper();
				oracleHelper.generateOraclePDFReport(tableName, con1);

				//generating MySql HTML report and Oracle PDF report using Facade
				HelperFacade.generateReport(DBTypes.MYSQL, ReportTypes.HTML, tableName);
				HelperFacade.generateReport(DBTypes.ORACLE, ReportTypes.PDF, tableName);
	}

}
