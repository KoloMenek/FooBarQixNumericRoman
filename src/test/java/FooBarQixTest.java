import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FooBarQixTest {

    private FooBarQix fooBarQix;
    private String result;

    @BeforeEach
    public void setUp() {
        fooBarQix = new FooBarQix();

    }

    @Test
    public void shouldReturnOneGivenOne() throws Exception {

        //Act
        result = fooBarQix.print(1);

        //Assert
        assertEquals("1", result);
    }

    @Test
    public void shouldReturnTwoGivenTwo() throws Exception {

        //Act
        result = fooBarQix.print(2);

        //Assert
        assertEquals("2", result);
    }

    @Test
    public void shouldReturnFooFooGivenThree() throws Exception {

        //Act
        result = fooBarQix.print(3);

        //Assert
        assertEquals("FooFoo", result);
    }

    @Test
    public void shouldReturnBarBarGivenFive() throws Exception {

        //Act
        result = fooBarQix.print(5);

        //Assert
        assertEquals("BarBar", result);
    }

    @Test
    public void shouldReturnFooGivenSix() throws Exception {

        //Act
        result = fooBarQix.print(6);

        //Assert
        assertEquals("Foo", result);
    }

    @Test
    public void shouldReturnQixQixGivenSeven() throws Exception {

        //Act
        result = fooBarQix.print(7);

        //Assert
        assertEquals("QixQix", result);


    }

    @Test
    public void shouldReturnBuzzGivenTen() throws Exception {

        //Act
        result = fooBarQix.print(10);

        //Assert
        assertEquals("Bar*", result);
    }

    @Test
    public void shouldReturnQixGivenFourteen() throws Exception {

        //Act
        result = fooBarQix.print(14);

        //Assert
        assertEquals("Qix", result);
    }


    @Test
    public void shouldReturnFizzBuzzGivenFifteen() throws Exception {

        //Act
        result = fooBarQix.print(15);

        //Assert
        assertEquals("FooBarBar", result);
    }

    @Test
    public void shouldReturnFooBarGivenFiftyThree() throws Exception {

        //Act
        result = fooBarQix.print(53);

        //Assert
        assertEquals("BarFoo", result);
    }

    @Test
    public void shouldReturnFooQixGivenTwentyOne() throws Exception {

        //Act
        result = fooBarQix.print(21);

        //Assert
        assertEquals("FooQix", result);
    }

    @Test
    public void shouldReturnFooBarGivenThirtyThree() throws Exception {

        //Act
        result = fooBarQix.print(33);

        //Assert
        assertEquals("FooFooFoo", result);
    }
    @Test
    public void shouldReturn1star1GivenOneOOne() throws Exception {

        //Act
        result = fooBarQix.print(101);

        //Assert
        assertEquals("1*1", result);
    }

    @Test
    public void shouldReturnFooFooStarFooGivenThreeOThree() throws Exception {

        //Act
        result = fooBarQix.print(303);

        //Assert
        assertEquals("FooFoo*Foo", result);
    }

    @Test
    public void shouldReturnFooBarQixStarBarGivenOneOFive() throws Exception {

        //Act
        result = fooBarQix.print(105);

        //Assert
        assertEquals("FooBarQix*Bar", result);
    }

    @Test
    public void shouldReturnFooQixStarStarStarGivenOneOOneOOne() throws Exception {

        //Act
        result = fooBarQix.print(10101);

        //Assert
        assertEquals("FooQix**", result);
    }
}
