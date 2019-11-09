package com.algorithm.dichotomy;

import java.math.BigDecimal;
import java.util.Scanner;

/**
 * 回型矩阵
 */
public class ReturnMatrix {

	//方向
	public enum Direction {
		Left, Right, Up, Down
	}

	private static int n;

	private static int value = 1;

	private int[][] arr = new int[n][n];

	private Direction lastDirection = Direction.Right;

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("请输入回型矩阵边长: ");
			String text = sc.nextLine();
			text = new BigDecimal(text).toString();
			n = Integer.parseInt(text);
			new ReturnMatrix().initMatrix();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void initMatrix() {
		int row = 0;
		int col = 0;
		for (int i = 0; i < n * n; i++) {
			//赋值
			arr[row][col] = value;
			//根据所在的行列,判断下一步的走向
			Direction nowDirection = getDirection(row, col);
			switch (nowDirection) {
				case Left:
					col--;
					break;
				case Right:
					col++;
					break;
				case Up:
					row--;
					break;
				case Down:
					row++;
					break;
			}
			value++;
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(String.format("%0" + (String.valueOf(n * n).length()) + "d", arr[i][j]) + " ");
			}
			System.out.println();
		}
	}

	private Direction getDirection(int row, int col) {
		switch (lastDirection) {
			case Left:
				if (col == (n - 1 - row))
					lastDirection = Direction.Up;
				break;
			case Right:
				if (col == (n - 1 - row))
					lastDirection = Direction.Down;
				break;
			case Up:
				if (row == (col + 1)) {
					lastDirection = Direction.Right;
				}
				break;
			case Down:
				if (row == col)
					lastDirection = Direction.Left;
				break;
		}
		return lastDirection;
	}


}
