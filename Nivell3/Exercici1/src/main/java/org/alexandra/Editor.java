package org.alexandra;

import java.util.ArrayList;

public class Editor {

    private String name;
    private final String ID_CARD;
    static Integer salary = 1500;
    ArrayList<SportNews> news;


    Editor(String name, String ID_CARD) {
        this.name = name;
        this.ID_CARD = ID_CARD;
        this.news = new ArrayList<>();
    }

    public String getName() {
        return name;
    }
}
