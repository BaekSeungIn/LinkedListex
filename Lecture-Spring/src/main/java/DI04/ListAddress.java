package DI04;

import java.util.List;

public class ListAddress {

	private List<String> address; //java.util.ArrayList가 기본이다.

	public ListAddress() {
		System.out.println("ListAddress() 호출");
	}

	public ListAddress(List<String> address) {
		this.address = address;
		System.out.println("ListAddress(List<String>) 호출..");
	}

	public List<String> getAddress() {
		return address;
	}

	public void setAddress(List<String> address) {
		this.address = address;
	}
	
}
