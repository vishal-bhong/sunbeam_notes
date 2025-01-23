using System;
using System.Collections;
using System.IO;
using System.Runtime.Serialization.Formatters.Binary;

namespace _17Demo_FileIO
{
    public class Program
    {
        static void Main(string[] args)
        {
            #region Simple File Write
            //Console.WriteLine("Enter something");
            //string data = Console.ReadLine();

            //string filePath = "C:\\Users\\Admin\\OneDrive\\Desktop\\CDAC\\DOTNETDemos\\MyData.txt";

            //FileStream stream = null;

            //if (File.Exists(filePath))
            //{
            //    stream = new FileStream(filePath, FileMode.Append, 
            //                                      FileAccess.Write);

            //}
            //else
            //{
            //    stream = new FileStream(filePath, FileMode.OpenOrCreate,
            //                                      FileAccess.Write);
            //}

            //StreamWriter pen = new StreamWriter(stream);

            //pen.WriteLine(data);

            //pen.Close();
            //stream.Close();
            //Console.WriteLine("Done Writing..");
            #endregion

            #region Simple File Read

            //string filePath = "C:\\Users\\Admin\\OneDrive\\Desktop\\CDAC\\DOTNETDemos\\MyData.txt";

            //FileStream stream = null;

            //if (File.Exists(filePath))
            //{
            //    stream = new FileStream(filePath, FileMode.Open,
            //                                      FileAccess.Read);

            //    StreamReader reader = new StreamReader(stream);
            //    string dataFromFile = reader.ReadToEnd();

            //    Console.WriteLine(dataFromFile);
            //    reader.Close();
            //    stream.Close();
            //    Console.WriteLine("Done Reading..");
            //}
            //else
            //{
            //    Console.WriteLine("File not found!");
            //}

            #endregion

            #region Store Emp Object

            //Emp emp = new Emp();

            //Console.WriteLine("Enter Emp No");
            //emp.No = Convert.ToInt32(Console.ReadLine());

            //Console.WriteLine("Enter Emp Name");
            //emp.Name = Console.ReadLine();

            //Console.WriteLine("Enter Emp Address");
            //emp.Address = Console.ReadLine();

            //string filePath = "C:\\Users\\Admin\\OneDrive\\Desktop\\CDAC\\DOTNETDemos\\MyObjectData.txt";

            //FileStream stream = null;

            //if (File.Exists(filePath))
            //{
            //    stream = new FileStream(filePath, FileMode.Append,
            //                                      FileAccess.Write);

            //}
            //else
            //{
            //    stream = new FileStream(filePath, FileMode.OpenOrCreate,
            //                                      FileAccess.Write);
            //}

            //BinaryFormatter helper = new BinaryFormatter();

            //helper.Serialize(stream, emp);

            //helper = null;
            //stream.Close();

            //Console.WriteLine("Done Writing Object..");

            #endregion

            #region Fetch Emp Object

            //string filePath = "C:\\Users\\Admin\\OneDrive\\Desktop\\CDAC\\DOTNETDemos\\MyObjectData.txt";

            //FileStream stream = null;

            //if (File.Exists(filePath))
            //{
            //    stream = new FileStream(filePath, FileMode.Open,
            //                                      FileAccess.Read);

            //    BinaryFormatter helper = new BinaryFormatter();

            //    object obj =  helper.Deserialize(stream);

            //    //if(obj.GetType().ToString() == "_17Demo_FileIO.Emp")
            //    if (obj is Emp)
            //    {
            //        Emp emp = (Emp)obj;
            //        Console.WriteLine(emp.No.ToString() + emp.Name + emp.Address);
            //    }

            //    helper = null;
            //    stream.Close();
            //}
            //else
            //{
            //    Console.WriteLine("File Not Found!");
            //}

         

            //Console.WriteLine("Done Reading Object..");

            #endregion

            Console.ReadLine();
        }
    }

    [Serializable]
    public class Emp
    {
        private int _No;
        private string _Name;
        private string _Address;

        [NonSerialized]
        private string _Password = "abc@123";

        public string Address
        {
            get { return _Address; }
            set { _Address = value; }
        }

        public string Name
        {
            get { return _Name; }
            set { _Name = value; }
        }

        public int No
        {
            get { return _No; }
            set { _No = value; }
        }

    }

}
