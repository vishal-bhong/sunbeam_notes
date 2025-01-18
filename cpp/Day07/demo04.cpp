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
    // virtual void print()
    virtual void print()
    {
        cout << "num1 = " << num1 << endl;
    }
};

// class Derived : public Base
class Derived
{
    int num2;

public:
    Derived()
    {
        num2 = 20;
    }
    // void print()
    // {
    //     Base::print();
    //     cout << "num2 = " << num2 << endl;
    // }

    void printDerived()
    {

        cout << "Derived::num2 = " << num2 << endl;
    }
};

int main()
{
    // Base *bptr = new Derived(); // Upcasting
    Base *bptr = new Base();
    bptr->print();

    Derived *dptr = dynamic_cast<Derived *>(bptr); // Downcasting
    // Derived *dptr = static_cast<Derived *>(bptr); // Downcasting

    // Derived *dptr = reinterpret_cast<Derived *>(bptr); // Type conversion
    if (dptr != NULL)
        dptr->printDerived();
    else
        cout << "Downcasting is not possible..." << endl;
    return 0;
}