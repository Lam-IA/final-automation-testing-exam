package org.QawayFinal.Utility;

import org.openqa.selenium.UsernameAndPassword;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class Utility {
    public static String currentDir = System.getProperty("user.dir");

    public static boolean isSorted(double[] array){
        for (int i=0; i<array.length -1; i++) {
            if(array[i] > array[i+1])
                return false;
        }
        return true;
    }

    public static double [] listToArrayOfDouble(List<String> list){
        double[] doubleList = new double[list.size()];
        for (int i = 0; i < list.size(); i++){
            doubleList[i] = Double.parseDouble(list.get(i));
        }
        return doubleList;
    }

    public static Properties loadProperties(){
        Properties prop = new Properties();
        try {
            InputStream inputStream = Files.newInputStream(Paths.get(currentDir+ File.separator+"\\config.properties"));
            prop.load(inputStream);
            inputStream.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return prop;
    }

    public static String decode(String key){
        byte[] decodedBytes = Base64.getDecoder().decode(key);
        return new String(decodedBytes);
    }
    public static void main(String[] args) {
        String username = "";
        String securedUsername;
        String password = "";
        String securedPassword;

        securedUsername = Base64.getEncoder().encodeToString(username.getBytes());
        System.out.println(securedUsername);
        securedPassword = Base64.getEncoder().encodeToString(password.getBytes());
        System.out.println(securedPassword);
    }


}
