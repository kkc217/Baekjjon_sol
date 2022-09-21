#include <iostream>

using namespace std;

int main()
{
	int N;
	int* cards;

	cin >> N;
	cards = new int[2 * N];
	int front = 0;
	int back = N - 1;

	for (int i = 0; i < N; i++)
	{
		cards[i] = i + 1;
	}

	while (front < back)
	{
		front++;
		back++;
		cards[back] = cards[front];
		front++;
	}
	cout << cards[front];
}