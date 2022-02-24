package javaTest.designPatten;

public class ThreadSafeSington {
	private static ThreadSafeSington instance ;
	
	private ThreadSafeSington() {};
	
	
	synchronized static ThreadSafeSington getInstance() {
		if(instance == null) {
			return new ThreadSafeSington() ;
		}
		return instance;
	}

}
