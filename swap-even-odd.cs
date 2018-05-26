using System;

namespace Trial
{
	class Program
	{
		/*
         * Complete the function below.
         * DO NOT MODIFY CODE OUTSIDE THIS FUNCTION!
         */
		static string[] twins(string[] a, string[] b)
		{
			int maxItems = Math.Max(a.Length, b.Length);
			string[] result = new string[maxItems];

			//Lambda function to calculate Evens and Odds of a String.
			Func<string, Tuple<string, string>> getEvensAndOdds = (string input) =>
			{
				var arr = input.ToCharArray();
				char[] odds = new char[(input.Length + 2 - 1) / 2]; //Always Round UP
				char[] evens = new char[(arr.Length + 2 - 1) / 2]; //Always Round UP
				for (int j = 0; j < arr.Length; j++)
				{
					if (j % 2 == 0)
					{
						evens[j/2] = arr[j];
					}
					else
					{
						odds[j/2] = arr[j];
					}
				}
				Array.Sort(evens);
				Array.Sort(odds);
				return new Tuple<string, string>(new string(evens), new string(odds));
			};

			for (int i = 0; i < maxItems; i++)
			{
				if(a.Length > i && b.Length > i)
				{
					var aRes = getEvensAndOdds(a[i]);
					var bRes = getEvensAndOdds(b[i]);
					if(aRes.Item1.Equals(bRes.Item1) && aRes.Item2.Equals(bRes.Item2))
					{
						result[i] = "Yes";
					}
					else
					{
						result[i] = "No";
					}
				}
				else
				{
					result[i] = "No";
				}
			}
			return result;

		}
		// DO NOT MODIFY CODE OUTSIDE THE ABOVE FUNCTION!

		static void Main(String[] args)
		{
			string[] res;

			int _a_size = 0;
			_a_size = Convert.ToInt32(Console.ReadLine());
			string[] _a = new string[_a_size];
			string _a_item;
			for (int _a_i = 0; _a_i < _a_size; _a_i++)
			{
				_a_item = Console.ReadLine();
				_a[_a_i] = _a_item;
			}


			int _b_size = 0;
			_b_size = Convert.ToInt32(Console.ReadLine());
			string[] _b = new string[_b_size];
			string _b_item;
			for (int _b_i = 0; _b_i < _b_size; _b_i++)
			{
				_b_item = Console.ReadLine();
				_b[_b_i] = _b_item;
			}

			res = twins(_a, _b);
			for (int res_i = 0; res_i < res.Length; res_i++)
			{
				Console.WriteLine(res[res_i]);
			}
		}
	}
}
