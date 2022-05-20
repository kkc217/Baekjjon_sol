#include <iostream>
#include <string>
#include <vector>

int main()
{
	std::vector<int> result;
	std::string A;
	std::string B;
	int maxlen;
	int Anum, Bnum;
	int dummy = 0;
	int tmp, i;
	std::cin >> A >> B;

	Anum = A.size();
	Bnum = B.size();
	if (Anum > Bnum)
	{
		maxlen = Anum;
	}
	else
	{
		maxlen = Bnum;
	}
	while ((Anum > 0) || (Bnum > 0))
	{
		tmp = 0;
		Anum--;
		Bnum--;
		if (Anum >= 0)
		{
			tmp += A[Anum] - '0';
		}
		if (Bnum >= 0)
		{
			tmp += B[Bnum] - '0';
		}
		tmp += dummy;
		if (tmp >= 10)
		{
			dummy = 1;
			result.push_back(tmp - 10);
		}
		else
		{
			dummy = 0;
			result.push_back(tmp);
		}
	}

	if (dummy == 1)
	{
		result.push_back(dummy);
		i = 0;
	}
	else
	{
		i = 1;
	}

	for (; i < maxlen + 1; i++)
	{
		std::cout << result.back();
		result.pop_back();
	}
}