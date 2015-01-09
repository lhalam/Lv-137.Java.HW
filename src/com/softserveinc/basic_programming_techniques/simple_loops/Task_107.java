package com.softserveinc.basic_programming_techniques.simple_loops;

import com.softserveinc.homework.Task;
import com.softserveinc.tools.Constants;
import com.softserveinc.tools.NumberValidator;

/**
 * @author Volodymyr Yakymiv
 */
public class Task_107 extends Task {

    private static final int PART_OF_EQUOTION = 4;
    private NumberValidator checker;
    private int result = 0;

    public void startTask() {
        System.out.println(Constants.TASK_107);
        solveTask();
        System.out.println(toString());
    }

    private void solveTask() {
        checker = new NumberValidator();
        int enteredNumber = checker.checkIfEnteredValueIsValid();
        while ((Math.pow(PART_OF_EQUOTION, result)) < enteredNumber) {
            ++result;
            if ((Math.pow(PART_OF_EQUOTION, result)) < enteredNumber) continue;
            else break;
        }
    }

    @Override
    public String toString() {
        return "Result is : k=" + result;
    }
}










