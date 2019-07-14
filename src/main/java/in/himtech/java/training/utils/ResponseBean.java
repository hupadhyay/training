package in.himtech.java.training.utils;

public class ResponseBean<T> {
	
	private T payload;
	
	private String message;
	
	private String exception = Constant.NO_EXCEPTION;
	
	private String status;

	public ResponseBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ResponseBean(T payload, String message, String exception, String status) {
		super();
		this.payload = payload;
		this.message = message;
		this.exception = exception;
		this.status = status;
	}
	
	public static <T> ResponseBean<T> getResponseBean(){
		return new ResponseBean<T>();
	}

	public T getPayload() {
		return payload;
	}

	public ResponseBean<T> setPayload(T payload) {
		this.payload = payload;
		return this;
	}

	public String getMessage() {
		return message;
	}

	public ResponseBean<T> setMessage(String message) {
		this.message = message;
		return this;
	}

	public String getException() {
		return exception;
	}

	public ResponseBean<T> setException(String exception) {
		this.exception = exception;
		return this;
	}

	public String getStatus() {
		return status;
	}

	public ResponseBean<T> setStatus(String status) {
		this.status = status;
		return this;
	}

	@Override
	public String toString() {
		return String.format("ResponseBean [payload=%s, message=%s, exception=%s, status=%s]", payload, message,
				exception, status);
	}

}
