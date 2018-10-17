import org.junit.Assert;
import org.junit.Test;
import CalcForUnitTest.Addition;
import CalcForUnitTest.Division;
import CalcForUnitTest.Substraction;
import CalcForUnitTest.Multiplication;

public class unitTest {

    @Test
    public void testAddition() {
        Addition testAdd = new Addition();
        Assert.assertEquals("Неправильно складывем числа",10, testAdd.getSumNum(4, 6), 0);
    }

    @Test
    public void testDivision() {
        Division testDiv = new Division();
        Assert.assertEquals("Неправильно вычитаем числа", 48, testDiv.getDivNum(148, 100), 0);
    }
    @Test
    //тест специально с ошибкой. Неправильно выставила ожидаемый результат
    public void testMultiplication() {
        Multiplication testMul = new Multiplication();
        Assert.assertEquals("Неправильно умножаем числа", 42.882, testMul.getMultiNum(5.23, 8.2), 0);
    }
    @Test
    public void testSustraction() {
        Substraction testSub = new Substraction();
        Assert.assertEquals("Неправильно делим числа", 64.5, testSub.getSubNum(258, 4), 0);
    }

}
