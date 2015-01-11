package com.softserveinc.basic_programming_techniques.simple_loops;

import com.softserveinc.homework.Task;
import com.softserveinc.tools.Constants;
import com.softserveinc.tools.DataScanner;
import com.softserveinc.tools.Input;

/**
 * Task №107 from homework book
 *
 * @author Volodymyr Yakymiv
 * @version 1.1
 */
public class Task_107 extends Task {

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
        solveTask(Input.readNatural(DataScanner.getScanner()));
        System.out.println(toString());
    }

    /**
     * Solves task 107
     *
     * Raises result by 1 if condition is true and terminates method if condition is false
     */
    public int solveTask(int enteredNumber) {
        while ((Math.pow(Constants.PART_OF_EQUOTION, result)) < enteredNumber) {
            ++result;
            if ((Math.pow(Constants.PART_OF_EQUOTION, result)) < enteredNumber) continue;
            else break;
        }
   return result; }

    /**
     * Returns the String representation of result.
     */
    @Override
    public String toString() {
        return "Result is : k=" + result;
    }

}










