package TestNgDataProvider;

import java.lang.reflect.Method;
import java.util.HashMap;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class usedataprovider {

	@BeforeMethod
	public void btest(Method M) {
		System.out.println(M.getName());
	}

	@Test(enabled = true)
	public void method1() {

	}

	@Test(dataProvider = "getData", dataProviderClass = DataProviders.class, enabled = true)
	public void takeData1(int a, int b) {
		System.out.println(a + b);
	}

	@Test(dataProvider = "getData", dataProviderClass = DataProviders.class, enabled = true)
	public void takeData2(int a, int b, int c) {
		System.out.println(a + b + c);
	}

	@Test(dataProvider = "getDataMap", dataProviderClass = DataProviders.class, enabled = true)
	public void takaDataMap(HashMap<String, String> data) {

		System.out.println(data.get("c1"));
		System.out.println(data.get("c2"));
		System.out.println(data.get("c3"));

	}

}
