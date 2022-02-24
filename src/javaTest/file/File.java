package javaTest.file;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class File {
	// Dùng để lưu trữ data
	// có 2 loại text  và binary  
	// text + binary
	// file : đọc cả file read and write.
	
	// Gồm 3 bước :  
	// b1 mở file
	// b2 read/write
	// đóng kết nối file
	
	public static void main(String[] args) {
		FileInputStream fileInputStream = null;
//		java.io.File file = new java.io.File("Text.txt");
//		if(file.isFile()) {
//			// lấy đường dẫn tuyệt đối 
//			System.out.println("file :" + file.getAbsolutePath());
//
//		}
//		else {
//			System.out.println("not found");
//			try {
//				file.createNewFile();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
		// nhập dữ liệu từ bàn phím 
//		System.out.println("Nhập N : ");
//	    DataInputStream inputStream = new DataInputStream(System.in);
//	    int N = Integer.parseInt(inputStream.readLine());
//	    System.out.println(N);
		
		// Đọc dữ liệu từ file
		
		try {
			 fileInputStream = new FileInputStream("Text.txt");
			 int ch;
			 while((ch = fileInputStream.read()) != -1 ) {
				 System.out.print((char)ch);
			 }
			 fileInputStream.read();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			if(fileInputStream != null ) {
				try {
					fileInputStream.close();
				} catch (Exception ex) {
					
				}
			}
		}
	}

}
