package javaTest.generics;



import java.util.Set;

import javaTest.model.Hocsinh;

public class Main {
	
	public static void main(String[] args) {
		Generics<String, Hocsinh> listHocSinh = new Generics<String, Hocsinh>(null, null);
		listHocSinh.add("001" ,new Hocsinh("TranHoangLinh" , 24,5.6f));
		listHocSinh.add("002" ,new Hocsinh("TranThiPhuongThanh" ,20,5.1f));
		System.out.println(listHocSinh.searchValueByKey("002").toString());
		Set<String> keys=  listHocSinh.keySet();
		for (String t : keys) {
			System.out.println("key :" +t+ " : " + listHocSinh.searchValueByKey(t));
		}
	   
	}

}
