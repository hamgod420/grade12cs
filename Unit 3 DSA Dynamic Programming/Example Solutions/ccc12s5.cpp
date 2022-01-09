#include <bits/stdc++.h>

using namespace std;

int dp[26][26];//dp matrix
int r, c, k;
//r : rows
//c : columns
//k : num of cats
int main() {
	cin >> r >> c;
	memset(dp, 0, 26);
	cin >> k;
	for (int i = 0; i < k; i++) {
		int x, y;
		cin >> x >> y;
		dp[x][y] = -1;//marks cat
	}
	dp[1][1] = 1;//starting path
	for (int i = 1; i <= r; i++) {
		for (int j = 1; j <= c; j++) {
			if (dp[i][j] == -1) {//if iterlating on cat 
				dp[i][j] = 0;//after iterlating over cat, there will be no paths to that point
				continue;
			}
			
			dp[i][j] += dp[i - 1][j] + dp[i][j - 1];//counting amount of paths to point (i,j)
		}
	}
	cout << dp[r][c] << "\n";//number of paths to point (r,c)
}
/*
dp states: dp[i][j] = the number of paths to coordinate (i,j)
base case: dp[1][1] = 1
recurrence: dp[i][j] += dp[i - 1][j] + dp[i][j - 1];
*/
