package volodymyrYakymiv.Exercise;

import java.util.Scanner;

/**
 * Abstract class
 *
 * @author Volodymyr Yakymiv
 * @version 1.0, January 2015
 *          Note that this version is not thread safe.
 */
public abstract class Exercise {

    protected long inputNumber;
    protected Scanner scanner = new Scanner(System.in);

    /**
     * solve an exercise
     *
     * @see volodymyrYakymiv.Exercise.Exercise107
     * @see volodymyrYakymiv.Exercise.Exercise243
     */
    public abstract void solveAnExercise();

    protected void checkCorrectInputNumber() {
        System.out.println(" Input natural number 'm' which is 'm>1' ");
        outer:
        while (scanner.hasNext()) {
            if (scanner.hasNextLong()) {
                inputNumber = scanner.nextLong();
                if (inputNumber > 1 && inputNumber < Long.MAX_VALUE) {
                    break outer;
                } else System.out.println("Incorrect value, input another number");
                continue outer;
            } else if (scanner.hasNextLine()) {
                String incorrectValue = scanner.nextLine();
                System.out.printf("Incorrect value '%s', input natural number", incorrectValue);
                continue outer;
            }
        }

    }
}