package org.alexandra;

public class TennisNews extends SportNews implements Price, Score{
    private String competition;
    private String tennisPlayers;

    public TennisNews(String title, String competition, String tennisPlayers) {
        super(title);
        this.competition = competition;
        this.tennisPlayers = tennisPlayers;
    }

    public Integer calculateNewsPrice() {
        Integer price = 150;

        if(tennisPlayers.equals("Federer") || tennisPlayers.equals("Nadal") || tennisPlayers.equals("Djokovic")) {
            price = price + 100;
        }
        System.out.println(TennisNews.super.title + " price: " + price + "€");
        return price;
    }

    public Integer calculateScore(){
        Integer score = 4;
        if(tennisPlayers.equals("Federer") || tennisPlayers.equals("Nadal") || tennisPlayers.equals("Djokovic")) {
            score = score + 3;
        }
        System.out.println(TennisNews.super.title + " score: " + score + " points");
        return score;
    }

}