package com.inteview.prep.seralization;

import java.io.Serializable;

public class Human implements Serializable{
	
	
	int x = 100;
	transient int y = 20;
	transient final int z =10;
	
	 int [] array = {3,5,7,8};
	 
	 int array2 [] = array;

}
