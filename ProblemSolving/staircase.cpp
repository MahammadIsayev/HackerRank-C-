#include <iostream>
#include <stdlib.h>
#include <bits/stdc++.h>

using namespace std;

int main()
{
    int N;
    cin >> N;
    for (int i = N; i > 0; i--)
    {
        for (int j = 0; j < i - 1; j++)
        {
            cout << " ";
        }
        for (int k = i - 1; k < N; k++)
        {
            cout << "#";
        }
      cout << endl;  
    }
    
    return 0;
}