package com.TestCompany.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
    // 1- Create the object of Properties class
    private static Properties properties = new Properties();

    static{
        try {
            // 2- Create the object of FileInputStream
            FileInputStream file = new FileInputStream("config.properties");
            // 3- Load the properties object using FileInputStream object
            properties.load(file);
            file.close();

        }catch(IOException e) {
            e.printStackTrace();
        }
    }
    /**
     * This method is used to read value from a configuration.properties file
     * @param keyword --> key name in configuration.properties file
     * @return --> value for the key. returns null if key is not found
     * driver.get(ConfigurationReader.getProperty("env"))
     */

    public static String getProperty(String keyword){
        return properties.getProperty(keyword);
    }
}
