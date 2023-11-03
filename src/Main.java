public class Main {
    public static void main(String[] args) {
        int startX = 100;
        int replenishment = 2300;
        int bonus;
        if (replenishment > 1000) {
            bonus = replenishment / 100;
        } else {
            bonus = 0;
        }
        int finishX = startX + replenishment + bonus;
        System.out.println("Итоговая сумма на счету " + finishX);

    }
}
