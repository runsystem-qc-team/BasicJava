package com.gmo.nhanttt;

import java.util.Scanner;

public class ExDay2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap number 1 = ");
		int number1 = scanner.nextInt();

		System.out.print("Nhap number 2 = ");
		int number2 = scanner.nextInt();

		System.out.print("Nhap number 3 = ");
		int number3 = scanner.nextInt();
		
	    int max = number1;
	    if(max < number2){
	        max = number2;
	    }
	    if(max < number3) {
	        max = number3;
	    }	 
	    System.out.println("So lon nhat là " + max);
	    int min = number1;
	    if(min > number2){
	    	min = number2;
	    }
	    if(min > number3) {
	    	min = number3;
	    }	 
	    System.out.println("So nhỏ nhat là " + min);

		int tong = number1 + number2;
		System.out.println("Tổng 2 số = " + tong);
		int hieu = number1 - number2;
		System.out.println("Hiệu 2 số = " + hieu);
		int tich = number1 * number2;
		System.out.println("Tích 2 số = " + tich);
		double thuong = (double) number1 / number2;
		System.out.println("Thương 2 số = " + thuong);
	
		if (number3 % 2 == 0) {			
			System.out.println(number3 + " là số chẵn .");
			int number4 = number3 *2;
			System.out.println("number 3 = " + number4);
		} else {
			System.out.println(number3 + " là số lẻ .");
		}
		System.out.println("Cạnh 1 : " + number1);
		System.out.println("Cạnh 2 : " + number2);
		System.out.println("Cạnh 3 : " + number3);
		
		if ((number1 + number2 > number3) && (number1 + number3 > number2) && (number2 + number3 > number1) && (number1>0) && (number2 > 0) && (number3 > 0)){
			if ((number1==number2) && (number2==number3)){
				System.out.println("Day la tam giac deu");
			} 
			else if ((number1==number2) && (number1!=number3) || (number1==number3) && (number1!=number2) || (number2==number3) && (number2!=number1)){
				System.out.println("Day la tam giac can");
			}
			else if ((number1*number1==number2*number2+number3*number3)||(number2*number2==number1*number1+number3*number3)||(number3*number3==number1*number1+number2*number2)){
				System.out.println("Day la tam giac vuong");// 24 10 26
			}
			else {
				System.out.println("Day la tam giac thuong");
			}
		}
		else {
			System.out.println("Day khong phai la tam giac");
		}
		if (number3 > 5) {			
			number3 = number3 + 2;
			System.out.println("number 3 = " + number3);	
		} else {
			System.out.println("number 3 = 0 ");
		}
		int tongChan = 0;
		for (int i = 0;i < 10;i++) {
			tongChan +=i*2;
		 }
		System.out.println("Tổng 10 số chẵn đầu tiên là:" + tongChan);
		
		int soLe = 1;
		System.out.print("Số lẻ từ 1~99 là : ");
		while(soLe < 99) {
			System.out.print(soLe + "," );
			soLe+=2;				
		}		
		
		int TongBoiSo=0;
		System.out.print("\nBoi so của 7 là :"); 
		for (int i=7;i<100;i++) 
		{ 
			if(i%7==0){
				System.out.print(i+",");
				TongBoiSo= TongBoiSo+i;				
				}
			
		} 
		System.out.println("\nTổng Boi so của 7 = " + TongBoiSo); 
		
		if (number1 % 2 == 0 && number2 % 2 == 0) {			
			System.out.println("number1, number2 là số chẵn : " + number1+" , " + number2);
			int tongSoChan = number1 + number2;
			System.out.println("Tong 2 số chẵn = " + tongSoChan);
		} else if (number1 % 2 != 0 && number2 % 2 != 0) {
			System.out.println("number1, number2 là số lẻ : " + number1+" , " + number2);
			int tongSoLe = number1 + number2;
			System.out.println("Tong 2 số lẻ = " + tongSoLe);
		} else {
			System.out.println("number1, number2 gồm số lẻ và số chẵn ");
		} 

	 
		//Giải Bậc Phương trình
		System.out.println("Giải Bậc Phương trình : " + number1 + "x + " + number2 + " = 0.");
		if (number1 == 0) {
			if (number2 == 0) {
				System.out.println("Phương trình này có vô số nghiệm.");
			} else {
				System.out.println("Phương trình vô nghiệm.");
			}
		} else {
			double nghiem2so = (double) -number1 / number2;
			System.out.println("Phương trình có nghiệm x = " + nghiem2so + ".");
		}
	
	
	}

}
