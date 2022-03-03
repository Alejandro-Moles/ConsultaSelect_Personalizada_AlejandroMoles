
package Vista;

import Controlador.Conexion;
import static Controlador.Conexion.conexion;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import Modelo.Columnas;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class VentanaPrincipal extends javax.swing.JFrame {
    
    
    private ArrayList<Columnas> datosColumnas= new ArrayList<>();//me creo un ArrayList de columnas
    
    private Controlador.Conexion cr = new Controlador.Conexion();//me creo el objecto del controlador
    
    private String sentencia;
    
    
    public VentanaPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
        tabla.getTableHeader().setReorderingAllowed(false);
        
        //recorro el bucle para ir metiendo en el JChoice los datos del arrayList de string que contiene los nombres de las tablas
        for(int i = 0;i<Controlador.Conexion.NombresTablas.size();i++){
            choice_Tabla.add(Controlador.Conexion.NombresTablas.get(i));
        } 
        //hago que el label y el textField del Valor dos no puedan ser visibles
        text_Valor2.setVisible(false);
        jLabel5.setVisible(false);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        choice_Tabla = new java.awt.Choice();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        text_Orden = new javax.swing.JTextField();
        boton_ejecutar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        choice_columnas = new javax.swing.JComboBox<>();
        choice_operador = new javax.swing.JComboBox<>();
        text_Valor = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        text_Valor2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Trabajar_BaseDatos");
        setPreferredSize(new java.awt.Dimension(750, 750));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setPreferredSize(new java.awt.Dimension(750, 750));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Tablas: ");

        choice_Tabla.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        choice_Tabla.setFocusable(false);
        choice_Tabla.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        choice_Tabla.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                choice_TablaItemStateChanged(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Columnas");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Operador");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Valor");

        text_Orden.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N

        boton_ejecutar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        boton_ejecutar.setText("Ejecutar");
        boton_ejecutar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_ejecutarActionPerformed(evt);
            }
        });

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tabla.setEnabled(false);
        jScrollPane1.setViewportView(tabla);

        choice_columnas.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        choice_columnas.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                choice_columnasItemStateChanged(evt);
            }
        });

        choice_operador.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        choice_operador.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                choice_operadorItemStateChanged(evt);
            }
        });

        text_Valor.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        text_Valor.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                text_ValorFocusLost(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Valor 2");

        text_Valor2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        text_Valor2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                text_Valor2FocusLost(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(choice_columnas, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(choice_operador, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(text_Valor, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                            .addComponent(text_Valor2))
                        .addGap(0, 49, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(choice_Tabla, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(text_Orden, javax.swing.GroupLayout.PREFERRED_SIZE, 542, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(boton_ejecutar, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 38, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(choice_Tabla, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(choice_columnas, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(choice_operador, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(text_Valor, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(text_Valor2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(68, 68, 68)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(boton_ejecutar, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                    .addComponent(text_Orden))
                .addGap(46, 46, 46)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(117, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel2, jLabel3});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {choice_columnas, choice_operador, text_Valor});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 758, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 904, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Hago que cuando la ventana se este cerrando, salte un mensaje y cierre la conexion
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        try {
            JOptionPane.showMessageDialog(rootPane, "Cerrando Conexion");
            Controlador.Conexion.conexion.close();
        } catch (SQLException ex) {
            
        }
    }//GEN-LAST:event_formWindowClosing
    
    //Cuando se presiona el boton ejecutar ocurre esto
    private void boton_ejecutarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_ejecutarActionPerformed
        tabla.removeAll();//borra toda la tabla
        try {
            DefaultTableModel modelo = new DefaultTableModel();//me creo un DefaultTableModel
            tabla.setModel(modelo);
            ArrayList<String> nombreColumnas = new ArrayList<>();//me creo un array de String
            
            Statement sta = conexion.createStatement();//Me creo un Statement, al cual asigno la conexion
            ResultSet rs = sta.executeQuery(text_Orden.getText());//utilizo el metodo executeQuery() para ejecutar la senetencia sql, que es la que hay en el textField, text_Orden
            ResultSetMetaData rsmd = rs.getMetaData();//creo un ResultSetMetaData y obtengo los metadatos del resultset 
            
            //recorro el resulsetmetadata y añado en el arraylist <nombreColumnas> los nombres de las columnas
            for(int i = 1; i<=rsmd.getColumnCount();i++){
                nombreColumnas.add(rsmd.getColumnName(i));
            }
            
            //recorro el array nombreColumnas y voy metiendo en la tabla, los nombres de las columnas respectivamente
            for(int i = 0; i<nombreColumnas.size();i++){
                modelo.addColumn(new String(nombreColumnas.get(i)));    
            }
            
            //recorro el result set con un while para obtener las filas de las tabla
            while(rs.next()){
                Object[] NuevaFila = new Object[datosColumnas.size()];//me creo un nuevo Object[] y le asigno como tamaño, las dimensiones del array datosColumnas
                for(int i = 0; i<nombreColumnas.size();i++){
                    //Añado en el objecto NuevaFila, el objecto que he leido utilizando el metodo getObject
                    NuevaFila[i] = rs.getObject(i + 1); // se tiene que poner el +1 ya que estas cogiendo los datos del resultSet, y dentro de el no se puede empezar desde el indice 0, el primero es el 1
                }
                modelo.addRow(NuevaFila);//añado a la tabla la fila, pasandole el objeto NuevaFila
            }
            
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(rootPane, "Error, consulta no valida");
        }
    }//GEN-LAST:event_boton_ejecutarActionPerformed

    //metodo que comprueba cuando el choice_Tabla se ha cambiado de seleccion
    private void choice_TablaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_choice_TablaItemStateChanged
        try {
            choice_columnas.removeAllItems();//remuevo todos los items de choice_columnas, para que no se me acumulen
            
            //Relleno el array datosColumnas con el metodo que esta en la clase controladora
            datosColumnas = cr.getColumnas(choice_Tabla.getSelectedItem());
            //recorro el array datosColumnas y voy poiendo cada una de las columnas 
            for(int i = 0;i<datosColumnas.size();i++){
                choice_columnas.addItem(datosColumnas.get(i));
            }
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(rootPane, "Error, consulta no valida");
        }
    }//GEN-LAST:event_choice_TablaItemStateChanged

    //metodo que comprueba cuando se ha cambiado el item de choice_columnas
    private void choice_columnasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_choice_columnasItemStateChanged
        choice_operador.removeAllItems();//limpia los items de choice_operador para que no se acumulen
        //si el choice_columnas esta vacio, entonces no realiza este if
        if(choice_columnas.getSelectedIndex() != -1){
            Columnas c1 = (Columnas)choice_columnas.getSelectedItem();//creo un objecto Columnas que cojo del choice_columnas
            
            //si el tipo de la columna es VARCHAR2 se me ponnen los siguientes opreadores en el choice_operador
            if(c1.getTipo().equalsIgnoreCase("VARCHAR2")){
                choice_operador.addItem("LIKE");
                choice_operador.addItem("=");
            }
            //si el tipo de la columna es NUMBER se me ponnen los siguientes opreadores en el choice_operador
            if(c1.getTipo().equalsIgnoreCase("NUMBER")){
                choice_operador.addItem("<");
                choice_operador.addItem("=");
                choice_operador.addItem(">");
                choice_operador.addItem(">=");
                choice_operador.addItem("<=");
            }
            //si el tipo de la columna es DATE se me ponnen los siguientes opreadores en el choice_operador
            if(c1.getTipo().equalsIgnoreCase("DATE")){
                choice_operador.addItem("BETWEEN"); 
        }
           
        }
    }//GEN-LAST:event_choice_columnasItemStateChanged
    //etodo que se ejecuta cada vez que el choice_operador se cambia
    private void choice_operadorItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_choice_operadorItemStateChanged
        //si choice_operador, esta seleccionando la opcion BETWEEN ejecuta esto
        if(choice_operador.getSelectedItem() == "BETWEEN"){
            //pone visible el label y el textfield de Valor2
            text_Valor2.setVisible(true);
            jLabel5.setVisible(true);
        }else{
            //si no esta selecionando la opcion BETWEEN, pone invisible el label y el tetxtField de Valor2
            text_Valor2.setVisible(false);
            jLabel5.setVisible(false);
        }
    }//GEN-LAST:event_choice_operadorItemStateChanged

    //Metodo que se ejecuta cuando text_Valor pierde el focus
    private void text_ValorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_text_ValorFocusLost
        Columnas c1 = (Columnas)choice_columnas.getSelectedItem();//crea un objecto Columnas al que se le asigna lo que hay en choice_columnas
        
        //si el tipo de la columna es NUMBER, se crea una sentencia sql por defecto
        if(c1.getTipo().equalsIgnoreCase("NUMBER")){
            sentencia = "SELECT * FROM " +choice_Tabla.getSelectedItem() + " WHERE " +choice_columnas.getSelectedItem()+ " " +choice_operador.getSelectedItem()+ " " +text_Valor.getText();
        }
        //si el tipo de la columna es VARCHAR2, se crea otra sentencia sql por defecto
        if(c1.getTipo().equalsIgnoreCase("VARCHAR2")){
            sentencia = "SELECT * FROM " +choice_Tabla.getSelectedItem() + " WHERE " +choice_columnas.getSelectedItem()+ " " +choice_operador.getSelectedItem()+ " " +"'%"+text_Valor.getText()+"%'";
        }
        //si el tipo de la columna es NUMBER, se crea otra sentencia sql por defecto
        if(c1.getTipo().equalsIgnoreCase("DATE")){
            sentencia = "SELECT * FROM " +choice_Tabla.getSelectedItem() + " WHERE " +choice_columnas.getSelectedItem()+ " " +choice_operador.getSelectedItem()+ " " +"'"+text_Valor.getText()+"' " +"AND" +" '" +text_Valor2.getText()+ "'";
            
        }
        //si esta vacio el campo de valor, se crea una sentencia select diferente
        if(text_Valor.getText().isEmpty()){
            sentencia = "SELECT * FROM " +choice_Tabla.getSelectedItem();
        }
        text_Orden.setText(sentencia);//paso la sentencia que se ha creado al text_Orden
    }//GEN-LAST:event_text_ValorFocusLost

    //metodo que se ejecuta al perder el focus de text_Valor2
    private void text_Valor2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_text_Valor2FocusLost
        sentencia = "SELECT * FROM " +choice_Tabla.getSelectedItem() + " WHERE " +choice_columnas.getSelectedItem()+ " " +choice_operador.getSelectedItem()+ " " +"'"+text_Valor.getText()+"'" +"AND" +" '" +text_Valor2.getText()+ "'";
        text_Orden.setText(sentencia);
    }//GEN-LAST:event_text_Valor2FocusLost

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_ejecutar;
    private java.awt.Choice choice_Tabla;
    private javax.swing.JComboBox<Columnas> choice_columnas;
    private javax.swing.JComboBox<String> choice_operador;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField text_Orden;
    private javax.swing.JTextField text_Valor;
    private javax.swing.JTextField text_Valor2;
    // End of variables declaration//GEN-END:variables
}
