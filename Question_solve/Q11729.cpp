#include <iostream>
#include <cmath>

using namespace std;

void P(int one, int two, int three, int n);

int main()
{
	int N;

	cin >> N;
	cout << (int)pow(2, N) - 1 << "\n";
	P(1, 2, 3, N);
}

void P(int one, int two, int three, int n)
{
	if (n == 1)
	{
		cout << one << ' ' << three << "\n";
	}
	else
	{
		P(one, three, two, n - 1);
		cout << one << ' ' << three << "\n";
		P(two, one, three, n - 1);
	}
}