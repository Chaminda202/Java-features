package com.example.demo.fileload;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Properties;
import java.util.ResourceBundle;

public class LoadResourceFile {
    public static void main(String[] args) throws Exception {
        LoadResourceFile demo = new LoadResourceFile();
        demo.loadUsingClassLoaderMethod();
        demo.loadFile();
        demo.loadFileUsingResource();
    }

    private void loadUsingClassLoaderMethod() throws IOException {
        System.out.println("LoadResourceFile.loadUsingClassLoaderMethod");
        Properties properties = new Properties();

        // When using the ClassLoader method the resource name should
        // not started with "/". This method will not apply any
        // absolute/relative transformation to the resource name.
        ClassLoader classLoader = getClass().getClassLoader();
        URL resource = classLoader.getResource("configuration.properties");
        properties.load(new FileReader(new File(resource.getFile())));
        System.out.println("Date Pattern : " + properties.get("local.date.format.pattern"));

        /*InputStream is = classLoader.getResourceAsStream("database.conf");
        properties.load(is);
        System.out.println("JDBC URL: " + properties.get("jdbc.url"));*/
    }

    private void loadFile() throws IOException {
        System.out.println("LoadResourceFile....");
        Properties properties = new Properties();
        ClassLoader classLoader = getClass().getClassLoader();
        InputStream is = classLoader.getResourceAsStream("configuration.properties");
        properties.load(is);
        System.out.println("Date Pattern second method : " + properties.get("local.date.format.pattern"));
    }

    private void loadFileUsingResource() throws IOException {
        System.out.println("LoadResourceFile Third....");
        ResourceBundle rb = ResourceBundle.getBundle("configuration");
        System.out.println("Date Pattern third method : " + rb.getString("local.date.format.pattern"));
    }
}