using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Xml.Linq;

namespace _13Demo_Revision
{
    public class Program
    {
        static void Main(string[] args)
        {
            Button button = new Button();
            button.Text = "Click Me";
            button.Click += new EventHandler(Button_Click);//tell CLR
            button.KeepMonitoring(); // as good as u r about to click


            Student student = new Student();
            student.Name = "Parth";
            student.OnAccept += new MyDelegate(Student_OnAccept);//tell CLR
            student.Propose();// as good as proposal accepted

        }

        private static void Student_OnAccept(string name)
        {
            Console.WriteLine("Accepted!");
        }

        private static void Button_Click(object sender, EventArgs e)
        {
            Console.WriteLine("U clicked");
        }
    }

    public delegate void EventHandler(object sender, EventArgs e);
    public class Button
    {
        public Button()
        {
            //Print some visual on screen code here
        }
        public event EventHandler Click;

        private string _Text;

        public string Text
        {
            get { return _Text; }
            set { _Text = value; }
        }

        public void KeepMonitoring()
        {
            if (true) // did the left mouse button click happen on button area?
            {
                Click(this, new EventArgs());//INTRPT clr here something imp happened
            }
        }

    }

    public delegate void MyDelegate(string name);

    //public class MyDelegate : Delegate
    //{

    //}

    public class Student
    {
        private string _Name;

        public string Name
        {
            get { return _Name; }
            set { _Name = value; }
        }

        public event MyDelegate OnAccept;

        public void Propose()
        {
            if (true)   //we checked : if meesage is not "i am from sunbeam
            {
                OnAccept(Name);//INTRPT clr here something imp happened
            }
        }
    }
    

}
