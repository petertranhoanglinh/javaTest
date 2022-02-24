package javaTest.model;

import java.util.ArrayList;
import java.util.List;

import javaTest.service.Caculator;

public class Hocsinh {
 private String ten;
 private int tuoi;
 private float diem;
 static List<Float> listdiem = new ArrayList<Float>();
 public List<Hocsinh> listHs = new ArrayList<Hocsinh>();
 public Hocsinh(String ten 
		 , int tuoi 
		 , float diem) {
	 this.ten = ten;
	 this.diem = diem;
	 this.tuoi = tuoi;
	 listdiem.add(this.diem);
 }
public Hocsinh() {
	// TODO Auto-generated constructor stub
}
public String getTen() {
	return ten;
}
public void setTen(String ten) {
	this.ten = ten;
}
public int getTuoi() {
	return tuoi;
}
public void setTuoi(int tuoi) {
	this.tuoi = tuoi;
}
public float getDiem() {
	return diem;
}
public void setDiem(long diem) {
	this.diem = diem;
};

@Override
	public String toString() {
		// TODO Auto-generated method stub
		return  ten+" "+" "+ tuoi+" "+diem  ;
	}


public void addHocsinh(String ten1 
		 , int tuoi1 
		 , float diem1) {
	
	listHs.add(new Hocsinh(ten1, tuoi1, diem1));
}

public String getNameCheckDiem(String maxOrMin ) {
	String name = "";
	for(int i = 0 ; i< listHs.size(); i++) {
		if(listHs.get(i).getDiem() == Caculator.checkDiem(maxOrMin,listdiem)) {
			name = name + listHs.get(i).getTen() + " ";
		}
	}
	return name;
	
}


}