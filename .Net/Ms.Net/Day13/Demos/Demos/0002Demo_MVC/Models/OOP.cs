namespace _0002Demo_MVC.Models
{
	public interface ISpellChecker
	{
		void DoCheck(string word);
	}

    public class EnglishSpellChecker : ISpellChecker
    {
        public void DoCheck(string word)
        {
           //Some logic
        }
    }

    public class HindiSpellChecker : ISpellChecker
    {
        public void DoCheck(string word)
        {
            //Some logic
        }
    }
}
