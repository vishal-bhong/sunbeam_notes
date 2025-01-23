using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

//First Example
namespace OperatorOverloading
{
    public class BankAccount
    {
        public string AccountHolder { get; set; }
        public decimal Balance { get; private set; }

        public BankAccount(string accountHolder, decimal balance)
        {
            AccountHolder = accountHolder;
            Balance = balance;
        }

        // Overload + operator to deposit money
        public static BankAccount operator +(BankAccount account, Transaction transaction)
        {
            return new BankAccount(account.AccountHolder, account.Balance + transaction.Amount);
        }

        // Overload - operator to withdraw money
        public static BankAccount operator -(BankAccount account, Transaction transaction)
        {
            //if (transaction.Amount > account.Balance)
            //{
            //    Console.WriteLine("Withdrawal failed: Insufficient funds.");
            //    return account; // Return the original account without changes
            //}
            return new BankAccount(account.AccountHolder, account.Balance - transaction.Amount);
        }

        public override string ToString()
        {
            return $"{AccountHolder}'s account balance: {Balance:C}";
        }
    }

    public class Transaction
    {
        public decimal Amount { get; set; }

        public Transaction(decimal amount)
        {
            Amount = amount;
        }

        public override string ToString()
        {
            return $"Transaction Amount: {Amount:C}";
        }
    }

    public class Program
    {
        static void Main()
        {
            BankAccount account = new BankAccount("Alice", 1000m);
            Transaction deposit = new Transaction(200m);
            Transaction withdrawal = new Transaction(300m);

            Console.WriteLine("Initial " + account);

            // Deposit money
            account = account + deposit;
            Console.WriteLine("After Deposit: " + account);

            // Withdraw money
            account = account - withdrawal;
            Console.WriteLine("After Withdrawal: " + account);

            // Perform a large withdrawal without validation
            Transaction largeWithdrawal = new Transaction(1500m);
            account = account - largeWithdrawal;
            Console.WriteLine("After Large Withdrawal: " + account);
        }
    }
}

//Second Example

//     class Box
//    {
//        private double length;   // Length of a box
//        private double breadth;  // Breadth of a box
//        private double height;   // Height of a box

//        public double getVolume()
//        {
//            return length * breadth * height;
//        }
//        public void setLength(double len)
//        {
//            length = len;
//        }
//        public void setBreadth(double bre)
//        {
//            breadth = bre;
//        }
//        public void setHeight(double hei)
//        {
//            height = hei;
//        }

//        // Overload + operator to add two Box objects.
//        public static Box operator +(Box b, Box c)
//        {
//            Box box = new Box();
//            box.length = b.length + c.length;
//            box.breadth = b.breadth + c.breadth;
//            box.height = b.height + c.height;
//            return box;
//        }
//    }

//        internal class Program
//    {
//        static void Main(string[] args)
//        {
//            Box Box1 = new Box();   // Declare Box1 of type Box
//            Box Box2 = new Box();   // Declare Box2 of type Box
//            Box Box3 = new Box();   // Declare Box3 of type Box
//            double volume = 0.0;    // Store the volume of a box here

//            // box 1 specification
//            Box1.setLength(6.0);
//            Box1.setBreadth(7.0);
//            Box1.setHeight(5.0);

//            // box 2 specification
//            Box2.setLength(12.0);
//            Box2.setBreadth(13.0);
//            Box2.setHeight(10.0);

//            // volume of box 1
//            volume = Box1.getVolume();
//            Console.WriteLine("Volume of Box1 : {0}", volume);

//            // volume of box 2
//            volume = Box2.getVolume();
//            Console.WriteLine("Volume of Box2 : {0}", volume);

//            // Add two object as follows:
//            Box3 = Box1 + Box2;

//            // volume of box 3
//            volume = Box3.getVolume();
//            Console.WriteLine("Volume of Box3 : {0}", volume);
//            Console.ReadKey();
//        }
//    }
//}
