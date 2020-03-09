package com.example.positivethinking.model;

import com.example.positivethinking.tool.FileManager;

import java.io.File;

public class ModelManager {

    private static PositiveApp positiveApp;

    public static PositiveApp getPositiveApp() {
        return positiveApp;
    }

    public static int getId(){
        if (positiveApp != null)
            return positiveApp.getLastId();
        else
            return 0;
    }

    public static void setPositiveApp(File file){
        positiveApp = (PositiveApp)FileManager.readAnObject(file);
        if (positiveApp == null){
            setDataTest(file);
        }
    }

    private static void setDataTest(File file){
        positiveApp = new PositiveApp();
        positiveApp.getThoughts().add(new Thought("Think Positive","Times new roman"));
        positiveApp.getThoughts().add(new Thought("One day or Day on","Times new roman"));
        positiveApp.getThoughts().add(new Thought("Try to know what happens if you don't give up","Times new roman"));

        if (FileManager.writeFile(positiveApp,file))
            positiveApp = (PositiveApp)FileManager.readAnObject(file);

    }

}
