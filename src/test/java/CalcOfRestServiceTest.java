import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import ru.netology.services.CalcOfRestService;

public class CalcOfRestServiceTest {

    @Test
    void shouldtestCalcOfRestService() {
        CalcOfRestService calcOfRestService = new CalcOfRestService();
        int expected = 3;
        int actual = calcOfRestService.calculate(10000, 3000, 20000);
    }

    @Test
    void shouldtestCalcOfRestService2(){
        CalcOfRestService calcOfRestService = new CalcOfRestService();
        int expected = 2;
        int actual = calcOfRestService.calculate(100_000, 60_000, 150_000);
    }
}