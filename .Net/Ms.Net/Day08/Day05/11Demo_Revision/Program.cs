using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _11Demo_Revision
{
    public class Program
    {

        static void Main(string[] args)
        {
            MyDelegate ptr = new MyDelegate(MyLog);
            

            MySQL client1 = new MySQL();
            client1.OnInsert += ptr;

            client1.Insert();

            Console.ReadLine();
        }

        public static void MyLog(string msg)
        {
            Console.WriteLine("MY LOG " + msg);
        }

    }

    public delegate void MyDelegate(string message);


    public class MySQL
    {
        public event MyDelegate OnInsert;
        public void Insert()
        {
            Console.WriteLine("MySQL DB Inserted with Record!");
            OnInsert("MYSQL INSERT DONE!");//Intrupt CLR
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

    public class Logger : ILogger
    {
        private static Logger logger = new Logger();
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

}
