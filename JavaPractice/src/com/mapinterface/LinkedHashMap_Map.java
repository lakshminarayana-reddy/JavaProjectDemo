package com.mapinterface;

import java.util.LinkedHashMap;

public class LinkedHashMap_Map {

	public static void main(String[] args) {
		LinkedHashMap<Object,Object> map = new LinkedHashMap<>();
		map.put(1707, "Sai");
		map.put('K', "Sai");
		map.put(31, "Leela");
		map.put(22, "Sailu");
		map.put(null, null);
		System.out.println(map);
	}

}
