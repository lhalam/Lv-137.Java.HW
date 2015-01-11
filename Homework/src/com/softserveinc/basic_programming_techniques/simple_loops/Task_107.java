package com.softserveinc.basic_programming_techniques.simple_loops;

import com.softserveinc.homework.Task;
import com.softserveinc.tools.Constants;
import com.softserveinc.tools.NumberValidator;

/**
 * Task №107 from homework book
 *
 * @author Volodymyr Yakymiv
 * @version 1.1
 */
public class Task_107 extends Task {

    /**
     * Create object of {@link com.softserveinc.tools.NumberValidator} class
     * which include  method  which  will check accuracy of entered number
     */
    private NumberValidator checker = new NumberValidator();

    /**
     * Result of solution
     */
    private int result;

    /**
     * Starts task execution;
     */
    @Override
    public void startTask() {
        System.out.println(Constants.TASK_107);
        solveTask();
        System.out.println(toString());
    }

    /**
     * Solves task 107
     *
     * Raises result by 1 if condition is true and terminates method if condition is false
     */
    private void solveTask() {
        int enteredNumber = checker.checkIfEnteredValueIsValid();
        while ((Math.pow(Constants.PART_OF_EQUOTION, result)) < enteredNumber) {
            ++result;
            if ((Math.pow(Constants.PART_OF_EQUOTION, result)) < enteredNumber) continue;
            else break;
        }
    }

    /**
     * Returns the String representation of result.
     */
    @Override
    public String toString() {
        return "Result is : k=" + result;
    }

}










