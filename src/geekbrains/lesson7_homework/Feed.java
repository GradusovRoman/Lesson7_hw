package geekbrains.lesson7_homework;

public class Feed {

    public static void main(String[] args) {
        int time = 0;
        Cat[] cat = new Cat[3];
        cat[0] = new Cat("Базилио", 100, 4);
        cat[1] = new Cat("Дымок", 120, 3);
        cat[2] = new Cat("Матроскин", 80, 5);
        Plate plate = new Plate(500);
        System.out.println("Утром в миске было " + plate.getFood() + " гр. кошачьего корма.");
        System.out.println("У хозяина три кота: " + cat[0].getName() + ", " + cat[1].getName()+ ", и " + cat[2].getName()
                + ", которые хотят есть каждые " + cat[0].getSatietyTime() + ", " + cat[1].getSatietyTime()+ ", и " + cat[2].getSatietyTime()
                + " час(а/ов) соответственно.");


        do {
            for (Cat i : cat) {
                //если кот голоден
                if (i.getSatiety() == 0) {

                    //Когда в миске не хватает корма для кота - добавляем
                    if (!plate.checkFood(i.getAppetite())) {
                        plate.increaseFood();
                    }

                    //Кормим кота
                    i.eat(plate);
                    System.out.println("Кот " + i.getName() + " съел " + i.getAppetite() +
                            " гр. корма ,следующая кормежка у него через " + (i.getSatiety()) + " часа(ов)");
                }

                //уменьшение показателя сытости
                i.setSatiety(i.getSatiety() - 1);
            }
            System.out.println("С момента начала кормежки прошел(ло) " + time + " час(а). В миске осталось " + plate.getFood() + " гр. корма.");
            time++;
            if (time >=12){
                System.out.println("Хозяин лег спать! Коты доедают ночью то, что осталось, и ждут утра. =<^_^>=");


            }
            // Кормим в течение 12 часов (днем), ночью коты по большей части спят... по крайней мере должны =)
        } while (time <= 12);

    }
}