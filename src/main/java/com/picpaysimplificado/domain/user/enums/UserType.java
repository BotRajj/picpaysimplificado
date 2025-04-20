package com.picpaysimplificado.domain.user.enums;

public enum UserType {
	COMMON(1), 
	MERCHANT(2);

	private int code;

	private UserType(int code) {
		this.code = code;
	}

	public int getCode() {
		return code;
	}

	public static UserType valueOf(int code) {
		for (UserType value : UserType.values()) {
			if (value.getCode() == code) {
				return value;
			}
		}
		throw new IllegalArgumentException("invalid UserType code");
	}

}
