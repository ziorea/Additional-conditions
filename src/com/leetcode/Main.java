package com.leetcode;

public class Main {

    public static void main(String[] args) {
	// write your code here

                for (int i = 1; i <= 100; i++) {
                    if (i % 5 == 0 && i % 10 == 0)
                        System.out.println("Broj je djeljiv s 5 i 10");
                    else if (i % 10 == 0)
                        System.out.println("Broj je djeljiv s 10");
                    else if (i % 3 == 0 && i % 5 == 0)
                        System.out.println("Broj je djeljiv s 3 i 5");
                    else if (i % 5 == 0)
                        System.out.println("Broj je djeljiv s 5");
                    else if (i % 3 == 0)
                        System.out.println("Broj je djeljiv s 3");
                    else System.out.println("Broj nije djeljiv");
                }
    }
}
