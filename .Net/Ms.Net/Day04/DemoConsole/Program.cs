
using System;

namespace DemoConsole
{
    internal class Program
    {
        static void Main(string[] args)
        {
            #region First Demo Code
            //Console.WriteLine("Hello .NET ");
            //Console.ReadLine(); 
            #endregion

            int i = 199;

            Console.WriteLine("Enter Something");
            
            string xValue = Console.ReadLine();

            Console.WriteLine(xValue);

            Console.WriteLine("Hit Enter To Close App");
            Console.ReadLine();
        }
    }

    #region Below code is used for Testing multiple main methods in one project
    //internal class Program2
    //{
    //    static void Main(string[] args)
    //    {
    //    }
    //}
    #endregion

}
