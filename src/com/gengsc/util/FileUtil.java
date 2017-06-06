/**
 * 
 */
package com.gengsc.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author shichaogeng
 *
 * 2017年6月6日
 */
public class FileUtil {

	/**
	 * 读取文件的数组列表
	 * @author shichaogeng
	 * @date 2017年6月6日
	 * @return
	 */
	public static Integer[] readList(String path){
        ArrayList<Integer> list = new ArrayList<Integer>();
        Scanner in =null;
        try {
            in = new Scanner(new File("C:\\Users\\Administrator\\Desktop\\algorithms\\algs4-data\\algs4-data\\"+path));
            while(in.hasNext()){
                list.add(in.nextInt());
            }
        } catch (FileNotFoundException e) {
            System.out.println("文件没找到");
            e.printStackTrace();
        }
        in.close();
        Integer[] whitelist = list.toArray(new Integer[0]);
        return whitelist;
    }
}
