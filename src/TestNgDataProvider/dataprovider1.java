package TestNgDataProvider;

import java.lang.reflect.Method;
import java.util.HashMap;

import org.testng.annotations.DataProvider;

public class dataprovider1 {
	
	@DataProvider
	
	public Object[][] getData(Method M)
	{		
		Object[][] data = null ;
		if(M.getName().equals("vijay"))
		data = new Object[][] {{"vij","ay"} , {"jakk","awar"}};
		else if(M.getName().equals("vijay1"))
		data = new Object[][] {{"nik","it","a"}, {"jak","ka","war"}};	
		return data;
		
	}
	
	@DataProvider
	
	public Object[][] getDataMap()
	{
		Object[][] data = new Object[4][1];
		String[] cols = {"s.no","emp id","course","batch"};
		String[][] values = {{"001", "216", "testing","morning"},{"002", "217", "java","morning"},{"003", "218", "pythone","morning"},{"004", "219", ".net","morning"}};
		int k= 0;
		for(int i=0; i<data.length; i++)
		{
			HashMap<String , String> hmap = new HashMap<String , String>();
			
			for(int j=0; j<cols.length; j++)
			{
				hmap.put(cols[j], values[i][j]);
			}
			
			data[k++][0] = hmap;
		}
			
		
		return data;

	}

	
	
}
