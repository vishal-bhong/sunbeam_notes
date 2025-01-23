using Microsoft.AspNetCore.Mvc;
using _0002Demo_MVC.Models;
using _0002Demo_MVC.DAL;

namespace _0002Demo_MVC.Controllers
{
    public class HomeController : Controller
    {
        EmpDAL dalObject = new EmpDAL();
        public IActionResult Index()
        {
            List<Emp> emps =  dalObject.GetEmployees();
            return View("Index", emps);
        }

        [HttpGet]
        public IActionResult Create()
        {
            return View();  
        }

        [HttpPost]
        public IActionResult Create(Emp empToBeAdded)
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
