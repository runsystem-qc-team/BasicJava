package com.gmo.ngannt.day1_bai2;

import java.util.Scanner;

public class Ex_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// nhập s�? bất kỳ. Kiểm tra chẵn lẽ v�? in ra m�?n hình
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập s�?: ");
		int n = sc.nextInt();

		if (n % 2 == 0) {
			System.out.println(n + " l�? s�? chắn");
		} else
			System.out.println(n + " l�? s�? lẽ");
	}

}
