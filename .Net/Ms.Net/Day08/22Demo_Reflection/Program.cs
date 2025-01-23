using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Reflection;
using System.IO;

namespace _22Demo_Reflection
{
    internal class Program
    {
        static void Main(string[] args)
        {
            string path = "C:\\Users\\Admin\\OneDrive\\Desktop\\CDAC\\DOTNETDemos\\CDACGroupOfProject\\CalcLib\\bin\\Debug\\CalcLib.dll";
            
            Assembly assembly = Assembly.LoadFrom(path);

            Type[] allTypesInAssebly = assembly.GetTypes();

            foreach (Type type in allTypesInAssebly)
            {
                if (type.IsClass && !type.IsAbstract)
                {
                    Console.WriteLine("------------------------------");
                    Console.WriteLine("Found " + type.FullName);

                    Console.WriteLine("Creating object of " + type.FullName);

                    object dynamicallyCreatedObject =
                        assembly.CreateInstance(type.FullName);


                    //For all methods 
                    MethodInfo[] allMethods = type.GetMethods();

                    //For only Add and Sub
                    //MethodInfo[] allMethods = type.GetMethods(BindingFlags.Public | BindingFlags.Instance | BindingFlags.DeclaredOnly);

                    foreach (MethodInfo method in allMethods)
                    {
                        Console.WriteLine(" -- Found " +  method.Name);
                        Console.WriteLine(" -- Calling " + method.Name);


                        ParameterInfo[] allParams =
                            method.GetParameters();

                        object[] paramArray = new object[allParams.Length];

                        for (int i = 0; i < allParams.Length; i++)
                        {
                            ParameterInfo parameter = allParams[i];
                            Console.WriteLine("Enter value for " + 
                                parameter.Name + " of type " + 
                                parameter.ParameterType.ToString());

                            string paramValue = Console.ReadLine();
                           
                            paramArray[i] = 
                                Convert.ChangeType(paramValue, parameter.ParameterType);
                        }

                        object result = type.InvokeMember(method.Name,
                                         BindingFlags.Public |
                                         BindingFlags.Instance |
                                         BindingFlags.InvokeMethod,
                                         null,
                                         dynamicallyCreatedObject,
                                         paramArray);

                        Console.WriteLine("Result of " + method.Name + " is " +
                                           result.ToString());

                        #region Sample Call To Method with hard coded params
                        //object result = type.InvokeMember(method.Name,
                        //                  BindingFlags.Public |
                        //                  BindingFlags.Instance |
                        //                  BindingFlags.InvokeMethod,
                        //                  null,
                        //                  dynamicallyCreatedObject,
                        //                  new object[] { 10, 20 });
                        //                  
                        //Console.WriteLine("Result of " + method.Name + " is " +
                        //                   result.ToString());
                        #endregion


                    }

                }


            }

            Console.ReadLine();
        }
    }
}
