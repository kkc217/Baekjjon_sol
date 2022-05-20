#include <iostream>

using namespace std;

int main()
{
	int T;
	int min, max, tmp;

	cin >> T;
	cin >> tmp;
	min = tmp;
	max = tmp;
	for (int i = 0; i < T - 1; i++)
	{
		cin >> tmp;
		if (min > tmp)
		{
			min = tmp;
		}
		if (max < tmp)
		{
			max = tmp;
		}
	}

	cout << min * max;
}