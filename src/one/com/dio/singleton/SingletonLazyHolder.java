package one.com.dio.singleton;

public class SingletonLazyHolder {
	
	private static class InstanceHolder{
		public static SingletonLazyHolder instancia = new SingletonLazyHolder();
	}
	
	private SingletonLazyHolder () {
		super();
	}
	
	public static SingletonLazyHolder getInstacia() {
		return InstanceHolder.instancia;
	}
	
}
