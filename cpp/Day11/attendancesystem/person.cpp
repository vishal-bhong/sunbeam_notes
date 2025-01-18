#include "person.h"

Person::Person()
{
    cout << "Person()" << endl;
}
Person::Person(int id, string name)
{
    cout << "Person(int name)" << endl;
}
void Person::accept()
{
    cout << "Person::accept()" << endl;
}
void Person::display()
{
    cout << "Person::display()" << endl;
}