#include "employee.h"

void loadData(vector<Employee *> &v1)
{
}

Employee::Employee()
{
    cout << "Employee()" << endl;
}
Employee::Employee(double salary)
{
    cout << "Employee(double)" << endl;
}
void Employee::accept()
{
    cout << "Employee::accept()" << endl;
}

void Employee::display()
{
    cout << "Employee::display()" << endl;
}