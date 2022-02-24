package javaTest;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Set;
import java.util.Vector;

public class Vector1{
	public static int[] swap(int x , int y) {
	    int temp;
	    System.out.println("trước khi swap x la" +x);
		System.out.println("trước khi swap y la" +y);
	    temp = x;
	    x = y;
	    y = temp;
		int[] swap = {x,y};
		System.out.println("sau khi swap x la" +x);
		System.out.println("sau khi swap y la" +y);
		return swap;
	}
	public static void main(String[] args) {
		
		swap(100 , 200); 
		// bản thân vector rất giống arrayList 
		
		Vector<String> List = new Vector();
		
		LinkedList<String> linklist  =  new LinkedList<>();
		// bản chất nó sẽ ghi 2 giá trị là giá trị của con trỏ là gì và chứa 1 con trỏ để có thể trỏ đến phần tử tiếp theo
		// ưu điểm: ko bị thừa ko gian nhớ . nhược điểm: chậm
		
		// TIM HIEU VE BO SET
		
		HashMap<String, String> map = new HashMap<>();
		// bản chất lưu trữ là lưu trữ theo kiểu key và value;
		map.put("fullname", "Trần Hoàng Linh");
		
		map.put("adrress", "90/1d ấp 3 an viễn trảng bom");
		
		System.out.println(map.get("fullname"));
		// muốn biết ctrinh có bao nhieu key.
		Set<String> keys=  map.keySet();
		keys.forEach((key)->{
			System.out.println("key :" +key+ " : " + map.get(key));
			
		});
		// duyet phan tu trong hashmap
		for (String t : keys) {
			System.out.println("key :" +t+ " : " + map.get(t));
		}
		
		
		HashMap<String, String> ListStudent =  new HashMap<>();
		ListStudent.put("fullnameSinh", "Trần Hoàng Linh");
		
		Set<String> KeysSV = ListStudent.keySet();
		KeysSV.forEach((key1)->{
			System.out.println("key :" +key1+ " : "+ ListStudent.get(key1));
		});
	}

}
