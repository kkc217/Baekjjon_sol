#include <iostream>

int main()
{
	int N;
	int divisor = 2;
	std::cin >> N;
	while (N >= divisor)
	{
		if (N % divisor == 0)
		{
			std::cout << divisor << "\n";
			N /= divisor;
		}
		else
		{
			divisor++;
		}
	}
}