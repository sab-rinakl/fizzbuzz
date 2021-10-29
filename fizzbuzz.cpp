#include <string>
#include <iostream>

using namespace std;

int main()
{
    cout << "Please input an integer greater than 1." << endl;
    int n;
    cin >> n;
    for (int i = 1; i <= n; i++)
    {
        if (i % 3 == 0)
        {
            if (i % 5 == 0)
            {
                cout << "FizzBuzz" << endl;
            }
            else 
            {
                cout << "Fizz" << endl;
            }
        }
        else if (i % 5 == 0)
        {
            cout << "Buzz" << endl;
        }
        else
        {
            cout << i << endl;
        }
    }
}