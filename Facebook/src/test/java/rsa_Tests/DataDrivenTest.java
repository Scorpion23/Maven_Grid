package rsa_Tests;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import data.DataReader;
import rsa_PageObjects.RegistrationPage;
import testComponents.BaseTest;

public class DataDrivenTest extends BaseTest {

	@Test(dataProvider = "LoginData")
	public void loginTest(String firstname, String lastname, String email, String mobileno, String password,
			String confirmpassword, String text) {
		RegistrationPage registrationpage = loginpage.getRegistrationpage();
		registrationpage.TestScenarios(firstname, lastname, email, mobileno, password, confirmpassword, text);
	}

	@DataProvider(name = "LoginData")
	public String[][] getData() throws IOException {
		/*
		 * String loginData[][]= { {"admin@yourstore.com","admin","Valid"},
		 * {"admin@yourstore.com","adm","Invalid"},
		 * {"adm@yourstore.com","admin","Invalid"},
		 * {"adm@yourstore.com","adm","Invalid"} };
		 */

		// get the data from excel
		String path = "D:\\Eclipse_Workspace\\New folder\\Facebook\\src\\test\\java\\data\\registrationpage.xlsx";
		DataReader xlutil = new DataReader(path);

		int totalrows = xlutil.getRowCount("Sheet1");
		int totalcols = xlutil.getCellCount("Sheet1", 1);

		String loginData[][] = new String[totalrows][totalcols];

		for (int i = 1; i <= totalrows; i++) // 1
		{
			for (int j = 0; j < totalcols; j++) // 0
			{
				loginData[i - 1][j] = xlutil.getCellData("Sheet1", i, j);
			}

		}

		return loginData;
	}

}
