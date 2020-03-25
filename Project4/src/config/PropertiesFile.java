package config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class PropertiesFile {
	
	static Properties prop = new Properties();
	
	public static void main(String[] args) {
		readPropertiesFile();
		writePropertiesFile();
		readPropertiesFile();
	}
	
	//steps for getting data from properties file
	public static void readPropertiesFile() {
		try {
			InputStream input = new FileInputStream("G:\\Eclipse workspaces\\Test Automation\\Project4\\src\\config\\config.properties");
			prop.load(input);
			System.out.println(prop.getProperty("browser"));
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//steps to set data to properties file
	public static void writePropertiesFile() {
		try {
			OutputStream output = new FileOutputStream("G:\\Eclipse workspaces\\Test Automation\\Project4\\src\\config\\config.properties");
			prop.setProperty("browser", "Chrome");
			prop.store(output, "");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
