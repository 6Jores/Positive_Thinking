package com.example.positivethinking.model;

import java.util.ArrayList;

public class PositiveApp {
    private int lastId;
    ArrayList<Thought> thoughts;

    public PositiveApp() {
        lastId = 0;
        this.thoughts = new ArrayList<>();
    }

    public ArrayList<Thought> getThoughts() {
        return thoughts;
    }

    public void setThoughts(ArrayList<Thought> thoughts) {
        this.thoughts = thoughts;
    }

    public int getLastId() {
        lastId++;
        return lastId-1;
    }
}
