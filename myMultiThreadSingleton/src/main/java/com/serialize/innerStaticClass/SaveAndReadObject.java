package com.serialize.innerStaticClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SaveAndReadObject {
    public static void main(String[] args) {
        String filePath = "E:\\temp\\Singleton.txt";
        File file = new File(filePath);
        try (FileOutputStream output = new FileOutputStream(file);
                ObjectOutputStream ooutput = new ObjectOutputStream(output);) {
            Singleton singleton = Singleton.getInstance();
            ooutput.writeObject(singleton);
            System.out.println(singleton.hashCode());
        } catch (IOException e) {
            e.printStackTrace();
        }
        try (FileInputStream input = new FileInputStream(file);
                ObjectInputStream oinput = new ObjectInputStream(input);) {
            Singleton singleton = (Singleton) oinput.readObject();
            System.out.println(singleton.readResovle().hashCode());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
