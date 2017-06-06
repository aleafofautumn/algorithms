/**
 * 
 */
package com.gengsc.algorithms;

import org.junit.Test;

import edu.princeton.cs.algs4.StdOut;

/**
 * @author shichaogeng
 *
 * 2017年6月6日
 */
public class Test1_1 {

	@Test
	public void test1_1_6() {
		int f = 0;
		int g = 1;
		for (int i = 0; i <= 15; i++) {
			StdOut.println(f);
			f = f + g;
			g = f - g;
		}
	}
		
	@Test
	public void test1_1_7() {
	        double t = 9.0;
	        while (Math.abs(t - 9.0/t) > .001) {
	            t = (9.0/t + t) / 2.0;
	            StdOut.printf("%.5f\n", t);
	        }
	        
	}
	
	@Test
	public void test1_1_8() {
		System.out.println('b');
		System.out.println('b' + 'c');
		System.out.println((char)('a' + 4));
	}
	
}
