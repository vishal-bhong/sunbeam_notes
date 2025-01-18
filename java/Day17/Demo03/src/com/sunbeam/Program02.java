package com.sunbeam;

public class Program02 {
	static boolean sunbeamstatus = false;

	public static void delay() {
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		Object obj = new Object();

		class SunbeamThread extends Thread {
			@Override
			public void run() {
				String name = "Sunbeam";
				synchronized (obj) { // lock the moniter
					for (int i = 0; i < name.length(); i++) {
						System.out.print(name.charAt(i));
						delay();
					}
					sunbeamstatus = true;
					obj.notify();
				} // unlock the moniter
			}
		}

		class InfotechThread extends Thread {
			@Override
			public void run() {
				String name = "Infotech";
				synchronized (obj) {
					try {
						if (!sunbeamstatus)
							obj.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					for (int i = 0; i < name.length(); i++) {
						System.out.print(name.charAt(i));
						delay();
					}
				} // unlock the moniter
			}
		}

		SunbeamThread st = new SunbeamThread();
		InfotechThread it = new InfotechThread();

		it.start();
		st.start();

	}

}
