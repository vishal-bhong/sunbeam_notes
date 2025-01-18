#include <iostream>
#include <fstream>
#include <sstream>
#include <vector>
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

class Student
{
    int rollNo, marks;
    string name;

    public :
        Student() {}
        Student(int rolln, string name, int marks): rollNo(rolln), name(name), marks(marks) {}

        void accept () {
            cout << "enter roll no :: ";
            cin >> this->rollNo;

            cout << "enter name :: ";
            cin >> this->name;

            cout << "enter marks :: ";
            cin >> this->marks;
        }

        void display() {
            cout << "roll no of student :: " << this->rollNo << endl;
            cout << "name of student :: " << this->name << endl;
            cout << "marks of student :: " << this->marks << endl;
        }

        int get_rollno () {
            return this->rollNo;
        }

        string get_name () {
            return this->name;
        }

        int get_marks () {
            return this->marks;
        }
};

void loadEmployees(vector<Employee *> &empList)
{
    ifstream fin("emp.txt");
    string line;
    while (getline(fin, line))
    {
        stringstream data(line);
        string id, name, salary;
        getline(data, id, ',');
        getline(data, name, ',');
        getline(data, salary, ',');
        empList.push_back(new Employee(stoi(id), name, stod(salary)));
        // Employee *ptr = new Employee(stoi(id), name, stod(salary));
        // empList.push_back(ptr);
    }
    fin.close();
    cout << "***************************" << endl;
    cout << "Employee data is loaded...." << endl;
    cout << "***************************" << endl;
}

void saveEmployees(vector<Employee *> &empList)
{
    ofstream fout("emp.txt");
    for (int i = 0; i < empList.size(); i++)
    {
        Employee *e = empList[i];
        fout << e->getId() << "," << e->getName() << "," << e->getSalary() << endl;
    }
    fout.close();
    cout << "***************************" << endl;
    cout << "Employee data is saved...." << endl;
    cout << "***************************" << endl;
}

int findEmployee(vector<Employee *> &empList)
{
    int id;
    cout << "Enter id to search .. ";
    cin >> id;
    for (int i = 0; i < empList.size(); i++)
        if (id == empList[i]->getId())
            return i;
    return -1;
}

void loadStudents(vector<Student *> &studentList)
{
    ifstream fin("student.txt");
    string line;
    while(getline(fin, line)) {
        stringstream data(line);
        string rollno, name, marks;
        getline(data, rollno, ',');
        getline(data, name, ',');
        getline(data, marks, ',');
        studentList.push_back(new Student(stoi(rollno), name, stoi(marks)));
    }
    fin.close();
    cout << "***************************" << endl;
    cout << "student data is loaded...." << endl;
    cout << "***************************" << endl;

}

void saveStudents(vector<Student *> &studentList)
{
    ofstream fout("student.txt");
    for(int i = 0; i < studentList.size(); i++) {
        fout << studentList[i]->get_rollno() << ',' << studentList[i]->get_name() << ',' << studentList[i]->get_marks() << endl;
    }

    fout.close();
    cout << "***************************" << endl;
    cout << "student data is saved...." << endl;
    cout << "***************************" << endl;
}

int findStudent(vector<Student *> &studentList)
{
    int roll;
    cout << "enter roll no to search  :: ";
    cin >> roll;

    for (int i = 0; i < studentList.size(); i++)
    {
       if(studentList[i]->get_rollno() == roll) {
            return i;
       }
    }
    
    return -1;
}

int menu() {
    int choice;
    cout << "select from the following choices  :: " << endl;
    cout << "0. Exit "<< endl;
    cout << "1. Add employee "<< endl;
    cout << "2. display employee "<< endl;
    cout << "3. find employee "<< endl;
    cout << "4. find and erase employee "<< endl;
    cout << "5. Add student "<< endl;
    cout << "6. display student "<< endl;
    cout << "7. find student "<< endl;
    cout << "8. find and erase student" << endl;
    cin >> choice;

    if(choice == 0) cout << "thank you for using application :)" << endl;
    return choice;
}

int main()
{
    vector<Employee *> empList;
    vector<Student *> studentList;
    loadEmployees(empList);
    loadStudents(studentList);

    int choice;

    // start the menudriven code from here

    while ((choice = menu()) != 0)
    {
        switch (choice)
        {
        case 1 :
        {    Employee *e = new Employee();
            e->accept();
            empList.push_back(e);
            break;
        }

        case 2 :
            {
                for (int i = 0; i < empList.size(); i++) {
                    empList[i]->display();
                }
                break;
            }

        case 3 :
           { 
            int index = findEmployee(empList);
            if (index != -1)
            {
                cout << "Employee found..." << endl;
                empList[index]->display();
                break;
            }
            else {
                cout << "Employee not found..." << endl;
            }
            break;
            }

        case 4 :
           { 
            int index = findEmployee(empList);
            if (index != -1)
            {
                empList.erase(empList.begin() + index);
                cout << "Employee deleted..." << endl;
            }
            else {
                cout << "Employee not found..." << endl;
            }
            break;
            }

        case 5 :
        {
            Student *s = new Student();
            s->accept();
            studentList.push_back(s);
            break;
        }

        case 6 :
            // display student
            for (int i = 0; i < studentList.size(); i++)
            {
                studentList[i]->display();
            }
            break;

        case 7 :
            // find student
        {
            int index = findStudent(studentList);
            if ( index != -1 ) {
                cout << "Student found ...." << endl;
                studentList[index]->display();
                break;
            }
            else cout << "student not found :(" << endl;
            break;
        }

        case 8 :
            // find and erase student
        {
            int index = findStudent(studentList);
            if ( index != -1 ) {
                studentList.erase(studentList.begin() + index);
                cout << "Student deleted ...." << endl;
                break;
            }
            else cout << "student not found :(" << endl;
            break;
        }

        
        default:
            cout << "invalid value entered :(" << endl;
            break;
        }
    }
    
    saveEmployees(empList);
    saveStudents(studentList);
    return 0;
}
