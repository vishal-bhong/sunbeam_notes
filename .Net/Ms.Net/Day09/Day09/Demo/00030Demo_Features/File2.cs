using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.InteropServices;
using System.Text;
using System.Threading.Tasks;

namespace _00030Demo_Features
{
    //FILE 2
    public partial class Demo
    {
        partial void Test(string name)
        {
            Console.WriteLine("Hi " + name);
        }
    }

    public partial class Emp
    {
        partial void Validate(string propertyName, object propertyValue)
        {
            if (propertyName == "Name")
            {
                if (propertyValue==null)
                {
                    throw new Exception("Name can not be null!");
                }
            }
            else if (propertyName == "No")
            {
                int NoValue = Convert.ToInt32(propertyValue);
                if (NoValue < 0)
                {
                    throw new Exception("No can not be less than zero!");
                }
            }
        }
    }
}
