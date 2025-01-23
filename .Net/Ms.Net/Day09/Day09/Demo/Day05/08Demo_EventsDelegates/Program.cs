using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _08Demo_EventsDelegates
{
    public class Program
    {
        static void Main(string[] args)
        {
           
            
            Student student = new Student();// Button button1 = new Button();
            student.Name = "parth"; //button1.Text = "Click Me";

            //EventHandler functionpointer = new EventHandler(CallMe);
            MyDelegate gajendra = new MyDelegate(OnAcceptPartyHere);
            MyDelegate srinivas = new MyDelegate(OnRejectPartyHere);

            //button1.Click += functionpointer;
            student.Accepted += gajendra;
            student.Rejected += srinivas;

            Console.WriteLine("Say Something!");

            student.Propose(Console.ReadLine());//As good as user click on button
            student.Propose(Console.ReadLine());
            Console.ReadLine();

        }

       

        //public void CallMe(object sender, EventArgs e)
        public static void OnAcceptPartyHere(string name)
        {
            Console.WriteLine(name + " Bhai Congrats!");
        }

        public static void OnRejectPartyHere(string name)
        {
            Console.WriteLine(name + " Bhai Bach Gaya!");
        }


    }

    //public delegate void EventHandler(object sender, EventArgs e);
    public delegate void MyDelegate(string str);


    public class Student //public class Button
    {
        private string _Name;

        public string Name  //public string Text
        {
            get { return _Name; }
            set { _Name = value; }
        }

        //public event EventHandler Click;
        public event MyDelegate Accepted;
        public event MyDelegate Rejected;

        public void Propose(string proposalMessage)
        {
            //if user clicked on button area 
            if (proposalMessage == "i am from sunbeam")
            {
                //Click(this, new EventArgs);
                Rejected(Name);
            }
            else
            {
                Accepted(Name);
            }
        }
    }
}
