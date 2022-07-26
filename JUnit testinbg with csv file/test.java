import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

class testing {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/test.csv")
    void test(int age, char gender, Boolean married, int points, int expectedOutput){
        CarInsurance fst = new CarInsurance();
        int result = fst.CarInsurance(age, gender, married, points);
        Assertions.assertEquals(result, expectedOutput);
    }

}