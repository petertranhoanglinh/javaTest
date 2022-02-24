package javaTest.service;


import java.util.List;

public   class  Caculator {
 //private L type;

 
 public static float getDiemTB(List<Float> listdiem) {
		float diemTb = 0f;
		float sum = 0f;
		for(int i = 0 ; i < listdiem.size();i++) {
			sum = sum + listdiem.get(i);
		}
		diemTb = sum / listdiem.size();
		return diemTb;
	}
 
 public static float checkDiem(String maxOrMin,List<Float> listdiem ) {
		float check = listdiem.get(0);
		
		for (int i = 1; i < listdiem.size(); i++) {
	        // nếu kết quả của phép so sánh này lớn hơn 0
	        // tức biến max nhỏ hơn phần tử tại vị trí thứ i trong ArrayList
	        // thì gán max = phần tử tại vị trí i
	        // và đó chính là phần tử lớn nhất
			if(maxOrMin.equalsIgnoreCase("MAX")) {
				if (listdiem.get(i).compareTo(check) > 0) {
					check = listdiem.get(i);
		        }
			}else if(maxOrMin.equalsIgnoreCase("MIN")) {
	        	if (listdiem.get(i).compareTo(check) < 0) {
	        		check = listdiem.get(i);
	            }
			}
	        
	    }
		return check;
	}
}
