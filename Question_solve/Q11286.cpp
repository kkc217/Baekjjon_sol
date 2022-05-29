#include <iostream>
#include <queue>

using namespace std;

int main() {
	ios_base::sync_with_stdio(0);
	cin.tie(0);
	cout.tie(0);

	int n;
	priority_queue<long, vector<long>, greater<long>> pqPlus;
	priority_queue<long> pqMinus;
	cin >> n;

	for (int i = 0; i < n; i++) {
		long input;
		cin >> input;
		if (input == 0) {
			if (pqPlus.size() == 0 && pqMinus.size() == 0) {
				cout << "0\n";
			}
			else if (pqPlus.size() == 0) {
				cout << pqMinus.top() << "\n";
				pqMinus.pop();
			}
			else if (pqMinus.size() == 0) {
				cout << pqPlus.top() << "\n";
				pqPlus.pop();
			}
			else {
				long tmpPlus = pqPlus.top();
				long tmpMinus = pqMinus.top();
				if (abs(tmpMinus) <= tmpPlus) {
					cout << tmpMinus << "\n";
					pqMinus.pop();
				}
				else {
					cout << tmpPlus << "\n";
					pqPlus.pop();
				}
			}
		}
		else {
			if (input < 0)
				pqMinus.push(input);
			else
				pqPlus.push(input);
		}
	}
}