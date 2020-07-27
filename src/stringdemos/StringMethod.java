package stringdemos;

public class StringMethod {

	public static void main(String[] args) {
		String name="VineelRudrapati";
		System.out.println(name.charAt(5)); // getting the letter from the name variable at the index 5
		System.out.println(name.concat("Mathew")); //concatenating the name with mathew
		System.out.println(name.substring(3)); // printing the string from 3rd index
		System.out.println(name.substring(4,name.length())); // printing the string from 4 to end of the string
		System.out.println(name.equals("Mathew")); // checking whether name is equal to mathew
		System.out.println(name.indexOf("R")); //getting the index of the letter R. if the letter doesnt exist it return -1
	}

}
