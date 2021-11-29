package HomeWork2;

public class HomeWork2 {
    public static void main(String[] args) {

    /*    int nujnoeZnachenie = sumAndVars(10,20);
        System.out.println("Результат выполнения метода " + nujnoeZnachenie);
    }

    private static int sumAndVars(int a, int b) {
    int result = a + b;
    return result;*/
        converSeasonSwitch(2);

    }

    public static void converSeasonSwitch(int seasonNumber) {
        String season = switch (seasonNumber) { // сразу переменной season присваивается возврат switch
            case 1, 5, 6 -> "Winter"; // можно проверять несколько аргументов seasonNumber
            case 2 -> "Spring";
            case 3 -> "Summer";
            case 4 -> "Fall";
            default -> "Unknown season";
        };

        System.out.println(season);

    }

}
