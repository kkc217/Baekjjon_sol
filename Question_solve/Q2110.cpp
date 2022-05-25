#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

int main() {
	int n, c;
	cin >> n >> c;

	vector<long> houses(n);
	for (int i = 0; i < n; i++) {
		cin >> houses[i];
	}

	sort(houses.begin(), houses.end());

	long disRight = houses.back() - houses.front();
	long disLeft = 1;
	long disMiddle = (disRight + disLeft) / 2;

	long result = 1;
	while (disRight >= disLeft) {
		int houseCnt = 1;
		int idx = 0;
		for (int i = 1; i < n; i++) {
			if (houses[i] - houses[idx] >= disMiddle) {
				houseCnt++;
				idx = i;
			}
		}

		if (houseCnt >= c) {
			result = max(result, disMiddle);
			disLeft = disMiddle + 1;
		}
		else if (houseCnt < c) {
			disRight = disMiddle - 1;
		}
		disMiddle = (disRight + disLeft) / 2;
	}

	cout << result;
}