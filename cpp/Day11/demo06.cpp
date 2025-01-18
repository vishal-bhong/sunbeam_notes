#include <iostream>
using namespace std;
int n2 = 20;
static int n3 = 30;
void f1()
{
    int n1 = 10;
    static int n4 = 40;

    // local class cannot be static
    class LocalClass
    {
    private:
        int num1;
        // static int num2; // NOT OK

    public:
        void f2()
        {
            //cout << n1 << endl;     // error    (reference to local variable of enclosing function is not allowed)
            cout << n2 << endl;
            cout << n3 << endl;
            cout << n4 << endl;

            cout << "f2()" << endl;
        }
        static void f3()
        {
            // cout << n1 << endl;      // error    (reference to local variable of enclosing function is not allowed)
            cout << n2 << endl;
            cout << n3 << endl;
            cout << n4 << endl;

            cout << "f3()" << endl;
        }
    };

    LocalClass c1;
    c1.f2();
    LocalClass::f3();
}

int main()
{
    f1();
    return 0;
}

// output ::
// 20
// 30
// 40
// f2()
// 20
// 30
// 40
// f3()