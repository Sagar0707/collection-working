package com.collections.working.map;

/**
 * @author sagarsingh.ranawat
 * 
 */
public class Key {
	private final String key;
	
	Key(String key){
		this.key = key;
	}

	@Override
	public int hashCode() {
		
		System.out.println("hash called "+key);
		return 1;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		System.out.println("equals called "+((Key)obj).getKey());
		return key.equalsIgnoreCase(((Key)obj).getKey());
	}
	
	public String getKey() {
		return key;
	}
	
	
}
