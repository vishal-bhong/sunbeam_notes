#include <iostream>
using namespace std;

class Singleton
{

    // step-2-> declare a static data member of ptr type of the same class
    static Singleton *ptr;

    // step-1 -> to make the ctor private
    Singleton()
    {
        cout << "Singleton ctor" << endl;
    }

public:
    // step - 3-> Provide an inspector function that will return the
    // single instance of the class
    static Singleton *getInstance()
    {
        if (ptr == NULL)
            ptr = new Singleton();
        return ptr;
    }
};

// step-4 -> Initialize the static ptr type of data member to null
Singleton *Singleton::ptr = NULL;

void f1()
{
    Singleton *s3 = Singleton::getInstance();
    Singleton *s4 = Singleton::getInstance();
}

int main()
{
    Singleton *s1 = Singleton::getInstance();
    Singleton *s2 = Singleton::getInstance();
    Singleton *s3 = Singleton::getInstance();
    Singleton *s4 = Singleton::getInstance();
    f1();
    delete s1;
    return 0;
}

int main1()
{
    // Singleton *s1 = new Singleton();
    // Singleton *s2 = new Singleton();
    // Singleton *s3 = new Singleton();
    // Singleton *s4 = new Singleton();
    return 0;
}