#include <iostream>
using namespace std;

int main()
{
    int **ptr = new int *[5];
    ptr[0] = new int(10);
    ptr[1] = new int(20);
    ptr[2] = new int(30);
    ptr[3] = new int(40);
    ptr[4] = new int(50);

    for (int i = 0; i < 5; i++)
        cout << "element = " << *ptr[i] << endl;

    for (int i = 0; i < 5; i++)
    {
        delete ptr[i];
        ptr[i] = NULL;
    }

    delete[] ptr;

    return 0;
}

int main3()
{
    int *arr[5];
    arr[0] = new int;
    *arr[0] = 10;
    arr[1] = new int(20);
    arr[2] = new int(30);
    arr[3] = new int(40);
    arr[4] = new int(50);

    for (int i = 0; i < 5; i++)
        cout << "Element = " << *arr[i] << endl;

    // used to deallocat the dynamically allocated memory
    for (int i = 0; i < 5; i++)
    {
        delete arr[i];
        arr[i] = NULL;
    }
    return 0;
}

int main2()
{
    int *ptr = new int[5];
    ptr[0] = 10;
    ptr[1] = 20;
    ptr[2] = 30;
    ptr[3] = 40;
    ptr[4] = 50;

    for (int i = 0; i < 5; i++)
        cout << "element = " << ptr[i] << endl;

    delete[] ptr;
    ptr = NULL;
    return 0;
}

int main1()
{
    int arr[5];
    arr[0] = 10;
    arr[1] = 20;
    arr[2] = 30;
    arr[3] = 40;
    arr[4] = 50;

    for (int i = 0; i < 5; i++)
        cout << "element = " << arr[i] << endl;

    return 0;
}