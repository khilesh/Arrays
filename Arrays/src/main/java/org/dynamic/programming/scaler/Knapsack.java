package org.dynamic.programming.scaler;

public class Knapsack {


static void solutionknapSack(int W, int wt[], int val[], int n) {
	int i, w;
	int M[][] = new int[n + 1][W + 1];
	
	// Build table M[][]
	for (i = 0; i <= n; i++) {
		for (w = 0; w <= W; w++) {
			if (i == 0 || w == 0)
				M[i][w] = 0;
			else if (wt[i - 1] <= w)
				M[i][w] = Math.max(val[i - 1] + M[i - 1][w - wt[i - 1]], M[i - 1][w]);
			else
				M[i][w] = M[i - 1][w];
		}
	}
	System.out.println("Maximum Value:\t" + M[n][W]);
	
	System.out.println("Selected Packs: ");
	
	while (n != 0) {
		if (M[n][W] != M[n - 1][W]) {
			System.out.println("Pack " + n + " with weight = " + wt[n - 1] + " and value = " + val[n - 1]);
			
			W = W - wt[n - 1];
		}
		n--;
	}
}


public static void main(String args[]) {
	//int value[] = new int[] { 2, 6, 4, 3 };
	//int weight[] = new int[] { 3, 4, 5, 6 };
	
	int value[]  = new int[] { 1, 8, 18, 22, 28 };
	int weight[] = new int[] { 1, 3, 5, 6, 7 };
	int W = 10;
	int n = value.length;
	solutionknapSack(W, weight, value, n);
}

}
