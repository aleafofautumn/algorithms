/**
 * 
 */
package com.gengsc.algorithms;

import java.util.Arrays;

import com.gengsc.util.FileUtil;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * @author shichaogeng
 *
 * 2017年6月1日
 */
public class BinarySearch {
	
	/**
	 * 二分查找
	 * @author shichaogeng
	 * @date 2017年6月1日
	 * @param key
	 * @param a
	 * @return
	 */
	public static int rank(int key, Integer[] a) {
		int lo = 0;
		int hi = a.length - 1;
		while (lo <= hi) {
			int mid = lo + (hi - lo) / 2;
			if (key < a[mid]) {
				hi = mid - 1;
			} else if (key > a[mid]) {
				lo = mid + 1;
			} else {
				return mid;
			}
		}
		
		return -1;
	}
	
	public static void main(String[] args) {
		Integer[] whitelist = FileUtil.readList("largeW.txt");
		Arrays.sort(whitelist);
		Integer[] accountList = FileUtil.readList("largeT.txt");
		for (Integer key : accountList) {
			if (rank(key, whitelist) < 0) {
				System.out.println(key);
			}
		}
	}
}
