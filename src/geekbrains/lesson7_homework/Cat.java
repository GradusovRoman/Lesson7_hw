package geekbrains.lesson7_homework;

public class Cat extends Feed {
    private String name;
    private int appetite;
    private int satietyTime;
    private int satiety;

    public String getName() {
        return name;
    }

    public int getAppetite() {
        return appetite;
    }

    public int getSatietyTime() {
        return satietyTime;
    }

    public int getSatiety() {
        return satiety;
    }

    public void setSatiety(int satiety) {
        this.satiety = satiety;
    }

    public Cat(String name, int appetite, int satietyTime) {

        this.name = name;
        this.appetite = appetite;
        this.satietyTime = satietyTime;
        this.satiety = 0;
    }

    //показатель сытости кота
    public void eat(Plate p) {
        p.decreaseFood(appetite);
        satiety += satietyTime;
    }
}
