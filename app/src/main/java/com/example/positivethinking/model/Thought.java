package com.example.positivethinking.model;

public class Thought {
    private int id;
    private String text;
    private String font;

    public Thought(String text, String font) {
        id = ModelManager.getId();
        this.text = text;
        this.font = font;
    }

    public void updateThought(String text, String font){
        this.text = text;
        this.font = font;
    }

    public int getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public String getFont() {
        return font;
    }
}
