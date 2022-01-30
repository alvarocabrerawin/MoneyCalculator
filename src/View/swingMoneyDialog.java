package View;

import Model.Currency;
import Model.Money;
import Controller.Controller;
import java.awt.Color;
import java.util.*;
import javax.swing.JOptionPane;
    
    public class swingMoneyDialog extends javax.swing.JFrame implements Dialog, Display{
    
        /*Declaramos las siguientes variables*/
    private final String[] currenciesCombo;
    private final Controller controller;
    private final List<Currency> listadoCurrency;
    
    
    // metodo swingMoney
    
    
    public swingMoneyDialog(List<Currency> currenciesList, Controller controller) {
        this.listadoCurrency=currenciesList;
        this.currenciesCombo=creaCurrency(listadoCurrency);
        this.controller=controller;
        initComponents();
    }
    
    // creando currency
    
    private String[] creaCurrency(List<Currency> lista) {
        String[] result = new String[lista.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = lista.get(i).toString();
        }
        return result;
    }

    
    @Override
    public Money getMoney() {
        
        double cantidad = 0
       ;
        try {
             cantidad=Double.parseDouble(jTextFieldQuantityReader.getText());
             
             
             // si no se ponen bien que aparezca un mensaje de error
             
             
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,
                    "Error en la cantidad introducida",
                    "Revisar",
                    JOptionPane.ERROR_MESSAGE);
        }
        int selectedIndex=jComboBoxCurrencyFrom.getSelectedIndex();
        return new Money(cantidad, listadoCurrency.get(selectedIndex));
        
    }
    
    
    // currency to
    @Override
    public Currency getCurrencyTo() {
        return listadoCurrency.get(jComboBoxCurrencyTo.getSelectedIndex());
    }
    
    // currency from
    

    @Override
    public Currency getCurrencyFrom() {
        return listadoCurrency.get(jComboBoxCurrencyFrom.getSelectedIndex());
    }
    
    
    // display
    
    
    @Override
    public void display(Money money) {
        jTextAreaDisplay.setText(money.toString());
    }
    
    private void jComboBoxCurrencyToActionPerformed(java.awt.event.ActionEvent evt) {                                           
        this.controller.metodo();
    }
    
    
    private void jComboBoxCurrencyFromActionPerformed(java.awt.event.ActionEvent evt) {                                           
        this.controller.metodo();
    }
    
    
            
    private void jTextFieldQuantityReaderActionPerformed(java.awt.event.ActionEvent evt) {                                            
        this.controller.metodo();
    }
    
    // declaramos
    private javax.swing.JLabel jLabelQuatityText;
    private javax.swing.JLabel jLabelProbablyUnnecessaryCredits;
    private javax.swing.JScrollPane jScrollPaneForTextAreaDisplay;
    private javax.swing.JComboBox<String> jComboBoxCurrencyFrom;
    private javax.swing.JComboBox<String> jComboBoxCurrencyTo;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JLabel jLabelCurrencyFromText;
    private javax.swing.JLabel jLabelCurrencyToText;
    private javax.swing.JTextArea jTextAreaDisplay;
    private javax.swing.JTextField jTextFieldQuantityReader;
    
    // init component
    
    
    private void initComponents() {

        jLabelTitle = new javax.swing.JLabel(); // titulo
        
        jTextFieldQuantityReader = new javax.swing.JTextField();
        jComboBoxCurrencyFrom = new javax.swing.JComboBox<>();
        jComboBoxCurrencyTo = new javax.swing.JComboBox<>();
        jLabelCurrencyFromText = new javax.swing.JLabel();
        jLabelCurrencyToText = new javax.swing.JLabel();
        jScrollPaneForTextAreaDisplay = new javax.swing.JScrollPane();
        jTextAreaDisplay = new javax.swing.JTextArea();
        jLabelQuatityText = new javax.swing.JLabel();
        jLabelProbablyUnnecessaryCredits = new javax.swing.JLabel();
        
        // operacion de cerrar

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        
        

        
        jTextFieldQuantityReader.setText("");
        
        //listener
        jTextFieldQuantityReader.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldQuantityReaderActionPerformed(evt);
            }
        });

        
        jComboBoxCurrencyFrom.setModel(new javax.swing.DefaultComboBoxModel<>(currenciesCombo));
         jComboBoxCurrencyFrom.setBackground(new Color(123,245,238));
        jComboBoxCurrencyFrom.addActionListener(new java.awt.event.ActionListener() {
            
            
            /*Implement an action listener to define what should be done when an user performs certain operation.
            
            */
            public void actionPerformed(java.awt.event.ActionEvent e) {
                jComboBoxCurrencyFromActionPerformed(e);
            }
        });
        
        /* Aparezca from para sleccionar */
        
        jLabelCurrencyFromText.setText("From:");
      

        
        /* Aparezca to para introducir */
        
        
        jLabelCurrencyToText.setText("To:");
      
        

       
        jComboBoxCurrencyTo.setModel(new javax.swing.DefaultComboBoxModel<>(currenciesCombo));
         jComboBoxCurrencyTo.setBackground(new Color(123,245,238));
        jComboBoxCurrencyTo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxCurrencyToActionPerformed(evt);
            }
        });

        
        

        
        
        
        jScrollPaneForTextAreaDisplay.setViewportView(jTextAreaDisplay);

        // aparezca la opcion escrita de introducir la cantidad
        
        
        jLabelQuatityText.setText("quantity money:");
        jLabelQuatityText.setBackground( Color.WHITE );

        
       

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        
        this.getContentPane().setBackground(Color.orange); // color
        
        // set Horizontal
        
        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                
                // addGroup
                
            .addGroup(layout.createSequentialGroup()
                    
                
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                         
                    // addComponent
                        
                    .addComponent(jLabelCurrencyFromText, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                        
                        
                     .addComponent(jComboBoxCurrencyFrom, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                       
                        
                    .addComponent(jTextFieldQuantityReader)
                        
                        
                    
                        
                       .addComponent(jLabelQuatityText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    
                    
                    //addPreferredGap
                    
                    
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        
                    .addComponent(jComboBoxCurrencyTo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        
                    .addComponent(jLabelCurrencyToText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        
                    .addComponent(jScrollPaneForTextAreaDisplay, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE))
                )
            .addGroup(layout.createSequentialGroup()
               
                .addComponent(jLabelTitle)
                )
                
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelProbablyUnnecessaryCredits, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                )
        );
        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                    
                // addComponent
                    
                    
                .addComponent(jLabelTitle) // añadir componente titulo
                
                    // addGroup
                    
                    
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                            
                            // utilizamos addComponent
                            
                            
                            
                        .addComponent(jLabelCurrencyToText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                       
                        .addComponent(jComboBoxCurrencyTo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                            
                        .addComponent(jLabelCurrencyFromText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        
                            
                            
                        
                            
                            .addComponent(jComboBoxCurrencyFrom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        
                        
                    .addGroup(layout.createSequentialGroup()
                            
                            
                        // seguimos utilizando addComponent para lo que queda
                            
                        .addComponent(jLabelQuatityText, javax.swing.GroupLayout.PREFERRED_SIZE,12,javax.swing.GroupLayout.PREFERRED_SIZE)
                        
                       
                            
                            .addComponent(jTextFieldQuantityReader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        
                            
                        .addComponent(jScrollPaneForTextAreaDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                
                    
                    
                .addComponent(jLabelProbablyUnnecessaryCredits)
                )
        );

        pack();
    }
    
}

