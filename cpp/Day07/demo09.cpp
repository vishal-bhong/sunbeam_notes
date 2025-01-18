#include <iostream>
using namespace std;

// template function

template <typename T> // T-> double
void myswap(T *ptr1, T *ptr2)
{
    T temp = *ptr1;
    *ptr1 = *ptr2;
    *ptr2 = temp;
}

int main()
{
    // int num1 = 10;
    // int num2 = 20;
    // double num1 = 10.11;
    // double num2 = 20.22;
    char num1 = 'A';
    char num2 = 'B';
    cout << "Before Swap - " << num1 << "," << num2 << endl;
    myswap(&num1, &num2);
    cout << "After Swap - " << num1 << "," << num2 << endl;
    return 0;
}