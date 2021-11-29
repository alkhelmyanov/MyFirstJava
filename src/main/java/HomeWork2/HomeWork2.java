package HomeWork2;

public class HomeWork2 {
    public static void main(String[] args) {
        int c = 1;
        System.out.println(c++ + c); // 1 + 2 // сначала увеличили c на 1 потом прибавили 1
        System.out.println("теперь с равна " + c); // с == 2
        System.out.println(++c + c); // 3 + 3 // сначала увеличили с на 1
        System.out.println("теперь с равна " +c); // с == 3
        System.out.println(c + c++);
        System.out.println("теперь с равна " +c); // с == 4
        c += ++c + c;
        System.out.println("теперь с равна " +c); // с == 14
    }
}
