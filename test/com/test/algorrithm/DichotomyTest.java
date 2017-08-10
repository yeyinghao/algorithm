package com.test.algorrithm;

import com.algorithm.dichotomy.Dichotomy;

/**
 * 
 * ClassName: DichotomyTest
 * 
 * @Description: 二分查找测试
 * @author Yeyh
 * @date 2017年7月21日
 */
public class DichotomyTest {

	public static void main(String[] args) {
		int[] arr = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 15, 48, 100, 200 };

		int findNumber = 50;

		System.out.println(Dichotomy.findNumberByDichotomy(0, arr.length - 1, arr, findNumber));
		//System.out.println(Dichotomy.findNumberByDichotomy(arr, 200));
	}

}
