using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.InteropServices;
using System.Text;
using System.Threading.Tasks;

namespace _02Demo_OOP
{
    internal class Program
    {
        static void Main(string[] args)
        {
            #region Use Person
            //Person person = new Person();
            //person.No = 100;
            //person.Name = "Sachin";

            // Person person = new Person(101, "Rohit");

            //string details = person.GetDetails();
            //Console.WriteLine(details);
            //Console.ReadLine();
            #endregion

            #region Use Employee

            //Employee employee = new Employee();
            //employee.No = 91;
            //employee.Name = "Rahul";

            //string details = employee.GetDetails();
            //Console.WriteLine(details);

            #endregion


            //Employee employee = new Employee();
            //employee.No = 1;
            //employee.Name = "Laxman";

            Employee employee = new Employee(10, "sachin", "mumbai");

            string details = employee.GetDetails();
            Console.WriteLine( details);
            Console.ReadLine();
        }
    }

    public class Person
    {
        private int _No;
        private string _Name;

        public string Name
        {
            get { return _Name; }
            set { _Name = value; }
        }

        public int No
        {
            get { return _No; }
            set { _No = value; }
        }


        public Person()
        {
            No = 0;
            Name = "";
        }


        public Person(int no, string name)
        {
            No = no;
            Name = name;
        }

        public virtual string GetDetails()
        {
            return No.ToString() + Name;
        }
    }


    public class Employee : Person
    {
        private string _Location;

        public string Location
        {
            get { return _Location; }
            set { _Location = value; }
        }


        public Employee() : base()
        {
            Location = "Pune";
        }

        public Employee(int no, string name, string location) : base(no,name)
        {
            Location = location;
        }

        public override string GetDetails()
        {
            return base.GetDetails()  + Location;
        }


    }
}
