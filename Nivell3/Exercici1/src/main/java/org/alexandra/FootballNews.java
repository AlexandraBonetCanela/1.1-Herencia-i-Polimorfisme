package org.alexandra;

public class FootballNews extends SportNews implements Price, Score{
    private String competition;
    private String club;
    private String player;

    public FootballNews(String title, String competition, String club, String player){
        super(title);
        this.competition = competition;
        this.club = club;
        this.player = player;
    }

    public Integer calculateNewsPrice() {
        Integer price = 300;

        if(competition.equals("ChampionsLeague")) {
            price = price + 100;
        }
        if(club.equals("Barcelona") || club.equals("Madrid")) {
            price = price + 100;
        }
        if(player.equals("Ferran Torres") || player.equals("Benzema")) {
            price = price + 50;
        }
        System.out.println(FootballNews.super.title + " price: " + price + "€");
        return price;
    }

    public Integer calculateScore() {
        Integer score = 5;
        if(competition.equals("ChampionsLeague")) {
            score = score + 3;
        }
        if(competition.equals("League")) {
            score = score + 2;
        }
        if(club.equals("Barcelona") || club.equals("Madrid")) {
            score = score + 1;
        }
        if(player.equals("Ferran Torres") || player.equals("Benzema")) {
            score = score + 1;
        }
        System.out.println(FootballNews.super.title + " score: " + score + " points");
        return score;
    }
}
