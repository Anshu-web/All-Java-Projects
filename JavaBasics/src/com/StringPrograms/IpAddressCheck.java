package com.StringPrograms;

public class IpAddressCheck {

	public static void main(String[] args) {

		String ipAddress = "10.32.142.15";
		boolean valid = ipCheck(ipAddress);

		System.out.println(valid);

	}

	private static boolean ipCheck(String ipAddress) {

		String[] stringArray = ipAddress.split("\\.");
 
		if (ipAddress == null || ipAddress.isEmpty()) {
			return false;
		}
		if (stringArray.length != 4) {
			return false;
		}

		for (String string : stringArray) {
			int s = Integer.parseInt(string);
			if (s < 0 || s > 255) {
				return false;
			}
		}

		if (ipAddress.endsWith(".")) {
			return false;
		}
		
		if (ipAddress.startsWith(".")) {
			return false;
		}

		return true;

	}

}
