using Microsoft.AspNetCore.Mvc;

namespace _0000DemoMVC.Controllers
{
    public class AboutController : Controller
    {
        public ActionResult Index()
        {
            return new ContentResult() { Content = "This is about us!" , ContentType = "text/plain"};
        }

    }
}
