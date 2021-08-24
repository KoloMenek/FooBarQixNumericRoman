import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumericRomanTest {
    NumericRoman numericRoman;
    @BeforeEach
    public void prep(){
        //Arrange
        numericRoman = new NumericRoman();
    }

    @Test
    public void ShouldReturnIGivenOne(){
        //Act
        String result = numericRoman.print(1);

        //Assert
        assertEquals("I", result);
    }
    @Test
    public void ShouldReturnIIGivenTwo(){
        //Act
        String result = numericRoman.print(2);

        //Assert
        assertEquals("II", result);
    }
    @Test
    public void ShouldReturnIIIGivenThree(){
        //Act
        String result = numericRoman.print(3);

        //Assert
        assertEquals("III", result);
    }
    @Test
    public void ShouldReturnIVGivenFour(){
        //Act
        String result = numericRoman.print(4);

        //Assert
        assertEquals("IV", result);
    }
    @Test
    public void ShouldReturnVGivenFive(){
        //Act
        String result = numericRoman.print(5);

        //Assert
        assertEquals("V", result);
    }
    @Test
    public void ShouldReturnVIGivenSix(){
        //Act
        String result = numericRoman.print(6);

        //Assert
        assertEquals("VI", result);
    }
    @Test
    public void ShouldReturnVIIGivenSeven(){
        //Act
        String result = numericRoman.print(7);

        //Assert
        assertEquals("VII", result);
    }
    @Test
    public void ShouldReturnVIIIGivenEight(){
        //Act
        String result = numericRoman.print(8);

        //Assert
        assertEquals("VIII", result);
    }
    @Test
    public void ShouldReturnIXGivenNine(){
        //Act
        String result = numericRoman.print(9);

        //Assert
        assertEquals("IX", result);
    }
    @Test
    public void ShouldReturnXGivenTen() {
        //Act
        String result = numericRoman.print(10);

        //Assert
        assertEquals("X", result);
    }
    @Test
    public void ShouldReturnXXGivenTwenty() {
        //Act
        String result = numericRoman.print(20);

        //Assert
        assertEquals("XX", result);
    }
    @Test
    public void ShouldReturnXXXGivenThirty() {
        //Act
        String result = numericRoman.print(30);

        //Assert
        assertEquals("XXX", result);
    }
    @Test
    public void ShouldReturnXLGivenForty() {
        //Act
        String result = numericRoman.print(40);

        //Assert
        assertEquals("XL", result);
    }
    @Test
    public void ShouldReturnLGivenFifty() {
        //Act
        String result = numericRoman.print(50);

        //Assert
        assertEquals("L", result);
    }

    @Test
    public void ShouldReturnLXGivenSixty() {
        //Act
        String result = numericRoman.print(60);

        //Assert
        assertEquals("LX", result);
    }
    public void ShouldReturnLXXXGivenEighty() {
        //Act
        String result = numericRoman.print(80);

        //Assert
        assertEquals("LXXX", result);
    }
    @Test
    public void ShouldReturnNullGivenZero(){
        //Act
        String result = numericRoman.print(0);

        //Assert
        assertEquals("", result);
    }
    @Test
    public void ShouldReturnLXIXGivenSixtyNine(){
        //Act
        String result = numericRoman.print(69);

        //Assert
        assertEquals("LXIX", result);
    }

    @Test
    public void ShouldReturnLXXXVIIIGivenEightyEight(){
        //Act
        String result = numericRoman.print(88);

        //Assert
        assertEquals("LXXXVIII", result);
    }

    @Test
    public void ShouldReturnCCCXCVIIIGivenThreeNineEight(){
        //Act
        String result = numericRoman.print(398);

        //Assert
        assertEquals("CCCXCVIII", result);
    }
    @Test
    public void ShouldReturnMGivenThousand(){
        //Act
        String result = numericRoman.print(1000);

        //Assert
        assertEquals("M", result);
    }
    @Test
    public void ShouldReturnMIGivenThousandOne(){
        //Act
        String result = numericRoman.print(1001);

        //Assert
        assertEquals("MI", result);
    }
}
