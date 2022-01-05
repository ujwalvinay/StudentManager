package Student;

public class StudentMain
{
	String name;
	int regno;
	int Mark;
	char grade;
	void readData(String a, String c,String d)
	{
		name=a;
		regno=Integer.parseInt(c);
		Mark =Integer.parseInt(d);
		computeGrade();
	
	}
	void computeGrade()
	{
		if(Mark<40)
			grade='F';
		else if(Mark<=50)
			grade='e';
		else if(Mark<=60)
			grade='d';
		else if(Mark<=70)
			grade='c';
		else if(Mark<=80)
			grade='B';
		else if(Mark<=90)
			grade='A';
		else if(Mark<=100)
			grade='S';
		else
			System.out.println("Wrong input");
		display();
		
	}
	void display()
	{
		System.out.println("------------------");
		System.out.println("Name : "+name);
		System.out.println("Regno. : "+regno);
		System.out.println("Grade : "+grade);
	}
	public static void main(String args[])
	{
		LoginFrame frame=new LoginFrame();
		
	}
	
}