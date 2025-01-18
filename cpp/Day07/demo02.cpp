#include <iostream>
using namespace std;

class Employee
{
    int *salary;

public:
    Employee()
    {
        cout << "Employee Constructor" << endl;
    }
    virtual void accept()
    {
        cout << "Employee::accept()" << endl;
    }
    virtual void display()
    {
        cout << "Employee::display()" << endl;
    }
    virtual ~Employee()
    {
        cout << "Employee Destructor" << endl;
    }
};

class Manager : public Employee
{
    int *bonus;

public:
    Manager()
    {
        cout << "Manager constructor" << endl;
    }
    void accept()
    {
        cout << "manager::accept()" << endl;
    }
    void display()
    {
        cout << "manager::display()" << endl;
    }
    ~Manager()
    {
        cout << "Manager Destructor" << endl;
    }
};

int main()
{
    // Employee obj;
    // Manager obj;
    // obj.accept();
    // obj.display();

    // Employee *ptr = new Employee();
    // Manager *ptr = new Manager();

    Employee *ptr = new Manager(); // upcasting
    ptr->accept();
    ptr->display();
    delete ptr;             // if Employee destructor is not made as virtual it will call Employee's destructor first since the pointer is of type Employee and the dangling pointer of Manager will be created since it is not get destroyed.
    ptr = NULL;
    return 0;
}

int main1()
{
    Employee *eptr = new Manager();
    cout << "Type of eptr = " << typeid(eptr).name() << endl;
    cout << "Type of *eptr = " << typeid(*eptr).name() << endl;
    // to use RTTI the classes should be polymorphic.
    // i.e atleast 1 function inside the base class should be virtual
    return 0;
}