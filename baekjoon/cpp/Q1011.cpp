#include <iostream>
#include <cmath>

int main()
{
	int T, x, y, distance, tmp;
	int* result;

	std::cin >> T;
	result = new int[T];
	for (int i = 0; i < T; i++)
	{
		std::cin >> x >> y;
		distance = y - x;
		tmp = sqrt(distance);
		if (tmp * tmp == distance)
		{
			result[i] = 2 * tmp - 1;
			continue;
		}

		if ((distance - (tmp * tmp)) < ((tmp + 1) * (tmp + 1) - distance))
		{
			result[i] = 2 * tmp;
		}
		else
		{
			result[i] = 2 * tmp + 1;
		}
	}

	for (int i = 0; i < T; i++)
	{
		std::cout << result[i] << "\n";
	}
}