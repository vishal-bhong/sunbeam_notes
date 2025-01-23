using _0003DemoMVC.Models;
using Microsoft.EntityFrameworkCore;

namespace _0003DemoMVC
{
    public class Program
    {
        public static void Main(string[] args)
        {
            var builder = WebApplication.CreateBuilder(args);

            // Add services to the container.
            builder.Services.AddControllersWithViews();

            //builder.Services.AddDbContext<SunbeamDBContext>(options =>
            //{
            //    options.UseSqlServer("name=con");
            //});

            //builder.Services.AddDbContext<SunbeamDBContext>(options =>
            //{
            //    options.UseSqlServer("name=con");
            //});

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