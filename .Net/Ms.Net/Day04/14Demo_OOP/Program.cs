using System;
using DBLib;
namespace _14Demo_OOP
{
    public class Program
    {
        static void Main(string[] args)
        {
            MySQL mySQL = new MySQL();
            mySQL.DoInsert();

            Oracle oracle = new Oracle();
            oracle.DoDelete();

            Console.ReadLine();
        }
    }

   


    //Developer 1 authored code : Anupam
    public class MySQL : Database
    {
        protected override void Delete()
        {
            Console.WriteLine("Data Deleted in MYSQL");
        }

        protected override string GetDBName()
        {
            return "MYSQL";
        }

        protected override void Insert()
        {
            Console.WriteLine("Data Inserted in MYSQL");
        }

        protected override void Update()
        {
            Console.WriteLine("Data Updated in MYSQL");
        }
    }

    //Developer 2 authored code : yash
    public class Oracle : Database
    {
        protected override void Delete()
        {
            Console.WriteLine("Data Deleted in Oracle");
        }

        protected override string GetDBName()
        {
            return "Oracle";
        }

        protected override void Insert()
        {
            Console.WriteLine("Data Inserted in Oracle");
        }

        protected override void Update()
        {
            Console.WriteLine("Data Updated in Oracle");
        }
    }



}
