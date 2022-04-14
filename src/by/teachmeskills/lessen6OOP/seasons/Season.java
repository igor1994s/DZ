package by.teachmeskills.lessen6OOP.seasons;

public enum Season {
    WINTER(-15),
    SPRING(15),
    SUMMER(25){
        @Override
        public String getDescription(){
            return "Теплое время года";
        }
    },
    AUTUMN(10);

    private int temperature;

    Season (int temperature){
        this.temperature=temperature;
    }

    public String getDescription(){
        return "Холодное время года";
    }

    public int getTemperature(){
        return temperature;
    }

    public String rus(Season season){
        String rus=null;
        switch (season){
            case WINTER:
                rus= "Зима ";
                break;
            case SPRING:
                rus= "Весна ";
                break;
            case SUMMER:
                rus= "Лето ";
                break;
            case AUTUMN:
                rus= "Осень ";
                break;
        }
        return rus;
    }

    public void iLove(Season pora){
        switch (pora){
            case WINTER:
                System.out.println("Я люблю зиму.");
                break;
            case SPRING:
                System.out.println("Я люблю весну.");
                break;
            case SUMMER:
                System.out.println("Я люблю лето.");
                break;
            case AUTUMN:
                System.out.println("Я люблю осень.");
                break;
        }
    }
}
