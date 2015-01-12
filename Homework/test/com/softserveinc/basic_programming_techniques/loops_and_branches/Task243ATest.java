package com.softserveinc.basic_programming_techniques.loops_and_branches;

import com.softserveinc.basic_programming_techniques.loops_and_branches.Task_243_a;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Volodymyr
 */
public class Task243ATest {
    private Task_243_a task_243_a1;
    private Task_243_a task_243_a2;

    @Before
    public void task243ATest() {
        task_243_a1 = new Task_243_a();
        task_243_a2 = new Task_243_a();
    }

    @Test
    public void setTask243ATest() {
        task_243_a1.solveTask(100000);
        task_243_a2.solveTask(100000);
        Assert.assertTrue(task_243_a1.map.containsKey(316) == task_243_a2.map.containsKey(316) ||
                task_243_a1.map.containsValue(12) || task_243_a2.map.containsValue(12));
    }
}

