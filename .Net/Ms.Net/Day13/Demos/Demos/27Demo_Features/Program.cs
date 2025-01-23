using System;
using System.Collections.Generic;
using System.Text;
using System.Threading.Tasks;
using System.Linq;
using System.Diagnostics;
using System.Linq.Expressions;
using System.Reflection.Emit;
using System.Reflection;
namespace _27Demo_Features
{
    public class Program
    {
        //var i = 100;      //Can't use at global scope. ERR
        static void Main(string[] args)
        {
            #region Partial Class
            //Maths obj = new Maths();
            #endregion

            #region Event Handler Via Named Method, Anonymous Method and Lambada Expression

            Student student = new Student();
            student.Name = "Parth";

            #region Named Method Attachment to Event
            ////MyDelegate gajendra = new MyDelegate(OnAcceptCallThis);
            ////MyDelegate srinivas = new MyDelegate(OnRejectCallThis);

            //student.Accept += gajendra;
            //student.Reject += srinivas;
            #endregion

            #region Anonymous Method Attachment to Event

            //student.Accept += delegate(string message)
            //{
            //    Console.WriteLine("Congrats!");
            //};

            //student.Reject +=delegate (string message)
            // {
            //    Console.WriteLine("Sorry!");
            //};
            #endregion

            #region Lambada Expression Attachement to Event
            student.Accept += (message) =>
            {
                Console.WriteLine("Congrats!");
            };

            student.Reject += (message) =>
            {
                Console.WriteLine("Sorry!");
            };
            #endregion

            //Console.WriteLine("Bolo! Kya Hai?");
            //student.Propose(Console.ReadLine());

            #endregion

            #region Nullable Type
            //Nullable<int> salary = null;

            //int? salary = null;
            //int? salary = 0;

            //if (salary.HasValue)
            //{
            //    Console.WriteLine("Salary has value");
            //}
            //else
            //{
            //    Console.WriteLine("Salary is NULL");
            //}    
            #endregion

            #region Var OR Implicit Type
            //var i = 100; // is same as int i = 100;
            //var s = new Student(); // is same as Student s = new Student();

            //i = "ddhdhdhd"; //this throws err

            // var i;        //var needs to be initialized is err

            //Console.WriteLine("Enter Your choice Number");
            //int  choice = Convert.ToInt32(Console.ReadLine());

            ////object obj = GetMeSomthing(choice);
            ////is same as below line
            //var obj = GetMeSomthing(choice);

            #endregion

            #region Object Initializer

            //Emp emp = new Emp();
            //emp.No = 10;
            //emp.Name = "Ketan";
            //emp.Address = "Sangli";

            ////Concept : Object Initializer
            ////[ Above 4 lines are same as below 1 line]
            //Emp emp = new Emp() { No = 10, Name = "Sachin", Address = "Pune" };


            //Console.WriteLine(emp.No.ToString() + emp.Name + emp.Address);
            #endregion

            #region Anonymous Type 
            //var v = new Emp() { No = 1, Name = "Sourav", Address = "Kolkata" };

            //Console.WriteLine(v.No.ToString() + v.Name + v.Address);

            //var v = new { No = 1, Name = "Sourav", Address = "Kolkata" };
            //Console.WriteLine(v.No.ToString() + v.Name + v.Address);
            //Console.WriteLine(v.GetType());
            //v.Name = "changed";//All properties of anonymous type are bu default read only!! So ERR here


            //var v1 = new { No = 11, Name = "Santosh", Address = "Kochi" };
            //Console.WriteLine(v1.No.ToString() + v1.Name + v1.Address);
            //Console.WriteLine(v1.GetType());

            //var v1 = new { No = "Eleven", Name = 234, Address = "Kochi" };
            //Console.WriteLine(v1.No.ToString() + v1.Name + v1.Address);
            //Console.WriteLine(v1.GetType());

            //SpecialMaths<int, string, string> specialMaths1 = new SpecialMaths<int, string, string>();
            //specialMaths1.SomeNonsenseMethod(10, "cdcd", "dcdc");

            //SpecialMaths<int, string, short> specialMaths2 = new SpecialMaths<int, string, short>();
            //specialMaths2.SomeNonsenseMethod(10, "cdcd", 3);

            //var v1 = new { Name = "Sourav", Address = "Kolkata", No = 1};
            //Console.WriteLine(v1.No.ToString() + v1.Name + v1.Address);
            //Console.WriteLine(v1.GetType());

            //var v = new { No = 1, Name = "Sourav", Address = "Kolkata" };
            //Console.WriteLine(v.No.ToString() + v.Name + v.Address);
            //Console.WriteLine(v.GetType());

            #endregion

            #region Extension Method
            //List<int> arr = new List<int>() { 10, 20,30};
            //var avg = arr.Average();
            //Console.WriteLine(avg);

            //string str = "abc@d.com";
            ////bool isValid =  Helper.CheckForValidEMailAddress(str, 100);
            //bool isValid = str.CheckForValidEMailAddress(100);
            //Console.WriteLine(isValid);

            //Helper obj = new Helper();
            //bool isValidEMail = obj.CheckForValidEMailAddress(str, 100);
            #endregion

            #region Call Function Via - Delegate | Anonymous Function | Lambada Expression | Expression Tree 
            ////Normal Delegate
            ////YourDelegate pointer = new YourDelegate(Check);

            ////Generaic Delegate
            ////YourDelegate<bool, int> pointer = new YourDelegate<bool, int>(Check);

            ////Action or Func???

            ////Func<int, bool> pointer = delegate(int i)
            ////                             {
            ////                                    return (i > 10);
            ////                             };


            ////Func<int, bool> pointer = (i)=>
            ////                            {
            ////                                return (i > 10);
            ////                            };


            ////Create a Expression Tree
            //Expression<Func<int, bool>> tree = (i) => (i > 10);

            ////Compile a Tree
            //Func<int, bool> pointer = tree.Compile();


            ////AssemblyBuilder assemblyBuilder;
            ////Type MyType = new Type() { Name = "MyClass" };
            ////MethodBuilder methodbuilder = new MethodBuilder() { Name = "CompiledCheck"};

            ////tree.CompileToMethod(methodbuilder);

            ////MyType.Methods.Add(methodbuilder);

            ////assemblyBuilder.AddTypes(MyType);

            ////assemblyBuilder.Save("YOUR DLL Path");
            ////Now, your DLL will hold compiled expression tree in  CompiledCheck method
            ////CompiledCheck method is part of MyClass which inturn part of Your DLL



            //Stopwatch stopwatch = new Stopwatch();
            //stopwatch.Start();

            ////bool result = Check(20);///   450
            ////bool result = pointer(20);//Normal Your Delegate 444
            ////bool result = pointer(20); //Generic Delegate / Func

            //bool result = pointer(20);

            //stopwatch.Stop();

            //Console.WriteLine(result);
            //Console.WriteLine("Time taken = " + stopwatch.ElapsedTicks);
            #endregion

            Console.ReadLine();
        }

      

