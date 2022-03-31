import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BonusServiceTest {

    @Test
    void ShouldCalculateRegistereAndBonusNotlilimited() {
        BonusService service = new BonusService();
        // подгатавливаем данные:
        long amount = 1000_60;
        boolean registered = true;
        long expected = 30;

        // вызываем целевой метод
        long actual = service.calculate(amount, registered);

        assertEquals(expected, actual);
    }
    @Test
    void ShouldCalculateRegistereAndBonuslilimited() {
        BonusService service = new BonusService();
        // подгатавливаем данные:
        long amount = 1000_00_60;
        boolean registered = true;
        long expected = 500;

        // вызываем целевой метод
        long actual = service.calculate(amount, registered);

        assertEquals(expected, actual);
    }
    @Test
    void ShouldCalculateNotRegistereAndBonusNotlilimited() {
        BonusService service = new BonusService();
        // подгатавливаем данные:
        long amount = 1000_60;
        boolean registered = false;
        long expected = 10;

        // вызываем целевой метод
        long actual = service.calculate(amount, registered);

        assertEquals(expected, actual);
    }
    @Test
    void ShouldCalculateNotRegistereAndBonuslilimited() {
        BonusService service = new BonusService();
        // подгатавливаем данные:
        long amount = 1000_00_60;
        boolean registered = false;
        long expected = 500;

        // вызываем целевой метод
        long actual = service.calculate(amount, registered);

        assertEquals(expected, actual);
    }
}