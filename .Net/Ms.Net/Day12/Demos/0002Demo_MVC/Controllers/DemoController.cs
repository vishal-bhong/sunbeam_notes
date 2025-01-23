using _0002Demo_MVC.Models;
using Microsoft.AspNetCore.Mvc;

namespace _0002Demo_MVC.Controllers
{
    public class DemoController : Controller
    {
        public DemoController(ISpellChecker checker) 
        //public DemoController(IEnumerable<ISpellChecker> checkers)
        {
        
        }
        public IActionResult Index()
        {
            return View();
        }
    }
}
