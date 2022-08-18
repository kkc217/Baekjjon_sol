//Q2447 º° Âï±â - 10
#include <iostream>

char result[10000][10000];
void drawStars(int level);

int main()
{
	int N;
	int count = 3;
	result[0][0] = '*';

	std::cin >> N;
	while (count <= N)
	{
		drawStars(count);
		count *= 3;
	}
	for (int i = 0; i < N; i++)
	{
		for (int j = 0; j < N; j++)
		{
			if (result[i][j] == '*')
			{
				std::cout << '*';
			}
			else
			{
				std::cout << ' ';
			}
		}
		if (i == (N - 1))
		{
			break;
		}
		std::cout << std::endl;
	}
}

void drawStars(int level)
{
	for (int i = 0; i < level; i++)
	{
		for (int j = 0; j < level; j++)
		{
			if ((i / (level / 3)) == 1 && (j / (level / 3)) == 1)
			{
				continue;
			}
			result[i][j] = result[i % (level / 3)][j % (level / 3)];
		}
	}
}