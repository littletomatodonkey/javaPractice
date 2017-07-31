package net.gry;

import java.net.InetAddress;

import test.gry.stringTest;

public class AddressTest {

	public static void main(String[] args) {
		try {
			InetAddress addr = InetAddress.getByName("www.baidu.com");
			String domainName = addr.getHostName();
			String ipName = addr.getHostAddress();
			System.out.println(domainName);
            System.out.println(ipName);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
