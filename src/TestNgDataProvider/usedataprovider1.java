package TestNgDataProvider;

import java.util.HashMap;

import org.testng.annotations.Test;

public class usedataprovider1 {
	
	@Test(dataProvider = "getData", dataProviderClass = dataprovider1.class, enabled = true)
	public void vijay(String a , String b)
	{
		System.out.println(a+b);
	}
@Test(dataProvider = "getData", dataProviderClass = dataprovider1.class, enabled = true)
	public void vijay1(String a , String b , String c)
	{
	
		System.out.println(a+b+c);
	}
@Test(dataProvider = "getDataMap", dataProviderClass = dataprovider1.class, enabled = true)
public void getDataMap(HashMap<String,String> data)
{
	System.out.println(data.get("s.no"));
	System.out.println(data.get("emp id"));
	System.out.println(data.get("course"));
	System.out.println(data.get("batch"));
}
	
}
