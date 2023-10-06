import org.junit.Test;

public class Ex1Test {

    @Test
    public void testNotGoodEnoughGrade() {
        Ex1 ex1 = new Ex1();
        int[] grades = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        int[] finalNotes = ex1.notGoodEnoughGrade(grades);

        for(int i = 0; i < finalNotes.length; i++) {
            System.out.println(finalNotes[i]);
        }

        assert finalNotes.length == 7;

        assert finalNotes[0] == 40;
        assert finalNotes[1] == 50;
        assert finalNotes[2] == 60;
        assert finalNotes[3] == 70;
        assert finalNotes[4] == 80;
        assert finalNotes[5] == 90;
        assert finalNotes[6] == 100;

        //assert that does not work and handles the error with an exception
        try {
            assert finalNotes[7] == 100;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException");
        }

    }

}
