package projects.exception;

@SuppressWarnings("serial")
public class DbException extends RuntimeException{

	public DbException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	
	public DbException(Throwable cause) { 
		super(cause);
	}
	
	public DbException(String message, Throwable cause) {
		super(message, cause);
	}

}
