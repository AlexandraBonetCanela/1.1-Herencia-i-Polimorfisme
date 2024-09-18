package org.alexandra;

public class FootballNews extends SportNews implements Price{
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
}
