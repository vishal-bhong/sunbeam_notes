#ifndef PERSON_H
#define PERSON_H
#include <iostream>
using namespace std;

class Person
{
    int id;
    string name;

public:
    Person();
    Person(int id, string name);
    virtual void accept();
    virtual void display();
};

#endif