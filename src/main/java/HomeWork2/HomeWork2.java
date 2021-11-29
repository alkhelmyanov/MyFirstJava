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
    public static void converSeasonSwitch(int seasonNumber){
        String season; // создаем пустую переменную

        switch (seasonNumber){ //  в аргументы пишем что именно будет сравниваться в дальнейшем
            case 1: // варианты сравнения с чем сравнивать seasonNumber. Если seasonNumber будет равен "1"
                season = "Winter"; // Если seasonNumber == 1, то переменной season присваивается значение "Winter"
                break; // после каждого кейса обязательно должен быть break. Если не поставить break то выполение кейса не завершится, и java будет присваивать переменной season значения остальных кейсов которые идут дальше.
            case 2:
                season = "Spring";
                break;
            case 3:
                season = "Summer";
                break;
            case 4:
                season = "Fall";
                break;
            default: // Если ни один из кейсов не выполнился то выполнится кейс по умолчанию default. После default ставить break не надо.
                season = "Unknown season";
        }
        System.out.println(season);

    }

}
