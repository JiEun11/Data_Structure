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
}

public class Generic {

	public static void main(String[] args) {
		Integer id = new Integer(1);   // 숫자 1을 나타내는 객체 id를 생성함
		Person<EmployeeInfo, Integer> p1 = new Person<EmployeeInfo, Integer>(new EmployeeInfo(1),id);
		System.out.println(p1.id.intValue());
		

//		List<Integer> list = Arrays.asList(1,2,3,4);
//		
//		list.forEach(x->System.out.println(x));
	}

}
