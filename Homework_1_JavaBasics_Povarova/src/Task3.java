import java.util.Scanner;

public class Task3 {

    public static double temperatureConverter(double t, int type){
        double newT;
        switch (type) {
            case 1 -> newT = t + 273.15;
            case 2 -> newT = t + 32;
            case 3 -> newT = (t + 273.15) * 9 / 5;
            default -> throw new IllegalStateException("Unexpected value: " + type);
        }
        return newT;
    }

    public static void main(String[] args){
        System.out.println("Введите температуру в Градусах Цельсия: ");
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextDouble()) {
            double t = scanner.nextDouble();
            System.out.println("Спасибо! Вы ввели число " + t + ".\nВ какую температурную шкалу хотите перевести? Введите значение от 1 до 3");
            System.out.println("1. Кельвин\n2. Фаренгейт\n3. Ранкин");
            if(scanner.hasNextInt()){
                int type = scanner.nextInt();
                System.out.println("Получили результат: "+temperatureConverter(t, type));
            }
            else {System.out.println("Число должно быть в диапазоне от 1 до 3. Попробуйте еще раз!");}
        }
        else {System.out.println("Вы ввели не число. Запустите программу заново и попробуйте еще раз!");}

    }
}
