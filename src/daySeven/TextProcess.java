package daySeven;

public class TextProcess {
    public static void main(String[] args) {
//        String s =  "Hello World";
//        System.out.println(s);
//        System.out.println(s.length());
//
//        s ="at Route";
//        System.out.println(s); // String is immutable && String pool => Heap memory
//
//        // reference point object
//        String a = "Alzhraa";
//        String b = "Alzhraa";
//        System.out.println(a==b); // both refer to the same object in the string pool
//
//        String c =  new String("alzhraa");// new object in the heap memory
//        System.out.println(a==c); // false
//        System.out.println(a.equals(c)); // true => compare content

//        String text = "I love Java and Java is fun e.";
//        String lower = text.toLowerCase();
//        System.out.println(lower);
//        String upper = text.toUpperCase();
//        System.out.println(upper);
//        System.out.println(text.charAt(5));
//        System.out.println(text.indexOf('e')); // first occurrence
//        System.out.println(text.lastIndexOf('e')); // last occurrence
       // countWords("I Love Route Academy");
//        reverseString("Eslam Ahmed Hazem");

//        String s1 = "          Route";
//        System.out.println(s1.trim());

//        StringBuilder builder = new StringBuilder("Hello");
//        System.out.println(builder);
//        builder.append("World");
//        System.out.println(builder);
//        builder.insert(5,":(");
//        System.out.println(builder);
//        builder.delete(0,5);
//        System.out.println(builder);
//        builder.reverse();
//        System.out.println(builder);
//        builder.replace(0,5,"Java");
//        System.out.println(builder);
        addSpace2("ILoveRouteAcademyAndJava");
    }




    // method => count the number of words in a text
    public static void countWords(String text)
    {
        String [] words = text.split(" ");
        int numberOfWords = words.length;
        String message = String.format("Your text contains %d words", numberOfWords);
        System.out.println(message);
        for(int i =0;i<words.length; i++)
        {
            System.out.println(words[i]);
        }
    }

    public static void reverseString(String text)
    {
        String reversedString = "";
       for(int i = text.length()-1;i>=0;i--)
       {
          reversedString = reversedString + text.charAt(i);
       }
        System.out.println(reversedString);
    }

    public static void addSpace(String text)
    {

       StringBuilder modifiedText = new StringBuilder(text);
        for(int i=1;i<modifiedText.length();i++)
        {
            if(Character.isUpperCase(modifiedText.charAt(i)))
            {
                modifiedText.insert(i, " ");
                i++;
            }
        }
        System.out.println(modifiedText);
    }

    public static void addSpace2(String text)
    {
        StringBuilder modifiedText = new StringBuilder();
        for(int i=0;i<text.length();i++)
        {

            char ch = text.charAt(i);
            if(Character.isUpperCase(ch) && i>0)
            {
                modifiedText.append(" ");
            }
            modifiedText.append(ch);
        }
        System.out.println(modifiedText);
    }

    //Stash changes => save changes without committing them to the local repository
    // pop => apply the stashed changes and remove them from the stash list
    // apply => apply the stashed changes but keep them in the stash list
}
