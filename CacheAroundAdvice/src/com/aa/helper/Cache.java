package com.aa.helper;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Cache {
	private static Cache instance = null;

	public Map<String, Object> datamap = null;

	public Cache() {
		datamap = new ConcurrentHashMap<>();
	}

	public static synchronized Cache getInstance() {
		if (instance == null) {
			instance = new Cache();
		}

		return instance;
	}

	public void put(String key, Object value) {
		datamap.put(key, value);
	}

	public Object get(String key) {
		
		
		return  datamap.get(key);
	}

	

	public boolean containKey(String key) {
		return datamap.containsKey(key);
	}
public void show() {
	System.out.println("datamap");
}

}
