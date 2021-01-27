#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <set>
#include <map>
#include <algorithm>
using namespace std;

int main()
{
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */
    map<string, int> m;
    int N;
    cin >> N;
    for (int i = 0; i < N; i++)
    {
        int q;
        cin >> q;
        string X;
        int Y;
        if (q == 1)
        {
            cin >> X;
            cin >> Y;
            m[X] = m[X] + Y;
        }
        else if (q == 2)
        {
            cin >> X;
            m.erase(X);
        }
        else
        {
            cin >> X;
            map<string, int>::iterator itr = m.find(X);
            if (itr == m.end())
            {
                cout << 0 << endl;
            }
            else
            {
                cout << m[X] << endl;
            }
        }
    }

    return 0;
}