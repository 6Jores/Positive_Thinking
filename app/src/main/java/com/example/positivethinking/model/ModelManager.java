package com.example.positivethinking.model;

abstract public class ModelManager {
    private static PositiveApp positiveApp;

    public void setPositiveApp(PositiveApp _positiveApp) {
        positiveApp = _positiveApp;
    }

    public static int getId(){
        if (positiveApp != null)
            return positiveApp.getLastId();
        else
            return 0;
    }

}
