/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programaparentesis;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/** 
 *
 * @author Jimbo
 */
public class Programaparentesis {
   
    
    public ArrayList <String>  ColocarOperacion(String s) {
        ArrayList <String> numero = new ArrayList<String>();
        String aux = "";
        System.out.println(s);
        for(int i = 0; i <s.length();i++)
        {
            System.out.println(s.substring(i, i+1));
                if ( ("/".equals(s.substring(i, i+1))) || ("X".equals(s.substring(i, i+1))) || ("+".equals(s.substring(i, i+1))) || ("-".equals(s.substring(i, i+1))) || ("(".equals(s.substring(i, i+1))) || (")".equals(s.substring(i, i+1))))
                {   
                    System.out.println(" signo."+s.substring(i, i+1));
                    if (!aux.isEmpty())
                    {
                    numero.add(aux);
                    }
                    aux = "";
                    numero.add(s.substring(i, i+1));
                } 
               if ( ("0".equals(s.substring(i, i+1))) || ("1".equals(s.substring(i, i+1))) || ("2".equals(s.substring(i, i+1))) || ("3".equals(s.substring(i, i+1))) || ("4".equals(s.substring(i, i+1))) || ("5".equals(s.substring(i, i+1))) || ("6".equals(s.substring(i, i+1))) ||  ("7".equals(s.substring(i, i+1))) ||  ("8".equals(s.substring(i, i+1)))|| ("9".equals(s.substring(i, i+1))) || (".".equals(s.substring(i, i+1))) )
                {   
                    System.out.println(" numero."+s.substring(i, i+1));
                    aux = aux.concat(s.substring(i,i+1));
                }
         System.out.println(numero);
         }
        numero.add(aux);
        
        numero.remove("");
        
        return numero;
    }
        
    public String EjecutarOperacion (ArrayList <String> s) {
         String result = " ";
         boolean siSigno = false;
         double op = 0;
         int i = 0;
         
             for ( int j = 0; j < s.size()-1; j++)
                 if ( ( "+".equals(s.get(j)) ) || ( "-".equals(s.get(j)) ) || ( "/".equals(s.get(j)) ) || ( "X".equals(s.get(j)) ) ) 
                     siSigno = true;
             
         
         
             while(i<s.size()&&siSigno)
             {
                 if (("/".equals(s.get(i))))
                 {
                     op = ( Double.valueOf(s.get(i-1)) / Double.valueOf(s.get(i+1)));
                     s.set(i,Double.toString(op));
                     s.remove(i-1);s.remove(i);
                 }
                 else if (("X".equals(s.get(i))))
                 {
                     op = ( Double.valueOf(s.get(i-1)) * Double.valueOf(s.get(i+1)));
                     s.set(i,Double.toString(op));
                     s.remove(i-1);
                     s.remove(i);    
                 }
                 
                 else i++;
             }
             
             
             i = 0;
             
             while(i<s.size()&&siSigno)
             {
                 if (("+".equals(s.get(i))))
                 {
                     op = ( Double.valueOf(s.get(i-1)) + Double.valueOf(s.get(i+1)));
                     s.set(i,Double.toString(op));
                     s.remove(i-1);s.remove(i);
                 }
                 else if (("-".equals(s.get(i))))
                 {
                     op = ( Double.valueOf(s.get(i-1)) - Double.valueOf(s.get(i+1)));
                     s.set(i,Double.toString(op));
                     s.remove(i-1);
                     s.remove(i);    
                 }
                 
                 else i++;
             }
             
             System.out.println(s);
             
             if (siSigno)
               result = s.get(0);  
             
             if (!siSigno)
               for ( int h = 0; h < s.size(); h++)

                   result = result + s.get(h);
               
             
        return result;
        }   
    
    public String EjecutarParentesis (ArrayList <String> s) {
    String result =  null;
    List <String> list = new ArrayList<String>();
    ArrayList <String> sublist = new ArrayList<String>();
    
         boolean encontrados = false;
         int i = 0;
         int y = 0;
         int open = 0;
         int close = 0;
         boolean fin = false;
         
        
         
         
             while(i<s.size())
             {
                 
             fin = false;
                 for (int r = 0; r<s.size()&&!fin;r++)
                 {
                     
                     if( "(".equals(s.get(r)) || ")".equals(s.get(r)) )
                         fin = true;
                 }
                  if (!fin)
                 {
                     result = this.EjecutarOperacion(s);
                     //System.out.print(result);
                     break;
                 }    
                 
                 
                 
                 while((!encontrados))
                 {
                     if ("(".equals(s.get(y)))
                       {
                        
                        open = y;
                         
                     
                     
                          for (int j = y+1;j<s.size();j++) 
                           {
                         
                              if (")".equals(s.get(j)))
                                {
                                  close = j;
                                  System.out.print(close);
                                  encontrados = true;
                                  break;
                                 }

                              if ("(".equals(s.get(j)))
                                {
                                  
                                  break;
                                }
                          }
                      }
                  y++;
                 }
                     
                     
                 if (encontrados)    
                    {
                     
                     list =  s.subList(open+1,close);
                     
                     for(int h = 0;h<list.size();h++)
                         sublist.add(list.get(h));
                     System.out.println(sublist);
                         
                     result = this.EjecutarOperacion(sublist);
                     
                     System.out.println(result);
                     s.set(open, result);
                     System.out.print(s);
                     int j=open+1;
                     
                     while((open)<close)
                     {
                         System.out.println(s.get(j));
                         s.remove(j);
                         open++;
                         
                     }
                     
                     i=0;
                     encontrados = false;
                     sublist.clear();
                     y=0;
                     
                 }
                 else i++;
                 
                 System.out.println(s);
                 
             }
    
    return result;
    }
    
   
   public void GuardarOperacion (String a, String b) {  
       
   }   
        
 
    
     
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        String n = "22.1/2";
        ArrayList <String> ejemplo = new ArrayList<String>();
        String [] example = new String [n.length()];
        String resultado = null;
        
        Programaparentesis r = new Programaparentesis ();
        ejemplo = r.ColocarOperacion(n);
        System.out.println(ejemplo);
        
        
        
        
        
      n = r.EjecutarParentesis(ejemplo);
      System.out.println(n);
       
       
        
    }
    
}
