package com.mapinterface;

import java.util.HashMap;

public class HashMap_Map {

	public static void main(String[] args) {
		HashMap<Object,Object> map = new HashMap<>();
		map.put(17, "Sai");
		map.put(31, 'K');
		map.put(22, "Sailu");
		map.put(31, "Leela");
		map.put(null, null);
		//map.remove(null);
		System.out.println(map);
		System.out.println(map.keySet());
		System.out.println(map.values());
	}

}
