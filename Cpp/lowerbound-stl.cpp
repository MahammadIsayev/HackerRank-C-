#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;

int main()
{
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */
    int N, Q;
    cin >> N;
    int arr[N];
    for (int i = 0; i < N; i++)
    {
        cin >> arr[i];
    }
    cin >> Q;
    int arr1[];
    for (int i = 0; i < Q; i++)
    {
        cin >> arr1[i];
    }
    for (int i = 0; i < N; i++)
    {
        for (int j = 0; j < Q; i++)
        {
            if (arr[i] == arr1[j])
            {
            }
        }
    }

    return 0;
}