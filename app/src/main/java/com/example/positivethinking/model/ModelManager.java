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
        Thought thought1 = new Thought("Think Positive","Times new roman");
        positiveApp.getThoughts().put(thought1.getId(),thought1);
        Thought thought2 = new Thought("One day or Day on","Times new roman");
        positiveApp.getThoughts().put(thought2.getId(),thought2);
        Thought thought3 = new Thought("Try to know what happens if you don't give up","Times new roman");
        positiveApp.getThoughts().put(thought3.getId(),thought3);

        if (FileManager.writeFile(positiveApp,file))
            positiveApp = (PositiveApp)FileManager.readAnObject(file);

    }

}
