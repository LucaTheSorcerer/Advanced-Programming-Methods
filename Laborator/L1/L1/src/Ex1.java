import org.jetbrains.annotations.NotNull;

public class Ex1 {

    public int[] notGoodEnoughGrade(@NotNull int[] grades) {
        int[] finalNotes = new int[grades.length];

        for(int i = 0; i < grades.length; i++) {
            if(roundGrade(grades[i]) >= 40) {
                finalNotes = addToArray(finalNotes, roundGrade(grades[i]));
            }
        }

        return finalNotes;

    }

    public int roundGrade(int grade) {
        if(grade < 38) {
            return grade;
        }

        else {
            return grade + grade%5;
        }
    }

    //do the same notGoodEnoughGrade but with the object array

    public Object[] notGoodEnoughGradeObj(@NotNull Object[] grades) {
        Object[] finalNotes = new Object[grades.length];

        for(int i = 0; i < grades.length; i++) {
            if(roundGrade((Integer) grades[i]) >= 40) {
                finalNotes[i] = roundGrade((Integer) grades[i]);
            }
        }

        return finalNotes;
    }

    public int[] addToArray(int[] original, int newElement) {
        int[] result = new int[original.length + 1];

        //System.arraycopy(original, 0, result, 0, original.length);

        for(int i = 0; i < original.length; i++) {
            result[i] = original[i];
        }

        result[original.length] = newElement;

        return result;

    }
}
