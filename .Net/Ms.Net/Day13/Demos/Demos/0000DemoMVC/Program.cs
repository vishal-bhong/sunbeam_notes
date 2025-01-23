namespace _0000DemoMVC
{
    public class Program
    {
        public static void Main(string[] args)
        {
            var builder = WebApplication.CreateBuilder(args);

            // Add services to the container.
           
            //below line helps us create
            //1. Controllerfactory object
            //2. RazorViewEngine
            builder.Services.AddControllersWithViews();

            //if used below line helps us create
            //1. Controllerfactory object only!!
            //builder.Services.AddControllers();

            //below line actually creates factory , viewengine like objects
            var app = builder.Build();

            app.UseStaticFiles();

            app.UseRouting();

            //app.UseAuthorization();

            //app.MapControllerRoute(
            //    name: "myownroute",
            //    pattern: "{controller=About}/{action=Index}/{id?}/{?name}");

           //app.MapControllerRoute(
           //name: "adminDefault",
           //pattern: "Admin/{controller=Home}/{action=Index}/{id?}");


            app.MapControllerRoute(
              name: "default",
              pattern: "{controller=Home}/{action=Index}/{id?}");

            app.Run();

            Console.ReadLine();
        }
    }
}