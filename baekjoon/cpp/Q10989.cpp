#include <iostream>

using namespace std;

int main()
{
	ios::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);

	int N, tmp;
	cin >> N;

	int count[10001] = {0};
	
	for (int i = 0; i < N; i++)
	{
		cin >> tmp;
		count[tmp]++;
	}

	for (int i = 1; i <= 10000; i++)
	{
		for (int j = 0; j < count[i]; j++)
		{
			cout << i << "\n";
		}
	}
}