        //public static bool Check(int i)
        //{
        //    return (i > 10);
        //}


        public static object GetMeSomthing(int choice)
        {
            if (choice == 1)
            {
                return 100;
            }
            else
            {
                return new Student();
            }
        }

        //public void DoSomething(var v) //Err : Var can not be used in here.s
        //{
        //    //
        //}

        #region Named Methods / Event Handlers
        //public static void OnAcceptCallThis(string message)
        //{
        //    Console.WriteLine("Congrats!");
        //}

        //public static void OnRejectCallThis(string message)
        //{
        //    Console.WriteLine("Sorry!");
        //}
        #endregion
    }

    //public delegate P YourDelegate<P,Q>(Q i);

    //public delegate bool YourDelegate(int i);


    #region Extension Class / Extension Method
    //public class MyString: String
    public static class Helper
    {
        public static bool CheckForValidEMailAddress(this string str, int i)
        {
            //Some logic to check valid email address
            return true;
        }
    }

    #endregion

    public delegate void MyDelegate(string msg);
    public class Student
    {
        private string _Name;
        public string Name
        {
            get { return _Name; }
            set { _Name = value; }
        }

        public event MyDelegate Accept;
        public event MyDelegate Reject;
        public void Propose(string message)
        {
            if (message.Contains("sunbeam"))
            {
                Reject(message);
            }
            else
            {
                Accept(message);
            }
        }
    }

    public class Emp
    {
        #region Auto Property
        public int No { get; set; }
        public string Name { get; set; }
        public string Address { get; set; }
        #endregion

        #region Normal Getter / Setter
        //private int _No;
        //private string _Name;

        //public string Name
        //{
        //    get { return _Name; }
        //    set { _Name = value; }
        //}

        //public int No
        //{
        //    get { return _No; }
        //    set { _No = value; }
        //}
        #endregion



    }

    public class SpecialMaths<No,Name,Address>
    {
        public void SomeNonsenseMethod(No p1, Name q1, Address r1)
        {
            //some logic
        }
    }

    public class SpecialMaths1<Name, Address, No>
    {
        public void SomeNonsenseMethod(No p1, Name q1, Address r1)
        {
            //some logic
        }
    }
}
