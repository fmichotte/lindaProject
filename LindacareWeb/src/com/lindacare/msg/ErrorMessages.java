package com.lindacare.msg;

public enum ErrorMessages {
	
	VALID_OK(InputMessage.VALID_OK, "ok"),
	VALID_ERROR(InputMessage.VALID_ERROR_GENERAL, "ERROR"),
	VALID_ERROR_USER(InputMessage.VALID_ERROR_USER, "WRONG USER"),
	VALID_ERROR_RATE(InputMessage.VALID_ERROR_RATE, "WRONG RATE");
	
    int value;
    String name;

	
	ErrorMessages(int value, String name) {
        this.value = value;
        this.name = name;
    }
	
	public String getMessage(){
		return name;
	}
	public String  getValue(){
		return value+"";
	}
}
