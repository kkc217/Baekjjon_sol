#include <iostream>
#include <string>

int main()
{
	int k, count;
	std::string tmp;
	std::string* result;
	std::cin >> k;
	result = new std::string[k];
	for (int i = 0; i < k; i++)
	{
		std::cin >> tmp;

		count = 0;
		for (int j = 0; j < tmp.size(); j++)
		{
			if (tmp[j] == '(')
			{
				count++;
			}
			else
			{
				count--;
			}

			if (count < 0)
			{
				break;
			}
		}
		if (count != 0)
		{
			result[i] = "NO";
		}
		else
		{
			result[i] = "YES";
		}
	}

	for (int i = 0; i < k; i++)
	{
		std::cout << result[i] << "\n";
	}
}