using System;
using System.Collections.Generic;
using System.Linq;
using System.Net;
using System.Text;
using System.Threading.Tasks;

namespace _00029Demo_Features
{
    public class Program
    {
        static void Main(string[] args)
        {
            #region Filter Collection Via ForEach
            //var emps = new List<Emp>() { 
            //    new Emp{ No = 1, Name = "sourav", Address = "kolkata" },
            //    new Emp{ No = 2, Name = "rahul", Address = "banglore" },
            //    new Emp{ No = 3, Name = "mahendra", Address = "ranchi" },
            //    new Emp{ No = 4, Name = "sachin", Address = "mumbai" },
            //    new Emp{ No = 5, Name = "laxman", Address = "hyderabad" }
            //};

            //Console.WriteLine("Enter City Filter:");
            //string cityDetails = Console.ReadLine();

            //var result = new List<Emp>();

            //foreach (var emp in emps)
            //{
            //    if (emp.Address.Contains(cityDetails))
            //    {
            //        result.Add(emp);    
            //    }
            //}

            //Console.WriteLine("-------------result is -----------------");
            //foreach (var item in result)
            //{
            //    Console.WriteLine(item.Name + " | " + item.Address);
            //}
            #endregion

            #region LINQ - Demo 1
            //var emps = new List<Emp>() {
            //    new Emp{ No = 1, Name = "sourav", Address = "kolkata" },
            //    new Emp{ No = 2, Name = "rahul", Address = "banglore" },
            //    new Emp{ No = 3, Name = "mahendra", Address = "ranchi" },
            //    new Emp{ No = 4, Name = "sachin", Address = "mumbai" },
            //    new Emp{ No = 5, Name = "laxman", Address = "hyderabad" }
            //};

            //Console.WriteLine("Enter City Filter:");
            //string cityDetails = Console.ReadLine();

            //var result = from emp in emps
            //             where emp.Address.Contains(cityDetails)
            //             select emp;

            ////var result = (from emp in emps
            ////              where emp.Address.Contains(cityDetails)
            ////              select emp).ToList();

            ////Below code is to check lazy loading / execution of the LINQ
            //emps.Add(new Emp() { No = 6, Name = "virat", Address = "pune" });

            //Console.WriteLine("-------------result is -----------------");
            //foreach (var item in result)
            //{
            //    Console.WriteLine(item.Name + " | " + item.Address);
            //}
            #endregion

            #region LINQ -  Demo 2
            //var emps = new List<Emp>() {
            //    new Emp{ No = 1, Name = "sourav", Address = "kolkata" },
            //    new Emp{ No = 2, Name = "rahul", Address = "banglore" },
            //    new Emp{ No = 3, Name = "mahendra", Address = "ranchi" },
            //    new Emp{ No = 4, Name = "sachin", Address = "mumbai" },
            //    new Emp{ No = 5, Name = "laxman", Address = "hyderabad" }
            //};

            //Console.WriteLine("Enter City Filter:");
            //string cityDetails = Console.ReadLine();

            //var result = from emp in emps
            //             where emp.Address.Contains(cityDetails)
            //             select emp.Name;

            //Console.WriteLine("-------------result is -----------------");
            //foreach (var name in result)
            //{
            //    Console.WriteLine(name);
            //}
            #endregion

            #region LINQ -  Demo 3
            //var emps = new List<Emp>() {
            //    new Emp{ No = 1, Name = "sourav", Address = "kolkata" },
            //    new Emp{ No = 2, Name = "rahul", Address = "banglore" },
            //    new Emp{ No = 3, Name = "mahendra", Address = "ranchi" },
            //    new Emp{ No = 4, Name = "sachin", Address = "mumbai" },
            //    new Emp{ No = 5, Name = "laxman", Address = "hyderabad" }
            //};

            //Console.WriteLine("Enter City Filter:");
            //string cityDetails = Console.ReadLine();

            //////Below query is wrong!
            ////var result = from emp in emps
            ////             where emp.Address.Contains(cityDetails)
            ////             select emp.Name, emp.Address;

            ////var result = from emp in emps
            ////             where emp.Address.Contains(cityDetails)
            ////             select new ResultHolder() { EName = emp.Name, EAddress = emp.Address };

            ////var result = (from emp in emps
            ////              where emp.Address.Contains(cityDetails)
            ////              select new { EName = emp.Name, EAddress = emp.Address }).ToList();




            //Console.WriteLine("-------------result is -----------------");
            //foreach (var item in result)
            //{
            //    Console.WriteLine(item.EName + " - " + item.EAddress);
            //}
            #endregion

            #region LINQ - Demo 4
            //var emps = new List<Emp>() {
            //    new Emp{ No = 1, Name = "sourav", Address = "kolkata" },
            //    new Emp{ No = 2, Name = "rahul", Address = "banglore" },
            //    new Emp{ No = 3, Name = "mahendra", Address = "ranchi" },
            //    new Emp{ No = 4, Name = "sachin", Address = "mumbai" },
            //    new Emp{ No = 5, Name = "laxman", Address = "hyderabad" }
            //};

            //Console.WriteLine("Enter City Filter:");
            //string cityDetails = Console.ReadLine();

            ////var result = from emp in emps
            ////             where emp.Address.Contains(cityDetails)
            ////             select emp;

            ////var result = emps.Where((emp) => { return emp.Address.Contains(cityDetails); });

            //var result = emps.Where((emp) => { return emp.Address.Contains(cityDetails); })
            //                 .Select((emp) => { return new { EName = emp.Name, EAddress = emp.Address }; });

            //Console.WriteLine("-------------result is -----------------");
            //foreach (var item in result)
            //{
            //    Console.WriteLine(item.EName + " | " + item.EAddress);
            //}
            #endregion

            Console.ReadLine();

        }
    }
    public class Emp
    {
        public int No { get; set; }
        public string Name { get; set; }
        public string Address { get; set; }
    }


    public class ResultHolder
    {
        public string EName { get; set; }
        public string EAddress { get; set; }
    }

}
