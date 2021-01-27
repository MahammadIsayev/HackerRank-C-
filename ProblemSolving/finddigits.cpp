#include <iostream>
#include <stdlib.h>
#include <bits/stdc++.h>

using namespace std;

int main()
{
    int T;
    cin >> T;
    for (int i = 0; i < T; i++)
    {
        int a, b;
        int dcnt = 0;
        cin >> a;
        b = a;
        while (b > 0)
        {
            int cd = b % 10;
            b /= 10;
            if (cd != 0 && a % cd == 0)
            {
                dcnt++;
            }
        }
        cout << dcnt << endl;
    }

    return 0;
}