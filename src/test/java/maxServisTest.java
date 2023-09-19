import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class maxServisTest {

    @Test

    public void maxGet(){

        maxServis serves = new maxServis();

        int a = 8;
        int b = 5;

        int actual = a;
        int expected = serves.maxServ(a, b);
        Assertions.assertEquals(actual, expected);
    }
}
