package com.java8;

import java.util.*;

public class Codechef {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		System.out.println(alienAttack(a, b, c));

	}

	public static int alienAttack(int health, int numberOfAliens, int damagePerPunch) {

		while (numberOfAliens > 4) {
			numberOfAliens = numberOfAliens - 4;
			health = health - damagePerPunch;
		}

		int result = health;
		return result;
	}
}
