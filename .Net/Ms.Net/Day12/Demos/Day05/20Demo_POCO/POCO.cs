using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using _19Demo_MyAttributes;

namespace _20Demo_POCO
{
	[Table(TableName ="Employee")]
    public class Emp
    {
		private int _No;
		private string _Name;
		private string _Address;

		[Column(Name = "EAddress", Type="varchar(50)")]
		public string Address
		{
			get { return _Address; }
			set { _Address = value; }
		}

        [Column(Name = "EName", Type = "varchar(50)")]
        public string Name
		{
			get { return _Name; }
			set { _Name = value; }
		}

        [Column(Name = "ENo", Type = "int")]
        public int No
		{
			get { return _No; }
			set { _No = value; }
		}

	}

	[Table(TableName ="Department")]
	public class Dept
	{
		private int _DNo;
		private string _DName;

		[Column(Name = "DeptName", Type = "varchar(50)")]
		public string DName
		{
			get { return _DName; }
			set { _DName = value; }
		}

        [Column(Name = "DeptNo", Type = "int")]

        public int DNo
		{
			get { return _DNo; }
			set { _DNo = value; }
		}

	}
}
