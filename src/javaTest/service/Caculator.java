package javaTest.service;

import java.util.ArrayList;
import java.util.List;

public   class  Caculator {
 //private L type;
 public static  List<Float> listdiem = new ArrayList<Float>();
 
 public static float getDiemTB() {
		float diemTb = 0f;
		float sum = 0f;
		for(int i = 0 ; i < listdiem.size();i++) {
			sum = sum + listdiem.get(i);
		}
		diemTb = sum / listdiem.size();
		return diemTb;
	}
}
