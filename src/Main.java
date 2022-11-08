public class Main {
    public static void main(String[] args) {
        int userBalance = 100;
        int depositBalance = 1500;
        int bonus;

        if (depositBalance > 1000) {
            bonus = depositBalance / 100;
        } else {
            bonus = 0;
        }

        int balance = userBalance + depositBalance + bonus;

        System.out.print("Итоговый счет " + balance);

        System.out.print(" Бонусы " + bonus);
    }
}