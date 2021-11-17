package edu.isu.cs.cs2263;

import edu.isu.cs.cs2263.hw02.data.Course;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Simple to string test to make sure the toString output is valid
 */
class CourseToStringTest {

    @Test
    void toStringTest() {
        Course course = new Course("course", "0", 2, 3);
        assertEquals("0 2 course (3)", course.toString());
    }
}