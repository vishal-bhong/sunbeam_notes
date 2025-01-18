#include <iostream>
using namespace std;

void division(int n1, int n2) noexcept
{
    if (n2 == 0)
        throw 1;
    cout << "Division =" << n1 / n2 << endl;
}

// Exception Specification List
void multiply(int n1, int n2) throw(double)
{
    if (n1 == 0 || n2 == 0)
        throw 1;
    cout << "Multiplication =" << n1 * n2 << endl;
}

int main()
{
    try
    {
        multiply(5, 0);
    }
    catch (int error)
    {
        cout << "Multiplciation is not possible" << endl;
    }
    return 0;
}

int main1()
{
    try
    {
        division(10, 0);
    }
    catch (int error)
    {
        cout << "Division is not possible" << endl;
    }
    return 0;
}