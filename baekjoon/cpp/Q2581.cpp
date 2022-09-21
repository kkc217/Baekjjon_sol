#include <iostream>

int main()
{
	int M, N, min, j;
	int total = 0;
	std::cin >> M;
	std::cin >> N;
	for (int i = N; i >= M; i--)
	{
		for (j = 2; j < i; j++)
		{
			if (i % j == 0)
			{
				break;
			}
		}
		if (j == i)
		{
			min = i;
			total += i;
		}
	}
	if (total == 0)
	{
		std::cout << -1;
	}
	else
	{
		std::cout << total << "\n" << min;
	}
}