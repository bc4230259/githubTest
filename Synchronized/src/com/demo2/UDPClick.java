package com.demo2;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/** 
  * @author  作者 姜老师 
  * @date 创建时间：2018年5月29日 上午9:56:13 
  * @version 1.0  
  */
public class UDPClick {

	public static void main(String[] args) throws Exception {
		DatagramSocket ds = new DatagramSocket(2614);
		//接收一个数据包
//		while(true){
//			byte b[] = new byte[1024];
//			DatagramPacket dp = new DatagramPacket(b,b.length);
//			ds.receive(dp);//一直在这里执行
//			//接收到数据后，可以得到发送端的Ip信息
//			InetAddress as = dp.getAddress();
//			String ip = as.getHostAddress();
//			String s = new String(dp.getData());
//			System.out.println("从"+ip+"得到:"+s);
//		}
		byte[] b=new byte[1024];
		DatagramPacket dp=new DatagramPacket(b,b.length);
		ds.receive(dp);
		System.out.println(new String(dp.getData()));
		ds.close();
	}

}
