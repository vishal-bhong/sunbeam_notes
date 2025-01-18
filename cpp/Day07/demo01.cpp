#include <iostream>
#include <typeinfo>
using namespace std;

class Employee
{
    int id;
    double salary;

public:
    virtual void accept()
    {
        cout << "Enter id - ";
        cin >> id;
        cout << "Enter salary - ";
        cin >> salary;
    }

    virtual void display()
    {
        cout << "Empid - " << id << endl;
        cout << "Salary - " << salary << endl;
    }
};

class Manager : virtual public Employee
{
private:
    double bonus;

protected:
    void acceptManager()
    {
        cout << "Enter the bonus - ";
        cin >> bonus;
    }
    void displayManager()
    {
        cout << "Bonus - " << bonus << endl;
    }

public:
    void accept()
    {
        Employee::accept();
        acceptManager();
    }

    void display()
    {
        Employee::display();
        displayManager();
    }
};

class Salesman : virtual public Employee
{
private:
    double commission;

protected:
    void acceptSalesman()
    {
        cout << "Enter the commission - ";
        cin >> commission;
    }

    void displaySalesman()
    {
        cout << "Commission - " << commission << endl;
    }

public:
    void accept()
    {
        Employee::accept();
        acceptSalesman();
    }

    void display()
    {
        Employee::display();
        displaySalesman();
    }
};

class SalesManager : public Manager, public Salesman
{
public:
    void accept()
    {
        Employee::accept();
        acceptManager();
        acceptSalesman();
    }

    void display()
    {
        Employee::display();
        displayManager();
        displaySalesman();
    }
};

int main()
{
    Employee *arr[6];
    arr[0] = new Salesman();
    arr[1] = new SalesManager();
    arr[2] = new Manager();
    arr[3] = new Manager();
    arr[4] = new SalesManager();
    arr[5] = new Salesman();

    // display only the salesmanagers
    for (int i = 0; i < 6; i++)
    {

        if (typeid(*arr[i]).name() == typeid(SalesManager).name())
        {
            cout << "-------------------" << endl;
            arr[i]->display();
            cout << "-------------------" << endl;
        }
    }
    return 0;
}

int main2()
{
    Employee *eptr = new Salesman();
    cout << "type = " << typeid(eptr).name() << endl;
    cout << "type = " << typeid(*eptr).name() << endl; //  8Salesman

    cout << "type of class = " << typeid(Manager).name() << endl; // 7Manager
    return 0;
}

int main1()
{
    // Employee *e = new SalesManager(); // upcasting
    // Manager *e = new SalesManager();//upcasting
    Salesman *e = new SalesManager(); // upcasting
    e->accept();
    e->display();
    return 0;
}