#include <iostream>
using namespace std;

class Base
{
    int num1;

public:
    Base()
    {
        num1 = 10;
    }
    void printBase()
    {
        cout << "num1 = " << num1 << endl;
    }
};

class Derived : public Base
{
    int num2;

public:
    Derived()
    {
        num2 = 20;
    }
    void printDerived()
    {
        cout << "num2 = " << num2 << endl;
    }
};

int main()
{
    // Base *bptr = new Derived(); // Upcasting
    Base *bptr = new Base();
    bptr->printBase();

    Derived *dptr = (Derived *)bptr; // Downcasting
    dptr->printDerived();
    return 0;
}