#include <iostream>
using namespace std;

constexpr int square(int n)
{
    // cout << "Hello" << n << endl; // NOT OK
    return n * n;
}

int main()
{
    int sq = square(5);
    cout << "Square of 5 = " << sq << endl;
    return 0;
}