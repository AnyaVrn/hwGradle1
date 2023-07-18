import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    CashbackHackService service = new CashbackHackService();

    @Test

    public void testRemain() {

            int actual = service.remain(500);
            int expected = 500;

            assertEquals(actual, expected);
        }

    }
