#include <iostream>
using namespace std;

class Point
{
    int xaxis;
    int yaxis;

public:
    Point(int xaxis, int yaxis)
    {
        this->xaxis = xaxis;
        this->yaxis = yaxis;
    }

    void displayPoint()
    {
        cout << "Point = (" << xaxis << "," << yaxis << ")" << endl;
    }

    void setYaxis(int yaxis)
    {
        this->yaxis = yaxis;
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