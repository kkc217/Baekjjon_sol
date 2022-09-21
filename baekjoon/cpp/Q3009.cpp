#include <iostream>

using namespace std;

int main()
{
	int x[3];
	int y[3];
	int tmp;
	int result[2];

	for (int i = 0; i < 3; i++)
	{
		cin >> x[i] >> y[i];
	}

	for (int i = 0; i < 3; i++)
	{
		for (int j = i + 1; j < 3; j++)
		{
			if (x[i] == x[j])
			{
				result[0] = 3 - i - j;
			}
			if (y[i] == y[j])
			{
				result[1] = 3 - i - j;
			}
		}
	}

	cout << x[result[0]] << ' ' << y[result[1]];
}