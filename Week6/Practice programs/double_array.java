/*Design a Java program to accept a double array- Full. create two more arrays pos,
neg. Check every element of Full array and push the positive
numbers to pos array and negative numbers to neg. Count the number of
positives, negatives and zeros and display.*/



import java.util.Scanner;
class double_array{
  int l,p=0,j=0,count_pos,count_neg,count_zero;
  double_array(int n){
    l = n;
  }
  void sortarray(double[] arr,double[] pos,double[] neg){
    for(int i=0;i<l;i++){
      if(arr[i]>0){
        pos[p] = arr[i];
        p++;
      }
      else if(arr[i]<0){
        neg[j]= arr[i];
        j++;
      }
    }
  }
  void count(double[] arr,double[] pos,double[] neg){
    for(int i=0;i<l;i++){
      if(arr[i]==0){
        count_zero++;
    }
  }
    for(int i=0;i<l;i++){
      if(pos[i]!=0){
        count_pos++;
    }
    }
    for(int i=0;i<l;i++){
      if(neg[i]!=0){
        count_neg++;
    }
  }
  System.out.println("\nNumber of \n POSITIVE NUMBERS: "+count_pos+"\n NEGATIVE NUMBERS: "+count_neg+"\n NUMBER OF ZERO: "+count_zero);
}
}

class double_array_main{
  public static void main(String args[]){
    Scanner ss = new Scanner(System.in);
    System.out.println("Enter the length of array: ");
    int n = ss.nextInt();
    double_array a1 = new double_array(n);
    double[] arr = new double[n];
    double[] pos = new double[n];
    double[] neg = new double[n];
    for(int i=0;i<n;i++){
      System.out.println("arr["+i+"]: ");
      arr[i] = ss.nextDouble();
    }
    a1.sortarray(arr,pos,neg);
    a1.count(arr,pos,neg);
  }
}
