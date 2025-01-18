package com.sunbeam;


//class Date implements Cloneable {
//    int day;
//    int month;
//    int year;
//
//    @Override
//    protected Object clone() throws CloneNotSupportedException {
//        return super.clone();
//    }
//}

class Date implements Cloneable {
	int day;
	int month;
	int year;

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

}

public class Program06 {

	public static void main(String[] args) {
		Date d1 = new Date();
		try {
			Date d2 = (Date) d1.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}

}
