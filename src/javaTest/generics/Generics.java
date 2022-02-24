package javaTest.generics;

import java.util.HashMap;
import java.util.Set;

public class Generics <K,V>{
	private K key;
	private V value;
	private HashMap<K,V> object = new HashMap<K,V>();
	
	public Generics(K key1, V value1){
		 
		 if(object.containsKey(key1) == false) {
			  value = value1;
			  key = key1;
		      object.put(key, value);
		 }
	   
	};
	public void setObject(HashMap<K, V> object) {
		this.object = object;
	}
	public void setValueByKey(K key, V value) { 	
		if(object.containsKey(key)) {
			object.remove(key);
			object.put(key, value);
		}else {
		   System.out.println("Dont key" + key+ " is object");
		}
	}
	public void add(K key, V value) { 	
		if(object.containsKey(key) == false) {
			object.remove(key);
			object.put(key, value);
		}else {
			System.out.println("key "+ key +" already exists");
		}
	}
	
	public V searchValueByKey(K key) {
		
	    return object.get(key);
	}
	public Set<K> keySet(){
		return object.keySet();
	}
	public K getKey() {
		return key;
	}
	public void setKey(K key) {
		this.key = key;
	}
	public V getValue() {
		return value;
	}
	public void setValue(V value) {
		this.value = value;
	}
	public HashMap<K, V> getObject() {
		return object;
	}

}
