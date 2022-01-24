package com.test.serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Save implements Serializable{
	
	int a;
}

public class SerializationEx {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		Save obj=new Save();
		obj.a=10;
		
		File file=new File("obj.txt");
		FileOutputStream fout=new FileOutputStream(file);
		ObjectOutputStream oout=new ObjectOutputStream(fout);
		oout.writeObject(obj);
		
		FileInputStream fis=new FileInputStream(file);
		ObjectInputStream ois=new ObjectInputStream(fis);
		
		Save obj1= (Save)ois.readObject();
		
		System.out.println("Object is :"+obj1.a);
		
		
	}

}
