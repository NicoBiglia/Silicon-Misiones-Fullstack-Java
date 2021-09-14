
package igu;

import java.awt.Color;

/**
 * @author Nicolas Biglia
 */
public class Agenda extends javax.swing.JFrame {
    
    //Declaro mis variables de forma global
    public static int index = 0;
    public static String dni[] = new String[10];
    public static String direccion[] = new String[10];
    public static String nombre[] = new String[10];
    public static String apellido[] = new String[10];
    public static String telefono[] = new String[10];
    public static String fecha[] = new String[10];
    
    //Creamos la funcion isNumber para corroborar que el dato ingresado sea un numero 
    private static boolean isNumber(String n) { 
		try {
			Integer.parseInt(n);
			return true;
		} catch (NumberFormatException nfe) {
			return false;
		}
	}
    
    public Agenda() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        guardarBtn = new javax.swing.JButton();
        siguienteBtn = new javax.swing.JButton();
        atrasBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        indiceTxt = new javax.swing.JTextField();
        telefonoTxt = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        fechaTxt = new javax.swing.JTextField();
        dniTxt = new javax.swing.JTextField();
        nombreTxt = new javax.swing.JTextField();
        apellidoTxt = new javax.swing.JTextField();
        direccionTxt = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Rockwell", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 51));
        jLabel1.setText("AGENDA ELECTRONICA");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Rockwell", 2, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 51));
        jLabel3.setText("INDICE :");

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Rockwell", 2, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 51));
        jLabel4.setText("NOMBRE :");

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Rockwell", 2, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 51));
        jLabel5.setText("APELLIDO :");

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Rockwell", 2, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 51));
        jLabel6.setText("DIRECCION :");

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Rockwell", 2, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 51));
        jLabel7.setText("TELEFONO :");

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Rockwell", 2, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 51));
        jLabel8.setText("FECHA NAC. :");

