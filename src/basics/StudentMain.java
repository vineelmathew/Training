package basics;

public class StudentMain {
public static void main(String argsp[])
{
	Student students[]=new Student[2];
	Student student1=new Student("vineel",22,true);
	Student student2=new Student("Vineel rudrapati",23,false);
	students[0]=student1;
	students[1]=student2;
	student1.setAge(44);
	student2.setAge(84);

for(int i=0;i<students.length;i++)
{
	Student iterated=students[i];
	String name=iterated.getName();
	int age=iterated.getAge();
	boolean placed=iterated.getPlaced();
	System.out.println("The name is "+name+" age is "+age+" Placed "+placed);

}
}
}
