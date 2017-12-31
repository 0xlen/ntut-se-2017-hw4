package ntut.se;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LetterGradeTest {
    private LetterGrade grade;

    @BeforeEach
    void setUp() {
        grade = new LetterGrade();
    }


    @Test
    public void testLetterGradeInRangeA() {
        assertEquals('A', grade.letterGrade(100));
        assertEquals('A', grade.letterGrade(90));
        assertEquals('A', grade.letterGrade(99));

    }

    @Test
    public void testLetterGradeInRangeB() {
        assertEquals('B', grade.letterGrade(80));
        assertEquals('B', grade.letterGrade(89));

    }

    @Test
    public void testLetterGradeInRangeC() {
        assertEquals('C', grade.letterGrade(70));
        assertEquals('C', grade.letterGrade(79));

    }

    @Test
    public void testLetterGradeInRangeD() {
        assertEquals('D', grade.letterGrade(60));
        assertEquals('D', grade.letterGrade(69));

    }

    @Test
    public void testLetterGradeInRangeF() {
        assertEquals('F', grade.letterGrade(59));
        assertEquals('F', grade.letterGrade(0));
    }
}