using _0001DemoMVC.Models;
using Microsoft.Data.SqlClient;


namespace _0001DemoMVC.DAL
{
    public class EmpDAL
    {
        public List<Emp> GetEmployees()
        {
            string connectionDetails = "Data Source=(LocalDB)\\MSSQLLocalDB;Initial Catalog=PGDAC;Integrated Security=True;Encrypt=True";

            #region Select Data

            SqlConnection connection = new SqlConnection(connectionDetails);
            string queryText = "select * from Emp";
            SqlCommand command = new SqlCommand(queryText, connection);
            connection.Open();

            SqlDataReader reader = command.ExecuteReader();

            List<Emp> empList = new List<Emp>();

            while (reader.Read())
            {
                Emp emp = new Emp();
                emp.No = Convert.ToInt32(reader["No"]);
                emp.Name = reader["Name"].ToString();
                emp.Address = reader["Address"].ToString();
                empList.Add(emp);
            }

            connection.Close();
            return empList;

            #endregion

        }

        public Emp GetEmployee(int no)
        {
            List<Emp> emps = GetEmployees();
            Emp empFound = (from emp in emps
                            where emp.No == no
                            select emp).First();
            return empFound;
        }

        public int AddEmployee(Emp emp)
        {
            string connectionDetails = "Data Source=(LocalDB)\\MSSQLLocalDB;Initial Catalog=PGDAC;Integrated Security=True;Encrypt=True";

            #region Insert Data

            SqlConnection connection = new SqlConnection(connectionDetails);

            string queryTextFormat = "insert into Emp values({0},'{1}', '{2}')";

            string queryText = string.Format(queryTextFormat, emp.No, emp.Name, emp.Address);

            SqlCommand command = new SqlCommand(queryText, connection);
            connection.Open();

            int rowsAffected = command.ExecuteNonQuery();

            connection.Close();

            #endregion

            return rowsAffected;

        }

        public int UpdateEmployee(Emp emp)
        {
            string connectionDetails = "Data Source=(LocalDB)\\MSSQLLocalDB;Initial Catalog=PGDAC;Integrated Security=True;Encrypt=True";

            #region Update Data

            SqlConnection connection = new SqlConnection(connectionDetails);

            string queryTextFormat = "update Emp set Name = '{1}', Address= '{2}' where No = {0}";

            string queryText = string.Format(queryTextFormat, emp.No, emp.Name, emp.Address);

            SqlCommand command = new SqlCommand(queryText, connection);
            connection.Open();

            int rowsAffected = command.ExecuteNonQuery();

            connection.Close();

            #endregion

            return rowsAffected;
        }

        public int RemoveEmployee(int no)
        {
            string connectionDetails = "Data Source=(LocalDB)\\MSSQLLocalDB;Initial Catalog=PGDAC;Integrated Security=True;Encrypt=True";

            #region Delete Data

            SqlConnection connection = new SqlConnection(connectionDetails);

            string queryTextFormat = "delete from Emp where No = {0}";

            string queryText = string.Format(queryTextFormat, no);

            SqlCommand command = new SqlCommand(queryText, connection);
            connection.Open();

            int rowsAffected = command.ExecuteNonQuery();

            connection.Close();

            #endregion

            return rowsAffected;
        }

    }
}
