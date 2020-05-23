package com.ba.helper;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Cache {

	private static Cache instance;
	private Map<String, Object> dataMap;

	private Cache() {
		// single tone
		dataMap = new ConcurrentHashMap<>();
	}

	public static Cache getInstance() {
		if (instance == null) {
			instance = new Cache();
		}
		return instance;
	}

	public void put(String key, Object value) {
		dataMap.put(key, value);
	}

	public Object get(String key) {
		return dataMap.get(key);
	}

	public boolean contain(String key) {
		return dataMap.containsKey(key);
	}
}
