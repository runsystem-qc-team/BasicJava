package com.gmo.linhdtm;

import java.util.Scanner;

public class ExerciseDay3 {

	public static void main(String[] args) {

		// Exercise 1
		System.out.println("Ex1:");
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập sâu kí tự: ");
		String n = sc.nextLine();
		n = n.trim();
		if (n.isEmpty()) {
			System.out.println("Chuỗi có 0 từ.");
		} else {
			String[] arr = n.split("\\s+");
			System.out.println("Chuỗi có " + arr.length + " từ.");
		}

		// Exercise 2
		
		// Exercise 3
		System.out.println("Ex3:");
		sc = new Scanner(System.in);
		System.out.println("Nhập sâu s1: ");
		String s1 = sc.nextLine();
		System.out.println("Nhập sâu s2: ");
		String s2 = sc.nextLine();
		if (s1.contains(s2)) {
			System.out.println("Chuỗi s1 có chứa s2.");
		} else {
			System.out.println("Chuỗi s1 không chứa s2.");
		}

		// Exercise 4
		System.out.println("Ex4:");
		sc = new Scanner(System.in);
		System.out.println("Nhập chuỗi: ");
		String s3 = sc.nextLine();
		System.out.println("Lấy kí tự tại vị trí: ");
		int n1 = sc.nextInt();
		if (n1 < s3.length()) {
			System.out.println("Kí tự tại vị trí " + n1 + " là: " + s3.indexOf(n1));
		} else {
			System.out.println("Không tồn tại ký tự tại vị trí: " + n1);
		}
		
		//Exercise 5
		System.out.println("Ex5:");
		sc = new Scanner(System.in);
		System.out.println("Nhập chuỗi thứ 1: ");
		String s4 = sc.nextLine();
		System.out.println("Nhập chuỗi thứ 2: ");
		String s5 = sc.nextLine();
		if (s4.compareTo(s5) > 0) {
			System.out.println("Chuỗi thứ 1 lớn hơn chuỗi thứ 2");
		} else if (s4.compareTo(s5) == 0) {
			System.out.println("Chuỗi thứ 1 bằng chuỗi thứ 2");
		} else {
			System.out.println("Chuỗi thứ 1 nhỏ hơn chuỗi thứ 2");
		}
		
		//Exercise 6
		System.out.println("Ex6:");
		sc = new Scanner(System.in);
		System.out.println("Nhập chuỗi thứ 1: ");
		String s6 = sc.nextLine();
		System.out.println("Nhập chuỗi thứ 2: ");
		String s7 = sc.nextLine();
		if (s6.compareToIgnoreCase(s7) > 0) {
			System.out.println("Chuỗi thứ 1 lớn hơn chuỗi thứ 2");
		} else if (s6.compareToIgnoreCase(s7) == 0) {
			System.out.println("Chuỗi thứ 1 bằng chuỗi thứ 2");
		} else {
			System.out.println("Chuỗi thứ 1 nhỏ hơn chuỗi thứ 2");
		}
		
		//Exercise 7
		System.out.println("Ex7:");
		sc = new Scanner(System.in);
		System.out.println("Nhập chuỗi thứ 1: ");
		String s8 = sc.nextLine();
		System.out.println("Nhập chuỗi thứ 2: ");
		String s9 = sc.nextLine();
		System.out.println("Chuỗi nối: " + s8.concat(s9));

		// Exercise 8
		System.out.println("Ex8: ");
		System.out.println("Nhập mảng số nguyên (Ngăn cách nhau bởi khoảng trắng): ");
		String n2 = sc.nextLine();
		String arr1[] = n2.split("\\s+");
		System.out.println("Các phần tử trong mảng: ");
		for (int j = 0; j < arr1.length; j++) {
			System.out.print(arr1[j] + " ");
		}
		System.out.println("\n");

		int a[] = new int[arr1.length];
		for (int i = 0; i < arr1.length; i++) {
			a[i] = Integer.parseInt(arr1[i]);
		}

		// Tìm min, max
		int max = a[0];
		int min = a[0];
		for (int e = 0; e < a.length; e++) {
			if (max <= a[e]) {
				max = a[e];
			} else if (min >= a[e]) {
				min = a[e];
			}
		}
		System.out.println("Giá trị lớn nhất: " + max);
		System.out.println("Giá trị nhỏ nhất: " + min);

		// Đếm số phần tử chẵn
		int count = 0;
		for (int f = 0; f < a.length; f++) {
			if (a[f] % 2 == 0) {
				count++;
			}
		}
		System.out.println("Số phần tử chẵn là: " + count);

		// Tìm các số nguyên tố có trong mảng
		System.out.print("Các số nguyên tố trong mảng là : ");
		for (int i = 0; i < a.length; i++) {
			if (checksonguyento(a[i]) == 1) {
				System.out.print(a[i] + " ");
			}

		}
		System.out.print("\n");
		
		//Sắp xếp mảng tăng dần
		System.out.print("Mảng sắp xếp tăng dần là: ");
		sortASC(a);
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		
	}
	public static int checksonguyento(int b) {
		int dem = 0;
		for (int i = 1; i <= b; i++) {
			if (b % i == 0) {
				dem++;
			}
		}
		if (dem == 2) {
			return 1;
		}
		return 0;
	}
	 public static void sortASC(int [] arr) {
	        int temp = arr[0];
	        for (int i = 0 ; i < arr.length - 1; i++) {
	            for (int j = i + 1; j < arr.length; j++) {
	                if (arr[i] > arr[j]) {
	                    temp = arr[j];
	                    arr[j] = arr[i];
	                    arr[i] = temp;
	                }
	            }
	        }
	    }


}
