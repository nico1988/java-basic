package cn.ccsunny.properties;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class Demo01Properties {
    public static void main(String[] args) throws IOException {
        /*
        InputStream 字节楼
        Reader reader
        */
        Properties prop = new Properties();
        prop.load(new FileReader("system.properties")); // 一般用字符流
        Set<String> set = prop.stringPropertyNames();
        for (String key : set) {
            String value = prop.getProperty(key);
            System.out.println(key + "=" + "value");
        }
    }
}
