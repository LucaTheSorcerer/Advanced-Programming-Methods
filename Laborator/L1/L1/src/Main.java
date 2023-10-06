public class Main {
    public static void main(String[] args) {

        Ex1 ex1 = new Ex1();

        int[] grades = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};

        int[] finalNotes = ex1.notGoodEnoughGrade(grades);

        for(int i = 0; i < finalNotes.length; i++) {
            System.out.println(finalNotes[i]);
        }

    }
}