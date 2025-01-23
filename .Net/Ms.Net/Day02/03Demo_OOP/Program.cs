using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _03Demo_OOP
{
    public class Program
    {
        static void Main(string[] args)
        {
            ReportFactory reportFactory = new ReportFactory();
            Console.WriteLine("1: PDF, 2: DOCX, 3: TXT, 4: XML");
            int choice = Convert.ToInt32(Console.ReadLine());


            Report report = reportFactory.GetReport(choice);
            report.GenerateReport();

            Console.ReadLine();
        }
    }
    public class ReportFactory
    {
        public Report GetReport(int choice)
        {
            if(choice == 1)
            {
                return new PDFReport();
            }
            else if (choice ==2 )
            {
                return new DOCXReport();
            }
            else if (choice ==3)
            {
                return new TXTReport();
            }
            {
                return new XMLReport();
             
            }
        }
    }
    public abstract class Report
    {
        protected abstract void CreateReport();
        protected abstract void ParseReport();
        protected abstract void ValidateReport();
        protected abstract void SaveReport();
       
        public virtual void GenerateReport()
        {
            CreateReport();
            ParseReport();
            ValidateReport();
            SaveReport();
        }
    }
    public class PDFReport : Report
    {
        protected override void CreateReport()
        {
            Console.WriteLine("PDF Created");
        }
        protected override void ParseReport()
        {
            Console.WriteLine("PDF Data Parsed");
        }
        protected override void ValidateReport()
        {
            Console.WriteLine("PDF Data Validated");
        }
        protected override void SaveReport()
        {
            Console.WriteLine("PDF Data Saved!");
        }


    }
    public class DOCXReport : Report
    {
        protected override void CreateReport()
        {
            Console.WriteLine("DOCX Created");
        }
        protected override void ParseReport()
        {
            Console.WriteLine("DOCX Data Parsed");
        }
        protected override void ValidateReport()
        {
            Console.WriteLine("DOCX Data Validated");
        }
        protected override void SaveReport()
        {
            Console.WriteLine("DOCX Data Saved!");
        }
    }

    public class TXTReport : Report
    {
        protected override void CreateReport()
        {
            Console.WriteLine("TXT Created");
        }

        protected override void ParseReport()
        {
            Console.WriteLine("TXT Parsed");
        }

        protected override void SaveReport()
        {
            Console.WriteLine("TXT Saved");
        }

        protected override void ValidateReport()
        {
            Console.WriteLine("TXT Validated");
        }
    }

    public abstract class SpecialReport: Report
    {
        protected abstract void ReValidate();
        public override void GenerateReport()
        {
            CreateReport();
            ParseReport();
            ValidateReport();
            ReValidate();
            SaveReport();
        }

    }
    public class XMLReport : SpecialReport
    {
        protected override void CreateReport()
        {
            Console.WriteLine("XML Created");
        }

        protected override void ParseReport()
        {
            Console.WriteLine("XML Parsed");
        }

        protected override void SaveReport()
        {
            Console.WriteLine("XML Saved");
        }

        protected override void ReValidate()
        {
            Console.WriteLine("XML Re Validated");
        }
        protected override void ValidateReport()
        {
            Console.WriteLine("XML Validated");
        }
    }
}
