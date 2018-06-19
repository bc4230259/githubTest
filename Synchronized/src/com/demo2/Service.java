package com.demo2;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class Service {

	public static void main(String[] args) throws Exception {
		DatagramSocket ds=new DatagramSocket();
		String s="ÄãºÃ";
		byte[] b=s.getBytes();
		InetAddress as=InetAddress.getLocalHost();
		
		DatagramPacket dp= new DatagramPacket(b, b.length, as, 9999);
		ds.send(dp);
		ds.close();
	}

}
