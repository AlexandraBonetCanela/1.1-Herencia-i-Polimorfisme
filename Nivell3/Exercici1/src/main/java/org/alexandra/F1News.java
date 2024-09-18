package org.alexandra;

public class F1News extends SportNews implements Price, Score{
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

    public Integer calculateScore() {
        Integer score = 4;
        if(team.equals("Ferrari") || team.equals("Mercedes")) {
            score = score + 2;
        }
        System.out.println(F1News.super.title + " score: " + score + " points");
        return score;
    }
}
