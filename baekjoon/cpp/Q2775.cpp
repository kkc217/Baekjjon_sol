#include <iostream>

int main()
{
	int T, k, n, tmp;
	int* result;
	int** resident;
	std::cin >> T;
	result = new int[T];
	for (int m = 0; m < T; m++)
	{
		std::cin >> k;
		std::cin >> n;
		resident = new int* [k + 1];
		for (int i = 0; i <= k; i++)
		{
			resident[i] = new int[n];
		}
		n--;
		for (int i = 0; i < n + 1; i++)
		{
			resident[0][i] = i + 1;
		}
		for (int i = 1; i <= k; i++)
		{
			for (int j = 0; j <= n; j++)
			{
				tmp = 0;
				for (int n = 0; n <= j; n++)
				{
					tmp += resident[i - 1][n];
				}
				resident[i][j] = tmp;
			}
		}
		result[m] = resident[k][n];
		delete[] resident;
	}
	
	for (int i = 0; i < T; i++)
	{
		std::cout << result[i] << "\n";
	}
}