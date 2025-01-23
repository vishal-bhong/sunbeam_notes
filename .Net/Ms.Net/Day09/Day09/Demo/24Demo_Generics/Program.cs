using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _24Demo_Generics
{
    internal class Program
    {
        static void Main(string[] args)
        {
            #region Example 1: Calling Generic + NonGeneric Method


       
            Maths<int> obj = new Maths<int>();

            //int result = obj.Add(10, 20);
            //Console.WriteLine(result);
            
            int p = 100;
            int q = 200;
            Console.WriteLine("Before Swap P = " + p.ToString() +
                                "Q = " + q.ToString());

            obj.Swap(ref p, ref q);

            Console.WriteLine("After Swap P = " + p.ToString() +
                              "Q = " + q.ToString());


            Maths<bool> obj1 = new Maths<bool>();

            bool p1 = true;
            bool q1 = false;
            Console.WriteLine("Before Swap P1 = " + p1.ToString() +
                                "Q1 = " + q1.ToString());

            obj1.Swap(ref p1, ref q1);

            Console.WriteLine("After Swap P1 = " + p1.ToString() +
                               "Q1 = " + q1.ToString());


            
            #endregion

            #region Example 2

            //Maths obj = new Maths();
            //int result = obj.Add(10, 20);
            //Console.WriteLine(result);



            //int p = 100;
            //int q = 200;
            //Console.WriteLine("Before Swap P = " + p.ToString() +
            //                    "Q = " + q.ToString());

            //obj.Swap<int>(ref p, ref q);

            //Console.WriteLine("After Swap P = " + p.ToString() +
            //                  "Q = " + q.ToString());
            #endregion

            #region Example 3: Generics + Inheritance

            //SpecialMaths obj = new SpecialMaths();

            //int p = 100;
            //int q = 200;
            //Console.WriteLine("Before Swap P = " + p.ToString() +
            //                    "Q = " + q.ToString());

            //// obj.Swap(ref p, ref q);
            //// obj.Swap<int>(ref p, ref q);

            //Console.WriteLine("After Swap P = " + p.ToString() +
            //                  "Q = " + q.ToString());
            #endregion

            #region Example 4: Generics + Inheritance

            //SpecialMaths<int, string, bool> obj = new SpecialMaths<int, string, bool>();

            //bool result1 = obj.SomeNonsenseMethod(10, "abcd", true);
            //Console.WriteLine(result1);

            //int p = 100;
            //int q = 200;
            //Console.WriteLine("Before Swap P = " + p.ToString() +
            //                    "Q = " + q.ToString());

            //obj.Swap(ref p, ref q);

            //Console.WriteLine("After Swap P = " + p.ToString() +
            //                  "Q = " + q.ToString());
            #endregion

            Console.ReadLine();
        }
    }

    #region MyRegion
    //public class Maths
    //{
    //    public int Add(int x, int y)
    //    {
    //        return x + y;
    //    }

    //    public void Swap<T>(ref T x, ref T y)
    //    {
    //        T z = x;
    //        x = y;
    //        y = z;
    //    }


    //}
    #endregion

    #region Generic Class with NonGeneric + Generic Method
    //public class Maths<T>
    //{
    //    public int Add(int x, int y)
    //    {
    //        return x + y;
    //    }

    //    public void Swap(ref T x, ref T y)
    //    {
    //        T z = x;
    //        x = y;
    //        y = z;
    //    }

    //    //public void Swap(ref int x,ref int y)
    //    //{
    //    //    int z = x;
    //    //    x = y;
    //    //    y = z;
    //    //}


    //} 
    #endregion

    #region Inherit Generic Classes

    //public class Maths<T>
    //{
    //    public void Swap(ref T x, ref T y)
    //    {
    //        T z = x;
    //        x = y;
    //        y = z;
    //    }
    //}

    //public class SpecialMaths : Maths<int>
    //{

    //}
    #endregion

    #region Inherit Generic Classes

    public class Maths<T>
    {
        public void Swap(ref T x, ref T y)
        {
            T z = x;
            x = y;
            y = z;
        }
    }

    public class SpecialMaths<X,Y,Z> : Maths<X>
    {
        public Z SomeNonsenseMethod(X p1, Y p2, Z p3)
        {
            //some logic
            return p3;
        }
    }
    #endregion

}
