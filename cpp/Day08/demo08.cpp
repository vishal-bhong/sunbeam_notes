#include <iostream>
#include <iomanip>
using namespace std;

int main2()
{
    double num = 123.4567;
    cout << setw(10) << "Hello" << endl;
    cout << setw(10) << left << setfill('@') << "Hello" << endl;
    cout << fixed << setprecision(2) << num << endl;
    return 0;
}
//      Hello
// Hello@@@@@
// 123.46

int main1()
{
    cout << setw(10) << "Hello" << endl;
    cout << setw(10) << setfill('$') << "Hello" << endl;
    cout << setw(16) << setfill('X') << "2345" << endl;

    return 0;
}
//      Hello
// $$$$$Hello
// XXXXXXXXXXXX2345

int main()
{
    cout << "Hello" << endl;
    cout << "World" << endl;
    int num = 10;

    cout << hex << num << endl;
    cout << oct << num << endl;
    return 0;
}
// Hello
// World
// a
// 12