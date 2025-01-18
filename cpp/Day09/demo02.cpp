#include <iostream>
#include <stack>
#include <queue>
using namespace std;

int main()
{
    queue<int> q1;
    q1.push(10);
    q1.push(20);
    q1.push(30);

    cout << "Front = " << q1.front() << endl;
    q1.pop();
    cout << "After pop, Front = " << q1.front() << endl;

    return 0;
}

int main1()
{
    stack<int> s1;
    s1.push(10);
    s1.push(20);
    s1.push(30);

    cout << "Peek = " << s1.top() << endl;
    s1.pop();
    cout << "After pop, Peek = " << s1.top() << endl;
    s1.pop();
    cout << "After pop, Peek = " << s1.top() << endl;
    return 0;
}