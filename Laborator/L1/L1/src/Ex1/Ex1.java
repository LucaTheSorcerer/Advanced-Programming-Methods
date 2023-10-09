package Ex1;

import org.jetbrains.annotations.NotNull;
import java.util.Arrays;

public class Ex1 {

//    public int[] notGoodEnoughGrade(int @NotNull [] grades) {
//        int[] finalNotes = new int[grades.length];
//        int finalNotesCount = 0;
//
//        for (int grade : grades) {
//            int roundedGrade = roundGrade(grade);
//            if (roundedGrade >= 40) {
//                finalNotes[finalNotesCount] = roundedGrade;
//                finalNotesCount++;
//            }
//        }
//
//        // Resize the finalNotes array to remove unused elements
//        int[] result = new int[finalNotesCount];
//        System.arraycopy(finalNotes, 0, result, 0, finalNotesCount);
//
//        return result;
//    }
//
//    public int roundGrade(int grade) {
//        if (grade < 38) {
//            return grade;
//        }
//
//        int nextMultipleOfFive = ((grade + 4) / 5) * 5;
//
//        if (nextMultipleOfFive - grade < 3) {
//            return nextMultipleOfFive;
//        } else {
//            return grade;
//        }
//    }
//
//    public Object[] notGoodEnoughGradeObj(@NotNull Object[] grades) {
//        Object[] finalNotes = new Object[grades.length];
//        int finalNotesCount = 0;
//
//        for (Object grade : grades) {
//            if (grade instanceof Integer) {
//                int roundedGrade = roundGrade((Integer) grade);
//                if (roundedGrade >= 40) {
//                    finalNotes[finalNotesCount] = roundedGrade;
//                    finalNotesCount++;
//                }
//            }
//        }
//
//        // Resize the finalNotes array to remove unused elements
//        Object[] result = new Object[finalNotesCount];
//        System.arraycopy(finalNotes, 0, result, 0, finalNotesCount);
//
//        return result;
//    }
//
//    //write a method that becomes an array of grades and computes the average grade
//
//    public double averageGrade(int @NotNull [] grades) {
//        double sum = 0;
//        for(int grade : grades) {
//            sum += grade;
//        }
//        return sum / grades.length;
//    }
//
//
//    public int[] roundGrades(int @NotNull [] grades) {
//        int[] roundedGrades = new int[grades.length];
//        for (int i = 0; i < grades.length; i++) {
//            roundedGrades[i] = roundGrade(grades[i]);
//        }
//        System.out.println("Rounded grades: " + Arrays.toString(roundedGrades));
//
//        return roundedGrades;
//    }
//
//
//    public int biggestRoundedGrade(int @NotNull [] grades) {
//        int biggestRoundedGrade = 0;
//
//        for(int grade : grades) {
//            if(roundGrade(grade) > biggestRoundedGrade) {
//                biggestRoundedGrade = roundGrade(grade);
//            }
//        }
//        return biggestRoundedGrade;
//    }


    public static int[] getFailingGrades(int[] grades) {
        return Arrays.stream(grades)
                .filter(grade -> grade < 40)
                .toArray();
    }


    public static double getAverageGrade(int[] grades) {
        if (grades.length == 0) {
            return 0.0;
        }

        int sum = Arrays.stream(grades).sum();
        return (double) sum / grades.length;
    }

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
