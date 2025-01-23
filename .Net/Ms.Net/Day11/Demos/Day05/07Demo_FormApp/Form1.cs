using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace _07Demo_FormApp
{
    public partial class Form1 : Form
    {
        Button button1 = null;
        EventHandler functionpointer = null;
        public Form1()
        {
            InitializeComponent();
            //this.BackColor = Color.Yellow;

            button1 = new Button();
            button1.Text = "Click Me";


            //button1.Click += CallMe;

            functionpointer = new EventHandler(CallMe);
            button1.Click += functionpointer;


            this.Controls.Add(button1);
        }

        public void CallMe(object sender, EventArgs e)
        {
            MessageBox.Show("Hello CDAC");
        }

        private void button2_Click(object sender, EventArgs e)
        {
            // -=Like detach
            button1.Click -= functionpointer;
        }
    }
}
