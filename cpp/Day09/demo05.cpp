#include <iostream>
using namespace std;

class Point
{
    int xaxis;
    int yaxis;

public:
    Point()
    {
    }
    Point(int x, int y)
    {
        xaxis = x;
        yaxis = y;
    }

    void display()
    {
        cout << "Point = (" << xaxis << "," << yaxis << ")" << endl;
    }

    // member function
    // Point operator+(Point &p2) // this->p1
    // {
    //     Point temp;
    //     temp.xaxis = this->xaxis + p2.xaxis;
    //     temp.yaxis = this->yaxis + p2.yaxis;
    //     return temp;
    // }

    friend Point operator+(Point &p1, Point &p2);
};
// non member function
Point operator+(Point &p1, Point &p2)
{
    Point temp;
    temp.xaxis = p1.xaxis + p2.xaxis;
    temp.yaxis = p1.yaxis + p2.yaxis;
    return temp;
}

int main()
{
    Point p1(2, 3);
    p1.display();
    Point p2(5, 6);
    p2.display();
    Point p3 = p1 + p2; // p1.operator+(p2) OR//operator+(p1,p2)
    p3.display();
    return 0;
}