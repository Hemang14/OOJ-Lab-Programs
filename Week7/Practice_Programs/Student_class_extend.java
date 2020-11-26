/*Develop a Java program to create a class Student whose variables are usn, name and sem.
Derive a class Test from Student to include an array of cie marks of each course and their
corresponding credits in another array. Derive a class Exam from Test which includes an
array of see marks. Derive a class Result which calculates the grade for each course and the
SGPA. Create n student objects and displays all the above details.*/



import java.util.Scanner;
class Student{
	private String USN;
	private String name;
	private int sem;

	void getstudentdata()
	{
		Scanner ss=new Scanner(System.in);
		System.out.print("Enter the USN of the student : ");
		USN=ss.next();
		ss.nextLine();
		System.out.print("Enter the name of the student : ");
		name=ss.next();
		ss.nextLine();
		System.out.println("Enter the semester of the student : ");
		sem=ss.nextInt();
	}
	void printstudentdata()
	{
		System.out.println("The name of the student is : "+name);
		System.out.println("The USN of the student is : "+USN);
		System.out.println("The Semester of teh student is : "+sem);
	}
}

class Test extends Student{
	private int cie[];
	private int credits[];
	private int n;

	void setsize(int m)
	{
		n=m;
		cie=new int[n];
		credits=new int[n];
	}
	void getciemarks()
	{
		Scanner ss=new Scanner(System.in);
		System.out.println("Enter the credits and cie marks of each subject : ");
		int i;
		for(i=0;i<n;i++)
		{
			System.out.println("Enter the credits and marks of "+(i+1)+" subject : ");
			credits[i]=ss.nextInt();
			cie[i]=ss.nextInt();
		}
	}
	int returnciemarks(int i)
	{
		return cie[i];
	}
	int return_credits(int i)
	{
		return credits[i];
	}
}

class Exams extends Test{
	private int see[];
	private int n1;

	void setsize1(int m)
	{
		n1=m;
		see=new int[n1];
	}
	void getseemarks()
	{
		Scanner ss=new Scanner(System.in);
		System.out.println("Enter the see marks of each subject : ");
		int i;
		for(i=0;i<n1;i++)
		{
			System.out.println("Enter the see marks of "+(i+1)+" subject : ");
			see[i]=ss.nextInt();
		}
	}
	int returnseemarks(int i)
	{
		return see[i];
	}

}

class Result extends Exams{
	private double result;
	private int n;

	Result()
	{
		Scanner ss=new Scanner(System.in);
		getstudentdata();
		System.out.println("Enter the number of subjects : ");
		int i=ss.nextInt();
		n=i;
		setsize(i);
		setsize1(i);
		getciemarks();
		getseemarks();
	}
	void calculateresult()
	{
		result=0;
		double temp=0;
		double totalcredits=0;
		for(int i=0;i<n;i++)
		{
			temp=temp+returnciemarks(i);
			temp=temp+(returnseemarks(i)/2);
			totalcredits=totalcredits+return_credits(i);
			result=result+((temp*return_credits(i))/100);
			temp=0;
		}
		result=(result/totalcredits)*10;
	}
	void printresult(int i)
	{
		System.out.println("The SGPA of the "+(i+1)+" student is : "+result);
	}
}

class StudentMain{
	public static void main(String args[])
	{
		Scanner ss=new Scanner(System.in);
		System.out.println("Enter the number of students : ");
		int n=ss.nextInt();
		Result r[]=new Result[n];
		for(int i=0;i<n;i++)
		{
			r[i]=new Result();
			r[i].calculateresult();
		}
		for(int i=0;i<n;i++)
		{
			r[i].printresult(i);
		}
	}
}
