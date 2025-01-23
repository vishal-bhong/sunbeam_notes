using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _26Demo_PubSub
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Publisher publisher = new Publisher();

            SMSSubscriber  sMSSubscriber = new SMSSubscriber();
            sMSSubscriber.Name = "Mahesh";
            ///sMSSubscriber.Notify += pointer(callMymethod1);

            EMailSubscriber eMailSubscriber = new EMailSubscriber();
            eMailSubscriber.Name = "Kiran";
            ///eMailSubscriber.Notify += pointer(callMymethod2);

            publisher.AddSubscriber(sMSSubscriber);
            publisher.AddSubscriber(eMailSubscriber);

            publisher.Notify("EVent & Delegate topic is over!");
            Console.ReadLine();
        }
    }

    public class Publisher
    {
        private List<ISubscriber> Subscribers;
        public Publisher()
        {
                Subscribers = new List<ISubscriber>();
        }

        public void AddSubscriber(ISubscriber subscriber) 
        {
            Subscribers.Add(subscriber);
        }

        public void Notify(string message)
        {
            foreach (ISubscriber subscriber in Subscribers)
            {
                subscriber.Subscribe(message);   
                //subscriber.Notify(message);
            }
        }
    }
    public interface ISubscriber
    {
        void Subscribe(string message);
    }
    public class SMSSubscriber : ISubscriber
    {
        private string _name;

        public string Name
        {
            get { return _name; }
            set { _name = value; }
        }

        public void Subscribe(string updates)
        {
            Console.WriteLine("SMS Subscriber " + Name +  " - received a updates from publisher " + updates);
        }
    }

    public class EMailSubscriber : ISubscriber
    {
        private string _name;

        public string Name
        {
            get { return _name; }
            set { _name = value; }
        }

        public void Subscribe(string updates)
        {
            Console.WriteLine("EMail Subscriber " + Name + " - received a updates from publisher " + updates);
        }
    }
}
