package javaTest.model;

public class Hocsinh {
 private String ten;
 private int tuoi;
 private float diem;
 public Hocsinh(String ten 
		 , int tuoi 
		 , float diem) {
	 this.ten = ten;
	 this.diem = diem;
	 this.tuoi = tuoi;
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
		return  ten +" " +" " + tuoi + " "+ diem  ;
	}

}
