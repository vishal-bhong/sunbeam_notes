#include <iostream>
using namespace std;

class Point
{
    int *xptr;
    int *yptr;

public:
    Point(int xaxis, int yaxis)
    {
        xptr = new int;
        *xptr = xaxis;
        yptr = new int(yaxis);
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
        cout << "Dtor called :)" << endl;           //dtor should be called 2 times for two obj but it did not.
    }
};

int main()
{
    Point p1(2, 3); // parameterized ctor
    Point p2 = p1;  // Default Copy ctor -> Shallow Copy
    p1.displayPoint();
    p2.displayPoint();
    p2.setYaxis(5);
    cout << "After change in p2, yaxis" << endl;
    p1.displayPoint();
    p2.displayPoint();
    return 0;
}