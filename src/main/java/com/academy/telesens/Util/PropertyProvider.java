package com.academy.telesens.Util;

import com.academy.telesens.Lesson12.Hometask.Insert200users;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyProvider {
    private static final  String DEFAULT_PROPERTY_FILE = "default-cfg.properties";
    private static Properties prop;


    //блок статической инициализации
    static {
        init();
    }

    public static void init(){

        try {
            prop = new Properties();
            InputStream is = Insert200users.class.getClassLoader().getResourceAsStream(DEFAULT_PROPERTY_FILE);
            prop.load(is);//загружаем физический файл с проперятми
        } catch (IOException e) {
            System.out.println("error prop initializations");
            e.printStackTrace();
        }
    }
    //отдает проперти по ключу
    public  static String get(String key) {

            return prop.getProperty(key);


    }
}
