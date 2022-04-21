package by.teachmeskills.lessen6_7_8OOP.seasons;

public class SeasonApp {
    public static void main(String[] args) {
        Season season=Season.SUMMER;
        season.iLove(season);
        for (Season ses:Season.values()){
            System.out.println(ses.rus(ses)+ses.getDescription()+", "+"со средней температурой: "+ses.getTemperature()+".");
        }
    }
}
