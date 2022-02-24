package javaTest.designPatten;

public class EagerInitializedSingleton {
	
	// private for variable  để đảm bảo biến chỉ được tạo ra trong class này.
	private static EagerInitializedSingleton instance = new EagerInitializedSingleton();
	// private constructor để hạn chế truy cập từ class bên ngoài
	private EagerInitializedSingleton(){};
	// có một method public để return instance được khởi tạo ở trên
	public static EagerInitializedSingleton getInstance () {
		return instance ; 
	}
	

}
