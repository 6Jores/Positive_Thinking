package com.example.positivethinking.model;

import java.io.Serializable;
import java.util.HashMap;

public class PositiveApp implements Serializable {
    private int lastId;
    HashMap<Integer,Thought> thoughts;

    public PositiveApp() {
        lastId = 0;
        this.thoughts = new HashMap<>();
    }

    public HashMap<Integer,Thought> getThoughts() {
        return thoughts;
    }

    public int getLastId() {
        lastId++;
        return lastId-1;
    }

    public Thought findById (int id){
        return thoughts.get(id);
    }
}
