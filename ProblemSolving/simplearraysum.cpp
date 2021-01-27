#include <bits/stdc++.h>
#include <iostream>
#include <stdlib.h>

using namespace std;

int main()
{
    int N;
    cin >> N;
    int arr[N];
    int sum = 0;
    for (int i = 0; i < N; i++)
    {
        cin >> arr[i];
        sum += arr[i];
    }

    cout << sum << endl;
    return 0;
}