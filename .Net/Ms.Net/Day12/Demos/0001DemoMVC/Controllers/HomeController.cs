using Microsoft.AspNetCore.Mvc;
using _0001DemoMVC.Models;
using _0001DemoMVC.DAL;

namespace _0001DemoMVC.Controllers
{
    public class HomeController : Controller
    {
        EmpDAL dalObject = new EmpDAL();
        public IActionResult Index()
        {
            List<Emp> emps =  dalObject.GetEmployees();
            return View("Index", emps);
        }

        public IActionResult Create()
        {
            return View();  
        }

        public IActionResult AfterCreate(Emp empToBeAdded)
        {
            int rowsAffected =  dalObject.AddEmployee(empToBeAdded);

            return Redirect("/Home/Index");
        }

        public IActionResult Edit(int id)
        {
            Emp emp = dalObject.GetEmployee(id);
            return View("Edit",emp);

        }


        public IActionResult AfterEdit(Emp empEdited)
        {
            int rowsAffected = dalObject.UpdateEmployee(empEdited);

            return Redirect("/Home/Index");
        }

        public IActionResult Delete(int id)
        {
            int rowsAffected = dalObject.RemoveEmployee(id);
            return Redirect("/Home/Index");
        }

    }


}
