#include <iostream>
using namespace std;

void division()
{
    int numerator;
    int denominator;
    cout << "Enter numerator = ";
    cin >> numerator;
    cout << "Enter denominator = ";
    cin >> denominator;
    if (denominator == 0)
        throw 2;
    cout << "Division = " << numerator / denominator << endl;
}

int main()
{
    try
    {
        division();
    }
    catch (int error)           // error = 2 ( if denominator = 0)
    {
        cout << "Division is not possible ... " << endl;
    }
    return 0;
}