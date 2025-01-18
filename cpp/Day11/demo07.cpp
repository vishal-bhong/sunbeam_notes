#include <iostream>
using namespace std;
int n1 = 10;
static int n2 = 20;

class Outer
{
    int num3;
    static int num4;

public:
    class Inner
    {
        int num1;
        static int num2;

    public:
        void f1()
        {
            cout << num1 << endl;
            cout << num2 << endl;
            // cout << num3 << endl; // NOT OK
            Outer o1;
            cout << o1.num3 << endl;
            cout << num4 << endl;
            cout << n1 << endl;
            cout << n2 << endl;
        }
        static void f2()
        {
            Outer o1;
            // cout << num1 << endl;// NOT OK
            cout << num2 << endl;
            // cout << num3 << endl;
            cout << o1.num3 << endl;
            cout << num4 << endl;
            cout << n1 << endl;
            cout << n2 << endl;
        }
    };

    void f3()
    {
        Inner i1;
        // cout << i1.num1 << endl;        // error  (member "Outer::Inner::num1" (declared at line 14) is inaccessible)
    }

    static void f4()
    {
    }
};

int main()
{
    Outer o1;
    Outer::Inner i1;
    return 0;
}