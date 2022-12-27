/*
 * To change this license header, choose License Headeresult in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author duynh
 */
public class allCaseTest {

    allCase test;

    public allCaseTest() {
        test = new allCase();
    }

    @Test
    public void testAdd2number() {
        double result = test.add2number(1, 2);
        double expected = 3;
        assertEquals(expected, result, 0.000);
    }

    @Test
    public void testSub2number() {
        double result = test.sub2number(2, 1);
        double expected = 1;
        assertEquals(expected, result, 0.000);

    }

    @Test
    public void testMul2number() {
        double result = test.mul2number(2, 2);
        double expected = 4;
        assertEquals(expected, result, 0.000);

    }

    @Test
    public void testDiv2number() {
        double result = test.div2number(4, 2);
        double expected = 2;
        assertEquals(expected, result, 0.000);

    }

    @Test
    public void testBiggerNumber() {
        double result = test.biggerNumber(2, 3);
        double expected = 3;
        assertEquals(expected, result, 0.000);

    }

    @Test
    public void testCountWord() {
        int result = test.countWord("test");
        int expected = 4;
        assertEquals(expected, result);
    }

    @Test
    public void testToUpperCase() {
        String result = test.toUpperCase("test");
        String expected = "TEST";
        assertTrue(expected.equals(result));
    }

    @Test
    public void testToLowerCase() {
        String result = test.toLowerCase("TeST");
        String expected = "test";
        assertTrue(expected.equals(result));
    }

    @Test
    public void testSquarePerimeter() {
        double result = test.SquarePerimeter(10);
        double ex = 40;
        assertTrue(ex == result);
    }

    @Test
    public void testTrianglePerimeter() {
        double result = test.TrianglePerimeter(10, 20, 30);
        double ex = 60;
        assertEquals(ex, result, 0.00);
    }

    @Test
    public void testRectanglePerimeter() {
        double result = test.RectanglePerimeter(20, 30);
        double ex = 25;
        assertEquals(ex, result, 0.00);
    }

    @Test
    public void testCirclePerimeter() {
        double result = test.CirclePerimeter(100);
        double ex = Math.PI * 2 * 100;
        assertEquals(ex, result, 0.00);
    }

    @Test
    public void testKitePerimeter() {
        double result = test.KitePerimeter(5, 2);
        double ex = 14;
        assertEquals(ex, result, 0.00);
    }

    @Test
    public void testTrapezoidPerimeter() {
        double result = test.TrapezoidPerimeter(10, 20, 30, 10);
        double ex = 70;
        assertEquals(ex, result, 0.00);
    }

    @Test
    public void testHexagonPerimeter() {
        double result = test.HexagonPerimeter(2);
        double ex = 12;
        assertEquals(ex, result, 0.00);
    }

    @Test
    public void testSquareArea() {
        double rs = test.SquareArea(3);
        double ex = 9;
        assertTrue(rs == ex);
    }

    @Test
    public void testEllipseArea() {
        double rs = test.EllipseArea(1, 2);
        double ex = Math.PI * 1 * 2;
        assertTrue(rs == ex);
    }

    @Test
    public void testTriangleArea() {
        double rs = test.TriangleArea(2,3);
        double ex = 0.5*2*3;
        assertTrue(rs == ex);

    }
    
    @Test
    public void testCircleArea() {
        
    }

    @Test
    public void testTrapezoidArea() {
    }

    @Test
    public void testCubeArea() {
    }

    @Test
    public void testCylinderArea() {
    }

    @Test
    public void testConeArea() {
    }

    @Test
    public void testSphereArea() {
    }

    @Test
    public void testHemisphere() {
    }

    @Test
    public void testBubbleSort() {
    }

    @Test
    public void testSortWord() {
    }

    @Test
    public void testIsOdd() {
    }

    @Test
    public void testIsEven() {
    }

    @Test
    public void testCalculateAverage() {
    }

    @Test
    public void testFindCos() {
    }

    @Test
    public void testFindSin() {
    }

    @Test
    public void testFindTan() {
    }

    @Test
    public void testCubeNumber() {
    }

    @Test
    public void testPowerNumber() {
    }

    @Test
    public void testAddNnumber() {
    }

    @Test
    public void testSubNnumber() {
    }

    @Test
    public void testMulNnumber() {
    }

    @Test
    public void testDivNnumber() {
    }

    @Test
    public void testGetAbsolutevalue() {
    }

    @Test
    public void testVietnamIncome() {
    }

    @Test
    public void testGetGrade() {
    }

    @Test
    public void testIsArightangeltriangle() {
    }

    @Test
    public void testCubeVolumn() {
    }

    @Test
    public void testCuboidVolumn() {
    }

    @Test
    public void testConeVolumn() {
    }

    @Test
    public void testCylinderVolumn() {
    }

    @Test
    public void testSphereVolumn() {
    }

    @Test
    public void testHemisphereVolumn() {
    }

    @Test
    public void testPyramidVolumn() {
    }

    @Test
    public void testForceof2object() {
    }

    @Test
    public void testForceOfearthToObject() {
    }

    @Test
    public void testVelocity() {
    }

    @Test
    public void testKineticEnergy() {
    }

    @Test
    public void testGravitationalPotentialEnergy() {
    }


}
