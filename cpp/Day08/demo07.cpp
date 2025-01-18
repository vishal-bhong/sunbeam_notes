#include <iostream>
using namespace std;

class Test
{
private:
    int num1;

protected:
    int num2;

public:
    int num3;

    // Member Function
    void f1()
    {
        Test t1;
        cout << num1 << num2 << num3 << endl;
        cout << t1.num1 << t1.num2 << t1.num3 << endl;
    }

    // friend functions
    friend void f2();

    friend void f3()
    {
        Test t1;
        cout << t1.num1 << t1.num2 << t1.num3 << endl;

        // friend functions do not get this pointer.
        // cout << num1 << num2 << num3 << endl; // NOT OK
    }
};

// Non-Member function
void f2()
{
    Test t1;
    cout << t1.num1 << t1.num2 << t1.num3 << endl;
}

class Base
{
private:
    int n1 = 10;

protected:
    int n2 = 20;

public:
    int n3 = 30;

    void printBase()
    {
        cout << n1 << n2 << n3 << endl;
    }
    friend class Derived;
};

class Derived : public Base
{
public:
    void printDerived()
    {
        cout << n1 << n2 << n3 << endl;
    }
};

int main()
{
    // Derived *d1 = new Derived();
    // d1->printDerived();
    Derived d1;
    d1.printDerived();             //10 20 30
    return 0;
}