#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

int main()
{
	ios_base::sync_with_stdio(false);
	cin.tie(NULL);
	cout.tie(NULL);

	int N;
	cin >> N;
	vector<int> input(N);

	for (int i = 0; i < N; i++)
	{
		cin >> input[i];
	}
	vector<int> check(input);
	sort(check.begin(), check.end());
	check.erase(unique(check.begin(), check.end()), check.end());

	for (int i = 0; i < N; i++)
	{
		auto tmp = lower_bound(check.begin(), check.end(), input[i]);

		cout << tmp - check.begin() << ' ';
	}
}