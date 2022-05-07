package TestNgDataProvider;

import java.lang.reflect.Method;
import java.util.HashMap;
import org.testng.annotations.DataProvider;

public class DataProviders {

	@DataProvider // (name="getdata")
	public Object[][] getData(Method M) {
		

		System.out.println(M.getName());
		Object[][] data = null;
		if (M.getName().equals("takeData1"))
			data = new Object[][] { { 1, 2 }, { 3, 4 } };
		else if (M.getName().equals("takeData2"))
			data = new Object[][] { { 1, 2, 3 }, { 3, 4, 5 } };
		return data;

	}

	@DataProvider // (name="getdatamap")
	public Object[][] getDataMap() {
			// creation of array
		Object[][] data = new Object[3][1];

		// creating coloums 
		String[] cols = { "c1", "c2", "c3" };
		 // creating values 
		String[][] vals = { { "a", "b", "c" }, { "d", "e", "f" }, { "g", "h", "i" } };
		int k = 0;
		
		for (int i = 0; i < data.length; i++) {
			HashMap<String, String> hmap = new HashMap<String, String>();

			for (int j = 0; j < cols.length; j++) {
				hmap.put(cols[j], vals[i][j]);
			}

			data[k++][0] = hmap;
		}
		return data;
	}

}
