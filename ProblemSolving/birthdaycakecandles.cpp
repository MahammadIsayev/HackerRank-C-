#include <bits/stdc++.h>
#include <iostream>
#include <stdlib.h>

using namespace std;

int main()
{
    int N;
    cin >> N;
    int arr[N];
    for (int i = 0; i < N; i++)
    {
        cin >> arr[i];
    }
    int cnt = 0;
    int max = arr[0];
    for (int i = 0; i < N; i++)
    {
        if (arr[i] > max)
        {
            max = arr[i];
            cnt = 1;
        }
        else if (max == arr[i])
        {
            cnt++;
        }
    }
    cout << cnt << endl;
    return 0;
}