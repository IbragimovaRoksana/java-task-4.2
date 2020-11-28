import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Диссклеймер: программа расчитана для мужчин, обладающих чувством юмора!!!");
        BmiService bmi = new BmiService();
        Scanner parametres = new Scanner(System.in);
        System.out.println("Введите массу тела(в кг.)");
        float massa = parametres.nextFloat();
        System.out.println("Введите ваш рост(в сантиметрах)");
        float height = parametres.nextFloat();

        float index = bmi.calculate(massa, height);
        if (index < 16.5)
            System.out.println("Чет ты ваще дрыщ.Тебя ветром не сдувает?\n Ваш индекс массы тела:" + index);
        else if (index >= 16.5 && index < 18.5)
            System.out.println("Надо потреблять больше углеводов!\n Ваш индекс массы тела:" + index);
        else if (index >= 18.5 && index < 25.0)
            System.out.println("Так держать!\n Ваш индекс массы тела:" + index);
        else if (index >= 25.0 && index < 30.0)
            System.out.println("Надо потреблять поменьше углеводов!\n Ваш индекс массы тела:" + index);
        else if (index >= 30.0 && index < 35.0)
            System.out.println("Хоть ты и всем говоришь, что у тебя широкая кость,\n тебе нужно что-то делать с весом!\n Ваш индекс массы тела:" + index);
        else if (index >= 35.0 && index < 40.0)
            System.out.println("Эй, толстый! Тебе срочно нужны диета и тренировки!\n Ваш индекс массы тела:" + index);
        else System.out.println("Годзилла нервно курит в сторонке!!!\n Ваш индекс массы тела:" + index);

    }
}
