#ifndef STUDENT_H
#define STUDENT_H
#include "person.h"

class Student : public Person
{
    double marks;

public:
    Student();
    Student(double marks);
    void accept();
    void display();
};

#endif