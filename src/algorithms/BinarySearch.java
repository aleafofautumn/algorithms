/**
 * 
 */
package algorithms;

import java.util.Arrays;

import edu.princeton.cs.algs4.In;
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
	public static int rank(int key, int[] a) {
		int lo = 0;
		int hi = a.length - 1;
		while (lo <= hi) {
			int mid = lo + (hi - lo) / 2;
			if (key < mid) {
				hi = mid - 1;
			} else if (key > mid) {
				lo = mid + 1;
			} else {
				return mid;
			}
		}
		
		return -1;
	}
	
	public static void main(String[] args) {
		int[] whitelist = In.readInts();
		Arrays.sort(whitelist);
		while (!StdIn.isEmpty()) {
			int key = StdIn.readInt();
			if (rank(key, whitelist) < 0) {
				StdOut.println(key);
			}
			
		}
	}
}
