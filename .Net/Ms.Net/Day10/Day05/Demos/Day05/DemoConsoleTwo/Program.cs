using CalcLib;
using System;


namespace DemoConsoleTwo
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Maths maths = new Maths();

            Console.WriteLine("Enter Value of X");
            string xValue = Console.ReadLine();
            int x = Convert.ToInt32(xValue);

            Console.WriteLine("Enter Value of Y");
            string yValue = Console.ReadLine();
            int y = Convert.ToInt32(yValue);
            
            int result = maths.Add(x,y);
            Console.WriteLine(result);
            Console.ReadLine();
        }
    }

}
