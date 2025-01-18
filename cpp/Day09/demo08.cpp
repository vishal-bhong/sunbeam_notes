#include <iostream>
using namespace std;

class Array
{
    int *ptr;

public:
    Array()
    {
        ptr = new int[5];
    }
    void addElement(int index, int element)
    {
        ptr[index] = element;
    }

    int getElement(int index)
    {
        return ptr[index];
    }

    int &operator[](int index)
    {
        return ptr[index];
    }
};

int main()
{
    Array a1;
    a1.addElement(0, 10);
    a1.addElement(1, 20);
    // cout << a1.getElement(0) << endl;
    cout << a1[0] << endl; // a1.operator[](0);
    // cout << a1.getElement(1) << endl;
    cout << a1[1] << endl; // a1.operator[](1);

    a1[2] = 30;
    cout << a1[3] << endl;
    return 0;
}