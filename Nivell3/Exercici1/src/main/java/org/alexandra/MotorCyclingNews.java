package org.alexandra;

public class MotorCyclingNews extends SportNews implements Price{
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
}
