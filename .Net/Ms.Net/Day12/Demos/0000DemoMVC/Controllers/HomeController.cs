using _0000DemoMVC.Controllers;
using Microsoft.AspNetCore.Mvc;
using Microsoft.AspNetCore.Mvc.Filters;
using _0000DemoMVC.Models;

namespace _0000DemoMVC.Controllers
{
    public class HomeController : Controller
    {
        public ActionResult Index(int? id)
        {
            Emp obj = new Emp() { No = 1, Name = "Sachin", Address = "Mumbai" };
            
            //Customer obj = new Customer() { No = 11, Name = "Sachin1", Address = "1Mumbai" };
            return View("MyView", obj);
        }

        public override void OnActionExecuting(ActionExecutingContext context)
        {
            var arr = new[] { new { No = 1, Name = ""},
                              new { No = 1, Name = "" },
                              new { No = 1, Name = ""}};
        }

        public override void OnActionExecuted(ActionExecutedContext context)
        {
        }

        
        public ActionResult Users()
        {
            Emp emp = new Emp() {  No = 1, Name = "Sachin", Address = "Mumbai"};
            return new JsonResult(emp);
        }
    }

}

