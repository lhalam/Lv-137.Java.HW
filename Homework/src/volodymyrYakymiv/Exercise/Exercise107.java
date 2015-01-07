package volodymyrYakymiv.Exercise;


/**
 * The Exercise107 class solve a task №107
 *
 * @author Volodymyr Yakymiv
 * @version 1.0, January 2015
 *          Note that this version is not thread safe.
 */
public class Exercise107 extends Exercise {

    private static final int PART_OF_EQUOTION = 4;
    private int result = 0;

    /**
     * Solve an exercise
     */
    @Override
    public void solveAnExercise() {
        checkCorrectInputNumber();
        while ((Math.pow(PART_OF_EQUOTION, result)) < inputNumber) {
            ++result;
            if ((Math.pow(PART_OF_EQUOTION, result)) < inputNumber) continue;
            else break;
        }
    }

    /**
     * Create and return a String of Object
     * @return String return answer
     */
    @Override
    public String toString() {
        return "Result is : k=" + result;
    }


}
