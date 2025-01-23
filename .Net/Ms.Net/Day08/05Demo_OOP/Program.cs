using System;

namespace _005Demo_OOP
{
    public class Program
    {
        static void Main(string[] args)
        {
            MySQL mySQL = new MySQL();
            mySQL.DoInsert();

            Oracle oracle = new Oracle();
            oracle.DoDelete();

            Console.ReadLine();
        }
    }

    public abstract class Database
    {
       protected abstract string GetDBName();
       protected abstract void Insert();
       protected abstract void Update();
       protected abstract void Delete();
       
        private string _dbName;

        public Database()
        {
            _dbName = GetDBName();
        }
        public void DoInsert()
        {
            Insert();
            Logger.CurrentLogger.Log (_dbName + " INSERT TOOK PLACE");
        }

        public void DoUpdate()
        {
            Update();
            Logger.CurrentLogger.Log(_dbName + " Update TOOK PLACE");
        }

        public void DoDelete()
        {
            Delete();
            Logger.CurrentLogger.Log(_dbName + " Delete TOOK PLACE");
        }

    }

    public class MySQL : Database
    {
        public MySQL()
        {
            
        }
        protected override void Delete()
        {
            Console.WriteLine("Data Deleted in MYSQL");
        }

        protected override string GetDBName()
        {
            return "MYSQL";
        }

        protected override void Insert()
        {
            Console.WriteLine("Data Inserted in MYSQL");
        }

        protected override void Update()
        {
            Console.WriteLine("Data Updated in MYSQL");
        }
    }

    public class Oracle : Database
    {
        protected override void Delete()
        {
            Console.WriteLine("Data Deleted in Oracle");
        }

        protected override string GetDBName()
        {
            return "Oracle";
        }

        protected override void Insert()
        {
            Console.WriteLine("Data Inserted in Oracle");
        }

        protected override void Update()
        {
            Console.WriteLine("Data Updated in Oracle");
        }
    }

    public class Logger
    {
        private static Logger logger = new Logger();
        private Logger()
        {
            Console.WriteLine("Logger Object Created...");
        }

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


    //public sealed class A
    //{

    //}

    //public class B : A
    //{

    //}
}
