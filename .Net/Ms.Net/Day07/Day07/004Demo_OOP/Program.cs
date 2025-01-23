using System;
using System.Collections.Generic;
using System.Diagnostics;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _004Demo_OOP
{
    public class Program
    {
        static void Main(string[] args)
        {
            MySQL mySQL = new MySQL();
            mySQL.Insert();

            Oracle oracle = new Oracle();
            oracle.Delete();

            Console.ReadLine();
        }
    }

    public class MySQL
    {
        // private Logger logger = Logger.GetLogger();
        //private Logger logger = Logger.CurrentLogger;
        public void Insert()
        {
            //Console.WriteLine("Machine Name is " + Process.GetCurrentProcess().MachineName);
            Console.WriteLine("Data Inserted in MYSQL");
            //logger.Log(" MYSQL INSERT TOOK PLACE");
            Logger.CurrentLogger.Log(" MYSQL INSERT TOOK PLACE");
        }

        public void Update()
        {
            Console.WriteLine("Data Updated in MYSQL");
            // logger.Log(" MYSQL UPDATE TOOK PLACE");
            Logger.CurrentLogger.Log(" MYSQL UPDATE TOOK PLACE");
        }

        public void Delete()
        {
            Console.WriteLine("Data Deleted in MYSQL");
            //logger.Log(" MYSQL DELETE TOOK PLACE");
            Logger.CurrentLogger.Log(" MYSQL DELETE TOOK PLACE");
        }
    }

    public class Oracle
    {
        //private Logger logger = Logger.GetLogger();
       // private Logger logger = Logger.CurrentLogger;
        public void Insert()
        {
            Console.WriteLine("Data Inserted in Oracle");
            //logger.Log(" Oracle INSERT TOOK PLACE");
            Logger.CurrentLogger.Log(" Oracle INSERT TOOK PLACE");
        }

        public void Update()
        {
            Console.WriteLine("Data Updated in Oracle");
            //logger.Log(" Oracle UPDATE TOOK PLACE");
            Logger.CurrentLogger.Log(" Oracle UPDATE TOOK PLACE");
        }

        public void Delete()
        {
            Console.WriteLine("Data Deleted in Oracle");
            //logger.Log(" Oracle DELETE TOOK PLACE");
            Logger.CurrentLogger.Log(" Oracle DELETE TOOK PLACE");
        }
    }


    public class Logger
    {
        private static Logger logger = new Logger();
        private Logger()
        {
            Console.WriteLine("Logger Object Created...");
        }

        //public static Logger GetLogger()
        //{
        //    return logger;
        //}

        public static Logger CurrentLogger
        {
            get { return logger; }
        }

        public void Log(string message)
        {
            Console.WriteLine("LOG: " + DateTime.Now.ToString() +
                               message);
        }
    }

}
