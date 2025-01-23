using Microsoft.Data.SqlClient;
using System.Text;
using _00033Demo_DB.Model;
using _00033Demo_DB.DAL;

namespace _00033Demo_DB
{
    internal class Program
    {
        static void Main(string[] args)
        {
            EmpDAL empDAL = new EmpDAL();

            Console.WriteLine("1: Select All, 2: Insert, 3: Update, 4: Delete");

            int choice = Convert.ToInt32(Console.ReadLine());

            switch (choice)
            {
                case 1:
                    #region Select Data
                    List<Emp> empList = empDAL.GetEmployees();

                    Console.WriteLine("------------------All Data -----------------------");
                    foreach (var e in empList)
                    {
                        Console.WriteLine(e.No + " | " + e.Name + " | " + e.Address);
                    }
                    #endregion
                    break;
                case 2:
                    #region Insert Data

                    Emp emp = new Emp();

                    Console.WriteLine("Enter No");
                    emp.No = Convert.ToInt32(Console.ReadLine());

                    Console.WriteLine("Enter Name");
                    emp.Name = Console.ReadLine();

                    Console.WriteLine("Enter Address");
                    emp.Address = Console.ReadLine();


                    int rowsAffected = empDAL.AddEmployee(emp);

                    Console.WriteLine("Rows Inserted are {0}", rowsAffected);

                    #endregion
                    break;
                case 3:
                    #region Update Data


                    Emp empToUpdate = new Emp();

                    Console.WriteLine("Enter No");
                    empToUpdate.No = Convert.ToInt32(Console.ReadLine());

                    Console.WriteLine("Enter Name");
                    empToUpdate.Name = Console.ReadLine();

                    Console.WriteLine("Enter Address");
                    empToUpdate.Address = Console.ReadLine();

                    int rowsAffected1 = empDAL.UpdateEmployee(empToUpdate);

                    Console.WriteLine("Rows Updated are {0}", rowsAffected1);

                    #endregion
                    break;
                case 4:
                    #region Delete Data

                    Console.WriteLine("Enter No To Delete Record");
                    int no = Convert.ToInt32(Console.ReadLine());

                    int rowsAffected2 = empDAL.RemoveEmployee(no);

                    Console.WriteLine("Rows Deleted are {0}", rowsAffected2);

                    #endregion
                    break;
                default:
                    Console.WriteLine("Wrong Choice!");
                    break;
            }
            

            

        

           

        

            Console.ReadLine();
        }
    }

  

}
