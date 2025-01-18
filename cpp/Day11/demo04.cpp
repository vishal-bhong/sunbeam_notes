#include <iostream>
using namespace std;

class Shape
{
public:
    virtual void acceptData() = 0;
    virtual void calculateArea() = 0;
};

class Circle : public Shape
{
public:
    void acceptData()
    {
        cout << "Circle::acceptData()" << endl;
    }
    void calculateArea()
    {
        cout << "Circle::calculateArea()" << endl;
    }
};

class Rectangle : public Shape
{
public:
    void acceptData()
    {
        cout << "Rectangle::acceptData()" << endl;
    }
    void calculateArea()
    {
        cout << "Rectangle::calculateArea()" << endl;
    }
};

class Square : public Shape
{
public:
    void acceptData()
    {
        cout << "Square::acceptData()" << endl;
    }
    void calculateArea()
    {
        cout << "Square::calculateArea()" << endl;
    }
};

int menu()
{
    int choice;
    cout << "0. Exit" << endl;
    cout << "1. Area of Circle" << endl;
    cout << "2. Area of Rectangle" << endl;
    cout << "3. Area of Square" << endl;
    cout << "Enter the choice - ";
    cin >> choice;
    return choice;
}

int main()
{
    int choice;
    Shape *sptr;
    while ((choice = menu()) != 0)
    {
        switch (choice)
        {
        case 1:
            sptr = new Circle();
            sptr->acceptData();
            sptr->calculateArea();
            break;
        case 2:
            sptr = new Rectangle();
            sptr->acceptData();
            sptr->calculateArea();
            break;

        case 3:
            sptr = new Square();
            sptr->acceptData();
            sptr->calculateArea();
            break;

        default:
            cout << "Wrong choice... " << endl;
            break;
        }
    }

    return 0;
}