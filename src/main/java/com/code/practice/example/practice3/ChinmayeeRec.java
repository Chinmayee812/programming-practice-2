package com.code.practice.example.practice3;

public class ChinmayeeRec {

	public static void main(String[] args) {
		//class 
		//room mate (annonymous)
		Gift gift = new Gift() {

			@Override
			public void greeting() {
				System.out.println("Many Many congratulations on your Job!!");
				
			}
			
		};
		gift.greeting();
		
		//Using java 8 lambda and functional interface
		Gift gift1 = ()-> System.out.println("Many Many congratulations on your Job!!!!!!");

		gift1.greeting();
	}


}
