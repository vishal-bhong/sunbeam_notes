#include <iostream>
using namespace std;
template <class T>
class Stack
{
    int top;
    int size;
    T *ptr;

public:
    Stack(int size = 5)
    {
        this->size = size;
        this->top = -1;
        ptr = new T[size];
    }

    void push(T element)
    {
        if (!isFull())
        {
            top++;
            ptr[top] = element;
        }
        else
            cout << "Stack is Full" << endl;
    }

    void pop()
    {
        if (!isEmpty())
            top--;
        else
            cout << "Stack is Empty" << endl;
    }

    T peek()
    {
        // if (!isEmpty())
        return ptr[top];
        // else
        //     cout << "Stack is Empty" << endl;
        // return -1;
    }

    bool isFull()
    {
        return top == size - 1;
    }

    bool isEmpty()
    {
        return top == -1;
    }
};

class Employee
{
    int id;
    string name;
    double salary;

public:
    Employee()
    {
    }

    Employee(int id, string name, double salary)
    {
        this->id = id;
        this->name = name;
        this->salary = salary;
    }

    void display()
    {
        cout << "Empid = " << id << endl;
        cout << "Name = " << name << endl;
        cout << "Salary = " << salary << endl;
    }
};

int main()
{

    Stack<Employee *> s1;
    s1.push(new Employee(1, "Anil", 10000));
    s1.push(new Employee(2, "Mukesh", 20000));
    s1.peek()->display();

    s1.pop();

    cout << "After Pop = " << endl;

    s1.peek()->display();

    return 0;
}

int main2()
{
    Stack<char> s1;
    s1.push('A');
    s1.push('B');

    cout << "Peek = " << s1.peek() << endl;
    s1.pop();
    cout << "After Pop, Peek = " << s1.peek() << endl;
    s1.pop();
    cout << "After Pop, Peek = " << s1.peek() << endl;

    return 0;
}

int main1()
{
    Stack<int> s1;
    s1.push(10);
    s1.push(20);

    cout << "Peek = " << s1.peek() << endl;
    s1.pop();
    cout << "Peek = " << s1.peek() << endl;

    return 0;
}