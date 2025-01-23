using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace _28Demo_Features
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
            //  this.button1.Click += new System.EventHandler(this.ok_click);

            //Below is anonymous method
            //this.button1.Click += delegate(object sender, EventArgs e)
            //                        {
            //                            MessageBox.Show("Hi");
            //                        };

            //Below is Lambada Expression
            this.button1.Click += (sender, e)=>
            {
                MessageBox.Show("Hi");
            };




        }



        //private void ok_click(object sender, EventArgs e)
        //{
        //    MessageBox.Show("Hi");
        //}
    }
}
