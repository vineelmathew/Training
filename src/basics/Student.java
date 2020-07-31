package basics;

public class Student {

	String name;
	int age;
	boolean placed;
	Student(String nameArg,int ageArg,boolean placedArg)
	{
		name=nameArg;
		age=ageArg;
		placed=placedArg;
	}
	
	/*
	 * Student(String name,int age,boolean placed)
	 * {
	 * this.name=name;
	 * this.age=age;
	 * this.placed=placed;
	 * }
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */

	int getAge()
	{
		return age;
	}
	void setAge(int ageArg)
	{
		age=ageArg;
	}
	String getName()
	{
		return name;
	}
	void setName(String nameArg)
	{
		name=nameArg;
	}
	boolean getPlaced()
	{
		return placed;
	}
	void setPlaced(boolean placedArg)
	{
		placed=placedArg;
	}
	}
