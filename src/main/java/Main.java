
public class Main {
    public static void main(String[] args) {
        BonusService service = new BonusService();
        // подгатавливаем данные:
        long amount = 1000_60;
        boolean registered = true;
        long expected = 30;

        // вызываем целевой метод
        long actual = service.calculate(amount, registered);
        // производим проверку (сравниваем ожидаемый и фактический результат)
        //если trut - то PASS
        //если false - то FAIL
        boolean passed = expected == actual;

        //выводим результат
        System.out.println(passed);
    }
}

