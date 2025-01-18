#include <iostream>
#include <vector>
using namespace std;
int menu()
{
    int choice;
    cout << "0. Exit" << endl;
    cout << "1. Add Employee" << endl;
    cout << "2. Add Student" << endl;
    cout << "3. Display All Employees" << endl;
    cout << "4. Display All Student" << endl;
    cout << "5. Find Employee" << endl;
    cout << "6. Find Student" << endl;
    cout << "7. Delete Employee" << endl;
    cout << "8. Delete Student" << endl;
    cout << "Enter choice - ";
    cin >> choice;
    return choice;
}

class Person
{
    int id;
    string name;

public:
    Person()
    {
    }

    Person(int id, string name)
    {
        this->id = id;
        this->name = name;
    }
    virtual void accept()
    {
        cout << "Enter the id - ";
        cin >> id;
        cout << "Enter the name - ";
        cin >> name;
    }
    virtual void display()
    {
        cout << "Id - " << id << endl;
        cout << "Name - " << name << endl;
    }

    int getId()
    {
        return id;
    }
};

class Employee : public Person
{
    double salary;

public:
    Employee()
    {
    }

    Employee(int id, string name, double salary) : Person(id, name)
    {
        this->salary = salary;
    }
    void accept()
    {
        Person::accept();
        cout << "Enter the salary - ";
        cin >> salary;
    }
    void display()
    {
        Person::display();
        cout << "Salary - " << salary << endl;
    }
};

class Stduent : public Person
{
    double marks;

public:
    Stduent()
    {
    }
    Stduent(int id, string name, double marks) : Person(id, name)
    {
        this->marks = marks;
    }

    void accept()
    {
        Person::accept();
        cout << "Enter the marks - ";
        cin >> marks;
    }
    void display()
    {
        Person::display();
        cout << "Marks - " << marks << endl;
    }

    static void findStudent(vector<Person *> &personList)
    {
        int id;
        cout << "Enter the id to search - ";
        cin >> id;
        for (int i = 0; i < personList.size(); i++)
            if (typeid(*personList[i]) == typeid(Stduent))
                if (id == personList[i]->getId())
                    personList[i]->display();
    }
};

int findEmployee(vector<Person *> &personList)
{
    int id;
    cout << "Enter the id to search - ";
    cin >> id;
    for (int i = 0; i < personList.size(); i++)
        if (typeid(*personList[i]) == typeid(Employee))
            if (id == personList[i]->getId())
                return i;
    return -1;
}

// void findEmployee(vector<Person *> &personList)
// {
//     int id;
//     cout << "Enter the id to search - ";
//     cin >> id;
//     for (int i = 0; i < personList.size(); i++)
//         if (typeid(*personList[i]) == typeid(Employee)) // to check if selected person object is of type Employee
//             if (id == personList[i]->getId())           // to check if given id matches the employee id
//                 personList[i]->display();               // display the employee if found
// }
// void deleteEmployee(vector<Person *> &personList)
// {
//     int id;
//     cout << "Enter the id to delete - ";
//     cin >> id;

//     for (int i = 0; i < personList.size(); i++)
//         if (typeid(*personList[i]) == typeid(Employee))
//             if (id == personList[i]->getId())
//                 personList.erase(personList.begin() + i);
// }

void addDummyData(vector<Person *> &personList)
{
    personList.push_back(new Employee(1, "Anil", 10000));
    personList.push_back(new Stduent(1, "Mukesh", 50));
    personList.push_back(new Employee(2, "Ramesh", 10000));
    personList.push_back(new Employee(3, "Suresh", 10000));
    personList.push_back(new Stduent(2, "Ram", 60));
}
int main()
{
    vector<Person *> personList;
    Person *p = NULL;

    addDummyData(personList);

    int choice;
    while ((choice = menu()) != 0)
    {
        switch (choice)
        {
        case 1:
            // TO-DO
            break;
        case 2:
            p = new Stduent();
            p->accept();
            personList.push_back(p);
            break;
        case 3:
            for (int i = 0; i < personList.size(); i++)
                if (typeid(*personList[i]) == typeid(Employee))
                    personList[i]->display();
            break;
        case 4:
            for (int i = 0; i < personList.size(); i++)
                if (typeid(*personList[i]) == typeid(Stduent))
                    personList[i]->display();
            break;
        case 5:
        {
            int index = findEmployee(personList);
            if (index != -1)
                personList[index]->display();
            else
                cout << "Employee not found ..." << endl;
        }
        break;
        case 6:
            Stduent::findStudent(personList);
            break;
        case 7:
        {
            // deleteEmployee(personList);
            int index = findEmployee(personList);
            if (index != -1)
                personList.erase(personList.begin() + index);
            else
                cout << "Employee not found ..." << endl;
        }
        break;
        case 8:
            // TO-DO
            break;
        default:
            cout << "Wrong choice..." << endl;
            break;
        }
    }

    return 0;
}