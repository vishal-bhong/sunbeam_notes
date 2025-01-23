using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace _04Demo_OOP
{
    public class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Choice for SpellCheck in: ");
            Console.WriteLine("1: English, 2: Hindi, 3: French");
            int choice = Convert.ToInt32(Console.ReadLine());

            SpellCheckerFactory spellCheckerFactory = new SpellCheckerFactory();
            ISpellChecker spellChecker = spellCheckerFactory.GetChecker(choice);

            Editor editor   = new Editor(spellChecker);
            editor.DoCheck("abc");
            Console.ReadLine();
        }
    }

    public class Editor
    {
        private ISpellChecker _spellChecker;

        public Editor(ISpellChecker spellChecker)
        {
            if (spellChecker == null)
            {
                _spellChecker = new EnglishSpellChecker();
            }
            else
            {
                _spellChecker = spellChecker;
            }
        }

        public void DoCheck(string word)
        {
            _spellChecker.SpellCheck(word);
        }
    }

    public interface ISpellChecker
    {
        void SpellCheck(string word);
    }


    //Inversion Of Control [IOC]
    public class SpellCheckerFactory
    {
        public ISpellChecker GetChecker(int choice)
        {
            if (choice == 1)
            {
                return new EnglishSpellChecker();
            }
            else if (choice == 2)
            {
                return new HindiSpellChecker();
            }
            else
            {
                return new FrenchSpellChecker();
            }
        }
    }

    public class EnglishSpellChecker: ISpellChecker
    {

        //Supporting functions here for english as language
        public void SpellCheck(string word)
        {
            Console.WriteLine("Spell Check Done in English");
        }
    }

    public class HindiSpellChecker : ISpellChecker
    {

        //Supporting functions here for Hindi as language
        public void SpellCheck(string word)
        {
            Console.WriteLine("Spell Check Done in Hindi");
        }
    }

    public class FrenchSpellChecker : ISpellChecker
    {

        //Supporting functions here for French as language
        public void SpellCheck(string word)
        {
            Console.WriteLine("Spell Check Done in French");
        }
    }
}
