#include <iostream>
#include <string>

int list[10000];
int top = 0;

void stackPush(int n);
void stackPop();
void stackSize();
void stackEmpty();
void stackTop();

int main()
{
	int N;
	std::cin >> N;
	std::string* inputWord = new std::string[N];
	int* input = new int[N];
	for (int i = 0; i < N; i++)
	{
		std::cin >> inputWord[i];
		if (inputWord[i] == "push")
		{
			std::cin >> input[i];
		}
	}
	
	for (int i = 0; i < N; i++)
	{
		if (inputWord[i] == "push")
		{
			stackPush(input[i]);
		}
		else if (inputWord[i] == "pop")
		{
			stackPop();
		}
		else if (inputWord[i] == "size")
		{
			stackSize();
		}
		else if (inputWord[i] == "empty")
		{
			stackEmpty();
		}
		else
		{
			stackTop();
		}
	}
}

void stackPush(int n)
{
	list[top] = n;
	top++;
}

void stackPop()
{
	if (top != 0)
	{
		top--;
		std::cout << list[top] << "\n";
	}
	else
	{
		
		std::cout << -1 << "\n";
	}
}

void stackSize()
{
	std::cout << top << "\n";
}

void stackEmpty()
{
	if (top == 0)
	{
		std::cout << 1 << "\n";
	}
	else
	{
		std::cout << 0 << "\n";
	}
}

void stackTop()
{
	if (top != 0)
	{
		std::cout << list[top - 1] << "\n";
	}
	else
	{
		std::cout << -1 << "\n";
	}
}