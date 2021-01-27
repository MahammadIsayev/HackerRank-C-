#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   
    vector<int> myVec;
    int N,a,b,x;
    cin >> N;
    for (int i = 0; i < N; i++)
    {
        int c;
        cin >> c;
        myVec.push_back(c);
        }
    cin >> x;
    cin >> a >> b;
    myVec.erase(myVec.begin() + x);
    myVec.erase(myVec.begin() + a-1,myVec.begin() + b-1);
    cout << myVec.size() << endl;
    for (int i = 0; i < myVec.size(); i++)
    {
        cout << myVec[i] << " ";
    }
    
    return 0;
}
