#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;
int main()
{
    int N;
    cin >> N;
    unsigned long long int sum = 0, a;
    for (int i = 0; i < N; i++)
    {
        cin >> a;
        sum += a;
    }
    cout << sum << endl;
    return 0;
}