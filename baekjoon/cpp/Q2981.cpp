#include <iostream>

using namespace std;

int main()
{
	ios::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);

	int N;
	int* input;
	int tmp;

	cin >> N;
	input = new int[N];

	cin >> input[0];
	for (int i = 1; i < N; i++)
	{
		cin >> input[i];
	}

	for (int i = 2; i < input[0]; i++)
	{
		tmp = input[0] % i;
		int j = 1;
		for (; j < N; j++)
		{
			if (input[j] % i != tmp)
			{
				break;
			}
		}
		if (j == N)
		{
			cout << i << ' ';
		}
	}
}