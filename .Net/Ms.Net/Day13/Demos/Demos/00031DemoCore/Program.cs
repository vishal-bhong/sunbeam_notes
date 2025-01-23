using Microsoft.Data.SqlClient;

namespace _00031DemoCore
{
    internal class Program
    {
        static void Main(string[] args)
        {
            #region Select Code
            ////SqlConnection connection = 
            ////    new SqlConnection("server=(LocalDB)\\MSSQLLocalDB;database=PGDAC;integrated security=true");

            //SqlConnection connection =
            //    new SqlConnection("Data Source=(LocalDB)\\MSSQLLocalDB;Initial Catalog=PGDAC;Integrated Security=True");


            //connection.Open();

            //SqlCommand cmd = new SqlCommand("select * from Emp", connection);

            //SqlDataReader reader =  cmd.ExecuteReader();

            //List<Emp> emps = new List<Emp>();

            //while (reader.Read())
            //{
            //    Emp emp = new Emp();
            //    emp.No = Convert.ToInt32(reader[0]); //Convert.ToInt32(reader["No"]);
            //    emp.Name = reader["Name"].ToString(); //reader[1].ToString();
            //    emp.Address = reader["Address"].ToString();//reader[2].ToString();

            //    emps.Add(emp);
            //}

            //connection.Close();
            //foreach (var item in emps)
            //{
            //    Console.WriteLine(item.No + item.Name + item.Address);
            //}
            #endregion

            #region Insert Code

            SqlConnection connection =
                new SqlConnection("Data Source=(LocalDB)\\MSSQLLocalDB;Initial Catalog=PGDAC;Integrated Security=True");


            connection.Open();

            string query = "insert into Emp values(4, 'Yogesh', 'Chennai')";

            SqlCommand cmd = new SqlCommand(query, connection);

            int rowsAffected = cmd.ExecuteNonQuery();
            connection.Close();

            Console.WriteLine("Rows Affected = " + rowsAffected.ToString());
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
