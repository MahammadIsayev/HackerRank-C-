#include <iostream>
#include <cstdio>
using namespace std;

int main()
{
    // Complete the code.
    int a, b;
    string arr[9] = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
    cin >> a >> b;
    for (int i = a; i <= b; i++)
    {
        if (i >= 1 && i <= 9)
            cout << arr[i - 1] << endl;
        else if (i > 9 && i % 2 == 0)
            cout << "even" << endl;
        else if (i > 9 && i % 2 == 1)
            cout << "odd" << endl;
    }
    return 0;
}