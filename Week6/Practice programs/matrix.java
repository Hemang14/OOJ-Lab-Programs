/*Develop a Java program to find the transpose of a given matrix of order MXN.*/

import  java.util.Scanner;
class matrix{
  void setdata(int n,int[][] MAT){
    Scanner ss = new Scanner(System.in);
    for(int i=0;i<n;i++){
      for(int j=0;j<n;j++){
        System.out.println("Enter MAT["+i+"]["+j+"]: ");
        MAT[i][j] = ss.nextInt();
      }
    }
  }
  void getdata(int n,int[][] MAT){
    System.out.println("\t***MATRIX***");
    for(int i=0;i<n;i++){
      for(int j=0;j<n;j++){
        System.out.print("\t"+MAT[j][i]);
      }
      System.out.print("\n");
    }
  }
}

class matrix_main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enteer the number of rows of matrix: ");
    int r = sc.nextInt();
    matrix m1 = new matrix();
    int[][] MAT = new int[r][r];
    m1.setdata(r,MAT);
    m1.getdata(r,MAT);
  }
}
