package volodymyrYakymiv.Exercise;

import java.util.HashMap;
import java.util.Map;


/**
 * The Exercise243 class solve a task №243
 *
 * @author Volodymyr Yakymiv
 * @version 1.0, January 2015
 *          Note that this version is not thread safe.
 */
public class Exercise243 extends Exercise {

    private String partOfExercise;
    private Map<Integer, Integer> map = new HashMap<>();
    private StringBuilder stringBuilder = new StringBuilder();

    /**
     * Solve an exercise
     */
    @Override
    public void solveAnExercise() {
        System.out.println(" Make a choice.\n Input 'A'-Exercise 243(A)\n Input 'B'-Exercise 243(B)");
        switch (choicePartOfExercise().toUpperCase()) {
            case "A":
                checkCorrectInputNumber();
                solveAnExerciseA();
                break;
            case "B":
                checkCorrectInputNumber();
                solveAnExerciseB();
                break;
        }
    }

    /**
     * Create and return a String of Object
     * @return String return answer
     */
    @Override
    public String toString() {
        if (map.isEmpty() == true) {
            System.out.println("Exercise doesn't have answers");
        } else {
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if (entry.getKey() >= entry.getValue()) {
                    stringBuilder.append("x=" + entry.getKey() + " y=" + entry.getValue() + "\n");
                }
            }
        }
        return stringBuilder.toString();
    }

    private String choicePartOfExercise() {
        outer:
        while (scanner.hasNext()) {
            partOfExercise = scanner.nextLine();
            if (partOfExercise.toUpperCase().equals("A") || partOfExercise.toUpperCase().equals("B")) {
                break outer;
            } else {
                System.out.printf("Incorrect input '%s', try again... ", partOfExercise);
                continue;
            }
        }
        return partOfExercise;
    }

    private void solveAnExerciseA() {
        outer:
        for (int i = 0; i <= Math.sqrt(inputNumber); i++) {
            for (int j = 0; j <= Math.sqrt(inputNumber); j++) {
                if ((Math.pow(i, 2) + Math.pow(j, 2)) > inputNumber) {
                    break;
                } else if ((Math.pow(i, 2) + Math.pow(j, 2)) == inputNumber) {
                    if (i > j) {
                        map.put(i, j);
                        break outer;
                    } else {
                        map.put(j, i);
                        break outer;
                    }
                }
            }
        }
    }

    private void solveAnExerciseB() {
        for (int i = 0; i <= Math.sqrt(inputNumber); i++) {
            for (int j = 0; j <= Math.sqrt(inputNumber); j++) {
                if ((Math.pow(i, 2) + Math.pow(j, 2)) > inputNumber) break;
                else if ((Math.pow(i, 2) + Math.pow(j, 2)) == inputNumber) {
                    map.put(i, j);
                }
            }
        }
    }

}

