using System;

namespace _15Demo_OOP
{
    public class Program
    {
        static void Main(string[] args)
        {
            MySQL mySQL = new MySQL();
            mySQL.OnInsert += new SomeDelegate(MySQL_OnInsert);
            mySQL.DoInsert();

            Oracle oracle = new Oracle();
            oracle.OnDelete += new SomeDelegate(Oracle_OnDelete);
            oracle.DoDelete();

            Console.ReadLine();
        }

        private static void Oracle_OnDelete(string message)
        {
            //Let developer of main method decide here 
            //what to do for logging
            //may be log in DB or email or sms or file or etc etc
            Console.WriteLine("Oracle On Delete Log logic for message " + message);
        }

        private static void MySQL_OnInsert(string message)
        {
            //Let developer of main method decide here 
            //what to do for logging
            //may be log in DB or email or sms or file or etc et
            Logger.CurrentLogger.Log(message);
        }
    }

    public delegate void SomeDelegate(string message);
    public abstract class Database
    {
        public event SomeDelegate OnInsert;
        public event SomeDelegate OnUpdate;
        public event SomeDelegate OnDelete;
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
            OnInsert("Insert is done!.");
        }

        public void DoUpdate()
        {
            Update();
            OnUpdate("Update is done!.");
        }

        public void DoDelete()
        {
            Delete();
            OnDelete("Delete is done!");
        }

    }

    public class MySQL : Database
    {
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

}
