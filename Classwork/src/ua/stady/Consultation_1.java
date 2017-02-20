package ua.stady;

import java.time.LocalDateTime;

public class Consultation_1 {
 public static void main(String[] args) {
	
	 int win = 200;
	 int a = 100;
	 int b = 200;
	 int c = 300;
	 
	 if(a==win){
		 System.out.println("you win1");
	 }
	 else if(b==win){
		 System.out.println("you win2");
	 }
	 
	 else if(c==win){
		 System.out.println("you win3");
	 }
	 else{
		 System.out.println("not found");
	 }
	 System.out.println("//------------------------------------------------------------------------------------------------------------------------------------------------------");
	 switch(win){
	 case 100:{
		 System.out.println("you win1");
		 break;
	 }
	 case 200:{
		 System.out.println("you win2");
		 break;
	 }
	 case 300:{
		 System.out.println("you win3");
		 break;
	 }
	 default:{
		 System.out.println("not found");
	    }
       }
//	 double  one =  12.90;
	 
	 
	 
	 
	 System.out.println(LocalDateTime.now());
	 
	 
 int [] numbers = {1234,3454,145,1345,345};
//	 
//	 int i = numbers.length-1;
//	 while(i > 1){
//		 System.out.println(numbers[i]);
//		 i--;
//	 }
 int i = numbers.length-1;
 do{
	 System.out.println(numbers[i]);
	 i--;
 }while(i>=0);
 
for (int g = 0; i < numbers.length; i++){
	System.out.println(numbers[i]);
}

for (int h : numbers) {
	System.out.println(i);
}
	
	 
	 
	 
	 
 }
}
