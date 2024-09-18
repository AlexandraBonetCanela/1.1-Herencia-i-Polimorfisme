package org.alexandra;

public class BasketballNews extends SportNews implements Price{
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
}