/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;
import programaparentesis.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;


/**
 *
 * @author Toni
 */
public class Interfaz extends javax.swing.JFrame {

    /**
     * Creates new form Interfaz
     */
    public Interfaz() {
        initComponents();
        signos.add('+');signos.add('-');signos.add('/');signos.add('X');
        numeros.add('0');numeros.add('1');numeros.add('2');numeros.add('3');numeros.add('4');
        numeros.add('5');numeros.add('6');numeros.add('7');numeros.add('8');numeros.add('9');numeros.add('.');
        parentesis.add('(');parentesis.add(')');
    }
    
    String operacion ="";
    String guardar ="";
    String comprobacion = " ";
    ArrayList <String> result = new ArrayList<String>();
    int contador = 0; 
    HashSet<Character> signos = new HashSet<>();
    HashSet<Character> numeros = new HashSet<>();
    HashSet<Character> parentesis = new HashSet<>();
    boolean notValid = false;
   
    

    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        num1 = new javax.swing.JButton();
        num5 = new javax.swing.JButton();
        num6 = new javax.swing.JButton();
        num4 = new javax.swing.JButton();
        num8 = new javax.swing.JButton();
        num9 = new javax.swing.JButton();
        num7 = new javax.swing.JButton();
        sumar = new javax.swing.JButton();
        multiplicar = new javax.swing.JButton();
        restar = new javax.swing.JButton();
        dividir = new javax.swing.JButton();
        cerrarparentesis = new javax.swing.JButton();
        num0 = new javax.swing.JButton();
        abrirparentesis = new javax.swing.JButton();
        resultado = new javax.swing.JButton();
        borrar = new javax.swing.JButton();
        num10 = new javax.swing.JButton();
        num11 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        borrar1 = new javax.swing.JButton();
        borrar2 = new javax.swing.JButton();
        num2 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        num1.setText("1");
        num1.setMargin(new java.awt.Insets(2, 2, 2, 2));
        num1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num1ActionPerformed(evt);
            }
        });

        num5.setText("5");
        num5.setMargin(new java.awt.Insets(2, 2, 2, 2));
        num5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num5ActionPerformed(evt);
            }
        });

        num6.setText("6");
        num6.setMargin(new java.awt.Insets(2, 2, 2, 2));
        num6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num6ActionPerformed(evt);
            }
        });

        num4.setText("4");
        num4.setMargin(new java.awt.Insets(2, 2, 2, 2));
        num4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num4ActionPerformed(evt);
            }
        });

        num8.setText("8");
        num8.setMargin(new java.awt.Insets(2, 2, 2, 2));
        num8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num8ActionPerformed(evt);
            }
        });

        num9.setText("9");
        num9.setMargin(new java.awt.Insets(2, 2, 2, 2));
        num9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num9ActionPerformed(evt);
            }
        });

        num7.setText("7");
        num7.setMargin(new java.awt.Insets(2, 2, 2, 2));
        num7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num7ActionPerformed(evt);
            }
        });

        sumar.setText("+");
        sumar.setMargin(new java.awt.Insets(2, 2, 2, 2));
        sumar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sumarActionPerformed(evt);
            }
        });

        multiplicar.setText("X");
        multiplicar.setMargin(new java.awt.Insets(2, 2, 2, 2));
        multiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiplicarActionPerformed(evt);
            }
        });

        restar.setText("-");
        restar.setMargin(new java.awt.Insets(2, 2, 2, 2));
        restar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restarActionPerformed(evt);
            }
        });

        dividir.setText("/");
        dividir.setMargin(new java.awt.Insets(2, 2, 2, 2));
        dividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dividirActionPerformed(evt);
            }
        });

        cerrarparentesis.setText(")");
        cerrarparentesis.setEnabled(false);
        cerrarparentesis.setMargin(new java.awt.Insets(2, 2, 2, 2));
        cerrarparentesis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cerrarparentesisActionPerformed(evt);
            }
        });

        num0.setText("0");
        num0.setMargin(new java.awt.Insets(2, 2, 2, 2));
        num0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num0ActionPerformed(evt);
            }
        });

        abrirparentesis.setText("(");
        abrirparentesis.setMargin(new java.awt.Insets(2, 2, 2, 2));
        abrirparentesis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abrirparentesisActionPerformed(evt);
            }
        });

        resultado.setText("=");
        resultado.setMargin(new java.awt.Insets(2, 2, 2, 2));
        resultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resultadoActionPerformed(evt);
            }
        });

        borrar.setText("C");
        borrar.setMargin(new java.awt.Insets(2, 2, 2, 2));
        borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarActionPerformed(evt);
            }
        });

        num10.setText("3");
        num10.setMargin(new java.awt.Insets(2, 2, 2, 2));
        num10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num10ActionPerformed(evt);
            }
        });

        num11.setText("2");
        num11.setMargin(new java.awt.Insets(2, 2, 2, 2));
        num11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num11ActionPerformed(evt);
            }
        });

        jTextField1.setEditable(false);
        jTextField1.setToolTipText("");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        borrar1.setText("CE");
        borrar1.setMargin(new java.awt.Insets(2, 2, 2, 2));
        borrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrar1ActionPerformed(evt);
            }
        });

        borrar2.setText("SAVE");
        borrar2.setEnabled(false);
        borrar2.setMargin(new java.awt.Insets(2, 2, 2, 2));
        borrar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrar2ActionPerformed(evt);
            }
        });

        num2.setText(".");
        num2.setMargin(new java.awt.Insets(2, 2, 2, 2));
        num2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num2ActionPerformed(evt);
            }
        });

        jTextField2.setEditable(false);
        jTextField2.setToolTipText("");
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(num1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(num11, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(num10, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(num0, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(num4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(num7, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(num5, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(num8, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(abrirparentesis, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(num2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(num6, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(num9, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cerrarparentesis, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(84, 84, 84)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(restar, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(borrar, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(dividir, javax.swing.GroupLayout.PREFERRED_SIZE, 65, Short.MAX_VALUE)
                            .addComponent(sumar, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(multiplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(borrar1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(39, 39, 39)
                            .addComponent(borrar2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(75, 75, 75))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(num1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(num11, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(num10, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(num4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(num5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(num6, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(num8, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(num9, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(num7, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(num0, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(abrirparentesis, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cerrarparentesis, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(borrar2, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                                    .addComponent(borrar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(multiplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(restar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sumar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(borrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(resultado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dividir, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(num2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void num5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num5ActionPerformed

            
            operacion = operacion.concat("5");
            jTextField1.setText(operacion);
            sumar.setEnabled(true);
            multiplicar.setEnabled(true);
            dividir.setEnabled(true);
            restar.setEnabled(true);
            
    }//GEN-LAST:event_num5ActionPerformed

    private void num8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num8ActionPerformed
            
            operacion = operacion.concat("8");
            jTextField1.setText(operacion);
            sumar.setEnabled(true);
            multiplicar.setEnabled(true);
            dividir.setEnabled(true);
            restar.setEnabled(true);
            
    }//GEN-LAST:event_num8ActionPerformed

    private void sumarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sumarActionPerformed
            if (!operacion.endsWith("+"))
            {
            operacion = operacion.concat("+");
            jTextField1.setText(operacion);
            restar.setEnabled(false);
            dividir.setEnabled(false);
            multiplicar.setEnabled(false);
            }
             
        
    }//GEN-LAST:event_sumarActionPerformed

    private void dividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dividirActionPerformed
            if (!operacion.endsWith("/"))
            {
            operacion = operacion.concat("/");
            jTextField1.setText(operacion);
            sumar.setEnabled(false);
            restar.setEnabled(false);
            multiplicar.setEnabled(false);
            }
        
    }//GEN-LAST:event_dividirActionPerformed

    private void cerrarparentesisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cerrarparentesisActionPerformed
            
            operacion = operacion.concat(")");
            jTextField1.setText(operacion);
            sumar.setEnabled(true);
            multiplicar.setEnabled(true);
            dividir.setEnabled(true);
            restar.setEnabled(true);
            contador --;
            if (contador == 0) resultado.setEnabled(true);
            
            
    }//GEN-LAST:event_cerrarparentesisActionPerformed

    private void abrirparentesisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abrirparentesisActionPerformed
            
            operacion = operacion.concat("(");
            jTextField1.setText(operacion);
            sumar.setEnabled(true);
            multiplicar.setEnabled(true);
            dividir.setEnabled(true);
            restar.setEnabled(true);
            
            contador++;
            if (contador != 0) resultado.setEnabled(false);
            cerrarparentesis.setEnabled(true);
            
    }//GEN-LAST:event_abrirparentesisActionPerformed

    private void resultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resultadoActionPerformed
            
            int numero = 0;
            for(int i = 0;i<operacion.length()-1;i++)
             {  
                 //numeros
                if(numeros.contains(operacion.charAt(i)) &&  '(' == (operacion.charAt(i+1))  )
                {
                     
                     notValid = true;
                     
                     borrar2.setEnabled(false);
                     break;
                     
                 }
                 //parentesis abierto
                if('(' == operacion.charAt(i) && ( signos.contains(operacion.charAt(i+1)) ||  ')'==(operacion.charAt(i+1)) ))
                {
                     notValid = true;
                     System.out.println("2");
                     borrar2.setEnabled(false);
                     break;
                 }
                // parentesis cerrado
                if(')' == operacion.charAt(i) && ( numeros.contains(operacion.charAt(i+1)) &&  '('==(operacion.charAt(i+1)))  )
                {
                     notValid = true;
                     System.out.println("3");
                     borrar2.setEnabled(false);
                     break;
                 }
                // signo
                if(signos.contains(operacion.charAt(i)) && ( ')'==(operacion.charAt(i+1)) )  )
                {
                     notValid = true;
                     System.out.println("4");
                     borrar2.setEnabled(false);
                     break;
                 }
                
                if(numeros.contains(operacion.charAt(i)) )
                {
                     numero++;
   
                 }           
                
             }
            if (numero==0)
                     {
                     notValid = true;
                     borrar2.setEnabled(false);
                     }
            
            Programaparentesis r = new Programaparentesis ();
            if(jTextField1.getText().isEmpty())
                borrar2.setEnabled(false);
            else
                borrar2.setEnabled(true);
            
            if(notValid==false)
            {
            result = r.ColocarOperacion(operacion);
            guardar = operacion;
            operacion = r.EjecutarParentesis(result);
            jTextField2.setText(operacion);
            contador = 0;
            }
            if(notValid == true)
            {
            operacion = "";
            guardar = "";
            jTextField2.setText(" Operacion No Valida");
            borrar2.setEnabled(false);
            contador = 0;
            }    
                
            

            resultado.setEnabled(false);
            abrirparentesis.setEnabled(false);
            borrar.setEnabled(false);
            cerrarparentesis.setEnabled(false);
            dividir.setEnabled(false);
            multiplicar.setEnabled(false);
            num0.setEnabled(false);
            num1.setEnabled(false);
            num10.setEnabled(false);
            num11.setEnabled(false);
            num4.setEnabled(false);
            num5.setEnabled(false);
            num6.setEnabled(false);
            num7.setEnabled(false);
            num8.setEnabled(false);
            num9.setEnabled(false);
            num2.setEnabled(false);
            restar.setEnabled(false);
            sumar.setEnabled(false);
            
           
        
    }//GEN-LAST:event_resultadoActionPerformed

    private void borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarActionPerformed
       
            if(jTextField1.getText().length()!=0)
            {
             comprobacion = operacion.substring(operacion.length()-1);
             if ("(".equals(comprobacion))
             {
                 abrirparentesis.setEnabled(true);
                 contador--;
                 if (contador!=0)
                      resultado.setEnabled(false);
                 if (contador==0)
                      resultado.setEnabled(true);
                 
             }
             else if (")".equals(comprobacion))
             {
                  cerrarparentesis.setEnabled(true);
                  contador++;
                 if (contador!=0)
                      resultado.setEnabled(false);
                 if (contador==0)
                      resultado.setEnabled(true);
             }
             else if ("/".equals(comprobacion))
               {
                  sumar.setEnabled(true);
                  restar.setEnabled(true);
                  multiplicar.setEnabled(true);
                  dividir.setEnabled(true);
               }
             else if ("/".equals(comprobacion))
               {
                  sumar.setEnabled(true);
                  restar.setEnabled(true);
                  multiplicar.setEnabled(true);
                  dividir.setEnabled(true);
               }
             else if ("+".equals(comprobacion))
               {
                  sumar.setEnabled(true);
                  restar.setEnabled(true);
                  multiplicar.setEnabled(true);
                  dividir.setEnabled(true);
               }
             else if ("-".equals(comprobacion))
               {
                  sumar.setEnabled(true);
                  restar.setEnabled(true);
                  multiplicar.setEnabled(true);
                  dividir.setEnabled(true);
               }
             jTextField1.setText(jTextField1.getText().substring(0, jTextField1.getText().length()-1));
             
             operacion = operacion.substring(0,operacion.length()-1);
            }
        
    }//GEN-LAST:event_borrarActionPerformed

    private void num4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num4ActionPerformed
            
            operacion = operacion.concat("4");
            jTextField1.setText(operacion);
            sumar.setEnabled(true);
            multiplicar.setEnabled(true);
            dividir.setEnabled(true);
            restar.setEnabled(true);
            
    }//GEN-LAST:event_num4ActionPerformed

    private void num7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num7ActionPerformed
            
            operacion = operacion.concat("7");
            jTextField1.setText(operacion);
            sumar.setEnabled(true);
            multiplicar.setEnabled(true);
            dividir.setEnabled(true);
            restar.setEnabled(true);
            
    }//GEN-LAST:event_num7ActionPerformed

    private void num0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num0ActionPerformed
            
            operacion = operacion.concat("0");
            jTextField1.setText(operacion);
            sumar.setEnabled(true);
            multiplicar.setEnabled(true);
            dividir.setEnabled(true);
            restar.setEnabled(true);
            
    }//GEN-LAST:event_num0ActionPerformed

    private void num1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num1ActionPerformed
            
            operacion = operacion.concat("1");
            jTextField1.setText(operacion);
            sumar.setEnabled(true);
            multiplicar.setEnabled(true);
            dividir.setEnabled(true);
            restar.setEnabled(true);
            
    }//GEN-LAST:event_num1ActionPerformed

    private void num6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num6ActionPerformed
            
            operacion = operacion.concat("6");
            jTextField1.setText(operacion);
            sumar.setEnabled(true);
            multiplicar.setEnabled(true);
            dividir.setEnabled(true);
            restar.setEnabled(true);
            
    }//GEN-LAST:event_num6ActionPerformed

    private void num9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num9ActionPerformed
            
            operacion = operacion.concat("9");
            jTextField1.setText(operacion);
            sumar.setEnabled(true);
            multiplicar.setEnabled(true);
            dividir.setEnabled(true);
            restar.setEnabled(true);
            
    }//GEN-LAST:event_num9ActionPerformed

    private void restarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_restarActionPerformed
            
            if (!operacion.endsWith("-"))
            {
            operacion = operacion.concat("-");
            jTextField1.setText(operacion);
            sumar.setEnabled(false);
            dividir.setEnabled(false);
            multiplicar.setEnabled(false);
            }
             
    }//GEN-LAST:event_restarActionPerformed

    private void multiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiplicarActionPerformed
            
            if (!operacion.endsWith("X"))
            {
            operacion = operacion.concat("X");
            jTextField1.setText(operacion);
            sumar.setEnabled(false);
            dividir.setEnabled(false);
            restar.setEnabled(false);
            }
            
    }//GEN-LAST:event_multiplicarActionPerformed

    private void num10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num10ActionPerformed
           
            operacion = operacion.concat("3");
            jTextField1.setText(operacion);
            sumar.setEnabled(true);
            multiplicar.setEnabled(true);
            dividir.setEnabled(true);
            restar.setEnabled(true);
            
    }//GEN-LAST:event_num10ActionPerformed

    private void num11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num11ActionPerformed
            
            operacion = operacion.concat("2");
            jTextField1.setText(operacion);
            sumar.setEnabled(true);
            multiplicar.setEnabled(true);
            dividir.setEnabled(true);
            restar.setEnabled(true);
            
    }//GEN-LAST:event_num11ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void borrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrar1ActionPerformed
          
           resultado.setEnabled(true);
           borrar2.setEnabled(false);
           operacion = "";
           guardar = "";
           jTextField1.setText(null);
           jTextField2.setText(null);
           
           contador = 0;
           
            abrirparentesis.setEnabled(true);
            borrar.setEnabled(true);
            cerrarparentesis.setEnabled(false);
            dividir.setEnabled(true);
            multiplicar.setEnabled(true);
            num0.setEnabled(true);
            num1.setEnabled(true);
            num10.setEnabled(true);
            num11.setEnabled(true);
            num4.setEnabled(true);
            num5.setEnabled(true);
            num6.setEnabled(true);
            num7.setEnabled(true);
            num8.setEnabled(true);
            num9.setEnabled(true);
            restar.setEnabled(true);
            sumar.setEnabled(true);
            num2.setEnabled(true);
            notValid = false;
                    
           
    }//GEN-LAST:event_borrar1ActionPerformed

    private void borrar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrar2ActionPerformed
        Programaparentesis r = new Programaparentesis ();
        {
            r.GuardarOperacion(guardar, operacion);
            jTextField2.setText(" Operación Guardada");
            operacion = "";
            guardar = "";
        }
    }//GEN-LAST:event_borrar2ActionPerformed

    private void num2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num2ActionPerformed
        
            operacion = operacion.concat(".");
            jTextField1.setText(operacion);
            sumar.setEnabled(true);
            multiplicar.setEnabled(true);
            dividir.setEnabled(true);
            restar.setEnabled(true);
    }//GEN-LAST:event_num2ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    
   
   
        
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton abrirparentesis;
    private javax.swing.JButton borrar;
    private javax.swing.JButton borrar1;
    private javax.swing.JButton borrar2;
    private javax.swing.JButton cerrarparentesis;
    private javax.swing.JButton dividir;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JButton multiplicar;
    private javax.swing.JButton num0;
    private javax.swing.JButton num1;
    private javax.swing.JButton num10;
    private javax.swing.JButton num11;
    private javax.swing.JButton num2;
    private javax.swing.JButton num4;
    private javax.swing.JButton num5;
    private javax.swing.JButton num6;
    private javax.swing.JButton num7;
    private javax.swing.JButton num8;
    private javax.swing.JButton num9;
    private javax.swing.JButton restar;
    private javax.swing.JButton resultado;
    private javax.swing.JButton sumar;
    // End of variables declaration//GEN-END:variables
}
