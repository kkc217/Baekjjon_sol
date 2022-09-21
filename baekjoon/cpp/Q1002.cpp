#include <iostream>
#include <cmath>

using namespace std;

int main()
{
	int T;
	int x1, y1, r1, x2, y2, r2;
	float distance;

	cin >> T;

	for (int i = 0; i < T; i++)
	{
		cin >> x1 >> y1 >> r1 >> x2 >> y2 >> r2;
		distance = sqrt(pow(x1 - x2, 2) + pow(y1 - y2, 2));

		if (r1 < r2)
		{
			swap(r1, r2);
		}

		if (distance == 0)
		{
			if (r1 == r2)
			{
				cout << -1 << "\n";
			}
			else
			{
				cout << 0 << "\n";
			}
		}
		else if (distance < r1 - r2)
		{
			cout << 0 << "\n";
		}
		else if (distance == r1 - r2)
		{
			cout << 1 << "\n";
		}
		else if (distance > r1 - r2 && distance < r1 + r2)
		{
			cout << 2 << "\n";
		}
		else if (distance == r1 + r2)
		{
			cout << 1 << "\n";
		}
		else
		{
			cout << 0 << "\n";
		}
	}
}