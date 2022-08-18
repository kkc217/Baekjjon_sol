#include <iostream>

using namespace std;

int main()
{
	int T, a, b;

	cin >> T;

	for (int i = 0; i < T; i++)
	{
		cin >> a >> b;
		int count = 2;
		int min = 1;

		while ((a != 1) || (b != 1))
		{
			while ((a % count == 0) || (b % count == 0))
			{
				if ((a % count == 0) && (b % count == 0))
				{
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
		cout << min << "\n";
	}
}