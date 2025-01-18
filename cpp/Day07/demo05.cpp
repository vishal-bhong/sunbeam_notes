#include <iostream>
using namespace std;

class Test
{
    int num1;
    int num2;

public:
    void f1() const // const Test *const this
    {
        const_cast<Test *const>(this)->num1 = 10;
        const_cast<Test *const>(this)->num2 = 20;
    }

    void f2() const // const Test *const this
    {
        num1 = 20;
    }
};

int main()
{

    return 0;
}