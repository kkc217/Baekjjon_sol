#include <iostream>
#include <string>

int main()
{
	std::string* result;
	int n;
	int* input;
	int* stackList;
	int top = -1;
	int count = 1;
	int k = 0;
	int j = 0;
	std::cin >> n;
	input = new int[n];
	stackList = new int[n];
	result = new std::string[n * 2];
	for (int i = 0; i < n; i++)
	{
		std::cin >> input[i];
	}

	while (true)
	{	
		while (count <= input[k])
		{
			top++;
			stackList[top] = count;
			count++;
			result[j] = "+";
			j++;
		}

		if (stackList[top] == input[k])
		{
			top--;
			k++;
			result[j] = "-";
			j++;
		}
		else if (stackList[top] > input[k])
		{
			break;
		}

		if ((top < 0) && (count > n))
		{
			break;
		}
	}
	if ((top < 0) && (count > n))
	{
		for (int i = 0; i < j; i++)
		{
			std::cout << result[i] << "\n";
		}
	}
	else
	{
		std::cout << "NO";
	}
}