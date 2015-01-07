package volodymyrYakymiv.ChoiceTask;

import volodymyrYakymiv.Exercise.Exercise;
import volodymyrYakymiv.Exercise.Exercise107;
import volodymyrYakymiv.Exercise.Exercise243;

import java.util.Scanner;

/**
 * The ViewOfMenu class shows the main menu of application
 *
 * @author Volodymyr Yakymiv
 * @version 1.0, January 2015
 *          Note that this version is not thread safe.
 */
public class ViewOfMenu {

    /**
     * Condition of first exercise
     */
    private static final String EXERCISE_107 = " Задане ціле число m>1.\n " +
            "Обчислити найбільше ціле число k при якому виконується умова 4^k<m";
    /**
     * Condition of second exercise
     */
    private static final String EXERCISE_243 = " Задане натуральне число n.\n Визначити," +
            "чи можливо представити дане число у вигляді суми двох квадратів натуральних чисел?\n" +
            " Якщо моливо , то:\n   a) Вказати пару x, y таких натуральних чисел, що x^2+y^2=n\n" +
            "   б) Вказати усі пари x, y таких натуральних чисел, що x^2+y^2=n та x>=y";
    private Scanner scanner = new Scanner(System.in);
    private Exercise task;
    private boolean pointOfEndApplication;

    public void startApplication() {
        listOfTasks();
        doChoice();
        checkEndOfApplication();
    }

    /**
     * Print conditions of exercises.
     */
    private void listOfTasks() {
        System.out.println("Task 1:\n" + EXERCISE_107 + "\nTask 2:\n" + EXERCISE_243);
    }

    private void doChoice() {
        System.out.println("  Make your choice:\n  Input (1)-Task 1;\n  Input (2)-Task 2; \n  Input 'end' to exit. ");
        outer:
        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                int temp = scanner.nextInt();
                switch (temp) {
                    case 1:
                        /**Create an object of  {@link volodymyrYakymiv.Exercise.Exercise107} class*/
                        task = new Exercise107();
                        break outer;
                    case 2:
                        /**Create an object of class {@link volodymyrYakymiv.Exercise.Exercise243} class*/
                        task = new Exercise243();
                        break outer;
                    default:
                        System.out.println("Incorrect number of exercise,try again.");
                        continue outer;
                }
            } else if (scanner.hasNextLine()) {
                String temp = scanner.nextLine();
                switch (temp) {
                    case "end":
                        pointOfEndApplication = true;
                        break outer;
                    default:
                        System.out.println("Incorect value, try again.");
                        continue outer;
                }
            }
        }
    }

    private void checkEndOfApplication() {
        if (pointOfEndApplication == false) {
            findResult();
        } else {
            System.out.println("Closing.....");
        }
    }

    /**
     * Print result
     */
    private void findResult() {
        task.solveAnExercise();
        System.out.println(task.toString());
    }

}
