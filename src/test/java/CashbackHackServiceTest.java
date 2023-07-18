import org.junit.Test;
import ru.netology.CashbackHackService;

import static org.junit.Assert.*;
public class CashbackHackServiceTest {

    ru.netology.CashbackHackService service = new CashbackHackService();

    @Test

    public void testRemain() {

        int actual = service.remain(500);
        int expected = 500;

        assertEquals(actual, expected);
    }

}

