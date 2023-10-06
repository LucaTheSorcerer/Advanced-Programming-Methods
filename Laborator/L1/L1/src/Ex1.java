import org.jetbrains.annotations.NotNull;

public class Ex1 {

    public int[] notGoodEnoughGrade(@NotNull int[] grades) {
        int[] finalNotes = new int[grades.length];
        int finalNotesCount = 0;

        for (int i = 0; i < grades.length; i++) {
            int roundedGrade = roundGrade(grades[i]);
            if (roundedGrade >= 40) {
                finalNotes[finalNotesCount] = roundedGrade;
                finalNotesCount++;
            }
        }

        // Resize the finalNotes array to remove unused elements
        int[] result = new int[finalNotesCount];
        System.arraycopy(finalNotes, 0, result, 0, finalNotesCount);

        return result;
    }

    public int roundGrade(int grade) {
        if (grade < 38) {
            return grade;
        }

        int nextMultipleOfFive = ((grade + 4) / 5) * 5; // Round to the nearest multiple of 5

        if (nextMultipleOfFive - grade < 3) {
            return nextMultipleOfFive;
        } else {
            return grade;
        }
    }

    public Object[] notGoodEnoughGradeObj(@NotNull Object[] grades) {
        Object[] finalNotes = new Object[grades.length];
        int finalNotesCount = 0;

        for (int i = 0; i < grades.length; i++) {
            if (grades[i] instanceof Integer) {
                int roundedGrade = roundGrade((Integer) grades[i]);
                if (roundedGrade >= 40) {
                    finalNotes[finalNotesCount] = roundedGrade;
                    finalNotesCount++;
                }
            }
        }

        // Resize the finalNotes array to remove unused elements
        Object[] result = new Object[finalNotesCount];
        System.arraycopy(finalNotes, 0, result, 0, finalNotesCount);

        return result;
    }
}
