package Week5CodingAssignment;

public class AsteriskLogger implements Logger{

	@Override
	public void log(String message) {
		// TODO Auto-generated method stub
		System.out.println("***" + message + "***");
	}

	@Override
	public void error(String errorMessage) {
		// TODO Auto-generated method stub
		System.out.println("****************");
		System.out.println("***Error: " + errorMessage.replaceAll(" " + " e ", errorMessage).toLowerCase() + "***");
		System.out.println("****************");
	}

}
