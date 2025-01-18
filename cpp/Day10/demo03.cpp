#include <iostream>
#include <fstream>
using namespace std;

void write()
{
    ofstream fout("file1.txt", ios::app);
    fout << "Hello" << endl;
    fout.close();
}

void read()
{
    ifstream fin("file1.txt");
    string data;
    while (getline(fin, data))
    {
        cout << data << endl;
    }
    fin.close();
}

int main()
{
    // write();
    read();
}