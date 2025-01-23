using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _09Demo_Revision
{
    delegate int MyDelegate(int x, int y);
    public class Program
    {
        static void Main(string[] args)
        {
            //int result = Add(10, 20);
            //MyDelegate pointer = new MyDelegate(Add);
            //int result = pointer(10, 20);

            //Console.WriteLine(result);



            MySQL client1 = new MySQL(Logger.CurrentLogger);
            client1.Insert();

            MySQL client2 = new MySQL(new EMailLogger());
            client2.Insert();


            Console.ReadLine();
        }

        public static int Add(int x , int y)
        {
            return x + y;
        }
    }

    public class MySQL
    {
        ILogger _logger = null;
        public MySQL(ILogger logger)
        {
            _logger = logger;
        }
        public void Insert()
        {
            Console.WriteLine("MySQL DB Inserted with Record!");
            _logger.Log("MYSQL INSERT DONE!");
        }
    }

    public interface ILogger
    {
        void Log(string message);
    }


    public class EMailLogger : ILogger
    {
        public void Log(string message)
        {
            Console.WriteLine("Log over EMail " + message);
        }
    }

    public class  Logger : ILogger
    {
        private static Logger logger   = new Logger();
        private Logger()
        {
            
        }

        public static Logger CurrentLogger
        {
            get { return logger; }
        }

        public void Log(string message)
        {
            Console.WriteLine("LOGGED @ " + DateTime.Now.ToString() + " " + message);
        }
    }



    //public interface IX { } 

    //public struct Student { }

    //namespace MyNamespace
    //{
    //    public class Maths
    //    {

    //    }
    //}

    // delegate void MyDelegate(int x, int y);

    //public class MyDelegate : Delegate
    //{
    //    public MyDelegate()
    //    {
    //    }
    //}

}
