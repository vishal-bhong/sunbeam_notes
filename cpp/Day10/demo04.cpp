#include <iostream>
#include <fstream>
#include <sstream>
using namespace std;
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

    void accept()
    {
        cout << "Enter the id - ";
        cin >> id;
        cout << "Enter the name - ";
        cin >> name;
        cout << "Enter the salary - ";
        cin >> salary;
    }
    void display()
    {
        cout << "Id - " << id << endl;
        cout << "Name - " << name << endl;
        cout << "Salary - " << salary << endl;
    }

    int getId()
    {
        return id;
    }
    string getName()
    {
        return name;
    }
    double getSalary()
    {
        return salary;
    }
};
void write()
{
    ofstream fout("emp.txt", ios::app);
    Employee e;
    e.accept();
    fout << e.getId() << "," << e.getName() << "," << e.getSalary() << endl;
    fout.close();
}

void read()
{
    ifstream fin("emp.txt");
    string line;
    while (getline(fin, line))
    {
        // convert the string object into the string stream
        // so that we can split that string
        stringstream data(line);
        string id, name, salary;
        getline(data, id, ',');
        getline(data, name, ',');
        getline(data, salary, ',');

        Employee e(stoi(id), name, stod(salary));
        e.display();
    }
    fin.close();
}

int main()
{
    // write();
    read();
}