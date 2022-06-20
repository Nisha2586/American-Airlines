package com.AAflightBooking.Utils;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	Properties prop;

	public ReadConfig() {
		File src = new File("src\\test\\java\\com\\AAflightBooking\\Configuration\\Config.properties");
		try {
			FileInputStream fs = new FileInputStream(src);
			prop = new Properties();
			prop.load(fs);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public String getBrowser() {
		String browser = prop.getProperty("browser");
		return browser;
	}

	public String getUrl() {
		String url = prop.getProperty("baseUrl");
		return url;

	}
}
