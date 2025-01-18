#ifndef EMPLOYEE_H
#define EMPLOYEE_H
#include "person.h"
#include <vector>
using namespace std;

class Employee : public Person
{
    double salary;

public:
    Employee();
    Employee(double salary);
    void accept();
    void display();
};

void loadData(vector<Employee *> &v1);
#endif