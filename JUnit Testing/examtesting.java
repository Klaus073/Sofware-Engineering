import org.junit.jupiter.api.*;

class ExamTest {
    exam fst;
    @Test
    @BeforeEach
    void init()
    {
        fst = new exam();
    }

    @Test
    void test()
    {

        int output = fst.Evaluation(new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1});
        Assertions.assertEquals(output, 10 );
    }
    @Test
    void test1(){
        int output = fst.Evaluation(new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 2});
        Assertions.assertEquals(output, 9 );
    }
    @Test
    void test2(){

        int c2 = fst.Evaluation(new int[]{1, 1, 1, 1, 1, 1, 1, 1, 2, 1});
        Assertions.assertEquals(c2, 8 );
    }
    @Test
    void test3(){

        int output = fst.Evaluation(new int[]{1, 1, 1, 1, 1, 1, 1, 2, 2, 2});
        Assertions.assertEquals(output, 7);
    }
    @Test
    void test4(){

        int output = fst.Evaluation(new int[]{2, 2, 2, 2, 1, 1, 1, 1, 1, 1});
        Assertions.assertEquals(output, 6);
    }
    @Test
    void test5(){
        int output = fst.Evaluation(new int[]{1, 1, 1, 1, 1, 2, 2, 2, 2, 2});
        Assertions.assertEquals(output, 5 );
    }
    @Test
    void test6(){

        int output = fst.Evaluation(new int[]{2, 1, 1, 1, 2, 2, 2, 2, 2, 2});
        Assertions.assertEquals(output, 3 );
    }
    @Test
    void test7(){
        int output = fst.Evaluation(new int[]{1, 2, 1, 2, 2, 2, 2, 2, 2, 2});
        Assertions.assertEquals(output, 2 );
    }
    @Test
    void test8(){

        int output = fst.Evaluation(new int[]{1, 1, 2, 2, 2, 2, 2, 2, 2, 2});
        Assertions.assertEquals(output, 2 );
    }
    @Test
    void test9(){

        int output = fst.Evaluation(new int[]{1, 2, 2, 2, 2, 2, 2, 2, 2, 2});
        Assertions.assertEquals(output, 1 );
    }
    @Test
    void test10(){
        int output = fst.Evaluation(new int[]{2, 2, 2, 2, 2, 2, 2, 2, 2, 2});
        Assertions.assertEquals(output, 1 );
    }
}