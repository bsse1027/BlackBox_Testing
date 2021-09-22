import static org.junit.Assert.*;

public class GradeCalculatorTest {

    //getGrade_worstCase

    @org.junit.Test
    public void getGradeTest1 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(0,1,1,1);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest2 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,1,1,1);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest3 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(25,1,1,1);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest4 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(24,1,1,1);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest5 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(12,1,1,1);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest6 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(0,15,1,1);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest7 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,15,1,1);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest8 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(25,15,1,1);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest9 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(24,15,1,1);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest10 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(12,15,1,1);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest11 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(0,14,1,1);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest12 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,14,1,1);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest13 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(25,14,1,1);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest14 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(24,14,1,1);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest15 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(12,14,1,1);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest16 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(0,7,1,1);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest17 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,7,1,1);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest18 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(25,7,1,1);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest19 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(24,7,1,1);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest20 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(12,7,1,1);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest21 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(0,0,1,1);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest22 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,0,1,1);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest23 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(25,0,1,1);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest24 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(24,0,1,1);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest25 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(12,0,1,1);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest26 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(0,1,50,1);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest27 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,1,50,1);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest28 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(25,1,50,1);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest29 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(24,1,50,1);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest30 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(12,1,50,1);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest31 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(0,15,50,1);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest32 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,15,50,1);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest33 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(25,15,50,1);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest34 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(24,15,50,1);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest35 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(12,15,50,1);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest36 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(0,14,50,1);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest37 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,14,50,1);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest38 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(25,14,50,1);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest39 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(24,14,50,1);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest40 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(12,14,50,1);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest41 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(0,7,50,1);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest42 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,7,50,1);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest43 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(25,7,50,1);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest44 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(24,7,50,1);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest45 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(12,7,50,1);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest46 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(0,0,50,1);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest47 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,0,50,1);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest48 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(25,0,50,1);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest49 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(24,0,50,1);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest50 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(12,0,50,1);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest51 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(0,1,49,1);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest52 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,1,49,1);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest53 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(25,1,49,1);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest54 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(24,1,49,1);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest55 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(12,1,49,1);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest56 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(0,15,49,1);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest57 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,15,49,1);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest58 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(25,15,49,1);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest59 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(24,15,49,1);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest60 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(12,15,49,1);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest61 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(0,14,49,1);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest62 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,14,49,1);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest63 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(25,14,49,1);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest64 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(24,14,49,1);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest65 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(12,14,49,1);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest66 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(0,7,49,1);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest67 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,7,49,1);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest68 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(25,7,49,1);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest69 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(24,7,49,1);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest70 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(12,7,49,1);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest71 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(0,0,49,1);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest72 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,0,49,1);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest73 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(25,0,49,1);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest74 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(24,0,49,1);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest75 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(12,0,49,1);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest76 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(0,1,25,1);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest77 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,1,25,1);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest78 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(25,1,25,1);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest79 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(24,1,25,1);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest80 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(12,1,25,1);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest81 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(0,15,25,1);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest82 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,15,25,1);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest83 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(25,15,25,1);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest84 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(24,15,25,1);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest85 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(12,15,25,1);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest86 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(0,14,25,1);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest87 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,14,25,1);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest88 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(25,14,25,1);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest89 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(24,14,25,1);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest90 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(12,14,25,1);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest91 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(0,7,25,1);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest92 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,7,25,1);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest93 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(25,7,25,1);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest94 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(24,7,25,1);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest95 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(12,7,25,1);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest96 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(0,0,25,1);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest97 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,0,25,1);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest98 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(25,0,25,1);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest99 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(24,0,25,1);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest100 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(12,0,25,1);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest101 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(0,1,0,1);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest102 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,1,0,1);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest103 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(25,1,0,1);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest104 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(24,1,0,1);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest105 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(12,1,0,1);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest106 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(0,15,0,1);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest107 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,15,0,1);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest108 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(25,15,0,1);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest109 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(24,15,0,1);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest110 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(12,15,0,1);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest111 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(0,14,0,1);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest112 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,14,0,1);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest113 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(25,14,0,1);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest114 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(24,14,0,1);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest115 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(12,14,0,1);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest116 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(0,7,0,1);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest117 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,7,0,1);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest118 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(25,7,0,1);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest119 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(24,7,0,1);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest120 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(12,7,0,1);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest121 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(0,0,0,1);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest122 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,0,0,1);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest123 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(25,0,0,1);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest124 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(24,0,0,1);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest125 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(12,0,0,1);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest126 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(0,1,1,10);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest127 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,1,1,10);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest128 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(25,1,1,10);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest129 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(24,1,1,10);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest130 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(12,1,1,10);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest131 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(0,15,1,10);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest132 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,15,1,10);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest133 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(25,15,1,10);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest134 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(24,15,1,10);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest135 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(12,15,1,10);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest136 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(0,14,1,10);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest137 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,14,1,10);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest138 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(25,14,1,10);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest139 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(24,14,1,10);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest140 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(12,14,1,10);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest141 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(0,7,1,10);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest142 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,7,1,10);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest143 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(25,7,1,10);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest144 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(24,7,1,10);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest145 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(12,7,1,10);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest146 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(0,0,1,10);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest147 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,0,1,10);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest148 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(25,0,1,10);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest149 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(24,0,1,10);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest150 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(12,0,1,10);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest151 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(0,1,50,10);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest152 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,1,50,10);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest153 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(25,1,50,10);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest154 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(24,1,50,10);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest155 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(12,1,50,10);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest156 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(0,15,50,10);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest157 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,15,50,10);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest158 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(25,15,50,10);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest159 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(24,15,50,10);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest160 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(12,15,50,10);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest161 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(0,14,50,10);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest162 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,14,50,10);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest163 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(25,14,50,10);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest164 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(24,14,50,10);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest165 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(12,14,50,10);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest166 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(0,7,50,10);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest167 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,7,50,10);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest168 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(25,7,50,10);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest169 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(24,7,50,10);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest170 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(12,7,50,10);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest171 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(0,0,50,10);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest172 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,0,50,10);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest173 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(25,0,50,10);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest174 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(24,0,50,10);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest175 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(12,0,50,10);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest176 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(0,1,49,10);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest177 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,1,49,10);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest178 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(25,1,49,10);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest179 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(24,1,49,10);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest180 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(12,1,49,10);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest181 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(0,15,49,10);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest182 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,15,49,10);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest183 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(25,15,49,10);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest184 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(24,15,49,10);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest185 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(12,15,49,10);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest186 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(0,14,49,10);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest187 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,14,49,10);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest188 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(25,14,49,10);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest189 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(24,14,49,10);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest190 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(12,14,49,10);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest191 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(0,7,49,10);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest192 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,7,49,10);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest193 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(25,7,49,10);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest194 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(24,7,49,10);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest195 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(12,7,49,10);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest196 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(0,0,49,10);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest197 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,0,49,10);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest198 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(25,0,49,10);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest199 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(24,0,49,10);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest200 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(12,0,49,10);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest201 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(0,1,25,10);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest202 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,1,25,10);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest203 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(25,1,25,10);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest204 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(24,1,25,10);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest205 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(12,1,25,10);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest206 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(0,15,25,10);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest207 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,15,25,10);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest208 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(25,15,25,10);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest209 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(24,15,25,10);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest210 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(12,15,25,10);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest211 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(0,14,25,10);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest212 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,14,25,10);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest213 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(25,14,25,10);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest214 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(24,14,25,10);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest215 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(12,14,25,10);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest216 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(0,7,25,10);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest217 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,7,25,10);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest218 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(25,7,25,10);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest219 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(24,7,25,10);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest220 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(12,7,25,10);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest221 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(0,0,25,10);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest222 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,0,25,10);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest223 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(25,0,25,10);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest224 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(24,0,25,10);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest225 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(12,0,25,10);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest226 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(0,1,0,10);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest227 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,1,0,10);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest228 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(25,1,0,10);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest229 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(24,1,0,10);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest230 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(12,1,0,10);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest231 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(0,15,0,10);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest232 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,15,0,10);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest233 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(25,15,0,10);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest234 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(24,15,0,10);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest235 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(12,15,0,10);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest236 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(0,14,0,10);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest237 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,14,0,10);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest238 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(25,14,0,10);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest239 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(24,14,0,10);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest240 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(12,14,0,10);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest241 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(0,7,0,10);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest242 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,7,0,10);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest243 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(25,7,0,10);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest244 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(24,7,0,10);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest245 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(12,7,0,10);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest246 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(0,0,0,10);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest247 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,0,0,10);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest248 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(25,0,0,10);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest249 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(24,0,0,10);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest250 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(12,0,0,10);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest251 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(0,1,1,9);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest252 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,1,1,9);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest253 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(25,1,1,9);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest254 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(24,1,1,9);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest255 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(12,1,1,9);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest256 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(0,15,1,9);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest257 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,15,1,9);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest258 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(25,15,1,9);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest259 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(24,15,1,9);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest260 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(12,15,1,9);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest261 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(0,14,1,9);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest262 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,14,1,9);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest263 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(25,14,1,9);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest264 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(24,14,1,9);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest265 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(12,14,1,9);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest266 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(0,7,1,9);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest267 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,7,1,9);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest268 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(25,7,1,9);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest269 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(24,7,1,9);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest270 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(12,7,1,9);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest271 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(0,0,1,9);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest272 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,0,1,9);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest273 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(25,0,1,9);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest274 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(24,0,1,9);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest275 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(12,0,1,9);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest276 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(0,1,50,9);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest277 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,1,50,9);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest278 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(25,1,50,9);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest279 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(24,1,50,9);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest280 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(12,1,50,9);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest281 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(0,15,50,9);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest282 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,15,50,9);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest283 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(25,15,50,9);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest284 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(24,15,50,9);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest285 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(12,15,50,9);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest286 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(0,14,50,9);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest287 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,14,50,9);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest288 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(25,14,50,9);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest289 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(24,14,50,9);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest290 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(12,14,50,9);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest291 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(0,7,50,9);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest292 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,7,50,9);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest293 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(25,7,50,9);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest294 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(24,7,50,9);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest295 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(12,7,50,9);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest296 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(0,0,50,9);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest297 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,0,50,9);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest298 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(25,0,50,9);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest299 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(24,0,50,9);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest300 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(12,0,50,9);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest301 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(0,1,49,9);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest302 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,1,49,9);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest303 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(25,1,49,9);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest304 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(24,1,49,9);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest305 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(12,1,49,9);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest306 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(0,15,49,9);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest307 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,15,49,9);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest308 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(25,15,49,9);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest309 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(24,15,49,9);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest310 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(12,15,49,9);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest311 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(0,14,49,9);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest312 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,14,49,9);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest313 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(25,14,49,9);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest314 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(24,14,49,9);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest315 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(12,14,49,9);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest316 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(0,7,49,9);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest317 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,7,49,9);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest318 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(25,7,49,9);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest319 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(24,7,49,9);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest320 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(12,7,49,9);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest321 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(0,0,49,9);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest322 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,0,49,9);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest323 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(25,0,49,9);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest324 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(24,0,49,9);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest325 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(12,0,49,9);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest326 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(0,1,25,9);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest327 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,1,25,9);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest328 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(25,1,25,9);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest329 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(24,1,25,9);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest330 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(12,1,25,9);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest331 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(0,15,25,9);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest332 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,15,25,9);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest333 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(25,15,25,9);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest334 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(24,15,25,9);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest335 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(12,15,25,9);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest336 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(0,14,25,9);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest337 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,14,25,9);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest338 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(25,14,25,9);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest339 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(24,14,25,9);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest340 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(12,14,25,9);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest341 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(0,7,25,9);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest342 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,7,25,9);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest343 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(25,7,25,9);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest344 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(24,7,25,9);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest345 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(12,7,25,9);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest346 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(0,0,25,9);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest347 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,0,25,9);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest348 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(25,0,25,9);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest349 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(24,0,25,9);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest350 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(12,0,25,9);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest351 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(0,1,0,9);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest352 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,1,0,9);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest353 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(25,1,0,9);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest354 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(24,1,0,9);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest355 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(12,1,0,9);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest356 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(0,15,0,9);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest357 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,15,0,9);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest358 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(25,15,0,9);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest359 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(24,15,0,9);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest360 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(12,15,0,9);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest361 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(0,14,0,9);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest362 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,14,0,9);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest363 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(25,14,0,9);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest364 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(24,14,0,9);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest365 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(12,14,0,9);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest366 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(0,7,0,9);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest367 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,7,0,9);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest368 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(25,7,0,9);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest369 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(24,7,0,9);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest370 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(12,7,0,9);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest371 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(0,0,0,9);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest372 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,0,0,9);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest373 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(25,0,0,9);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest374 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(24,0,0,9);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest375 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(12,0,0,9);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest376 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(0,1,1,5);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest377 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,1,1,5);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest378 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(25,1,1,5);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest379 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(24,1,1,5);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest380 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(12,1,1,5);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest381 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(0,15,1,5);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest382 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,15,1,5);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest383 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(25,15,1,5);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest384 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(24,15,1,5);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest385 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(12,15,1,5);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest386 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(0,14,1,5);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest387 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,14,1,5);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest388 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(25,14,1,5);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest389 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(24,14,1,5);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest390 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(12,14,1,5);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest391 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(0,7,1,5);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest392 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,7,1,5);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest393 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(25,7,1,5);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest394 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(24,7,1,5);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest395 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(12,7,1,5);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest396 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(0,0,1,5);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest397 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,0,1,5);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest398 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(25,0,1,5);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest399 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(24,0,1,5);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest400 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(12,0,1,5);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest401 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(0,1,50,5);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest402 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,1,50,5);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest403 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(25,1,50,5);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest404 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(24,1,50,5);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest405 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(12,1,50,5);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest406 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(0,15,50,5);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest407 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,15,50,5);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest408 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(25,15,50,5);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest409 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(24,15,50,5);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest410 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(12,15,50,5);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest411 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(0,14,50,5);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest412 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,14,50,5);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest413 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(25,14,50,5);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest414 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(24,14,50,5);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest415 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(12,14,50,5);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest416 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(0,7,50,5);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest417 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,7,50,5);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest418 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(25,7,50,5);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest419 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(24,7,50,5);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest420 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(12,7,50,5);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest421 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(0,0,50,5);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest422 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,0,50,5);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest423 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(25,0,50,5);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest424 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(24,0,50,5);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest425 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(12,0,50,5);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest426 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(0,1,49,5);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest427 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,1,49,5);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest428 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(25,1,49,5);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest429 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(24,1,49,5);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest430 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(12,1,49,5);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest431 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(0,15,49,5);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest432 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,15,49,5);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest433 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(25,15,49,5);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest434 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(24,15,49,5);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest435 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(12,15,49,5);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest436 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(0,14,49,5);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest437 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,14,49,5);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest438 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(25,14,49,5);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest439 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(24,14,49,5);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest440 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(12,14,49,5);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest441 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(0,7,49,5);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest442 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,7,49,5);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest443 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(25,7,49,5);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest444 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(24,7,49,5);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest445 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(12,7,49,5);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest446 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(0,0,49,5);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest447 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,0,49,5);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest448 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(25,0,49,5);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest449 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(24,0,49,5);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest450 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(12,0,49,5);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest451 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(0,1,25,5);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest452 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,1,25,5);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest453 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(25,1,25,5);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest454 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(24,1,25,5);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest455 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(12,1,25,5);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest456 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(0,15,25,5);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest457 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,15,25,5);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest458 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(25,15,25,5);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest459 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(24,15,25,5);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest460 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(12,15,25,5);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest461 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(0,14,25,5);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest462 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,14,25,5);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest463 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(25,14,25,5);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest464 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(24,14,25,5);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest465 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(12,14,25,5);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest466 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(0,7,25,5);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest467 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,7,25,5);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest468 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(25,7,25,5);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest469 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(24,7,25,5);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest470 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(12,7,25,5);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest471 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(0,0,25,5);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest472 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,0,25,5);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest473 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(25,0,25,5);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest474 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(24,0,25,5);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest475 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(12,0,25,5);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest476 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(0,1,0,5);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest477 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,1,0,5);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest478 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(25,1,0,5);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest479 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(24,1,0,5);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest480 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(12,1,0,5);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest481 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(0,15,0,5);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest482 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,15,0,5);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest483 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(25,15,0,5);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest484 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(24,15,0,5);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest485 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(12,15,0,5);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest486 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(0,14,0,5);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest487 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,14,0,5);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest488 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(25,14,0,5);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest489 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(24,14,0,5);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest490 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(12,14,0,5);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest491 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(0,7,0,5);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest492 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,7,0,5);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest493 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(25,7,0,5);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest494 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(24,7,0,5);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest495 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(12,7,0,5);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest496 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(0,0,0,5);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest497 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,0,0,5);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest498 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(25,0,0,5);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest499 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(24,0,0,5);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest500 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(12,0,0,5);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest501 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(0,1,1,0);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest502 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,1,1,0);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest503 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(25,1,1,0);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest504 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(24,1,1,0);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest505 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(12,1,1,0);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest506 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(0,15,1,0);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest507 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,15,1,0);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest508 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(25,15,1,0);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest509 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(24,15,1,0);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest510 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(12,15,1,0);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest511 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(0,14,1,0);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest512 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,14,1,0);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest513 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(25,14,1,0);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest514 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(24,14,1,0);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest515 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(12,14,1,0);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest516 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(0,7,1,0);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest517 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,7,1,0);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest518 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(25,7,1,0);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest519 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(24,7,1,0);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest520 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(12,7,1,0);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest521 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(0,0,1,0);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest522 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,0,1,0);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest523 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(25,0,1,0);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest524 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(24,0,1,0);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest525 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(12,0,1,0);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest526 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(0,1,50,0);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest527 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,1,50,0);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest528 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(25,1,50,0);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest529 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(24,1,50,0);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest530 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(12,1,50,0);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest531 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(0,15,50,0);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest532 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,15,50,0);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest533 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(25,15,50,0);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest534 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(24,15,50,0);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest535 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(12,15,50,0);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest536 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(0,14,50,0);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest537 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,14,50,0);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest538 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(25,14,50,0);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest539 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(24,14,50,0);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest540 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(12,14,50,0);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest541 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(0,7,50,0);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest542 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,7,50,0);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest543 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(25,7,50,0);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest544 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(24,7,50,0);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest545 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(12,7,50,0);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest546 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(0,0,50,0);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest547 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,0,50,0);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest548 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(25,0,50,0);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest549 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(24,0,50,0);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest550 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(12,0,50,0);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest551 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(0,1,49,0);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest552 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,1,49,0);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest553 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(25,1,49,0);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest554 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(24,1,49,0);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest555 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(12,1,49,0);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest556 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(0,15,49,0);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest557 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,15,49,0);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest558 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(25,15,49,0);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest559 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(24,15,49,0);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest560 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(12,15,49,0);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest561 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(0,14,49,0);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest562 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,14,49,0);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest563 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(25,14,49,0);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest564 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(24,14,49,0);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest565 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(12,14,49,0);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest566 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(0,7,49,0);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest567 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,7,49,0);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest568 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(25,7,49,0);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest569 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(24,7,49,0);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest570 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(12,7,49,0);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest571 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(0,0,49,0);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest572 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,0,49,0);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest573 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(25,0,49,0);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest574 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(24,0,49,0);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest575 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(12,0,49,0);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest576 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(0,1,25,0);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest577 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,1,25,0);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest578 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(25,1,25,0);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest579 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(24,1,25,0);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest580 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(12,1,25,0);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest581 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(0,15,25,0);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest582 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,15,25,0);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest583 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(25,15,25,0);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest584 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(24,15,25,0);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest585 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(12,15,25,0);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest586 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(0,14,25,0);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest587 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,14,25,0);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest588 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(25,14,25,0);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest589 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(24,14,25,0);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest590 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(12,14,25,0);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest591 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(0,7,25,0);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest592 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,7,25,0);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest593 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(25,7,25,0);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest594 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(24,7,25,0);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest595 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(12,7,25,0);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest596 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(0,0,25,0);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest597 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,0,25,0);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest598 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(25,0,25,0);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest599 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(24,0,25,0);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest600 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(12,0,25,0);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest601 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(0,1,0,0);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest602 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,1,0,0);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest603 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(25,1,0,0);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest604 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(24,1,0,0);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest605 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(12,1,0,0);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest606 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(0,15,0,0);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest607 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,15,0,0);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest608 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(25,15,0,0);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest609 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(24,15,0,0);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest610 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(12,15,0,0);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest611 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(0,14,0,0);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest612 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,14,0,0);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest613 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(25,14,0,0);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest614 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(24,14,0,0);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest615 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(12,14,0,0);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest616 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(0,7,0,0);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest617 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,7,0,0);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest618 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(25,7,0,0);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest619 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(24,7,0,0);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest620 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(12,7,0,0);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest621 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(0,0,0,0);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest622 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,0,0,0);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest623 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(25,0,0,0);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest624 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(24,0,0,0);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest625 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(12,0,0,0);
        String expected = "Nil";
        assertEquals(expected,grade);
    }

    //getGrade_bvc

    @org.junit.Test
    public void getGradeTest_bvc_1 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(0,7,25,5);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest_bvc_2 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(1,7,25,5);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest_bvc_3 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(25,7,25,5);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest_bvc_4 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(24,7,25,5);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest_bvc_5 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(12,0,25,5);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest_bvc_6 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(12,1,25,5);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest_bvc_7 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(12,15,25,5);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest_bvc_8 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(12,14,25,5);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest_bvc_9 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(12,7,0,5);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest_bvc_10 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(12,7,1,5);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest_bvc_11 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(12,7,50,5);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest_bvc_12 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(12,7,49,5);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest_bvc_13 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(12,7,25,0);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest_bvc_14 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(12,7,25,1);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest_bvc_15 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(12,7,25,10);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest_bvc_16 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(12,7,25,9);
        String expected = "Nil";
        assertEquals(expected,grade);
    }
    @org.junit.Test
    public void getGradeTest_bvc_17 () {
        GradeCalculator gc= new GradeCalculator();
        String grade = gc.getGrade(12,7,25,5);
        String expected = "Nil";
        assertEquals(expected,grade);
    }






    @org.junit.Test
    public void getGPAtest_1() {

        GradeCalculator gc=new GradeCalculator();
        double gpa= gc.getGPA("A+");
        double expected=4.00;
        assertEquals(expected,gpa,0.01);

    }

    @org.junit.Test
    public void getGPAtest_2() {

        GradeCalculator gc=new GradeCalculator();
        double gpa= gc.getGPA("A");
        double expected=3.75;
        assertEquals(expected,gpa,0.01);

    }

    @org.junit.Test
    public void getGPAtest_3() {

        GradeCalculator gc=new GradeCalculator();
        double gpa= gc.getGPA("B");
        double expected=3.00;
        assertEquals(expected,gpa,0.000001);

    }

    @org.junit.Test
    public void getGPAtest_4() {

        GradeCalculator gc=new GradeCalculator();
        double gpa= gc.getGPA("C");
        double expected=2.25;
        assertEquals(expected,gpa,0.000001);

    }

    @org.junit.Test

    public void getGPAtest_5() {

        GradeCalculator gc=new GradeCalculator();
        double gpa= gc.getGPA("D");
        double expected=2.00;
        assertEquals(expected,gpa,0.000001);

    }

    @org.junit.Test

    public void getGPAtest_6() {

        GradeCalculator gc=new GradeCalculator();
        double gpa= gc.getGPA("F");
        double expected=0.00;
        assertEquals(expected,gpa,0.000001);

    }




}