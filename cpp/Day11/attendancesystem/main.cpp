#include <vector>
using namespace std;
#include "person.h"
#include "employee.h"
#include "student.h"

void saveData()
{
}

int menu()
{
    return 0;
}
int main()
{
    vector<Person *> v1;
    // vector<Employee *> v2;
    // loadData(v2);
    // vector<Student *> v3;
    v1.push_back(new Employee());
    v1.push_back(new Student());
    v1[0]->display();
    v1[1]->display();

    for (int i = 0; i < v1.size(); i++)
        delete v1[i];

    return 0;
}