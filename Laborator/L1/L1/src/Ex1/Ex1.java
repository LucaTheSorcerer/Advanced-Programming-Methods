package Ex1;

import org.jetbrains.annotations.NotNull;
import java.util.Arrays;

public class Ex1 {

    //return the grades that are failed
    public static int[] getFailingGrades(int[] grades) {
        return Arrays.stream(grades)
                .filter(grade -> grade < 40)
                .toArray();
    }


    //return the average grade
    public static double getAverageGrade(int[] grades) {
        if (grades.length == 0) {
            return 0.0;
        }

        int sum = Arrays.stream(grades).sum();
        return (double) sum / grades.length;
    }

    //return an array with the rounded grades
    public static int[] getRoundedGrades(int[] grades) {
        return Arrays.stream(grades)
                .map(grade -> {
                    if (grade >= 38 && grade % 5 >= 3) {
                        return (grade / 5 + 1) * 5;
                    }
                    return grade;
                })
                .toArray();
    }

    //return the max rounded grades
    public static int getMaxRoundedGrade(int[] grades) {
        int maxRoundedGrade = Integer.MIN_VALUE;

        for (int grade : grades) {
            if (grade >= 38) {
                int roundedGrade = (grade / 5 + 1) * 5;
                maxRoundedGrade = Math.max(maxRoundedGrade, roundedGrade);
            }
        }

        return maxRoundedGrade;
    }



}
