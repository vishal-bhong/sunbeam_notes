using System;
using System.Runtime.InteropServices;

namespace CalcLib
{
    //[Serializable]
    //[ComVisible(true)]
    public class Maths
    {
        public int Add(int x , int y)
        { 
            return x + y; 
        }

        public int Sub(int x, int y)
        {
            return x - y;
        }
    }
}
