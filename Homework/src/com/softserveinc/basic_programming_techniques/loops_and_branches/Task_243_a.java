package com.softserveinc.basic_programming_techniques.loops_and_branches;

import com.softserveinc.homework.Task;
import com.softserveinc.tools.Constants;
import com.softserveinc.tools.DataScanner;
import com.softserveinc.tools.Input;

import java.util.HashMap;
import java.util.Map;

/**
 * Task 243_A from homework book
 *
 * @author Volodymyr Yakymiv
 * @version 1.1
 */
public class Task_243_a extends Task {

    /**
     * Collection which contains  pairs of results
     */
    public Map<Integer, Integer> map = new HashMap<Integer, Integer>();

    private StringBuilder stringBuilder = new StringBuilder();

    /**
     * Starts task execution;
     */
    public void startTask() {
        System.out.println(Constants.TASK_243_A);
        solveTask(Input.readNatural(DataScanner.getScanner()));
        System.out.println(toString());
    }

    /**
     * Solves task 243_A
     */
    public void solveTask(int enteredNumber) {
        outer:
        for (int i = 0; i <= Math.sqrt(enteredNumber); i++) {
            for (int j = 0; j <= Math.sqrt(enteredNumber); j++) {
                if ((Math.pow(i, 2) + Math.pow(j, 2)) > enteredNumber) {
                    break;
                } else if ((Math.pow(i, 2) + Math.pow(j, 2)) == enteredNumber) {
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

    /**
     * Returns the String representation of result.
     */
    @Override
    public String toString() {
        if (map.isEmpty() == true) {
            System.out.println(Constants.NO_RESULT);
        } else {
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if (entry.getKey() >= entry.getValue()) {
                    stringBuilder.append("x=" + entry.getKey() + " y=" + entry.getValue() + "\n");
                }
            }
        }
        return stringBuilder.toString();
    }

}
