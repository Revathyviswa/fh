/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;

/**
 *
 * @author Student
 */
public class JavaApplication8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
            int H;
        
 String s1="hello";
for( H=0;H<=s1.length();H++)
{
    char e=s1.charAt(H);
    if((e== 'A')||(e=='E')||(e=='I')||(e=='O')||(e=='U')){
        {
String h=s1.substring(0, H);

String g=s1.substring(H+ H);
s1=h+"Z"+g;
}}
 }
    System.out.println("The result is="+s1);
    }
}
