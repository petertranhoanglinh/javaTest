package javaTest.generics;



import java.util.Set;

import javaTest.model.Hocsinh;

public class Main {
	
	public static void main(String[] args) {
		Hocsinh hs= new Hocsinh();
		hs.addHocsinh("Tran Hoang Linh", 24, 5f);
		hs.addHocsinh("Tran Hoang Linh 1", 24, 5.6f);
		hs.addHocsinh("Tran Hoang Linh 2", 24, 5.9f);
		hs.addHocsinh("Tran Hoang Linh 3", 24, 31f);
		Generics<String, Hocsinh> listHocSinh = new Generics<String, Hocsinh>(hs.listHs.get(0).getTen(), hs.listHs.get(0));
		for(int i = 1 ; i < hs.listHs.size() ; i++) {
				listHocSinh.add(hs.listHs.get(i).getTen(), hs.listHs.get(i));
		 }
		Set<String> keys=  listHocSinh.keySet();
		for (String t : keys) {
				System.out.println("key :" +t+ " : " + listHocSinh.searchValueByKey(t));
		}
		System.out.println("diem cao nhat la" + " " +hs.getNameCheckDiem("MAX"));
		System.out.println("diem thap nhat la" +" " +hs.getNameCheckDiem("MIN"));
	}

}
