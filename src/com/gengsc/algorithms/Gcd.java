package com.gengsc.algorithms;

public class Gcd {

	public static void main(String[] args) {
		System.out.println(gcd(10,12));
	}

	/**
	 * 求最大公约数，欧几里得算法
	 * @author shichaogeng
	 * @date 2017年6月1日
	 * @param p
	 * @param q
	 * @return
	 */
	public static int gcd(int p, int q) {
		if (0 == q) {
			return p;
		}
		int r = p % q;
		return gcd(q, r);

	}

}
