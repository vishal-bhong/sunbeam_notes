#include "student.h"

Student::Student()
{
    cout << "Student()" << endl;
}
Student::Student(double marks)
{
    cout << "Student(double)" << endl;
}
void Student::accept()
{
    cout << "Student::accept()" << endl;
}

void Student::display()
{
    cout << "Student::display()" << endl;
}