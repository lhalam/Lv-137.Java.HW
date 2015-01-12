package com.softserveinc.basic_programming_techniques.loops_and_branches;

import com.softserveinc.basic_programming_techniques.loops_and_branches.Task_243_b;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Volodymyr
 */
public class Task243BTest {

        private Task_243_b task_243_b1;
        private Task_243_b task_243_b2;

        @Before
        public void task243BTest() {
            task_243_b1 = new Task_243_b();
            task_243_b2 = new Task_243_b();
        }

        @Test
        public void setTask243ATest() {
            task_243_b1.solveTask(1000000);
            task_243_b2.solveTask(1000000);
            Assert.assertTrue(task_243_b1.map.containsKey(800) == task_243_b2.map.containsKey(800) ||
                    task_243_b1.map.containsValue(600) || task_243_b2.map.containsValue(600));
        }
    }

