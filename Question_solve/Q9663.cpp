#include <iostream>

void check(int n, int cur, int** m);
int count;

int main()
{
	std::ios::sync_with_stdio(false);
	std::cin.tie(NULL);
	std::cout.tie(NULL);

	int N;
	count = 0;

	std::cin >> N;

	int** matrix = new int*[N];
	for (int i = 0; i < N; i++)
	{
		matrix[i] = new int[N];
		std::fill_n(matrix[i], N, 0);
	}

	int c = 0;
	check(N, c, matrix);

	std::cout << count;
}

void check(int n, int cur, int** m)
{
	for (int i = 0; i < n; i++)
	{
		if (m[0][i] == 0)
		{
			int** tmp = new int*[n - cur - 1];
			for (int j = 0; j < n - cur - 1; j++)
			{
				tmp[j] = new int[n];
				for (int k = 0; k < n; k++)
				{
					tmp[j][k] = m[j + 1][k];
				}
			}
			for (int j = 0; j < n - cur - 1; j++)
			{
				tmp[j][i] = 1;
				if (i - j - 1 >= 0)
				{
					tmp[j][i - j - 1] = 1;
				}
				if (i + j + 1 < n)
				{
					tmp[j][i + j + 1] = 1;
				}
			}
			if (cur + 1 == n)
			{
				count++;
				return;
			}
			check(n, cur + 1, tmp);
			for (int j = 0; j < n - cur - 1; j++)
			{
				delete[] tmp[j];
			}
			delete[] tmp;
		}
	}
}
