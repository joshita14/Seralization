package com.inteview.prep.seralization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Seralization {
	
	
	/**
	 * Program implementing seralization
	 */

	public void seralize(Human human){
		
		human.array2 [3] =3000888;
		try{
		FileOutputStream fileout = new FileOutputStream("file.txt");
		
		ObjectOutputStream obj = new ObjectOutputStream(fileout);
		obj.writeObject(human);
		obj.close();
		}catch(IOException e){
			
			System.out.println("There is an exception");
		}
		
		
	}
	
	
	public void deseralize(Human human) throws IOException,ClassNotFoundException{

		FileInputStream filestream = new FileInputStream("file.txt");
		ObjectInputStream stream = new ObjectInputStream(filestream);
		
		Human human1 = (Human)stream.readObject();
		
		System.out.println(human1.x+ "    "+human1.y+"     "+human1.z);
		stream.close();
		
		for(int x : human1.array2){
			
			System.out.println(x);
			//human1.array2[3] = 3000;
		}
		
		for(int x : human1.array){
			System.out.println("   "+x);
		}
		
	   
	}
	
	
	public static void main(String args[]) throws ClassNotFoundException, IOException{
		
		Human human = new Human();
		
		Seralization s = new Seralization();
		s.seralize(human);
		s.deseralize(human);
	}
}
