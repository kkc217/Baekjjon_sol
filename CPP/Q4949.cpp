#include <iostream>
#include <string>

int main()
{
	std::string tmp;
	std::string result[10000];
	int list[10000];
	int top;
	int i = 0;
	while (true)
	{
		std::getline(std::cin, tmp);
		if (tmp == ".")
		{
			break;
		}

		top = 0;
		for (int j = 0; j < tmp.size(); j++)
		{
			if (tmp[j] == '(')
			{
				top++;
				list[top] = 1;
			}
			else if (tmp[j] == ')')
			{
				if (list[top] == 2)
				{
					break;
				}
				else
				{
					top--;
				}
			}
			else if (tmp[j] == '[')
			{
				top++;
				list[top] = 2;
			}
			else if (tmp[j] == ']')
			{
				if (list[top] == 1)
				{
					break;
				}
				else
				{
					top--;
				}
			}

			if ((top < 0))
			{
				break;
			}
		}
		if (top == 0)
		{
			result[i] = "yes";
		}
		else
		{
			result[i] = "no";
		}
		i++;
	}

	for (int j = 0; j < i; j++)
	{
		std::cout << result[j] << "\n";
	}
}