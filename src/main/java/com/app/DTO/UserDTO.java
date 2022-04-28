package com.app.DTO;

public class UserDTO {

	private String userId;
	private String isSuccess;
	private String email;
	private String rollNumber;
	private String[] numbers;
	private String[] alphabets;
	private String[] data;
	
	
	
	public UserDTO() {
		super();
	}
	public UserDTO(String userId, String isSuccess, String email, String rollNumber, String[] numbers,
			String[] alphabets,String[] data) {
		super();
		this.userId = userId;
		this.isSuccess = isSuccess;
		this.email = email;
		this.rollNumber = rollNumber;
		this.numbers = numbers;
		this.alphabets = alphabets;
		this.data = data;
	}
	/**
	 * @return the userId
	 */
	public String getUserId() {
		return userId;
	}
	/**
	 * @param userId the userId to set
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}
	/**
	 * @return the isSuccess
	 */
	public String getIsSuccess() {
		return isSuccess;
	}
	/**
	 * @param isSuccess the isSuccess to set
	 */
	public void setIsSuccess(String isSuccess) {
		this.isSuccess = isSuccess;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the rollNumber
	 */
	public String getRollNumber() {
		return rollNumber;
	}
	/**
	 * @param rollNumber the rollNumber to set
	 */
	public void setRollNumber(String rollNumber) {
		this.rollNumber = rollNumber;
	}
	/**
	 * @return the numbers
	 */
	public String[] getNumbers() {
		return numbers;
	}
	/**
	 * @param numbers the numbers to set
	 */
	public void setNumbers(String[] numbers) {
		this.numbers = numbers;
	}
	/**
	 * @return the alphabets
	 */
	public String[] getAlphabets() {
		return alphabets;
	}
	/**
	 * @param alphabets the alphabets to set
	 */
	public void setAlphabets(String[] alphabets) {
		this.alphabets = alphabets;
	}
	/**
	 * @return the data
	 */
	public String[] getData() {
		return data;
	}
	/**
	 * @param data the data to set
	 */
	public void setData(String[] data) {
		this.data = data;
	}
	
	
	
	
}
