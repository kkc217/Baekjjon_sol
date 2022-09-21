#include <iostream>

int main()
{
	int M, N, j;
	int* check;
	std::cin >> M >> N;
	check = new int[N + 1];
	check[1] = 1;
	for (int i = 2; i < N + 1; i++)
	{
		if (check[i] == 1)
		{
			continue;
		}
		else
		{
			j = 2;
			while (i * j <= N)
			{
				check[i * j] = 1;
				j++;
			}
		}
	}

	for (int i = M; i < N + 1; i++)
	{
		if (check[i] != 1)
		{
			std::cout << i << "\n";
		}
	}
}