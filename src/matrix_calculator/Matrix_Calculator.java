/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrix_calculator;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;
/**
 *
 * @author baou usman
 */
public class Matrix_Calculator {
    public char operator[];
    public int[][] matrix;
    public List <Matrix>Matrix_List;
    public List <String> M_names;
    public String Equation;
    public List <String> EquationList;
    public int n;
    public int rows;
    public int cols;
    String Mname;
    Matrix_Calculator(){
    M_names=new ArrayList<String>();
    EquationList=new ArrayList<String>();
    Matrix_List=new ArrayList<Matrix>();
    }
    public void User_input(){
        
     System.out.println("Hown many matrices you want to enter?");
     Scanner read=new Scanner(System.in);
     n=read.nextInt();
     for(int i=0;i<n;i++){
     System.out.println("Enter Matrix Name:");
     Mname=read.next(); 
     M_names.add(Mname);
     System.out.println("Enter no of rows:");
     rows=read.nextInt();
     System.out.println("Enter no of columns:");
     cols=read.nextInt();
     matrix=new int[rows][cols];
     populate_matrix(rows,cols,Mname);
     Matrix mat_obj=new Matrix(rows,cols,Mname,matrix);
     Matrix_List.add(mat_obj);
     }     
     System.out.println("Enter The Equation(Actions: '+' '-' '*')(Add spaces between operands and operators):");
     Equation=read.nextLine();
     Equation=read.nextLine();
    }
        public void populate_matrix(int rows,int cols,String Mname){
        Scanner read=new Scanner(System.in);
        for(int i=0;i<rows;i++){
         for(int j=0;j<cols;j++){
         System.out.println("Enter Value for "+Mname);
         matrix[i][j]=read.nextInt();
         }
      }
        }
        //Addition Function
        public int[][] Addition(String N1,String N2){
           int fIndex=0,sIndex=0;
            for(int i=0;i<2;i++){
            if(M_names.get(i).equals(N1)){
            fIndex=i;
        }
            if(M_names.get(i).equals(N2)){
            sIndex=i;
        }
        }   int[][] result=new int[2][2];
            if(Matrix_List.get(fIndex).rows1==Matrix_List.get(sIndex).rows1 && Matrix_List.get(fIndex).cols1==Matrix_List.get(sIndex).cols1){
            for(int i=0;i<Matrix_List.get(fIndex).rows1;i++){
             for(int j=0;j<Matrix_List.get(sIndex).cols1;j++){
                 result[i][j]=Matrix_List.get(fIndex).matrix[i][j]+Matrix_List.get(sIndex).matrix[i][j];
                System.out.print(result[i][j]+"  ");
                }
             System.out.println("");
            }
            }
            else{
            System.out.println("Cnnot be Added!");
            }
            return result;
        }
        //Subtraction function
        public int[][] Subtraction(String N1,String N2){
           int fIndex=0,sIndex=0;
            for(int i=0;i<2;i++){
            if(M_names.get(i).equals(N1)){
            fIndex=i;
        }
            if(M_names.get(i).equals(N2)){
            sIndex=i;
        }
        }   
             int[][] result=new int[2][2];
            if(Matrix_List.get(fIndex).rows1==Matrix_List.get(sIndex).rows1 && Matrix_List.get(fIndex).cols1==Matrix_List.get(sIndex).cols1){
            for(int i=0;i<Matrix_List.get(fIndex).rows1;i++){
             for(int j=0;j<Matrix_List.get(sIndex).cols1;j++){
                 result[i][j]=Matrix_List.get(fIndex).matrix[i][j]-Matrix_List.get(sIndex).matrix[i][j];
                System.out.print(result[i][j]+"  ");
                }
             System.out.println("");
            }
            }
            else{
            System.out.println("Cnnot be Subtracted!");
            }
            return result;
        }
        
        //Multiply function
        public int[][] Multiply(String N1,String N2){
           int fIndex=0,sIndex=0;
            for(int i=0;i<2;i++){
            if(M_names.get(i).equals(N1)){
            fIndex=i;
        }
            if(M_names.get(i).equals(N2)){
            sIndex=i;
        }
        }   
            int[][] sum=new int[2][2];
            if(Matrix_List.get(fIndex).rows1==Matrix_List.get(sIndex).cols1){
            for(int i=0;i<Matrix_List.get(fIndex).rows1;i++){
                for(int j=0;j<Matrix_List.get(sIndex).cols1;j++){
                    for(int k=0;k<Matrix_List.get(fIndex).cols1;k++){
                        sum[i][j]=sum[i][j]+Matrix_List.get(fIndex).matrix[i][k]*Matrix_List.get(sIndex).matrix[k][j];
   
                }
                    System.out.print(sum[i][j]+"  ");
             }
                System.out.println("");
             }
            }
            else{
            System.out.println("Cnnot be Multiplyed!");
            }
            return sum;
        }
       
        
    public static void main(String[] args) {
        // TODO code application logic here
        Matrix_Calculator m1=new Matrix_Calculator();
        m1.User_input();
        StringTokenizer st = new StringTokenizer(m1.Equation);
        while (st.hasMoreElements()) {
           m1.EquationList.add(st.nextToken());
        }
                if(m1.EquationList.get(1).equals("+")){
        m1.Addition(m1.EquationList.get(0),m1.EquationList.get(2));
       }
                else if(m1.EquationList.get(1).equals("-")){
        m1.Subtraction(m1.EquationList.get(0),m1.EquationList.get(2));
       }
                else if(m1.EquationList.get(1).equals("*")){
        m1.Multiply(m1.EquationList.get(0),m1.EquationList.get(2));
       }
    }
    
}

