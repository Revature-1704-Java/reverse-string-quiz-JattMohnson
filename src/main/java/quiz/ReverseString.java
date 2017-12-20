package quiz;

public class ReverseString 
{
    public String reverse(String input) 
    {
    	//Creates an output string that will be built character by character 
    	String outputt = "";
    	//Finds the length of the string input
    	int i = input.length();
    	
    	if (input == "")
    	{
    		return outputt;
    	}
    	else
    	{
    		//Goes letter by letter building the string backwards
    		for (int c = 0; c < i; c++)
    		{
    		String a_letter = Character.toString(input.charAt((i - c -1)));
    		outputt = (outputt + a_letter);
    		}
    		return outputt;
    		//return new StringBuffer(input).reverse().toString();
    	}
    }
}