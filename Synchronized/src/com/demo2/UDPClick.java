package com.demo2;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/** 
  * @author  ���� ����ʦ 
  * @date ����ʱ�䣺2018��5��29�� ����9:56:13 
  * @version 1.0  
  */
public class UDPClick {

	public static void main(String[] args) throws Exception {
		DatagramSocket ds = new DatagramSocket(2614);
		//����һ�����ݰ�
//		while(true){
//			byte b[] = new byte[1024];
//			DatagramPacket dp = new DatagramPacket(b,b.length);
//			ds.receive(dp);//һֱ������ִ��
//			//���յ����ݺ󣬿��Եõ����Ͷ˵�Ip��Ϣ
//			InetAddress as = dp.getAddress();
//			String ip = as.getHostAddress();
//			String s = new String(dp.getData());
//			System.out.println("��"+ip+"�õ�:"+s);
//		}
		byte[] b=new byte[1024];
		DatagramPacket dp=new DatagramPacket(b,b.length);
		ds.receive(dp);
		System.out.println(new String(dp.getData()));
		ds.close();
	}

}
