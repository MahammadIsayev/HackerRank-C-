#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <set>
#include <algorithm>
using namespace std;

int main()
{
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */
    set<int> s;
    int N;
    cin >> N;
    for (int i = 0; i < N; i++)
    {
        int y;
        int x;
        cin >> y;
        if (y == 1)
        {
            cin >> x;
            s.insert(x);
        }
        else if (y == 2)
        {
            cin >> x;
            s.erase(x);
        }
        else
        {
            cin >> x;
            set<int>::iterator itr = s.find(x);
            if (itr == s.end())
            {
                cout << "No" << endl;
            }
            else
            {
                cout << "Yes" << endl;
            }
        }
    }

    return 0;
}
