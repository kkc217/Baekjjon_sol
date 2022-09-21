#include <iostream>
#include <vector>

using namespace std;

int main()
{
	vector<int> input;
	int n;
	int input_size = 0;
	int max = 0;
	int* primes;

	cin >> n;
	while (n != 0)
	{
		if (n > max)
		{
			max = n;
		}
		input.push_back(n);
		input_size++;
		cin >> n;
	}

	max = 2 * max + 1;
	primes = new int[max];
	fill_n(primes, max, 0);
	for (int i = 2; i < max; i++)
	{
		if (primes[i] == 0)
		{
			for (int j = 2; i * j < max; j++)
			{
				primes[i * j] = 1;
			}
		}
	}

	for (int i = 0; i < input_size; i++)
	{
		int tmp = input.front();
		input.erase(input.begin());
		int count = 0;
		for (int j = tmp + 1; j <= 2 * tmp; j++)
		{
			if (primes[j] == 0)
			{
				count++;
			}
		}
		cout << count << "\n";
	}
}