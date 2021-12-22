package javaex.mysql.generic;

import java.util.Arrays;
import java.util.List;

interface Info{
	int getLevel();
}

class EmployeeInfo implements Info{
	public int rank;
	EmployeeInfo(int rank){
		this.rank = rank;
	}
	public int getLevel() {
		return this.rank;
	}
}

class Person<T extends Info>{
	public T info;
	Person(T info){
		this.info = info;
		info.getLevel();
	}
}

public class Generic {

	public static void main(String[] args) {
		Person<EmployeeInfo> p1 = new Person<EmployeeInfo>(new EmployeeInfo(1));
		Person<String> p2 = new Person<String>("부장");
//		p1.printInfo(e); 로 생략 가능 
		

//		List<Integer> list = Arrays.asList(1,2,3,4);
//		
//		list.forEach(x->System.out.println(x));
	}

}
