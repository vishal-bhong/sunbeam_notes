package com.sunbeam;

class Singleton {
	// step-3 -> Create the static reference of the Singleton class
	private static Singleton ref = null;

	// step-1 -> Make the ctor private
	private Singleton() {
		System.out.println("Inside Singleton Ctor");
	}

	// step-2 -> create the static getInstance() that will return the Object
	// of this singleton class
	public static Singleton getInstance() {
		// step-4 -> check if the ref is null and then create the instance
		// if ref is not null then return the ref as it is.
		if (ref == null)
			ref = new Singleton();
		return ref;
	}
}

public class Program {
	public static void main(String[] args) {
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		Singleton s3 = Singleton.getInstance();
	}

}
