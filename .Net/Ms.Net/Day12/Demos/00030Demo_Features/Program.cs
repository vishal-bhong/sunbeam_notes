using System;
using System.Collections;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _00030Demo_Features
{
    internal class Program
    {
        static void Main(string[] args)
        {
            #region Partial Methods
            //Demo demo = new Demo();

            //Emp emp = new Emp();
            //emp.No = 100;
            //emp.Name = "mahesh";
            #endregion

            #region Dynamic Type
            //Console.WriteLine("ENter some number");
            //int choice = Convert.ToInt32(Console.ReadLine());

            //Factory factory = new Factory();

            //dynamic obj = factory.GetMeSomething(choice);
            //obj.Insert();

            //object obj = factory.GetMeSomething(choice);

            //if (obj is SqlServer)
            //{
            //    SqlServer server = (SqlServer)obj;
            //    server.Insert();
            //}
            //else if (obj is Book)
            //{
            //    Book book = (Book)obj;
            //    Console.WriteLine(book.GetBookDetails()) ;
            //}
            #endregion

            #region Optional & Named Parameter

            //Emp emp = new Emp();

            ////string result = emp.GetDetails(10, "sachin", "mumbai");

            ////string result = emp.GetDetails(10);

            ////string result = emp.GetDetails(10, "rohit");

            ////string result = emp.GetDetails(10, address: "chennai");

            //string result = emp.GetDetails(10, address: "chennai", name: "sandip");

            //Console.WriteLine(result);

            #endregion

            #region Iterator
            //List<string> list = new List<string>(); 

            //Week week = new Week();

            //foreach (string day in week)
            //{
            //    Console.WriteLine(day);

            //}
            #endregion
        }

        public class Week : IEnumerable
        {
            private string []days = new string[] {"Mon", "Tue", "Wed", "Thur" };

            public IEnumerator GetEnumerator()
            {
                for (int i = 0; i < days.Length; i++)
                {
                   yield return days[i];
                }
            }
        }

        public class Emp
        {
            public string GetDetails(int no, string name="sachin", string address="pune")
            {
                return no.ToString() + name + address;
            }
        }

        public class SqlServer
        {
            public void Insert()
            {
                Console.WriteLine("SQL Server Insert Done");
            }
        }

        public class Book
        {
            public string GetBookDetails()
            {
                return "Some book details.";
            }
        }

        public class Factory
        {
            public object GetMeSomething(int choice)
            {
                if (choice == 1)
                {
                    return new SqlServer();
                }
                else
                {
                    return new Book();
                }
            }
        }
    }


}
