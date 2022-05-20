#include <iostream>

int main()
{
	int N, tmp, j;
	int count = 0;
	std::cin >> N;
	for (int i = 0; i < N; i++)
	{
		std::cin >> tmp;
		for (j = 2; j < tmp; j++)
		{
			if (tmp % j == 0)
			{
				break;
			}
		}
		if (j == tmp)
		{
			count++;
		}
	}
	std::cout << count << "\n";
}