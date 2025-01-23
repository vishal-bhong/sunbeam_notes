using Microsoft.Data.SqlClient;
using System.Data;

namespace _00034Demo_TestDataSetTable
{
    internal class Program
    {
        static void Main(string[] args)
        {
            #region Simple DataTable Creation
            //DataTable table = new DataTable("Employee");

            //DataColumn column1 = new DataColumn("No", typeof(int));
            //DataColumn column2 = new DataColumn("Name", typeof(string));
            //DataColumn column3 = new DataColumn("Address", typeof(string));

            //table.Columns.Add(column1);
            //table.Columns.Add(column2);
            //table.Columns.Add(column3);

            //DataRow row1 = table.NewRow();
            //row1["No"] = 10;
            //row1["Name"] = "mahesh";
            //row1["Address"] = "pune";

            //table.Rows.Add(row1);


            //DataRow row2 = table.NewRow();
            //row2["No"] = 20;
            //row2["Name"] = "nilesh";
            //row2["Address"] = "pune";

            //table.Rows.Add(row2);


            //DataRow row3 = table.NewRow();
            //row3["No"] = 30;
            //row3["Name"] = "suresh";
            //row3["Address"] = "pune";

            //table.Rows.Add(row3);
            //table.WriteXmlSchema("C:\\Users\\Admin\\OneDrive\\Desktop\\CDAC\\DOTNETDemos\\MyDataSchema.xml");
            //table.WriteXml("C:\\Users\\Admin\\OneDrive\\Desktop\\CDAC\\DOTNETDemos\\MyData.xml");
            #endregion

            #region Read XML Schema | Data
            //DataTable table = new DataTable();
            //table.ReadXmlSchema("C:\\Users\\Admin\\OneDrive\\Desktop\\CDAC\\DOTNETDemos\\MyDataSchema.xml");
            //table.ReadXml("C:\\Users\\Admin\\OneDrive\\Desktop\\CDAC\\DOTNETDemos\\MyData.xml");


            #endregion

            #region Understanding "has a" relation
            //Emp e1 = new Emp() { No = 1, Name = "abcd", Address = "pune" };
            //Emp e2 = new Emp() { No = 11, Name = "abcd1", Address = "pune1" };

            //Department department = new Department();
            //department.DNo = 99;
            //department.DName = "IT";

            //department.Employees.Add(e1);
            //department.Employees.Add(e2);
            #endregion

            #region Simple DataTable Creation With Constraint Primary Key

            //DataTable table = new DataTable("Employee");

            //DataColumn column1 = new DataColumn("No", typeof(int));
            //DataColumn column2 = new DataColumn("Name", typeof(string));
            //DataColumn column3 = new DataColumn("Address", typeof(string));

            //table.Columns.Add(column1);
            //table.Columns.Add(column2);
            //table.Columns.Add(column3);


            //table.PrimaryKey = new DataColumn[] { column1 };

            //DataRow row1 = table.NewRow();
            //row1["No"] = 10;
            //row1["Name"] = "mahesh";
            //row1["Address"] = "pune";

            //DataRow row2 = table.NewRow();
            ////row2["No"] = 10;
            ////row2["No"] = null;
            //row2["No"] = 20;
            //row2["Name"] = "nilesh";
            //row2["Address"] = "pune";


            //table.Rows.Add(row1);
            //table.Rows.Add(row2);

            #endregion

            #region Create Datatable from DB Data : Example 1

            //DataTable table = new DataTable("Employee");

            //DataColumn column1 = new DataColumn("No", typeof(int));
            //DataColumn column2 = new DataColumn("Name", typeof(string));
            //DataColumn column3 = new DataColumn("Address", typeof(string));

            //table.Columns.Add(column1);
            //table.Columns.Add(column2);
            //table.Columns.Add(column3);

            //table.PrimaryKey = new DataColumn[] { column1 };


            //string connectionDetails = "Data Source=(LocalDB)\\MSSQLLocalDB;Initial Catalog=PGDAC;Integrated Security=True;Encrypt=True";
            //SqlConnection connection = new SqlConnection(connectionDetails);

            //SqlCommand command = new SqlCommand("select * from Emp", connection);
            //connection.Open();

            //SqlDataReader reader = command.ExecuteReader();

            //while (reader.Read())
            //{
            //    DataRow row = table.NewRow();
            //    row["No"] = Convert.ToInt32(reader["No"]);
            //    row["Name"] = reader["Name"].ToString();
            //    row["Address"] = reader["Address"].ToString() ;
            //    table.Rows.Add(row);

            //}

            //connection.Close();


            #endregion

            #region Create Dataset

            #region Table 1 from Database
            //DataTable table1 = new DataTable("Employee");

            //DataColumn column1 = new DataColumn("No", typeof(int));
            //DataColumn column2 = new DataColumn("Name", typeof(string));
            //DataColumn column3 = new DataColumn("Address", typeof(string));

            //table1.Columns.Add(column1);
            //table1.Columns.Add(column2);
            //table1.Columns.Add(column3);

            //table1.PrimaryKey = new DataColumn[] { column1 };


            //string connectionDetails = "Data Source=(LocalDB)\\MSSQLLocalDB;Initial Catalog=PGDAC;Integrated Security=True;Encrypt=True";
            //SqlConnection connection = new SqlConnection(connectionDetails);

            //SqlCommand command = new SqlCommand("select * from Emp", connection);
            //connection.Open();

            //SqlDataReader reader = command.ExecuteReader();

            //while (reader.Read())
            //{
            //    DataRow row = table1.NewRow();
            //    row["No"] = Convert.ToInt32(reader["No"]);
            //    row["Name"] = reader["Name"].ToString();
            //    row["Address"] = reader["Address"].ToString();
            //    table1.Rows.Add(row);

            //}

            //connection.Close();
            #endregion

            #region Table 2 from hard coded data

            //DataTable table2 = new DataTable("Book");
            //DataColumn columnA = new DataColumn("ID", typeof(int));
            //DataColumn columnB = new DataColumn("Title", typeof(string));

            //table2.Columns.Add(columnA);
            //table2.Columns.Add(columnB);

            //DataRow rowA = table2.NewRow();
            //rowA[0] = 11;
            //rowA[1] = "Let us C";


            //DataRow rowB = table2.NewRow();
            //rowB[0] = 12;
            //rowB[1] = "Let us C++";

            //table2.Rows.Add(rowA);
            //table2.Rows.Add(rowB);

            #endregion

            #region Dataset in XML Form

            //DataSet dataSet = new DataSet();
            //dataSet.Tables.Add(table1);
            //dataSet.Tables.Add(table2);


            //dataSet.WriteXmlSchema("C:\\Users\\Admin\\OneDrive\\Desktop\\CDAC\\DOTNETDemos\\DSSchema.xml");
            //dataSet.WriteXml("C:\\Users\\Admin\\OneDrive\\Desktop\\CDAC\\DOTNETDemos\\DS.xml");
            #endregion

            #endregion

            #region Disconnected Architecture with CRUD Ops

            DataSet dataSet = new DataSet();

            string connectionDetails = "Data Source=(LocalDB)\\MSSQLLocalDB;Initial Catalog=PGDAC;Integrated Security=True;Encrypt=True";
            SqlConnection connection = new SqlConnection(connectionDetails);

            SqlDataAdapter adapter =   
                new SqlDataAdapter("select * from Emp", connection);

            SqlCommandBuilder sqlCommandBuilder = 
                new SqlCommandBuilder(adapter);

            adapter.MissingSchemaAction = MissingSchemaAction.AddWithKey;
            adapter.Fill(dataSet, "Employee");

            #region Add Record Using DS & Adapter
            //DataRow row = dataSet.Tables["Employee"].NewRow();
            //row["No"] = 7;
            //row["Name"] = "Sudesh";
            //row["Address"] = "Indore";

            //dataSet.Tables["Employee"].Rows.Add(row);

            //adapter.Update(dataSet, "Employee");
            #endregion

            #region Update Record using DS & Adapter
            //DataRow row = dataSet.Tables["Employee"].Rows.Find(2);
            //row["Name"] = "Sujit";
            //row["Address"] = "Udgir";

            //adapter.Update(dataSet, "Employee");

            #endregion

            #region Delete Record using DS & Adapter
            //DataRow row = dataSet.Tables["Employee"].Rows.Find(5);
            //row.Delete();

            //adapter.Update(dataSet, "Employee");
            #endregion


            #endregion
        }
    }
    public class Emp
    {
        public int No { get; set; }
        public string Name { get; set; }
        public string Address { get; set; }
    }
    public class Department
    {
        public int DNo { get; set; }
        public string DName { get; set; }

        private List<Emp> _Employees = null;

        public List<Emp> Employees
        {
            get { return _Employees; }
            set { _Employees = value; }
        }

        public Department()
        {
                this.Employees = new List<Emp>(); 
        }

    }
}
