using System;
using System.Collections;
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
            #region Old Code
            // int i = int.Parse(null); //This checks for NULL
            //int i = Convert.ToInt32(null); //This allows NULL and put default value as Zero

            //Type type = typeof(Emp);
            //MethodInfo []allMethods =  type.GetMethods();

            //PropertyInfo[] allProeprties = type.GetProperties(); 

            //Emp e1 = new Emp();
            //e1.Name  = "A";

            //e1 = null;
            #endregion

            Week week = new Week();
            Console.WriteLine(week[0]);

            ArrayList col = new ArrayList();
            col.Add("mahesh"); col.Add("nilesh");
            Console.WriteLine(col[0]);
        }
    }

    public class Week
    {
        private string[] Days = new string[] { "Mon", "Tue", "Wed" };


        //This is indexer used by almost every collection class
        public string this[int i]
        {
            get  { return Days[i]; }
        }

    }

    public class Emp: IDisposable
    {

        private string _name;

        public string Name
        {
            get { return _name; }
            set { _name = value; }
        }

        public void Dispose()
        {
           //Cleaning code
        }

        public string GetDetails()
        {
            return "details";
        }

    }


}
