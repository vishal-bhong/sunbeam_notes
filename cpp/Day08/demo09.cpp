#include <iostream>
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

    void display()
    {
        cout << "\n-----------------------------"<< endl;
        cout << "Empid = " << id << endl;
        cout << "Name = " << name << endl;
        cout << "Salary = " << salary << endl;
        cout << "-----------------------------"<< endl;
    }
    int getId()
    {
        return id;
    }
};

int main()
{
    vector<Employee *> empList;

    cout << "size of empList - " << empList.size() << endl;
    cout << "capacity of empList - " << empList.capacity() << endl;

    empList.push_back(new Employee(44, "Rohit", 44000));
    empList.push_back(new Employee(88, "swapnil", 76000));
    empList.push_back(new Employee(23, "virat", 90000));

    int choice;
    do {
        cout << "select from the following choies :" << endl;
        cout << "0. Exit " << endl;
        cout << "1. Enter the employee " << endl;
        cout << "2. Display the employee " << endl;
        cout << "3. Find the employee with Id " << endl;
        cout << "4. Delete the employee with Id " << endl;
        cin >> choice;

        switch(choice){
            case 0:
                cout << "Thank you for visiting :)" << endl;
                break;

            case 1: {
                int id, salary;
                string name;

                cout << "\nEnter id of employee     :: ";
                cin >> id;

                cout << "\nEnter name of employee   :: ";
                cin >> name;

                cout << "\nEnter salary of employee :: ";
                cin >> salary;

                empList.push_back(new Employee(id, name, salary));
                break;
            }

            case 2: {
                if(empList.size() != 0) {
                    cout << "Displaying Employees !" << endl;
                    for (int i = 0; i < empList.size(); i++)
                        empList[i]->display();
                }
                else cout << "No employees to display !";
                break;
            }

            case 3:
            {  
                int eId;
                if(empList.size() != 0){
                    cout << "Enter the id :: ";
                    cin >> eId;

                    for(int i=0; i< empList.size(); i++) {
                        if(empList[i]->getId() == eId) {
                            empList[i]->display();
                            break;
                        }
                    }
                };

                break;
            }

            case 4:
            {  
                int id_e;
                if(empList.size() != 0){
                    cout << "Enter the id :: ";
                    cin >> id_e;

                    for(int i=0; i< empList.size(); i++) {
                        if(empList[i]->getId() == id_e) {
                            delete empList[i];
                            empList[i] = NULL;
                            break;
                        }
                    }
                };

                break;
            }
                

            default:
                cout << "Invalid choice :(" << endl;
        }

    } while ( choice != 0);

    // TO-DO
    //- create the vector of Employee * as goven below
    // vector<Employee*> empList2;
    // Provide a menu driven code for for adding, displaying,
    // finding the employees and deleting them from the above vector
    return 0;
}

int main1()
{
    vector<int> v1;
    v1.push_back(10);
    v1.push_back(20);
    v1.push_back(30);
    v1.push_back(40);
    v1.push_back(50);

    cout << "Element at index 2 = " << v1.at(2) << endl;
    cout << "Element at index 2 = " << v1[2] << endl;

    cout << "size of v1 - " << v1.size() << endl;
    cout << "capacity of v1 - " << v1.capacity() << endl;

    cout << "Using Iterator ->" << endl;
    for (vector<int>::iterator itr = v1.begin(); itr != v1.end(); itr++)
        cout << *itr << endl;

    // v1.pop_back();
    v1.erase(v1.begin() + 2);

    cout << "Using index ->" << endl;
    for (int i = 0; i < v1.size(); i++)
        cout << v1[i] << endl;

    return 0;
}
