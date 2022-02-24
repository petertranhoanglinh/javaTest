package javaTest;
public class Generic {
	public static void main(String[] args) {
		// Tìm hiểu generic là gì
		// cách tạo generic của chúng ta.
		// khái niệm: Cho phép chúng ta định nghĩa kiểu dữ liệu trong lúc dùng. 
		
		Controller<Student> controller = new Controller<>();
		controller.add(new Student("r1", "A"));
		controller.add(new Student("r2", "B"));
		System.out.println(controller.get(0).fullname);
		System.out.println(controller.getALL().toString());
		
	}

}
