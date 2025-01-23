using CalcLib;
using System;
using System.Diagnostics;

namespace DemoConsoleTwo
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Maths maths = new Maths();
            int result = maths.Add(10, 20);
            Console.WriteLine(result);
            Console.ReadLine();
        }
    }
}
