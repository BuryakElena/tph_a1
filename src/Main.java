public class Main {
    public static void main(String[] args) {

        int initialBalance = 100;
        int addend = 300;
        int bonus = addend > 1000 ? addend / 1000 : 0;


        int finalBalance = initialBalance + addend + bonus;

        System.out.println("Итоговый счет: " + finalBalance);
        System.out.println("Бонус: " + bonus);
    }
}
