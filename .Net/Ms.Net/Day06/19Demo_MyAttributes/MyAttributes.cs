using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _19Demo_MyAttributes
{
	//[Serializable]
	//public class Emp
	//{
	//	[NonSerialized]
	//	private string _Password = "abc";

	//	private string _Name;

	//	[NonSerialized]
	//	public string Name
	//	{
	//		get { return _Name; }
	//		set { _Name = value; }
	//	}

	//}

	[AttributeUsage(AttributeTargets.Class, Inherited =false)]
    public class Table : Attribute
    {
		private string _TableName;

		public string TableName
		{
			get { return _TableName; }
			set { _TableName = value; }
		}

	}

    [AttributeUsage(AttributeTargets.Property)]
    public class Column : Attribute 
	{
		private string _Name;
		private string _Type;

		public string Type
		{
			get { return _Type; }
			set { _Type = value; }
		}

		public string Name
		{
			get { return _Name; }
			set { _Name = value; }
		}

	}
}
