public class Main {
    public static void main(String[] args) {
        //Задача 1
        System.out.println("Домашнее задание. Задание 1");
        for (int i = 1; i <= 10; i++){
            System.out.println(i);
        }
        //Задача 2
        System.out.println("Задание 2");
        for (int i = 10; i >= 1; i--){
            System.out.println(i);
        }
        //Задача 3
        System.out.println("Задание 3");
        for (int i = 2; i <= 17; i+=2){
            System.out.println(i);
        }
        //Задача 4
        System.out.println("Задание 4");
        for (int i = 10; i >= -10; i--){
            System.out.println(i);
        }
        //Задача 5
        System.out.println("Задание 5");
        for (int i = 10; i >= -10; i--){
            System.out.println(i);
        }
        //Домашнее задание 2. Задача 1
        System.out.println("Домашнее задание 2.Задание 1");
        for (int i = 1904; i <= 2096; i = i + 4){
            System.out.println(i);
        }
        //Задача 2
        System.out.println("Домашнее задание 2.Задание 2");
        for (int i = 7; i <= 98; i = i + 7){
            System.out.println(i);
        }
        //Задача 3
        System.out.println("Домашнее задание 2.Задание 3");
        for (int i = 1; i <= 512; i = i * 2){
            System.out.println(i);
        }
        //Задача 1
        System.out.println("Домашнее задание 3.Задание 1");
        int input = 29000;
        int total = 0;
        for (int i = 0; i < 12; i++){
            total = total + input;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей");
        }
        //Задача 2
        System.out.println("Домашнее задание 3.Задание 2");
        int input1 = 29000;
        int total1 = 0;
        for (int i = 0; i <= 12; i++){
            total1 = total1 + total1/100;
            total1 = total1 + input1;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total1 + " рублей");
        }
       }
}

