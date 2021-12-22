package javaex.mysql.generic;

import java.util.Arrays;
import java.util.List;

class EmployeeInfo{
	public int rank;
	EmployeeInfo(int rank){
		this.rank = rank;
	}
}

class Person<T, S>{
	public T info;
	public S id;
	Person(T info, S id){
		this.info = info;
		this.id = id;
	}
	public <U> void printInfo(U info) {
		System.out.println(info);
	}
}


public class Generic {

	public static void main(String[] args) {
		EmployeeInfo e = new EmployeeInfo(1);
		Integer i = new Integer(10);
		Person p1 = new Person(e,i);
		
		p1.<EmployeeInfo>printInfo(e);
		
//		p1.printInfo(e); 로 생략 가능 
		

//		List<Integer> list = Arrays.asList(1,2,3,4);
//		
//		list.forEach(x->System.out.println(x));
	}

}
