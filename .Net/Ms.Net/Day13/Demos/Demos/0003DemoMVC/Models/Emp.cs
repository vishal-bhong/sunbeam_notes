
using Microsoft.EntityFrameworkCore;
using System.ComponentModel.DataAnnotations;
using System.ComponentModel.DataAnnotations.Schema;

namespace _0003DemoMVC.Models
{
    [Table("Emp")]
    public class Emp
    {

        [Column("No", TypeName = "int")]
        [Key]
        public int No { get; set; }

        [Column("Name", TypeName = "varchar(50)")]
        public string Name { get; set; }

        [Column("Address", TypeName = "varchar(50)")]
        public string Address { get; set; }
    }

    public class SunbeamDBContext : DbContext
    {
        private DbSet<Emp> _Emp;

        public DbSet<Emp> Emps
        {
            get { return _Emp; }
            set { _Emp = value; }
        }


        protected override void OnConfiguring(DbContextOptionsBuilder optionsBuilder)
        {
            base.OnConfiguring(optionsBuilder);
            optionsBuilder.UseSqlServer("Data Source=(LocalDB)\\MSSQLLocalDB;Initial Catalog=Sunbeam;Integrated Security=True;");
        }

    }
}
