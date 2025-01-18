#include <iostream>
using namespace std;

class Date
{
    int day;
    int month;
    int year;

public:
    void setDay(int day)
    {
        if (day < 1 || day > 31)
            throw 1;
        this->day = day;
    }
    void setMonth(int month)
    {
        if (month < 1 || month > 12)
            throw 2;
        // throw 3.5;
        this->month = month;
    }
    void setYear(int year)
    {
        if (year < 1900 || year > 2050)
            throw 3;
        // throw 'a';
        this->year = year;
    }
};

int main()
{
    Date d1;
    try
    {
        d1.setDay(3);
        d1.setMonth(21);
        d1.setYear(2024);
    }
    catch (int error)
    {
        switch (error)
        {
        case 1:
            cout << "Invalid Day ..." << endl;
            break;
        case 2:
            cout << "Invalid Month ..." << endl;
            break;
        case 3:
            cout << "Invalid Year ..." << endl;
            break;
        }
    }

    return 0;
}

int main2()
{
    Date d1;
    try
    {
        d1.setDay(35);
        d1.setMonth(21);
        d1.setYear(2024);
    }
    catch (double error)
    {
        cout << "Invalid Month ..." << endl;
    }
    catch (...) // Generic Catch Block
    {
        cout << "Invalid Value ..." << endl;
    }

    return 0;
}

int main1()
{
    Date d1;
    try
    {
        d1.setDay(3);
        d1.setMonth(21);
        d1.setYear(2024);
    }
    catch (int error)
    {
        cout << "Invalid Day ..." << endl;
    }
    catch (double error)
    {
        cout << "Invalid Month ..." << endl;
    }
    catch (char error)
    {
        cout << "Invalid Year ..." << endl;
    }

    return 0;
}