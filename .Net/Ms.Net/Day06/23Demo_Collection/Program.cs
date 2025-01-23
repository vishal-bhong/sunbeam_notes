using System;
using System.Collections;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _23Demo_Collection
{
    internal class Program
    {
        static void Main(string[] args)
        {
            #region Boxing / Unboxing
            //int i = 100; //Stack

            //object obj = i; //Boxing

            //if (obj is int)
            //{
            //    int j = Convert.ToInt32(obj); //UnBoxing
            //}
            #endregion

            #region Simple Int Array

            ////int[]arr = new int[] { 1, 2, 3 };

            //int[] arr = new int[3] ;

            //arr[0] = 10;
            //arr[1] = 20 ;
            //arr[2] = 30 ;
            ////arr[3] = 40;//error here

            //for (int i = 0; i < arr.Length; i++)
            //{
            //    Console.WriteLine(arr[i]);
            //}

            #endregion

            #region All Emp Defined
            Emp e1 = new Emp();
            e1.No = 10;
            e1.Name = "Sameer";
            e1.Address = "Mumbai";

            Emp e2 = new Emp();
            e2.No = 20;
            e2.Name = "Ameer";
            e2.Address = "Manmad";

            Emp e3 = new Emp();
            e3.No = 30;
            e3.Name = "Meera";
            e3.Address = "Chennai";

            #endregion

            #region Emp Array

            //Emp[] arr = new Emp[] { e1, e2, e3 };

            //Emp[] arr = new Emp[3];
            //arr[0] = e1;
            //arr[1] = e2;
            //arr[2] = e3;

            //for (int i = 0; i < arr.Length; i++)
            //{
            //    Emp emp = arr[i];
            //    Console.WriteLine(emp.No.ToString() + emp.Name + emp.Address);
            //}

            #endregion

            #region Object Array

            //object[] arr = new object[] { 10, "abcd", e1 };

            //for (int i = 0; i < arr.Length; i++)
            //{
            //    object obj = arr[i];

            //    if (obj is int)
            //    {
            //        int j = Convert.ToInt32(obj);
            //        Console.WriteLine(j);
            //    }
            //    else if (obj is string) 
            //    {
            //        string data = obj.ToString();
            //        Console.WriteLine(data);
            //    }
            //    else if (obj is Emp)
            //    {
            //        Emp emp = (Emp)obj;
            //        Console.WriteLine(emp.No.ToString() + emp.Name + emp.Address);
            //    }
            //    else
            //    {
            //        Console.WriteLine(  "Unknown type of data!");
            //    }

            //}

            #endregion

            #region ArrayList: Collection of Objects 

            //ArrayList arr = new ArrayList();
            //arr.Add(10); //boxing
            //arr.Add(e1); //Casting
            //arr.Add(true); //boxing
            //arr.Add("abcd"); //Casting
            //arr.Add(new Student()); //Casting

            //for (int i = 0; i < arr.Count; i++)
            //{
            //    object obj = arr[i];

            //    if (obj is int)
            //    {
            //        int j = Convert.ToInt32("abcd");
            //        Console.WriteLine(j);
            //        throw new Exception("abcd");
            //    }
            //    else if (obj is string)
            //    {
            //        string data = obj.ToString();
            //        Console.WriteLine(data);
            //    }
            //    else if (obj is bool)
            //    {
            //        bool b = Convert.ToBoolean(obj);
            //        Console.WriteLine(b);
            //    }
            //    else if (obj is Emp)
            //    {
            //        Emp emp = (Emp)obj;
            //        Console.WriteLine(emp.No.ToString() + emp.Name + emp.Address);
            //    }
            //    else
            //    {
            //        Console.WriteLine("Unknown type of data!");
            //    }

            //}




            #endregion



        }
    }

    public class Student
    {

    }

    public class Emp
    {
        private int _No;
        private string _Name;
        private string _Address;

        public string Address
        {
            get { return _Address; }
            set { _Address = value; }
        }

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

    }
}