        guardarBtn.setBackground(new java.awt.Color(204, 204, 255));
        guardarBtn.setForeground(new java.awt.Color(0, 0, 51));
        guardarBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/floppy-disk (1).png"))); // NOI18N
        guardarBtn.setBorder(null);
        guardarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarBtnActionPerformed(evt);
            }
        });

        siguienteBtn.setBackground(new java.awt.Color(204, 204, 255));
        siguienteBtn.setForeground(new java.awt.Color(204, 204, 255));
        siguienteBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/next.png"))); // NOI18N
        siguienteBtn.setBorder(null);
        siguienteBtn.setBorderPainted(false);
        siguienteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                siguienteBtnActionPerformed(evt);
            }
        });

        atrasBtn.setBackground(new java.awt.Color(204, 204, 255));
        atrasBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/left-arrow.png"))); // NOI18N
        atrasBtn.setBorder(null);
        atrasBtn.setBorderPainted(false);
        atrasBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasBtnActionPerformed(evt);
            }
        });

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Rockwell", 2, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 51));
        jLabel9.setText("DNI :");

        indiceTxt.setEditable(false);
        indiceTxt.setBackground(new java.awt.Color(204, 204, 255));
        indiceTxt.setFont(new java.awt.Font("Rockwell", 2, 24)); // NOI18N
        indiceTxt.setForeground(new java.awt.Color(0, 0, 51));
        indiceTxt.setText("0");
        indiceTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indiceTxtActionPerformed(evt);
            }
        });

        telefonoTxt.setBackground(new java.awt.Color(204, 204, 255));
        telefonoTxt.setFont(new java.awt.Font("Rockwell", 2, 24)); // NOI18N
        telefonoTxt.setForeground(new java.awt.Color(0, 0, 51));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/calendario1.png"))); // NOI18N

        fechaTxt.setBackground(new java.awt.Color(204, 204, 255));
        fechaTxt.setFont(new java.awt.Font("Rockwell", 2, 24)); // NOI18N
        fechaTxt.setForeground(new java.awt.Color(0, 0, 51));

        dniTxt.setBackground(new java.awt.Color(204, 204, 255));
        dniTxt.setFont(new java.awt.Font("Rockwell", 2, 24)); // NOI18N
        dniTxt.setForeground(new java.awt.Color(0, 0, 51));

        nombreTxt.setBackground(new java.awt.Color(204, 204, 255));
        nombreTxt.setFont(new java.awt.Font("Rockwell", 2, 24)); // NOI18N
        nombreTxt.setForeground(new java.awt.Color(0, 0, 51));

        apellidoTxt.setBackground(new java.awt.Color(204, 204, 255));
        apellidoTxt.setFont(new java.awt.Font("Rockwell", 2, 24)); // NOI18N
        apellidoTxt.setForeground(new java.awt.Color(0, 0, 51));

        direccionTxt.setBackground(new java.awt.Color(204, 204, 255));
        direccionTxt.setFont(new java.awt.Font("Rockwell", 2, 24)); // NOI18N
        direccionTxt.setForeground(new java.awt.Color(0, 0, 51));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(19, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(351, 351, 351)
                                .addComponent(atrasBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(guardarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(siguienteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(315, 315, 315))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 20, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(dniTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(nombreTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(apellidoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(31, 31, 31)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(43, 43, 43)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(telefonoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(6, 6, 6))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(439, 439, 439)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(378, 378, 378)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(indiceTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(fechaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 846, Short.MAX_VALUE)
                                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(direccionTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(222, 222, 222)
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel11)))))
                        .addGap(0, 6, Short.MAX_VALUE)))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel11))
                .addGap(23, 23, 23)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(direccionTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dniTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(telefonoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nombreTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fechaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(apellidoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, Short.MAX_VALUE)))
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(siguienteBtn)
                    .addComponent(atrasBtn)
                    .addComponent(guardarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(indiceTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addComponent(jLabel2)
                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    //Creo una funcion donde establezco que en cada posicion segun el indice, tomo el texto en pantalla para guardarlo.
    public void recogerDatos(){  
      
    //Corroboro si el dato ingresado es un numero, sino advierto por pantalla el error
       if(isNumber(dniTxt.getText())) { 
            dni[index] = dniTxt.getText();
            dniTxt.setForeground(new Color(0,0,51));
            
        } else {
            dniTxt.setForeground(Color.RED);
            dni[index] = "Ingrese un DNI válido";
        } 
      
      direccion[index] = direccionTxt.getText();
      nombre[index] = nombreTxt.getText();
      apellido[index] = apellidoTxt.getText();
      
     
      
      if(isNumber(telefonoTxt.getText())) {
            telefono[index] = telefonoTxt.getText();
            telefonoTxt.setForeground(new Color(0,0,51));
            
        } else {
            telefonoTxt.setForeground(Color.red); //con este metodo cambiamos el color cuando hay un error para mayor claridad en el mensaje
            telefono[index] = "Teléfono invalido";
        }
      
      
      fecha[index] = fechaTxt.getText();
     
    }
    
    //Creo una funcion donde simplemente muestro los datos
    public void verDatos(){ 
        dniTxt.setText(dni[index]);
        direccionTxt.setText(direccion[index]);
        nombreTxt.setText(nombre[index]);
        apellidoTxt.setText(apellido[index]);
        telefonoTxt.setText(telefono[index]);
        fechaTxt.setText(fecha[index]);
    }
    
    private void guardarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarBtnActionPerformed
      //Al hacer click en guardar llamo a la funcion que recoge los datos y luego los muestro 
      recogerDatos();
      verDatos();
      
    }//GEN-LAST:event_guardarBtnActionPerformed

    private void indiceTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indiceTxtActionPerformed
     
    }//GEN-LAST:event_indiceTxtActionPerformed

    private void siguienteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_siguienteBtnActionPerformed
      //En esta funcion voy aumentando el indice y mostrando los datos mientras este sea menor a 10 
        if(index < 9){
           indiceTxt.setText(Integer.toString(++index));
       }
        verDatos();
    }//GEN-LAST:event_siguienteBtnActionPerformed

    private void atrasBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasBtnActionPerformed
        if(index > 0){
           indiceTxt.setText(Integer.toString(--index));
       }  
        verDatos();
    }//GEN-LAST:event_atrasBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField apellidoTxt;
    private javax.swing.JButton atrasBtn;
    private javax.swing.JTextField direccionTxt;
    private javax.swing.JTextField dniTxt;
    private javax.swing.JTextField fechaTxt;
    private javax.swing.JButton guardarBtn;
    private javax.swing.JTextField indiceTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField nombreTxt;
    private javax.swing.JButton siguienteBtn;
    private javax.swing.JTextField telefonoTxt;
    // End of variables declaration//GEN-END:variables
}
