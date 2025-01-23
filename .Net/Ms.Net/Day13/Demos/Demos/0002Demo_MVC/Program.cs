using _0002Demo_MVC.Models;

namespace _0002Demo_MVC
{
    public class Program
    {
        public static void Main(string[] args)
        {
            var builder = WebApplication.CreateBuilder(args);

            // Add services to the container.
            builder.Services.AddControllersWithViews();
            builder.Services.AddScoped(typeof(ISpellChecker),
                                       typeof(EnglishSpellChecker));

            //builder.Services.AddScoped(typeof(ISpellChecker),
            //                           typeof(HindiSpellChecker));

            //builder.Services.AddSingleton(typeof(ISpellChecker),
            //                           typeof(EnglishSpellChecker));

            var app = builder.Build();

            // Configure the HTTP request pipeline.
            if (!app.Environment.IsDevelopment())
            {
                app.UseExceptionHandler("/Home/Error");
            }
            app.UseStaticFiles();

            app.UseRouting();

            app.UseAuthorization();

            app.MapControllerRoute(
                name: "default",
                pattern: "{controller=Home}/{action=Index}/{id?}");

            app.Run();
        }
    }
}