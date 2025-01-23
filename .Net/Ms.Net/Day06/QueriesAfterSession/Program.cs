using System;
using System.Collections.Generic;
using System.Linq;
using System.Reflection;
using System.Text;
using System.Threading.Tasks;

namespace QueriesAfterSession
{
    internal class Program
    {
        static void Main(string[] args)
        {
            //int i = int.Parse(null); //This checks for NULL
            //int i = Convert.ToInt32(null); //This allows NULL and put default value as Zero

            //Type type = typeof(Emp);
            //MethodInfo []allMethods =  type.GetMethods();

            //PropertyInfo[] allProeprties = type.GetProperties(); 



        }
    }
    public class Emp
    {
        private string _name;

        public string Name
        {
            get { return _name; }
            set { _name = value; }
        }

        public string GetDetails()
        {
            return "details";
        }

    }
}
