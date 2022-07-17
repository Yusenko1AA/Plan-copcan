/*
package com.java.usenko.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertiesUtil {
    String fileSeparator = System.getProperty("file.separator");
    String absoluteFilePath = fileSeparator + "Users" + fileSeparator + "User" + fileSeparator + "IdeaProjects" + fileSeparator + "Plan-copcan" + fileSeparator + "properties";
    public String getPropertyValue(String propertyName) {
        String propertyValue = "";
        Properties properties = new Properties();

        try (InputStream inputStream = new FileInputStream(absoluteFilePath)) {
            properties.load(inputStream);

            propertyValue = properties.getProperty(propertyName);

        } catch (IOException e) {
            System.out.println(e);
        }
        return propertyValue;
    }
}
*/