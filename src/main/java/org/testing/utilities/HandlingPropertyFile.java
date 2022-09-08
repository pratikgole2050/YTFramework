package org.testing.utilities;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class HandlingPropertyFile {
	
	public static Properties loadPropertiesFile() throws IOException {
	
	File f = new File("../YTFramework/Objects.properties");
	FileReader fr = new FileReader(f);
	Properties pr = new Properties();
	pr.load(fr);
	return pr;
	}

}
