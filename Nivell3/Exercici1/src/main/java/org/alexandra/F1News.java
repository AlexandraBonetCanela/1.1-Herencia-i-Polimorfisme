package org.alexandra;

public class F1News extends SportNews implements Price{
    private String team;

    public F1News(String title, String team) {
        super(title);
        this.team = team;
    }

    public Integer calculateNewsPrice() {
        Integer price = 100;

        if(team.equals("Ferrari") || team.equals("Mercedes")) {
            price = price + 50;
        }
        System.out.println(F1News.super.title + " price: " + price + "€");
        return price;
    }
}
