package com.incedo.model.constant;

public enum Constants {
    SELECT_STUDENT_BY_EMAIL("from Student as s where s.studentEmail=?"),
    
    SELECT_STUDENT_BY_STUDENTID("from Student as s where s.studentId=:studentId"),
    
     
	
	SELECT_ALL_EMPLOYEES("from Employee"),
	SELECT_ALL_SKILLS("from Skill"),
	
	 
	SELECT_ALL_BOOK_COUNT_BY_AUTHOR("SELECT sum(E.noOfBooksAvailable) FROM Book E where author.authorId=:authorId");


    private Constants(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	private final String value;
}
