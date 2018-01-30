package com.incedo.responsebean;


// TODO: Auto-generated Javadoc
/**
 * The Class RootResponse.
 *
 * @param <T> the generic type
 */
public class RootResponse<T> {

	/** The status. */
	private boolean success;
	
	/** The data. */
	private T data;

	/**
	 * Instantiates a new root response.
	 */
	public RootResponse() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * Instantiates a new root response.
	 *
	 * @param status the status
	 * @param data the data
	 */
	public RootResponse(boolean success, T data) {
		super();
		this.success = success;
		this.data = data;
	}


	public boolean getSuccess() {
		return success;
	}


	public void setSuccess(boolean success) {
		this.success = success;
	}

	/**
	 * Gets the data.
	 *
	 * @return the data
	 */
	public T getData() {
		return data;
	}

	/**
	 * Sets the data.
	 *
	 * @param data the new data
	 */
	public void setData(T data) {
		this.data = data;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "RootResponse [status=" + success + ", data=" + data + "]";
	}

}
