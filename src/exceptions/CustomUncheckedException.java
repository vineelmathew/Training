package exceptions;

public class CustomUncheckedException {

	public static void main(String[] args) {
		
CustomUncheckedException unchecked=new CustomUncheckedException();
     Product product=null;
     unchecked.display(product);
     System.out.println("Unchecked exception");
     
	}
	public void display(Product product) {
		if (product == null) {
				InvalidUncheckedExcep exception = new InvalidUncheckedExcep("invalid argument");
				throw exception;
				//compiler not forcing us to handle exception 
				
		}
		String id = product.getId();
		String name = product.getName();
		System.out.println("product =" + id + " " + name);

	}

}
