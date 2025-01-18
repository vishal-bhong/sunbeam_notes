#include <iostream>
using namespace std;

class Point
{
    int *xptr;
    int *yptr;

public:
    Point()
    {
        xptr = new int(0);
        yptr = new int(0);
        cout << "Inside Parameterless ctor" << endl;
    }
    Point(int xval, int yval)
    {
        cout << "Inside Parameterized ctor" << endl;
        xptr = new int(xval);
        yptr = new int(yval);
    }

    Point(Point &p)
    {
        cout << "Inside Copy ctor" << endl;
    }

    void display()
    {
        cout << "Point = (" << *xptr << "," << *yptr << ")" << endl;
    }

    void setY(int yval)
    {
        *yptr = yval;
    }
    void operator=(Point &p1) // this-> p2
    {
        cout << "Inside Assignment Operator " << endl;
        *xptr = *p1.xptr;
        *yptr = *p1.yptr;
    }
};

int main()
{
    Point p1(2, 3); // Parameterized Ctor
    // Point p2 = p1;  // Copt ctor
    Point p2; // Parameterless ctor
    // p2 = p1;  // Default Assignemnt operator function -> Shallow Copy
    p2 = p1; // p2.operator=(p1)
    p1.display();
    p2.display();
    p2.setY(5);
    cout << "After change in p2 - " << endl;
    p1.display();
    p2.display();

    return 0;
}