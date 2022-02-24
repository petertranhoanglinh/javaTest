package javaTest;

import java.util.ArrayList;
import java.util.List;
// muốn quản lý tất cả các kế thừa của class people 
public class Controller<E extends People> {
	ArrayList<E> list = new ArrayList<>();
	public Controller() {
		
	}
	public void add(E e) {
		list.add(e);
	}
	public  E get(int index) {
		return list.get(index);
	}
	
	public List<E> getALL(){
		return  list ;
	}

}
