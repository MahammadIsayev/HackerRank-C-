#include <iostream>
#include <stdlib.h>
#include <bits/stdc++.h>

using namespace std;

int main()
{
    int a[3];
    for (int i = 0; i < 3; i++)
    {
        cin >> a[i];
    }

    int b[3];
    for (int i = 0; i < 3; i++)
    {
        cin >> b[i];
    }
    int apts = 0;
    int bpts = 0;
    for (int i = 0; i < 3; i++)
    {
        
        if (a[i] > b[i])
        {
            apts++;
        }
        if (a[i] < b[i])
        {
            bpts++;
        }
        if(a[i] == b[i]) {};
    }
    cout << apts << " " << bpts << endl;
    return 0;
}