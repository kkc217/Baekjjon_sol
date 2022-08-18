#include <iostream>
#include <string>

int* que;
int que_front = 0;
int que_back = 0;

void push(int x)
{
	que[que_back] = x;
	que_back++;
}

void pop()
{
	if (que_front == que_back)
	{
		std::cout << -1 << "\n";
	}
	else
	{
		std::cout << que[que_front] << "\n";
		que_front++;
	}
}

void size()
{
	std::cout << que_back - que_front << "\n";
}

void empty()
{
	if (que_front == que_back)
		std::cout << 1 << "\n";
	else
		std::cout << 0 << "\n";
}

void front()
{
	if (que_front == que_back)
		std::cout << -1 << "\n";
	else
		std::cout << que[que_front] << "\n";
}

void back()
{
	if (que_front == que_back)
		std::cout << -1 << "\n";
	else
		std::cout << que[que_back - 1] << "\n";
}

int main()
{
	std::ios_base::sync_with_stdio(false);
	std::cin.tie(NULL);
	std::cout.tie(NULL);

	int N, tmp;
	std::string input;
	
	std::cin >> N;
	que = new int[N];

	for (int i = 0; i < N; i++)
	{
		std::cin >> input;
		if (input == "push")
		{
			std::cin >> tmp;
			push(tmp);
		}
		else if (input == "pop")
			pop();
		else if (input == "size")
			size();
		else if (input == "empty")
			empty();
		else if (input == "front")
			front();
		else
			back();
	}
}