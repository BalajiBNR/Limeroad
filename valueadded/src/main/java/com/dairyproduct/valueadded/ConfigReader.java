package com.dairyproduct.valueadded;

public class ConfigReader {

	private String browserName = PropertyReader.propFile().getProperty("browser");
	
	private String url = PropertyReader.propFile().getProperty("url");
	
	private String cardno = PropertyReader.propFile().getProperty("cardno");

	private String cvv = PropertyReader.propFile().getProperty("cvv");
	
	public String getbrowserName() {
		return browserName;
	}
}
