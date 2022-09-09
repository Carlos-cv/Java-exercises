//Class used to reverse a given string element

class Reverse
{
    // Complete the function
    // str: input string
    public static String reverseWord(String str)
    {
        StringBuilder reverseStr = new StringBuilder(str); //StringBuilder
        return reverseStr.reverse().toString(); // Reverse the string str

    }
    //main method
    public static void main(String[] args){ 
        System.out.println(reverseWord("Greek"));
    }

}


