#include <iostream>
using namespace std;

class Time
{
    int hr;
    int min;

public:
    Time()
    {
        cout << "Time() ctor" << endl;
        hr = 10;
        min = 10;
    }

    Time(int mins)
    {
        cout << "Time(int) ctor" << endl;
        hr = mins / 60;
        min = mins % 60;
    }

    Time(int hr, int min)
    {
        cout << "Time(int, int) ctor" << endl;
        this->hr = hr;
        this->min = min;
    }

    void display()
    {
        cout << "Time = " << hr << " : " << min << endl;
    }

    // overloading the function call operator
    void operator()(int mins)
    {
        cout << "Function call Operator overloaded" << endl;
        hr = mins / 60;
        min = mins % 60;
    }

    // conversion function
    operator int()
    {
        return (hr * 60) + min;
    }
};

void f1()
{
}

int mai3()
{
    Time t1(2, 20);
    t1.display();

    int mins = t1; // conversion function
    cout << "Total mins = " << mins << endl;
    return 0;
}

int main()
{
    Time t1(120); // single paramaeterized ctor;
    t1.display();
    // Time t2 = t1; // Copy Ctor
    Time t2 = 120; // Time t2 = Time(120) Single parameterized ctor
    t2.display();

    Time t3;  // Parameterless Ctor
    t3 = 120; // t3 = Time(120) Single parameterized ctor.

    // Single paramaterized ctor works as a Conversion function
    return 0;
}

int main2()
{
    Time t1; // Function Object OR Functors
    t1(130);
    // f1();
     t1.display();
    return 0;
}

int main1()
{
    Time t1; // Parameterless Ctor
    t1.display();

    Time t2(11, 30); // Paramaterized Ctor
    t2.display();

    Time t3(130); // single parameterized ctor
    t3.display();
    return 0;
}