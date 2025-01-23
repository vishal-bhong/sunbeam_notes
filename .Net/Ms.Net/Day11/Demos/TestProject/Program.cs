using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.Remoting.Messaging;
using System.Text;
using System.Threading.Tasks;

namespace TestProject
{
    public class Program
    {
        static void Main(string[] args)
        {
            Maths obj = new Maths();
            int result = obj.Add(10, 20);
            Console.WriteLine(result);
            Console.ReadLine();
        }
    }

    public class Maths
    {
        public int Add(int i, int j)
        {
            return i + j + 100;
        }

        public int Sub(int iValue, int jValue)
        {
            return iValue - jValue;
        }
    }
}
