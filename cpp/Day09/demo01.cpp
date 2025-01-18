#include <iostream>
#include <vector>
using namespace std;

int main()
{
    vector<int> v1;
    v1.push_back(10);
    v1.push_back(20);
    v1.push_back(30);
    v1.push_back(40);
    v1.insert(v1.begin() + 2, 200);      // v1.begin() points to first element i.e, 10. and jumps 2 spots aghead from 10 that is 30 and replace it with 200 (position of 30 is now increased i.e, next to 2000).

    for (int i = 0; i < v1.size(); i++)
        cout << v1[i] << endl;
// 10
// 20
// 200
// 30
// 40


    v1.erase(v1.end() - 2);         // 
    cout << "After removing ->" << endl;
    for (int i = 0; i < v1.size(); i++)
        cout << v1[i] << endl;

// After removing ->
// 10
// 20
// 200
// 40

    vector<int>::iterator itr = v1.begin();
    while (itr != v1.end())
    {
        cout << *itr << endl;
        itr++;
    }
// 10
// 20
// 200
// 40
    return 0;
}