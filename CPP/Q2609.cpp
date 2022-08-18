#include <iostream>

using namespace std;

int main()
{
	int a, b;
	int max = 1;
	int min = 1;
	int count = 2;
	
	cin >> a >> b;
	
	while ((a != 1) || (b != 1))
	{
		while ((a % count == 0) || (b % count == 0))
		{
			if ((a % count == 0) && (b % count == 0))
			{
				max *= count;
				min *= count;
				a /= count;
				b /= count;
			}
			else if (a % count == 0)
			{
				min *= count;
				a /= count;
			}
			else if (b % count == 0)
			{
				min *= count;
				b /= count;
			}
		}
		count++;
	}

	cout << max << "\n" << min;
}