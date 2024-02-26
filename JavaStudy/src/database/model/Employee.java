package database.model;

import java.util.Date;

// 데이터 모델 클래스
public class Employee {
	// DB로부터 null이 나올수도 있으므로 
	// 기본 타입보다는 Wrapper 클래스를 사용하는것이 좋다
	Integer employee_id;
	String first_name;
	String last_name;
	String email;
	String phone_number;
	
	public Employee(
			Integer employee_id,
			String first_name,
			String last_name,
			String email,
			String phone_number) {
		this.employee_id = employee_id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.email = email;
		this.phone_number = phone_number;
	}
	@Override
	public String toString() {
		return String.format("%s %s", first_name,last_name);
	}
}

