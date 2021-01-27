#include <sstream>
#include <vector>
#include <iostream>
using namespace std;

vector<int> parseInts(string str)
{
    // Complete this function
    stringstream sso(str);
    vector<int> v;
    int sys;
    char ch;
    while (sso >> sys)
    {
        v.push_back(sys);
        sso >> ch;
    }
    return v;
}

int main()
{
    string str;
    cin >> str;
    vector<int> integers = parseInts(str);
    for (int i = 0; i < integers.size(); i++)
    {
        cout << integers[i] << "\n";
    }

    return 0;
}