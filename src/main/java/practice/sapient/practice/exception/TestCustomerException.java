package practice.sapient.practice.exception;

public class TestCustomerException {

	public static void main(String[] args) {
		Test test = new Test();
		try {
			test.testMethod();
		} catch (CustomException e) {
			e.printStackTrace();
		}
	}

}



class Test{
	
	public void testMethod() throws CustomException{
		throw new CustomException("this is a customer exception");
	}
	
}