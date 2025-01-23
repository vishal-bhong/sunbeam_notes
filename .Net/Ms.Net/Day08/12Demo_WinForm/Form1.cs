using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Data.SqlClient;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace _12Demo_WinForm
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();


            //Button button1 = new Button();
            //button1.Location = new Point(200, 200);
            //this.Controls.Add(button1);
            //button1.Click += new EventHandler(Button1_Click);

            //TextBox t1 = new TextBox();
            //this.Controls.Add(t1);

            button2.Click += new EventHandler(button1_Click);
            button3.Click += new EventHandler(button1_Click);
        }

        private void button1_Click(object sender, EventArgs e)
        {
            //Button b = (Button)sender;
            Button b = sender as Button;

            MessageBox.Show(b.Text);
        }

    }
}
