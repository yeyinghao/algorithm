package com.algorithm.dichotomy;

/**
 * 
 * ClassName: Dichotomy
 * 
 * @Description: 二分法
 * @author Yeyh
 * @date 2017年7月21日
 */
public class Dichotomy {

	/**
	 * 
	 * @Description: 二分法查找递归
	 * @param start
	 *            起始下标
	 * @param begin
	 *            终点下标
	 * @param arr
	 *            数组
	 * @param findNumber
	 *            要查找的数
	 * @return int 找的下标,如果为-1,则该数组不存在要找的值
	 * @author Yeyh
	 * @date 2017年7月21日
	 */
	public static int findNumberByDichotomy(int begin, int end, int[] arr, int findNumber) {// 递归实现

		int mid = (begin + end) / 2;// 拿到中点下标
		if (findNumber < arr[begin] || findNumber > arr[end] || arr[begin] > arr[end]) {
			return -1;
		}
		if (arr[mid] < findNumber) {
			return findNumberByDichotomy(mid + 1, end, arr, findNumber);
		}
		if (arr[mid] > findNumber) {
			return findNumberByDichotomy(begin, mid - 1, arr, findNumber);
		}
		return mid;
	}

	/**
	 * 
	 * @Description: 二分法查找非递归
	 * @param arr
	 *            数组
	 * @param findNumber
	 *            要查找的数
	 * @return int 找的下标,如果为-1,则该数组不存在要找的值
	 * @author Yeyh
	 * @date 2017年7月21日
	 */
	public static int findNumberByDichotomy(int[] arr, int findNumber) {// 非递归
		int low = 0;
		int high = arr.length - 1;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (arr[mid] == findNumber)
				return mid;
			if (arr[mid] < findNumber) {
				low = mid + 1;
			} else if (arr[mid] > findNumber) {
				high = mid - 1;
			}
		}
		return -1;
	}
}
