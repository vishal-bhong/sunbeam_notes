using Microsoft.Data.SqlClient;
using System.Text;

namespace _00032Demo_DB
{
    internal class Program
    {
        static void Main(string[] args)
        {
            string connectionDetails = "Data Source=(LocalDB)\\MSSQLLocalDB;Initial Catalog=PGDAC;Integrated Security=True;Encrypt=True";

            #region Select Data

            //SqlConnection connection = new SqlConnection(connectionDetails);
            //string queryText = "select * from Emp";
            //SqlCommand command = new SqlCommand(queryText, connection);
            //connection.Open();

            //SqlDataReader reader = command.ExecuteReader();

            //List<Emp> empList = new List<Emp>();

            //while (reader.Read())
            //{
            //    Emp emp = new Emp();
            //    emp.No = Convert.ToInt32(reader["No"]);
            //    emp.Name = reader["Name"].ToString();
            //    emp.Address = reader["Address"].ToString();
            //    empList.Add(emp);
            //}

            //connection.Close();

            //Console.WriteLine("------------------All Data -----------------------");
            //foreach (var e in empList)
            //{
            //    Console.WriteLine(e.No + " | " + e.Name + " | " +  e.Address);
            //}


            #endregion

            #region Insert Data

            //SqlConnection connection = new SqlConnection(connectionDetails);

            ////string queryText = "insert into Emp values(7,'" + Console.ReadLine() + 
            ////                    "', '" + Console.ReadLine() + "')";

            //string queryTextFormat = "insert into Emp values({0},'{1}', '{2}')";

            //Console.WriteLine("Enter No");
            //int no = Convert.ToInt32(Console.ReadLine());

            //Console.WriteLine("Enter Name");
            //string name = Console.ReadLine();

            //Console.WriteLine("Enter Address");
            //string address = Console.ReadLine();

            //string queryText = string.Format(queryTextFormat, no, name, address);


            //SqlCommand command = new SqlCommand(queryText, connection);
            //connection.Open();

            //int rowsAffected = command.ExecuteNonQuery();

            //connection.Close();

            ////string message = string.Format("Rows Affected are {0}", rowsAffected)
            ////Console.WriteLine(message);

            //Console.WriteLine("Rows Inserted are {0}", rowsAffected);

            #endregion

            #region Update Data

            //SqlConnection connection = new SqlConnection(connectionDetails);

            //string queryTextFormat = "update Emp set Name = '{1}', Address= '{2}' where No = {0}";

            //Console.WriteLine("Enter No To Update");
            //int no = Convert.ToInt32(Console.ReadLine());

            //Console.WriteLine("Enter Name");
            //string name = Console.ReadLine();

            //Console.WriteLine("Enter Address");
            //string address = Console.ReadLine();

            //string queryText = string.Format(queryTextFormat, no, name, address);

            //SqlCommand command = new SqlCommand(queryText, connection);
            //connection.Open();

            //int rowsAffected = command.ExecuteNonQuery();

            //connection.Close();

            //Console.WriteLine("Rows Updated are {0}", rowsAffected);

            #endregion

            #region Delete Data

            //SqlConnection connection = new SqlConnection(connectionDetails);

            //string queryTextFormat = "delete from Emp where No = {0}";

            //Console.WriteLine("Enter No To Delete Record");
            //int no = Convert.ToInt32(Console.ReadLine());

            //string queryText = string.Format(queryTextFormat, no);

            //SqlCommand command = new SqlCommand(queryText, connection);
            //connection.Open();

            //int rowsAffected = command.ExecuteNonQuery();

            //connection.Close();

            //Console.WriteLine("Rows Deleted are {0}", rowsAffected);

            #endregion

            Console.ReadLine();
        }
    } 
    
    public class Emp
    {
        public int No { get; set; }
        public string Name { get; set; }
        public string Address { get; set; }
    }

    
}
