using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Reflection;
using _19Demo_MyAttributes;

namespace _21Demo_Reflection
{
    internal class Program
    {
        static void Main(string[] args)
        {
            string path = "C:\\Users\\Admin\\OneDrive\\Desktop\\CDAC\\DOTNETDemos\\CDACGroupOfProject\\20Demo_POCO\\bin\\Debug\\20Demo_POCO.dll";
            Assembly asmbInfo = Assembly.LoadFrom(path);

          

            Type[] allTypes = asmbInfo.GetTypes();
            foreach (Type type in allTypes)
            {
                string query = "";

                #region Find Table Attribute and Name

                Attribute[] allAttributes =
                      type.GetCustomAttributes().ToArray();
                foreach (Attribute attribute in allAttributes)
                {
                    if (attribute is Table)
                    {
                        Table table = (Table)attribute;
                        query = " create table " + table.TableName + " ( ";
                        break;
                    }
                }


                #endregion

                #region Find Column Details
                PropertyInfo[] allProperties = type.GetProperties();

                foreach (PropertyInfo property in allProperties)
                {
                    Attribute[] pAttributes =
                         property.GetCustomAttributes().ToArray();

                    foreach (Attribute pAttribute in pAttributes)
                    {
                        if (pAttribute is Column)
                        {
                            Column column = (Column)pAttribute;
                            query = query + column.Name + " ";
                            query = query + column.Type + " ,";
                            break;
                        }
                    }
                }


                query = query.TrimEnd(',');




                #endregion

                query = query + " )";

                Console.WriteLine(query);

            }

        }
    }
}
