public class Main {
    public static void main(String[] args) {

        int deposit = 200; // сумма на счету клиента до пополнения
        int refill = 1500; // сумма пополнения

        int bonus; // бонус за пополнение счета
        if (refill > 1000) {
            bonus = refill / 100;

        }
        else {
            bonus = 0;

        }

        int totalAmount = deposit + refill + bonus;

        System.out.println("Итоговая сумма на счете: " + (totalAmount));
        System.out.println("Количество бонусов за пополнение: " + (bonus));


    }
}