package javaTest.generics;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import javaTest.model.Hocsinh;
import javaTest.service.Caculator;

public class Main {
	
	public static void main(String[] args) {
		List<Float> listDiem = new ArrayList<Float>();
		
		Hocsinh hs= new Hocsinh();
		hs.addHocsinh("Tran Hoang Linh ", 24, 5f);
		hs.addHocsinh("Tran Thi Phuong Thanh ", 24, 5.6f);
		hs.addHocsinh("Tran Van Giau ", 24, 5.9f);
		hs.addHocsinh("Lê thị Thanh", 24, 8f);
		hs.addHocsinh("Nguyễn Anh Dũng", 23, 10f);
		Generics<String, Hocsinh> listHocSinh = new Generics<String, Hocsinh>(hs.listHs.get(0).getTen(), hs.listHs.get(0));
		for(int i = 1 ; i < hs.listHs.size() ; i++) {
			    listDiem.add(hs.listHs.get(i).getDiem());
				listHocSinh.add(hs.listHs.get(i).getTen(), hs.listHs.get(i));
		 }
		listDiem.add(hs.listHs.get(0).getDiem());
		Set<String> keys=  listHocSinh.keySet();
		for (String t : keys) {
				System.out.println(listHocSinh.searchValueByKey(t));
		}
		System.out.println("SCORE MAX IS " + " " +hs.getNameCheckDiem("MAX") + " WITH SCORE " + Caculator.checkDiem("MAX",listDiem));
		System.out.println("SCORE MIN IS"  + " " +hs.getNameCheckDiem("MIN") + " WITH SCORE " + Caculator.checkDiem("MIN",listDiem));
		System.out.println(Caculator.getDiemTB(listDiem));
	}

}
