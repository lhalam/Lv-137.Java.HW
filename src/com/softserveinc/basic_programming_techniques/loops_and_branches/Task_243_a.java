package com.softserveinc.basic_programming_techniques.loops_and_branches;

import com.softserveinc.homework.Task;
import com.softserveinc.tools.Constants;
import com.softserveinc.tools.NumberValidator;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Volodymyr Yakymiv
 */
public class Task_243_a extends Task {

    private Map<Integer, Integer> map = new HashMap<>();
    private StringBuilder stringBuilder = new StringBuilder();
    private NumberValidator checker = new NumberValidator();

    public void startTask() {
        System.out.println(Constants.TASK_243_A);
        solveTask();
        System.out.println(toString());
    }

    private void solveTask() {
        int enteredNumber = checker.checkIfEnteredValueIsValid();
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
