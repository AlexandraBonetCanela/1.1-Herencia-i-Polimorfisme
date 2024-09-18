package org.alexandra;

public class BasketballNews extends SportNews implements Price, Score{
    private String competition;
    private String club;

    public BasketballNews(String title, String competition, String club) {
        super(title);
        this.competition = competition;
        this.club = club;
    }

    public Integer calculateNewsPrice() {
        Integer price = 250;

        if(competition.equals("Euroleague")) {
            price = price + 50;
        }
        if(club.equals("Barcelona") || club.equals("Madrid")) {
            price = price + 75;
        }
        System.out.println(BasketballNews.super.title + " price: " + price + "€");
        return price;
    }

    public Integer calculateScore(){
        Integer score = 5;
        if(competition.equals("Euroleague")) {
            score = score + 3;
        }
        if(competition.equals("ACB")){
            score = score + 2;
        }
        if (club.equals("Barcelona") || club.equals("Madrid")) {
            score = score + 1;
        }
        System.out.println(BasketballNews.super.title + " score: " + score + " points");
        return score;
    }
}