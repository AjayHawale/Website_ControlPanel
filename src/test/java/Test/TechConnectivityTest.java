package Test;

import org.testng.annotations.Test;

import BaseB.BaseT;

public class TechConnectivityTest extends BaseT{

	
	@Test(priority=28, enabled=true)
	
	public void connectivityPage() throws InterruptedException {
		tcn.EnterInConnectivity();
		tcn.FootersTest();
	}
	
	
	
	
	
	
	
	
	
	
	
}
