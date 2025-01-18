#include <iostream>
using namespace std;

class Employee
{
    int id;
    string name;
    double salary;

public:
    void accept()
    {
    }
    friend ostream &operator<<(ostream &out, Employee &e1);
    friend void operator>>(istream &in, Employee &e1);
};

ostream &operator<<(ostream &out, Employee &e1)
{
    out << "id = " << e1.id << endl;
    out << "name = " << e1.name << endl;
    out << "salary = " << e1.salary << endl;
    return out;
}

void operator>>(istream &in, Employee &e1)
{
    cout << "Enter the id - ";
    in >> e1.id;
    cout << "Enter the name - ";
    in >> e1.name;
    cout << "Enter the salary";
    in >> e1.salary;
}

int main()
{
    Employee e1;
    // e1.accept();
    cin >> e1;  // operator>>(cin,e1)
    cout << e1; // operator<<(cout,e1)
    // e1.display();
    return 0;
}