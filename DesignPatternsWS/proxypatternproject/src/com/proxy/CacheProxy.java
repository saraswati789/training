package com.proxy;

import java.util.HashMap;
import java.util.Map;

public class CacheProxy {

	StatesUtil util = new StatesUtil();

	Map<String, String> cache = new HashMap<String, String>();

	public String getCapital(String state) {

		String capital = null;
		state = state.toLowerCase();
		
		if (cache.containsKey(state)) {
			capital = cache.get(state);
			System.out.println("Got from cache");
		} else {
			capital = util.getCapital(state);
			cache.put(state, capital);
		}

		return capital;
	}

}
