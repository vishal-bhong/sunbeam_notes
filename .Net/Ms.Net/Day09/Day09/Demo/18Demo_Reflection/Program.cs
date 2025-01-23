using System;
using System.Collections.Generic;
using System.Linq;
using System.Reflection;
using System.Text;
using System.Threading.Tasks;

namespace _18Demo_Reflection
{
    internal class Program
    {
        static void Main(string[] args)
        {
            //string path = "C:\\Users\\Admin\\OneDrive\\Desktop\\CDAC\\DOTNETDemos\\CDACGroupOfProject\\CalcLib\\bin\\Debug\\CalcLib.dll";

            Console.WriteLine("Enter path of the assembly");
            string path = Console.ReadLine();

            Assembly asmbInfo = Assembly.LoadFrom(path);

            Type[] allTypes = asmbInfo.GetTypes();

            foreach (Type type in allTypes)
            {
                Console.WriteLine(type.FullName);

                #region Find Attributes of Type
                Attribute[] allAttributesOnType =
                    type.GetCustomAttributes().ToArray();

                bool flag = false;

                foreach (Attribute attribute in allAttributesOnType)
                {
                    if (attribute is SerializableAttribute)
                    {
                        flag = true;
                        break;
                    }
                }

                if (flag == true)
                {
                    Console.WriteLine(type.FullName + " is serlaizable");
                }
                else
                {
                    Console.WriteLine(type.FullName + " is not marked as serializable!");
                    //throw new Exception(type.FullName + " is not marked as serializable!");
                }
                #endregion

                #region Find Methods from Type

                MethodInfo[] allmethods = type.GetMethods();

                foreach (MethodInfo method in allmethods) {

                    Console.WriteLine();
                    Console.Write(" -- " + method.ReturnParameter.ToString() + " "+ method.Name);
                    Console.Write(" ( ");

                    ParameterInfo[] parameters = method.GetParameters();
                    foreach (ParameterInfo paramater in parameters)
                    {
                        Console.Write(paramater.ParameterType.ToString() + " " + paramater.Name + " ");
                    }

                    Console.Write(" ) ");
                    Console.WriteLine();

                }

                #endregion

            }

            Console.ReadLine();
        }
    }

}
