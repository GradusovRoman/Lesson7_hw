package geekbrains.lesson7_homework;

public class Plate extends Feed {

    private int food;

    public int getFood() {
        return food;
    }

    public Plate(int food) {
        this.food = food;
    }

    public void decreaseFood(int n) {
        food -= n;
    }
    //докладываем корм в тарелку
    public void increaseFood() {
        this.food += 450;
        System.out.println("Хозяин добавил в миску 450 гр. корма");
    }
    //проверка наполненности тарелки
    public boolean checkFood(int n) {
        return (food - n) >= 0;
    }

}