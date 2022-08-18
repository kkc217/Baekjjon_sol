#include <iostream>
#include <string>

int main()
{
	int* list;
	int top = 0;
	int k, tmp;
	int result = 0;
	std::cin >> k;
	list = new int[k];

	for (int i = 0; i < k; i++)
	{
		std::cin >> tmp;
		if (tmp == 0)
		{
			top--;
		}
		else
		{
			list[top] = tmp;
			top++;
		}
	}

	for (int i = 0; i < top; i++)
	{
		result += list[i];
	}
	std::cout << result;
}