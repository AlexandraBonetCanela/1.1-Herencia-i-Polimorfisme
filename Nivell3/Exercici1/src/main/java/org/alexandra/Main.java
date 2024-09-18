package org.alexandra;

public class Main {
    public static void main(String[] args) {

        // 1.Create Editor
        Editor editor1 = new Editor("Elliot", "4778456Q");
        Editor editor2 = new Editor("Sarah", "6768456J");

        // 2.Delete Editor
        editor2 = null;

        // 3.Attach News to Editor
        FootballNews barsaWinsChampionsNews = new FootballNews("Barcelona wins the champions", "ChampionsLeague","Barcelona", "Ferran Torres");
        editor1.news.add(barsaWinsChampionsNews);

        // 4.Delete News
        editor1.news.remove(barsaWinsChampionsNews);
        barsaWinsChampionsNews = null;

        // 5.Show all news from an Editor
        FootballNews madridWinsChampionsNews = new FootballNews("Madrid wins the champions", "ChampionsLeague","Madrid", "Benzema");
        F1News ferrariWinsRaceNews = new F1News("Ferrari wins again!", "Ferrari");
        TennisNews nadalRetiresNews = new TennisNews("Nadal retires", "RollandGarros", "Nadal");
        BasketballNews euroleagueNews = new BasketballNews("Euroleague playoff next Wednesday", "Euroleague", "Barcelona");

        editor1.news.add(madridWinsChampionsNews);
        editor1.news.add(ferrariWinsRaceNews);
        editor1.news.add(nadalRetiresNews);
        editor1.news.add(euroleagueNews);

        System.out.println(editor1.getName() + "'s News:");
        for (SportNews article:  editor1.news){
            System.out.println(article.title);
        }

        // 6.Calculate News's score
        System.out.println("\nNews'scores:");
        madridWinsChampionsNews.calculateScore();
        ferrariWinsRaceNews.calculateScore();
        nadalRetiresNews.calculateScore();
        euroleagueNews.calculateScore();

        // 7.Calculate News's price
        System.out.println("\nNews'prices:");
        madridWinsChampionsNews.calculateNewsPrice();
        ferrariWinsRaceNews.calculateNewsPrice();
        nadalRetiresNews.calculateNewsPrice();
        euroleagueNews.calculateNewsPrice();
    }
}