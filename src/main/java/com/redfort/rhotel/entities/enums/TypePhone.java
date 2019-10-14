package com.redfort.rhotel.entities.enums;

public enum TypePhone {
	
	RESIDENTIAL_PHONE(1),
	CELL_PHONE(2),
	COMMERCIAL_PHONE(3);
	

private int code;
	
	private TypePhone(int code) {
		this.code = code;
	}
	
	public int getCode() {
		return code;
	}
	
	public static TypePhone valueOf(int code) {
		for(TypePhone value: TypePhone.values()) {
			if(value.getCode() == code) {
				return value;
			}
		}
		throw new IllegalArgumentException("Invalid TypePhone code");
	}
}
