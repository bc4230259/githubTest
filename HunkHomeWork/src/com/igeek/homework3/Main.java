package com.igeek.homework3;


import java.io.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public List<String> pathList=new ArrayList<String>();
	
	public static void main(String[] args) {
		
		Main test=new Main();
		test.showPath("E:\\soft\\192.168.11.71[192.168.11.71]22.pub");
		for(String tempPath:test.pathList){
			String oriPath=tempPath;
			String desPath=tempPath.replace("E:\\", "D:\\");
			test.createDirectory(oriPath,desPath);
		}
	}

	public void showPath(String path){
		File file=new File(path);
		File[] fileList=file.listFiles();
	
		for(File tempFile:fileList){
			this.pathList.add(tempFile.getAbsolutePath());
			if(tempFile.isDirectory()){
				 showPath(tempFile.getAbsolutePath());
			}
			
		}
	
	}
	public void createDirectory(String oriPath,String desPath){
		File file=new File(oriPath);
		File newFile=new File(desPath);
		if(file.isFile()){
			if(!newFile.getParentFile().exists()){
				newFile.getParentFile().mkdirs();
			}
			System.out.println(fileTransfer(oriPath,desPath));
			
		}else{
			if(!newFile.exists()){
				newFile.mkdirs();
				System.out.println("ÒÑÌí¼ÓÄ¿Â¼"+desPath);
			}
			
		}
	}
	
	
	public String fileTransfer(String oriPath,String desPath){
		FileInputStream fis=null;
		BufferedInputStream bis = null;
		FileOutputStream fos=null;
		BufferedOutputStream bos=null;
				
		try {
			fis=new FileInputStream(oriPath);
			bis= new BufferedInputStream(fis);
			fos=new FileOutputStream(desPath);
			bos=new BufferedOutputStream(fos);
			
			byte[] b=new byte[1024];
			int t=0;
			while((t=bis.read(b))!=-1){
				bos.write(b,0,t);
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				bis.close();
				bos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
		
		
		return "File already transfered successfully from "+oriPath+" to "+desPath;
	}
	
}


