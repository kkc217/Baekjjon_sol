#include <iostream>

using namespace std;

void fibonacci(int n);
int zero, one;

int main()
{
    ios::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);

    int T, N;
    std::cin >> T;
    for (int i = 0; i < T; i++)
    {
        zero = 0;
        one = 0;
        cin >> N;
        fibonacci(N);
        cout << zero << ' ' << one << "\n";
    }
}

void fibonacci(int n)
{
    if (n == 0)
    {
        zero++;
    }
    else if (n == 1)
    {
        one++;
    }
    else if (n == 2)
    {
        zero++;
        one += 1;
    }
    else
    {
        fibonacci(n - 1);
        fibonacci(n - 2);
    }
}