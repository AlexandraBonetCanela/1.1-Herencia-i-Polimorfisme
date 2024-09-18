package org.alexandra;

public class MotorCyclingNews extends SportNews implements Price, Score{
    private String team;

    public MotorCyclingNews(String name, String team) {
        super(name);
        this.team = team;
    }

    public Integer calculateNewsPrice() {
        Integer price = 100;

        if(team.equals("Honda") || team.equals("Yamaha")) {
            price = price + 50;
        }
        System.out.println(MotorCyclingNews.super.title + " price: " + price + "€");
        return price;
    }

    public Integer calculateScore(){
        Integer score = 3;
        if(team.equals("Honda") || team.equals("Yamaha")) {
            score = score + 3;
        }
        System.out.println(MotorCyclingNews.super.title + " score: " + score + " points");
        return score;
    }
}
