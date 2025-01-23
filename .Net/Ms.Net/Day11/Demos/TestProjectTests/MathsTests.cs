using Microsoft.VisualStudio.TestTools.UnitTesting;
using TestProject;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace TestProject.Tests
{
    [TestClass()]
    public class MathsTests
    {
        [TestMethod()]
        public void AddTest()
        {
            Maths maths = new Maths();
            int iValue = 2147483647;
            int jValue = 200;
            int expectedResult = 300;

            int actualResult = maths.Add(iValue, jValue);

            Assert.AreEqual(expectedResult, actualResult);
        }

        [TestMethod()]
        public void SubTest() 
        {
            Maths maths = new Maths();
            int iValue = 100;
            int jValue = 10;
            int expectedResult = 90;

            int actualResult = maths.Sub(iValue, jValue);

            Assert.AreEqual(expectedResult, actualResult);
        }
    }
}