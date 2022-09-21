#include <iostream>

int main()
{
	int N;
	int* result;
	int* input;
	int* indList;
	std::cin >> N;
	result = new int[N];
	input = new int[N];
	indList = new int[N];

	int top = 0;
	std::cin >> input[0];
	indList[top] = 0;
	top++;
	for (int i = 1; i < N; i++)
	{
		std::cin >> input[i];
		if ()
	}
}

//int main()
//{
//	int N;
//	int* input;
//	int* result;
//	std::cin >> N;
//	input = new int[N];
//	result = new int[N];
//	for (int i = 0; i < N; i++)
//	{
//		std::cin >> input[i];
//	}
//
//	for (int i = 0; i < N; i++)
//	{
//		result[i] = -1;
//		for (int j = i + 1; j < N; j++)
//		{
//			if (input[j] > input[i])
//			{
//				result[i] = input[j];
//				break;
//			}
//		 }
//	}
//
//	for (int i = 0; i < N; i++)
//	{
//		std::cout << result[i] << " ";
//	}
//}