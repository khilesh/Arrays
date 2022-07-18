package org.container.with.most.water;

import static org.junit.jupiter.api.Assertions.*;
import org.container.with.most.water.Solution;

class SolutionTest {

    @org.junit.jupiter.api.Test
    void maxWater() {
        int input1[] = {1,8,6,2,5,4,8,3,7};
        assertEquals(49, Solution.maxWater(input1));
    }
}