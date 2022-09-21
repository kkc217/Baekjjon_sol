#include <iostream>
#include <vector>

using namespace std;

int main()
{
	int T;
	int tmp;
	int primes[10000];
	int prime[5000];
	int p = 0;
	int* input;
	int result[2];

	fill_n(primes, 10000, 0);
	primes[0] = 1;
	primes[1] = 1;
	for (int i = 2; i < 10000; i++)
	{
		if (primes[i] == 0)
		{
			prime[p] = i;
			p++;
			for (int j = 2; i * j < 10000; j++)
			{
				primes[i * j] = 1;
			}
		}
	}

	cin >> T;
	input = new int[T];
	for (int i = 0; i < T; i++)
	{
		cin >> input[i];
	}

	for (int i = 0; i < T; i++)
	{
		for (int j = 0; prime[j] <= input[i] / 2; j++)
		{
			for (int k = j; prime[k] < input[i]; k++)
			{
				if (prime[j] + prime[k] == input[i])
				{
					result[0] = prime[j];
					result[1] = prime[k];
				}
			}
		}
		cout << result[0] << ' ' << result[1] << "\n";
	}
}