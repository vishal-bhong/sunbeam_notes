#include <iostream>
using namespace std;

class Point
{
    int *xptr;
    int *yptr;

public:
    Point(int xaxis, int yaxis)
    {
        cout << "parameterized Ctor called" << endl;
        xptr = new int;
        *xptr = xaxis;
        yptr = new int(yaxis);
    }

    // copy ctor
    Point(Point &p) // this->p2
    {
        cout << "Copy Ctor is called" << endl;
        xptr = new int;
        *xptr = *p.xptr;
        yptr = new int(*p.yptr);
    }

    void displayPoint()
    {
        cout << "Point = (" << *xptr << "," << *yptr << ")" << endl;
    }

    void setYaxis(int yaxis)
    {
        *yptr = yaxis;
    }
    ~Point()
    {
        delete xptr;
        delete yptr;
        xptr = NULL;
        yptr = NULL;
        cout << "Dtor called :) " << endl;
    }
};

int main()
{
    Point p1(2, 3); // parameterized ctor
    Point p2 = p1;  // p2.Point(p1) Copy ctor -> Deep Copy
    p1.displayPoint();
    p2.displayPoint();
    p2.setYaxis(5);
    cout << "After change in p2, yaxis" << endl;
    p1.displayPoint();
    p2.displayPoint();
    return 0;
}