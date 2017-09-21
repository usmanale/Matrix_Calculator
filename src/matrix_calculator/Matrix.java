/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrix_calculator;

import java.util.Scanner;

/**
 *
 * @author baou usman
 */
class Matrix {
        public int[][] matrix;
    public int rows1;
    public int cols1;
    public String M_name;
 public Matrix(int x, int y, String N,int[][] m){
    rows1=x;
    cols1=y;
    M_name=N;
    matrix=m;
    }
}
