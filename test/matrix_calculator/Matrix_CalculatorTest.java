/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrix_calculator;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author baou usman
 */
public class Matrix_CalculatorTest {
    
    public Matrix_CalculatorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of User_input method, of class Matrix_Calculator.
     */


    /**
     * Test of populate_matrix method, of class Matrix_Calculator.
     */
    /**
     * Test of Addition method, of class Matrix_Calculator.
     */
    @Test
    public void testAddition() {
        Matrix_Calculator instance = new Matrix_Calculator();
        instance.M_names.add("W");
        instance.M_names.add("C");
        int[][] arr ={{2,2},{2,2}};
        Matrix m1 = new Matrix(2,2,"W",arr);
        Matrix m2 = new Matrix(2,2,"C",arr);
        
        instance.Matrix_List.add(m1);
        instance.Matrix_List.add(m2);
        
        int[][] result = instance.Addition("W", "C");
        int[][] expRes = {{4,4},{4,4}};
        
        assertArrayEquals(expRes, result);    }

    /**
     * Test of Subtraction method, of class Matrix_Calculator.
     */
    @Test
    public void testSubtraction() {
        Matrix_Calculator instance = new Matrix_Calculator();
        instance.M_names.add("T");
        instance.M_names.add("Q");
        int[][] arr ={{2,2},{2,2}};
        Matrix m1 = new Matrix(2,2,"T",arr);
        Matrix m2 = new Matrix(2,2,"Q",arr);
        
        instance.Matrix_List.add(m1);
        instance.Matrix_List.add(m2);
        
        int[][] result = instance.Subtraction("T", "Q");
        int[][] expRes = {{0,0},{0,0}};
        
        assertArrayEquals(expRes, result);
                
    }

    /**
     * Test of Multiply method, of class Matrix_Calculator.
     */
    @Test
    public void testMultiply() {
        Matrix_Calculator instance = new Matrix_Calculator();
        instance.M_names.add("S");
        instance.M_names.add("A");
        int[][] arr ={{2,2},{2,2}};
        Matrix m1 = new Matrix(2,2,"S",arr);
        Matrix m2 = new Matrix(2,2,"A",arr);
        
        instance.Matrix_List.add(m1);
        instance.Matrix_List.add(m2);
        
        int[][] result = instance.Multiply("S", "A");
        int[][] expRes = {{8,8},{8,8}};
        
        assertArrayEquals(expRes, result);
        
    }

    /**
     * Test of main method, of class Matrix_Calculator.
     */

    
}
