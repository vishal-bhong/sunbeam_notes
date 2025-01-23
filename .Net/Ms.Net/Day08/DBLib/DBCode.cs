using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace DBLib
{
    //Architect Authored Code
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
            Logger.CurrentLogger.Log(_dbName + " INSERT TOOK PLACE");
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
