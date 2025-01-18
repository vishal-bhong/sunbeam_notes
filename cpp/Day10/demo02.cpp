#include <iostream>
using namespace std;

class Employee
{
    double salary;

public:
    Employee()
    {
        cout << "Employee ctor" << endl;
    }

    ~Employee()
    {
        cout << "Employee Dtor" << endl;
    }

    void accept()
    {
        cout << "inside Empoyee::accept" << endl;
    }

    void display()
    {
         cout << "inside Empoyee::display" << endl;
    }
};

class SmartEmployee
{
    Employee *ptr;

public:
    SmartEmployee(Employee *ptr)
    {
        this->ptr = ptr;
    }

    Employee *operator->()
    {
        return ptr;
    }

    ~SmartEmployee()
    {
        delete ptr;
    }
};

int main()
{
    // Employee *e1 = new Employee();
    // e1->accept();
    // e1->display();
    // delete e1;
    // e1 = NULL;

    SmartEmployee e1(new Employee());
    e1->accept();
    e1->display();
    return 0;
}
// Employee ctor
// inside Empoyee::accept
// inside Empoyee::display
// Employee Dtor

int main2()
{
    SmartEmployee e1(new Employee());
    SmartEmployee e2(new Employee());
    SmartEmployee e3(new Employee());
    return 0;
}

int main1()
{
    // Employee e1;
    Employee *ptr = new Employee();
    delete ptr;
    Employee *e1 = new Employee();
    Employee *e2 = new Employee();
    Employee *e3 = new Employee();
    Employee *e4 = new Employee();
    Employee *e5 = new Employee();
    Employee *e6 = new Employee();
    delete e1;
    delete e2;
    delete e3;
    delete e4;
    delete e5;
    delete e6;
    return 0;
}