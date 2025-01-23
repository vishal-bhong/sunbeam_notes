using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _25Demo_Interfaces
{
    public class Program
    {
        static void Main(string[] args)
        {
            //IX obj = new Maths();
            IY obj = new Maths();

            Console.WriteLine(obj.Add(10, 20));
        }
    }

    public interface IX
    {
        int Add(int x, int y);
        int Sub(int x, int y);

    }

    public interface IY
    {
        int Add(int x, int y);
        int Mult(int x, int y);

    }

    public class Maths : IX, IY
    {
        public void DoSomeCOmplexCalculation()
        {

        }

        int IX.Add(int x, int y)
        {
            return x + y;
        }

        int IY.Add(int x, int y)
        {
            return x + y + 10;
        }

        int IY.Mult(int x, int y)
        {
            return x * y;
        }

        int IX.Sub(int x, int y)
        {
            return x - y;
        }
    }



    //public class Maths : IX, IY
    //{
    //    public int Add(int x, int y)
    //    {
    //        return x + y;
    //    }

    //    public int Mult(int x, int y)
    //    {
    //        return x * y;
    //    }

    //    public int Sub(int x, int y)
    //    {
    //        return x - y;
    //    }

    //    public void DoSomeCOmplexCalculation()
    //    {

    //    }
    //}
}
