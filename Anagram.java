/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package word_creation;



/**
 *
 * @author Yuwaiz
 */
public class Anagram {
    private final StringBuilder output = new StringBuilder();
    private final String inputstring;
    public static String dict[] = {"a","s","app","ale","ape","pull"};
    int n=dict.length;
    public Anagram( final String str ){
        inputstring = str;
        System.out.println("The input string  is  : " + inputstring);
    }
    public void combine(int start ){
        for( int i = start; i < inputstring.length(); i++ ){
            output.append( inputstring.charAt(i) );
            
            for(int j=0;j<n;j++)
            {
                if (output.toString().equalsIgnoreCase(dict[j]))
                    System.out.println( output);
            }
            
             //System.out.println( output);
           
            if ( i < inputstring.length() )
            combine( i + 1);
            output.setLength( output.length() - 1 );
        }
    }

}
