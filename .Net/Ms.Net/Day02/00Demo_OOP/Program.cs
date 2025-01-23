using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _00Demo_OOP
{
    internal class Program
    {
        static void Main(string[] args)
        {
            #region Way of calling getter setter like java
            //Person person = new Person();

            //Console.WriteLine("Enter your name");
            //string nm = Console.ReadLine();
            //person.Set_Name(nm);


            //string details = person.Get_Name();
            //Console.WriteLine(details);
            #endregion

            #region MS.NET way of calling properties
            Person person = new Person();

            Console.WriteLine("Enter your name");
            person.Name = Console.ReadLine();

            Console.WriteLine(person.Name);
            #endregion

            Console.ReadLine();

        }
    }

    public class Person
    {
        #region Writing Getter Setter Like Java or C++
        //private string _Name;

        //public void Set_Name(string name)
        //{
        //    //Some validation code here..
        //    //...........................
        //    //...........................
        //    _Name = name;
        //}

        //public string Get_Name()
        //{
        //    //We will manipulate name value
        //    //for presentation purpose!
        //    return "Mr / Mrs / Ms / Master " + _Name;
        //}
        #endregion

        #region Member & Properties

        private string _Name;

        public string Name
        {
            set
            {
                //Validation code here...
                //-----------------------
                _Name = value;
            }
            get
            {
                return "Mr / Mrs / Ms / Master " + _Name;

            }
        }

        #endregion
    }


 

}
