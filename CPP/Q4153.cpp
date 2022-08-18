#include <iostream>
#include <vector>

using namespace std;

int main()
{
	int a, b, c;
	int count = 0;
	vector<int> result;

	cin >> a >> b >> c;
	while (a != 0)
	{
		if (a > b && a > c)
		{
			result.push_back(a * a - b * b - c * c);
		}
		else if (b > a&& b > c)
		{
			result.push_back(b * b - a * a - c * c);
		}
		else
		{
			result.push_back(c * c - b * b - a * a);
		}
		cin >> a >> b >> c;
		count++;
	}

	for (int i = 0; i < count; i++)
	{
		if (result.front() == 0)
		{
			cout << "right" << "\n";
		}
		else
		{
			cout << "wrong" << "\n";
		}
		result.erase(result.begin());
	}
}