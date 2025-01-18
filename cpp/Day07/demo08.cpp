#include <iostream>
using namespace std;

// Custom Exception
class InvalidDateException
{
    string message;

public:
    InvalidDateException(string message)
    {
        this->message = message;
    }

    void printStackTrace()
    {
        cout << "InvaliDateException : " << endl;
        cout << "Message - " << message << endl;
    }
};

class Date
{
    int day;
    int month;
    int year;

public:
    void setDay(int day)
    {
        if (day < 1 || day > 31)
            throw InvalidDateException("Invalid Day entered...");
        this->day = day;
    }
    void setMonth(int month)
    {
        if (month < 1 || month > 12)
            throw InvalidDateException("Invalid Month Entered ...");
        this->month = month;
    }
    void setYear(int year)
    {
        if (year < 1900 || year > 2050)
            throw InvalidDateException("Invalid Year Entered ...");
        this->year = year;
    }
};

int main()
{
    Date d1;
    try
    {
        d1.setDay(3);
        d1.setMonth(2);
        try
        {
            d1.setYear(2060);
            // stmt-2
            // stmt-3
        }
        catch (int ex)
        {
            cout << "Invalid.." << endl;
        }
    }
    catch (InvalidDateException ex)
    {
        ex.printStackTrace();
    }

    //output ::
    //InvaliDateException : 
    //Message - Invalid Year Entered ...

    
    // Anonymous Objects
    // InvalidDateException("message");

    return 0;
}