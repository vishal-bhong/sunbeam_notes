#include <iostream>
using namespace std;

namespace na
{
    namespace nb
    {
        int num1 = 10;
        int num2 = 30;
    }

    namespace nc
    {
        int num1 = 20;
        int num2 = 40;

    }
}

namespace AttendaceSystem::NEmployee
{

    class Employee
    {
    };
    void find();
    void load();
    void save();
}

namespace AttendaceSystem::NStudent
{
    class Student
    {
    };

    void find();
    void load();
    void save();
}

void f1(int n1)
{
}

void f1(int *n1)
{
}

int main1()
{
    int num1 = NULL;
    int *num2 = nullptr;

    f1(0);
    f1(nullptr);
    return 0;
}

int main()
{
    cout << "num1::nb = " << na::nb::num1 << endl;
    cout << "num2::nc = " << na::nc::num2 << endl;
    return 0;
}
