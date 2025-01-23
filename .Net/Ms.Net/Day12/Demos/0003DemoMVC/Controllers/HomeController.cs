using _0003DemoMVC.Models;
using Microsoft.AspNetCore.Mvc;

namespace _0003DemoMVC.Controllers
{
    public class HomeController : Controller
    {
        SunbeamDBContext dalObject = new SunbeamDBContext();
        public IActionResult Index()
        {
            var emps = dalObject.Emps.ToList();
            return View(emps);
        }

        public IActionResult Create()
        {
            return View(); 
        }
        public IActionResult AfterCreate(Emp emp)
        {
            dalObject.Emps.Add(emp);
            dalObject.SaveChanges();
            return Redirect("/Home/Index");
        }


        public IActionResult Edit(int id)
        {
            var empFound = (from emp in dalObject.Emps.ToList()
                            where emp.No == id
                            select emp).First();
            
            return View(empFound);
        }
        public IActionResult AfterEdit(Emp empUpdated)  
        {
            var empToBeUpdated = (from emp in dalObject.Emps.ToList()
                            where emp.No == empUpdated.No
                            select emp).First();

            empToBeUpdated.Name = empUpdated.Name;
            empToBeUpdated.Address = empUpdated.Address;

            dalObject.SaveChanges();
            return Redirect("/Home/Index");
        }

        public IActionResult Delete(int id)
        {
            var empFound = (from emp in dalObject.Emps.ToList()
                            where emp.No == id
                            select emp).First();

            dalObject.Emps.Remove(empFound);
            dalObject.SaveChanges();

            return Redirect("/Home/Index");
        }

    }
}
