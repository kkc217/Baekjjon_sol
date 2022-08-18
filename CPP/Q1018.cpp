#include <iostream>
#include <string>

int main()
{
	int N, M;
	char tmp;
	int count;
	int result = 64;
	std::string* board;
	std::cin >> N >> M;
	board = new std::string[N];

	for (int i = 0; i < N; i++)
	{
		std::cin >> board[i];
		if (i % 2 == 0)
		{
			tmp = 'W';
		}
		else
		{
			tmp = 'B';
		}
		for (int j = 0; j < M; j++)
		{
			if ((j % 2 == 0) && (board[i][j] == tmp))
			{
				board[i][j] = '1';
			}
			else if ((j % 2 == 1) && (board[i][j] != tmp))
			{
				board[i][j] = '1';
			}
			else
			{
				board[i][j] = '0';
			}
		}
	}

	for (int i = 0; i < N - 7; i++)
	{ 
		for (int j = 0; j < M - 7; j++)
		{
			count = 0;
			for (int k = i; k < i + 8; k++)
			{
				for (int l = j; l < j + 8; l++)
				{
					if (board[k][l] == '1')
					{
						count++;
					}
				}
			}
			if ((64 - count) < count)
			{
				count = 64 - count;
			}
			if (result > count)
			{
				result = count;
			}
		}
	}
	std::cout << result;
}