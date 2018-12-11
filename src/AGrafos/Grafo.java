/*Programa realiado por Andrés Largo y Erika Infante*/
package AGrafos;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

public class Grafo extends javax.swing.JFrame {

// <editor-fold defaultstate="collapsed" desc="Vars Declaration">                          
    int AV_X, AV_Y, g, kj = 0, AV_Cantidad = 0;
    ArrayList<JLabel> JLabels = new ArrayList<>();
    DefaultTableModel Data = new DefaultTableModel();
    ArrayList<String> Labels = new ArrayList<>();
    String[][] fila;
    String[][] ady;
    String Cab[], Cab2[];
    int Last = 0;
    ArrayList<Integer> Pesos = new ArrayList<>();
    ArrayList<JLabel> AV_ConnectedNodo = new ArrayList<>();
    Graphics AV_G, Reco;
    int AV_PosX[] = new int[2];
    int AV_PosY[] = new int[2];
    int AV_Ite;
    int Pos = 0;
    int t = 0;
    JLabel e, f;
    boolean terminar = false;
    ArrayList<String> Relations = new ArrayList<>();
    ArrayList<String> AV_NodoName = new ArrayList<>();
    ArrayList<String> AV_NodoNamev2 = new ArrayList<>();
    ArrayList<Integer> Pesov2 = new ArrayList<>();
// </editor-fold>  

    public Grafo() {
        initComponents();
        jPanel4.setVisible(false);
        this.setLocationRelativeTo(null);
        jButton2.setEnabled(false);
        AV_G = jPanel5.getGraphics();
        Reco = jPanel5.getGraphics();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jTextField5 = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jTextField6 = new javax.swing.JTextField();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Grafos");
        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(1297, 706));
        setMinimumSize(new java.awt.Dimension(1297, 706));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1297, 706));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(0, 0, 0));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 255)));
        jPanel5.setForeground(new java.awt.Color(255, 255, 255));
        jPanel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel5MouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel5MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 458, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 630, 460));

        jTextArea1.setBackground(new java.awt.Color(0, 0, 0));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setAutoscrolls(false);
        jTextArea1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 255)));
        jScrollPane2.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 450, 180, 180));

        jButton1.setBackground(new java.awt.Color(0, 204, 255));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 650, 100, 30));

        jTextField2.setEditable(false);
        jTextField2.setBackground(new java.awt.Color(0, 0, 0));
        jTextField2.setForeground(new java.awt.Color(0, 204, 255));
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setText("MATRIZ DE ADYACENCIA");
        jTextField2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 255)));
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 100, 620, 30));

        jTextField3.setBackground(new java.awt.Color(0, 0, 0));
        jTextField3.setForeground(new java.awt.Color(0, 204, 255));
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField3.setText("POSICIONES");
        jTextField3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 255)));
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 410, 160, 30));

        jTextField4.setBackground(new java.awt.Color(0, 0, 0));
        jTextField4.setForeground(new java.awt.Color(0, 204, 255));
        jTextField4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField4.setText("MATRIZ DE INCIDENCIA");
        jTextField4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 255)));
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 250, 620, 30));

        jTable2.setBackground(new java.awt.Color(0, 0, 0));
        jTable2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 255)));
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "PARA MOSTRAR DATOS AQUÍ PRESIONE EN TERMINAR."
            }
        ));
        jTable2.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jTable2.setGridColor(new java.awt.Color(0, 0, 0));
        jTable2.setOpaque(false);
        jTable2.setSelectionBackground(new java.awt.Color(0, 204, 255));
        jTable2.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jScrollPane4.setViewportView(jTable2);

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 140, 620, 100));

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cooltext236845039395263.png"))); // NOI18N
        jLabel9.setText("jLabel9");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 1260, 100));

        jTable3.setBackground(new java.awt.Color(0, 0, 0));
        jTable3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 255)));
        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "PARA VISUALIZAR LA MATRIZ DE INCIDENCIA POR FAVOR PRESIONE EN TERMINAR."
            }
        ));
        jTable3.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jTable3.setGridColor(new java.awt.Color(0, 0, 0));
        jTable3.setOpaque(false);
        jTable3.setSelectionBackground(new java.awt.Color(0, 204, 255));
        jTable3.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jScrollPane5.setViewportView(jTable3);

        getContentPane().add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 290, 620, 110));

        jTextField5.setBackground(new java.awt.Color(0, 0, 0));
        jTextField5.setForeground(new java.awt.Color(0, 204, 255));
        jTextField5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField5.setText("LISTA DE NODOS");
        jTextField5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 255)));
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 410, 180, 30));

        jTextArea2.setBackground(new java.awt.Color(0, 0, 0));
        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jTextArea2.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea2.setLineWrap(true);
        jTextArea2.setRows(5);
        jTextArea2.setAutoscrolls(false);
        jTextArea2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 255)));
        jScrollPane3.setViewportView(jTextArea2);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 450, 160, 180));

        jPanel4.setBackground(new java.awt.Color(0, 204, 255));
        jPanel4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Querido usuario, realice las conexiones y compruebe.");

        jButton3.setBackground(new java.awt.Color(0, 204, 255));
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Terminar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(0, 204, 255));
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Comprobar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addGap(7, 7, 7)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 560, 630, 70));

        jPanel3.setBackground(new java.awt.Color(0, 204, 255));
        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Ingresa el nombre del nodo ");

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setForeground(new java.awt.Color(0, 204, 255));
        jButton2.setText("Terminar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jButton2)
                .addGap(28, 28, 28))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 560, 630, 70));

        jTextField6.setBackground(new java.awt.Color(0, 0, 0));
        jTextField6.setForeground(new java.awt.Color(0, 204, 255));
        jTextField6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField6.setText("ALGORITMO DE DIJKSTRA");
        jTextField6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 255)));
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 410, 260, 30));

        jTextArea3.setBackground(new java.awt.Color(0, 0, 0));
        jTextArea3.setColumns(20);
        jTextArea3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jTextArea3.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea3.setLineWrap(true);
        jTextArea3.setRows(5);
        jTextArea3.setAutoscrolls(false);
        jTextArea3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 204, 255)));
        jScrollPane6.setViewportView(jTextArea3);

        getContentPane().add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 450, 260, 180));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bJuhw.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-60, -70, 1390, 780));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Last = 1;
        jPanel3.setVisible(false);
        jPanel4.setVisible(true);
        jButton3.setEnabled(false);
        AV_Cantidad = 0;
        for (JLabel e : JLabels) {
            Labels.add(e.getText().toUpperCase());
            AV_Cantidad++;
        }
        ady = new String[AV_Cantidad + 1][AV_Cantidad + 1];
        fila = new String[AV_Cantidad + 1][AV_Cantidad + 1];

        Inicialización(ady);
        Inicialización(fila);
        Imprimir(fila);
        Cab = new String[AV_Cantidad + 1];
        for (int i = 0; i < AV_Cantidad + 1; i++) {
            Cab[i] = "";
        }

        fila[0][0] = "";

        jTable2 = new javax.swing.JTable();
        jTable2.setModel(new javax.swing.table.DefaultTableModel(fila, Cab));
        jScrollPane4.setViewportView(jTable2);
        jTable2.setBackground(new java.awt.Color(0, 0, 0));
        jTable2.setForeground(new java.awt.Color(0, 204, 255));
        TableColumnModel columnModel = jTable2.getColumnModel();
        for (int i = 0; i < columnModel.getColumnCount(); i++) {
            columnModel.getColumn(i).setPreferredWidth(100);
            centrar_datos(i, jTable2);
        }
        //jTable3.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        jTable2.getTableHeader().setVisible(false);

    }//GEN-LAST:event_jButton2ActionPerformed

    int Erika = 0;
    private void jPanel5MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel5MousePressed

    private void jPanel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jPanel5MouseEntered

    private void jPanel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseClicked

        if (Last == 0 && !terminar) {
            if (jTextField1.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Ha ocurrido una tragedia, el campo no debe estar vacio");
                return;
            }
            if (!AF_RE(jTextField1.getText())) {
                JOptionPane.showMessageDialog(null, "Por favor no repita los datos");
                return;
            }
            if ((jPanel5.getWidth() <= evt.getX() && jPanel5.getWidth() >= evt.getX() - 30) && (jPanel5.getHeight() <= evt.getY() && jPanel5.getHeight() >= evt.getY() - 30)) {
                JOptionPane.showMessageDialog(null, "Por favor, no ponga los nodos fuera del área rectangular.", "Ha ocurrido una tragedia", JOptionPane.WARNING_MESSAGE);
                return;
            }
            jButton2.setEnabled(true);
            AF_Pos(evt.getX(), evt.getY());

        } else if (Last == 1 && !terminar) {
            for (JLabel e : JLabels) {
                if ((e.getBounds().x <= evt.getX() + 25 && e.getBounds().x >= evt.getX() - 30) && (e.getBounds().y <= evt.getY() + 30 && e.getBounds().y >= evt.getY() - 30)) {
                    for (JLabel g : AV_ConnectedNodo) {
                        if (g.getText().toLowerCase().equals(e.getText().toLowerCase())) {
                            JOptionPane.showMessageDialog(null, "Por favor seleccione un nodo diferente al actual");
                            return;
                        }
                    }
                    ImageIcon prron = new ImageIcon(getClass().getResource("/verde.png"));
                    e.setIcon(prron);
                    jPanel5.removeAll();
                    jPanel5.add(e);
                    jPanel5.paintComponents(AV_G);
                    AV_ConnectedNodo.add(e);
                    Erika++;
                }
            }
            if (Erika == 2) {
                String x = JOptionPane.showInputDialog(null, "Ingrese el peso", "Sea usted bienvenido", JOptionPane.QUESTION_MESSAGE);

                if (!isNumeric(x)) {
                    JOptionPane.showMessageDialog(null, "Sólo datos numéricos | Ha cancelado.");
                    ImageIcon prron = new ImageIcon(getClass().getResource("/prron.png"));
                    AV_ConnectedNodo.get(0).setIcon(prron);
                    AV_ConnectedNodo.get(1).setIcon(prron);
                    jPanel5.removeAll();
                    jPanel5.add(AV_ConnectedNodo.get(0));
                    jPanel5.add(AV_ConnectedNodo.get(1));
                    jPanel5.paintComponents(AV_G);
                    Erika = 0;
                    AV_ConnectedNodo.clear();
                    return;
                }
                if (Integer.parseInt(x) <= 0) {
                    JOptionPane.showMessageDialog(null, "Sólo números mayores a 0");
                    Erika = 0;
                    ImageIcon prron = new ImageIcon(getClass().getResource("/prron.png"));
                    AV_ConnectedNodo.get(0).setIcon(prron);
                    AV_ConnectedNodo.get(1).setIcon(prron);
                    jPanel5.removeAll();
                    jPanel5.add(AV_ConnectedNodo.get(0));
                    jPanel5.add(AV_ConnectedNodo.get(1));
                    jPanel5.paintComponents(AV_G);
                    AV_ConnectedNodo.clear();
                    return;
                }
                AV_Ite = 0;
                for (JLabel AV_Label : JLabels) {
                    if (AV_Label.getText().equals(AV_ConnectedNodo.get(0).getText())) {
                        AV_PosX[AV_Ite] = AV_Label.getBounds().x;
                        AV_PosY[AV_Ite] = AV_Label.getBounds().y;
                        AV_Ite++;
                        e = AV_Label;
                    }
                    if (AV_Label.getText().equals(AV_ConnectedNodo.get(1).getText())) {
                        AV_PosX[AV_Ite] = AV_Label.getBounds().x;
                        AV_PosY[AV_Ite] = AV_Label.getBounds().y;
                        AV_Ite++;
                        f = AV_Label;
                    }
                }
                if (AV_Ite != 2) {
                    JOptionPane.showMessageDialog(null, "Ha ocurrido una tragedia, No se ha podido establecer comunicación, un nodo no existe");
                    return;
                }

                if (AV_PosX[0] == AV_PosX[1] && AV_PosY[0] == AV_PosY[1]) {
                    AV_G.setColor(Color.white);
                    AV_G.drawOval(AV_PosX[0] - 22, AV_PosY[0] + 4, 29, 25);
                    BuscarPos(e.getText(), f.getText(), 0, true);
                    return;
                }

                if (!BuscarPos(e.getText(), f.getText(), Integer.parseInt(x), false)) {
                    Erika = 0;
                    ImageIcon prron = new ImageIcon(getClass().getResource("/prron.png"));
                    AV_ConnectedNodo.get(0).setIcon(prron);
                    AV_ConnectedNodo.get(1).setIcon(prron);
                    jPanel5.removeAll();
                    jPanel5.add(AV_ConnectedNodo.get(0));
                    jPanel5.add(AV_ConnectedNodo.get(1));
                    jPanel5.paintComponents(AV_G);
                    AV_ConnectedNodo.clear();
                    return;
                }
                AV_G.setColor(Color.white);
                AV_G.drawLine(AV_PosX[0] + 12, AV_PosY[0] + 12, AV_PosX[1] + 12, AV_PosY[1] + 12);

                JLabel l = new JLabel(x);

                ImageIcon prron = new ImageIcon(getClass().getResource("/prron.png"));
                e.setIcon(prron);
                f.setIcon(prron);
                l.setBounds(((AV_PosX[0]) + AV_PosX[1] - 5) / 2, ((AV_PosY[0]) + AV_PosY[1] - 5) / 2, 50, 50);
                l.setForeground(Color.cyan);
                jPanel5.removeAll();
                jPanel5.add(l);
                jPanel5.add(e);
                jPanel5.add(f);
                jPanel5.paintComponents(AV_G);
                t++;
                AV_ConnectedNodo.clear();
                Erika = 0;
            }

        } else {
            if (kj == 0) {
                JOptionPane.showMessageDialog(null, "Debe comprobar y darle a terminar si quiere ejecutar el algoritmo");
            }

            if (kj == 1) {
                if (!CerradaLaWea(false)) {
                    JOptionPane.showMessageDialog(null, "No se puede ejecutar con grafos abiertos");
                } else {
                    if (Erika == 2) {
                        return;
                    }
                    for (JLabel e : JLabels) {
                        if ((e.getBounds().x <= evt.getX() + 25 && e.getBounds().x >= evt.getX() - 30) && (e.getBounds().y <= evt.getY() + 30 && e.getBounds().y >= evt.getY() - 30)) {
                            for (JLabel g : AV_ConnectedNodo) {
                                if (g.getText().toLowerCase().equals(e.getText().toLowerCase())) {
                                    JOptionPane.showMessageDialog(null, "Por favor seleccione un nodo diferente al actual");
                                    return;
                                }
                            }
                            ImageIcon prron = new ImageIcon(getClass().getResource("/prron_2.png"));
                            e.setIcon(prron);
                            jPanel5.removeAll();
                            jPanel5.add(e);
                            jPanel5.paintComponents(AV_G);
                            AV_ConnectedNodo.add(e);
                            Erika++;
                            break;

                        }
                    }

                    if (Erika == 2) {
                        UnirErikak(AV_ConnectedNodo.get(0), AV_ConnectedNodo.get(1));
                    }

                }
            }

        }

    }//GEN-LAST:event_jPanel5MouseClicked
    public void Inicialización(Object vector[][]) {
        for (int i = 0; i < AV_Cantidad + 1; i++) {
            for (int j = 0; j <= AV_Cantidad; j++) {
                if (i == 0 && j > 0) {
                    vector[i][j] = Labels.get(j - 1);
                } else {
                    vector[i][j] = "0";
                }
            }
        }

        for (int j = 0; j < AV_Cantidad + 1; j++) {
            for (int i = 0; i <= AV_Cantidad; i++) {
                if (j == 0 && i > 0) {
                    vector[i][j] = Labels.get(i - 1);
                }
            }
        }
    }

    public void Imprimir(Object v[][]) {
        for (int i = 0; i < AV_Cantidad + 1; i++) {
            for (int j = 0; j < AV_Cantidad + 1; j++) {
                System.out.print(v[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public void SearchConection(String Ini, String A) {
        int Conexiones = 0, Validaciones = 0;
        String result[];
        AV_NodoNamev2.clear();
        Pesov2.clear();
        String auida = "", aux_nodo = "";
        for (int i = 0; i < Relations.size(); i++) {
            result = Relations.get(i).split("-");
            if (result[0].equals(A.toLowerCase())) {
                aux_nodo = result[3];
                break;
            }
        }
        for (int i = 0; i <= AV_Cantidad; i++) {
            for (int j = 0; j <= AV_Cantidad; j++) {
                //result = Relations.get(PosAnt).split("-");
                // System.out.println("Comparamos "+aux_nodo+" con"+ A);
                if (aux_nodo.equals("false") && ady[i][0].toLowerCase().equals(A.toLowerCase()) && !ady[i][j].equals("0") && isNumeric(ady[i][j])) {
                    auida = ady[i][0];
                    Conexiones++;
                    SendInformation(Ini, ady[i][0], Integer.parseInt(ady[i][j]), ady[0][j]);
                    Pesov2.add(Integer.parseInt(ady[i][j]));
                    AV_NodoNamev2.add(ady[0][j]);
                }
            }
        }
        int PosAnt = -1;
        for (int i = 0; i < Relations.size(); i++) {
            Result = Relations.get(i).split("-");
            if (Result[0].equals(auida.toLowerCase())) {
                PosAnt = i;
            }
        }

        String auxi = "";
        for (int k = 0; k < Pesov2.size(); k++) {
            for (int l = 0; l < Relations.size(); l++) {
                Result = Relations.get(l).split("-");
                if (Result[0].equals(AV_NodoNamev2.get(k).toLowerCase())) {
                    auxi = Result[3];
                    break;
                }
            }
            for (int i = 0; i <= AV_Cantidad; i++) {
                for (int j = 0; j <= AV_Cantidad; j++) {

                    if (auxi.equals("false") && ady[i][0].toLowerCase().equals(AV_NodoNamev2.get(k).toLowerCase()) && !ady[i][j].equals("0") && isNumeric(ady[i][j])) {
                        Validaciones++;
                        SendInformation(Ini, ady[i][0], Integer.parseInt(ady[i][j]), ady[0][j]);

                    }
                }
            }

            if (Validaciones >= Conexiones) {
                // System.out.println("Konda k pex,aquí ejecuto un pinshi truexdxd");
                Result = Relations.get(PosAnt).split("-");
                Relations.set(PosAnt, Result[0] + "-" + Result[1] + "-" + Result[2] + "-true");
            }

        }
    }

    public void UnirErikak(JLabel A, JLabel B) {

        Relations.add(A.getText().toLowerCase() + "-" + "infinito-0-false");
        int PosAnt = 0;
        String result[];
        int Conexiones = 0, Validaciones = 0;

        for (int i = 0; i <= AV_Cantidad; i++) {
            for (int j = 0; j <= AV_Cantidad; j++) {
                result = Relations.get(PosAnt).split("-");
                if (result[3].equals("false") && ady[i][0].toLowerCase().equals(result[0].toLowerCase()) && !ady[i][j].equals("0") && isNumeric(ady[i][j])) {
                    Conexiones++;
                    SendInformation(A.getText().toLowerCase(), ady[i][0], Integer.parseInt(ady[i][j]), ady[0][j]);
                    Peso.add(Integer.parseInt(ady[i][j]));
                    AV_NodoName.add(ady[0][j]);
                }
            }
        }

        result = Relations.get(PosAnt).split("-");
        for (int k = 0; k < Peso.size(); k++) {
            for (int i = 0; i <= AV_Cantidad; i++) {
                for (int j = 0; j <= AV_Cantidad; j++) {

                    if (result[3].equals("false") && ady[i][0].toLowerCase().equals(AV_NodoName.get(k).toLowerCase()) && !ady[i][j].equals("0") && isNumeric(ady[i][j])) {
                        SendInformation(A.getText().toLowerCase(), ady[i][0], Integer.parseInt(ady[i][j]), ady[0][j]);
                        SearchConection(A.getText().toLowerCase(), ady[0][j]);
                        Validaciones++;
                    }

                }
            }
            if (Validaciones >= Conexiones) {
                result = Relations.get(PosAnt).split("-");
                Relations.set(PosAnt, result[0] + "-" + result[1] + "-" + result[2] + "-true");
            }
        }
        for (String g : Relations) {
            System.out.println(g);
        }
        String AntNodo = "", g = "", e = " ";

        for (int i = Relations.size() - 1; i >= 0; i--) {
            Result = Relations.get(i).split("-");
            if (B.getText().toLowerCase().equals(Result[0])) {
                AntNodo = Result[1];
                drawLine(B.getText().toLowerCase(), AntNodo);
                break;
            }
        }
        jTextArea3.append("Ruta:" + '\n');
        jTextArea3.append(B.getText().toUpperCase() + "-" + AntNodo.toUpperCase() + '\n');
        int Acue = 0;
        while (!e.equals(A.getText().toLowerCase())) {
            for (int i = Relations.size() - 1; i >= 0; i--) {
                Result = Relations.get(i).split("-");
                if (AntNodo.toLowerCase().equals(Result[0])) {
                    drawLine(AntNodo, Result[1]);
                    if (Result[1].equals("infinito")) {
                        jTextArea3.append(AntNodo.toUpperCase() + "-" + B.getText().toUpperCase() + "     ");
                    } else {
                        jTextArea3.append(AntNodo.toUpperCase() + "-" + Result[1].toUpperCase() + '\n');
                    }
                    AntNodo = Result[1];
                }
            }
            if (Acue > 368) {
                JOptionPane.showMessageDialog(null, "Algo ocurrió xdxdd");
            }
            Acue++;

            if (e.equals(A.getText())) {
                break;
            }
            if ("infinito".equals(AntNodo)) {
                break;
            }
        }
    }

    public String getAnt(String g) {
        for (String e : Relations) {
            Result = e.split("-");
            if (Result[0].equals(g)) {
                return Result[1];
            }
        }
        return null;
    }

    public String getNext(String g) {
        for (String e : Relations) {
            Result = e.split("-");
            if (Result[1].equals(g)) {
                return Result[0];
            }
        }
        return null;
    }
    int vector[][] = new int[2][2];

    public void drawLine(String A, String B) {
        //System.out.println("Valor A: "+A+" VALOR B: "+B);
        for (JLabel g : JLabels) {
            if (g.getText().toLowerCase().equals(A)) {
                vector[0][0] = g.getBounds().x;
                vector[0][1] = g.getBounds().y;
                e = g;
            }
            if (g.getText().toLowerCase().equals(B)) {
                vector[1][0] = g.getBounds().x;
                vector[1][1] = g.getBounds().y;
                f = g;
            }
        }
        Reco.setColor(Color.red);
        Reco.drawLine(vector[0][0] + 12, vector[0][1] + 12, vector[1][0] + 12, vector[1][1] + 12);
        jPanel5.removeAll();
        jPanel5.add(e);
        jPanel5.add(f);
        jPanel5.paintComponents(Reco);
    }
    String Result[], value;

    public void SendInformation(String Ini, String A, int Peso, String B) {
        String auxe = null;

        int pesoau = 0;
        if (AV_RE3(B)) {
            for (int i = 0; i < Relations.size(); i++) {
                Result = Relations.get(i).split("-");
                if (A.toLowerCase().equals(Result[0])) {
                    auxe = Result[0];
                    pesoau = Integer.parseInt(Result[2]);
                }
            }
            if (auxe != null) {
                pesoau += Peso;
                Relations.add(B.toLowerCase() + "-" + A.toLowerCase() + "-" + pesoau + "-false");
            } else {
                Relations.add(B.toLowerCase() + "-" + A.toLowerCase() + "-" + Peso + "-false");
            }
        } else {

            int acum = 0;
            int aux = 0;
            for (int i = 0; i < Relations.size(); i++) {
                Result = Relations.get(i).split("-");
                if (Result[0].equals(A.toLowerCase())) {
                    System.out.println("Se encontro un pes");
                    acum = Integer.parseInt(Result[2]);
                    break;
                }
            }
            for (int i = 1; i < Relations.size(); i++) {
                System.out.println(Relations.get(i));

                Result = Relations.get(i).split("-");
                if (Result[3].equals("true")) {
                    continue;
                }
                if (Result[0].equals(B.toLowerCase())) {
                    if (Integer.parseInt(Result[2]) >= acum + Peso) {
                        aux = acum + Peso;
                        Relations.set(i, Result[0] + "-" + A.toLowerCase() + "-" + aux + "-false");
                        System.out.println("Un glorioso cambio ha ocurrido");
                        break;
                    }
                }
            }
        }
    }

    public boolean AV_RE3(String a) {
        String value[];
        for (String e : Relations) {
            value = e.split("-");
            if (value[0].equals(a.toLowerCase())) {
                return false;
            }
        }
        return true;
    }
    ArrayList<String> Name = new ArrayList<>();
    ArrayList<String> Name2 = new ArrayList<>();
    ArrayList<Integer> Peso = new ArrayList<>();

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed
    String[][] Adyce;
    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
        if (jTextField1.getText().length() == 13) {
            evt.consume();
        }

        char c = evt.getKeyChar();
        if ((c < 'a' || c > 'z') && c != 'ñ' && (c < '1' || c > '9')) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField1KeyTyped

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if (CerradaLaWea(true)) {
            JOptionPane.showMessageDialog(null, "Se puede aplicar el algoritmo del camino más corto");
            jButton3.setEnabled(true);
            kj = 1;
        } else {
            JOptionPane.showMessageDialog(null, "No se puede aplicar el algoritmo en este nodo");
            kj = 0;
            jButton3.setEnabled(false);
        }

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        terminar = true;
        jButton4.setEnabled(false);
        Adyce = new String[Labels.size() + 1][Pesos.size() + 1];
        Cab2 = new String[Pesos.size() + 1];
        for (int i = 1; i <= Pesos.size(); i++) {
            Adyce[0][i] = "" + Pesos.get(i - 1);
        }
        for (int i = 1; i <= Labels.size(); i++) {
            Adyce[i][0] = Labels.get(i - 1);
        }
        for (int i = 0; i <= Pesos.size(); i++) {
            Cab2[i] = "";
        }
        for (int i = 0; i <= Labels.size(); i++) {
            for (int j = 0; j <= Pesos.size(); j++) {
                if (Adyce[i][j] == null) {
                    Adyce[i][j] = "0";
                }
            }
        }
        for (int i = 0; i < AV_Cantidad + 1; i++) {
            for (int j = 0; j < AV_Cantidad + 1; j++) {
                System.out.print(ady[i][j] + "\t");

                if (!"0".equals(ady[i][j]) && isNumeric(ady[i][j])) {
                    Change(ady[0][j], ady[i][0], ady[i][j]);
                }
            }
            System.out.println();
        }

        jTable3 = new javax.swing.JTable();
        jTable3.setModel(new javax.swing.table.DefaultTableModel(Adyce, Cab2));
        jScrollPane5.setViewportView(jTable3);
        jTable3.setBackground(new java.awt.Color(0, 0, 0));
        jTable3.setForeground(new java.awt.Color(0, 204, 255));
        TableColumnModel columnModel = jTable3.getColumnModel();
        for (int i = 0; i < columnModel.getColumnCount(); i++) {
            centrar_datos(i, jTable3);
        }

        for (int i = 0; i < columnModel.getColumnCount(); i++) {
            columnModel.getColumn(i).setPreferredWidth(100);
        }
        jTable3.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        jTable2.getTableHeader().setVisible(false);
        jButton3.setEnabled(false);

        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private boolean CerradaLaWea(boolean par) {
        for (int i = 0; i < JLabels.size(); i++) {

            for (int j = 1; j < JLabels.size(); j++) {
                g = 0;
                for (int u = 0; u < JLabels.size() + 1; u++) {
                    if (u != j) {
                        if ("1".equals(fila[j][u])) {
                            g = g + 1;
                        }
                    }

                }
                if (g < 2) {
                    return false;
                }
            }
        }
        return true;
    }

    public void Change(String a, String b, String c) {
        int pa = -1, pe = -1, pi = -1, po = -1;
        for (int i = 0; i < Labels.size() + 1; i++) {
            for (int j = 0; j < Pesos.size() + 1; j++) {
                if (i == 0 && j > 0) {
                    if (Adyce[i][j].equals(c) && pa == -1) {
                        pa = j;
                    }
                } else if (j == 0 && i > 0) {
                    if (Adyce[i][j].equals(a) && pe == -1) {
                        pe = i;
                    } else if (Adyce[i][j].equals(b) && pi == -1) {
                        pi = i;
                    }
                }
            }
        }
        if (pi != -1 && pa != -1) {
            Adyce[pi][pa] = "" + 1;
        }
        if (pe != -1 && pa != -1) {
            Adyce[pe][pa] = "" + 1;
        }

    }

    public boolean BuscarPos(String a, String b, int number, boolean option) {
        try {
            int ab = -1, dc = -1, de = -1, fg = -1;
            for (int i = 0; i < AV_Cantidad + 1; i++) {
                for (int j = 0; j < AV_Cantidad + 1; j++) {
                    if (i == 0 && j > 0) {
                        if (fila[i][j].equals(a.toUpperCase())) {
                            ab = j;
                        } else if (fila[i][j].equals(b.toUpperCase())) {
                            de = j;
                        }
                    }
                    if (j == 0 && i > 0) {
                        if (fila[i][j].equals(b.toUpperCase())) {
                            dc = i;
                        } else if (fila[i][j].equals(a.toUpperCase())) {
                            fg = i;
                        }
                    }
                }

            }
            if ((ab != -1 && dc != -1 && de == -1 && fg == -1) && option) {
                fila[ab][dc] = "1";
            } else if ((ab == -1 && dc == -1 && de != -1 && fg != -1) && option) {
                fila[de][fg] = "1";
            } else {
                if (fila[0][fg].equals(a.toUpperCase()) && fila[de][0].equals(b.toUpperCase()) && fila[ab][dc].equals("1") || fila[dc][ab].equals("1")) {
                    JOptionPane.showMessageDialog(null, "Estos nodos ya están unidos.");
                    return false;
                }
                fila[ab][dc] = "1";
                fila[de][fg] = "1";
                ady[ab][dc] = "" + number;
                ady[dc][ab] = "" + number;
                if (AF_Re2(number)) {
                    Pesos.add(number);
                }
            }
            jTable2.setModel(new javax.swing.table.DefaultTableModel(fila, Cab));
            jTable2.getTableHeader().setVisible(false);
            for (int i = 0; i < AV_Cantidad + 1; i++) {
                centrar_datos(i, jTable2);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido una tragedia, por favor los nodos deben existir.");
        }
        return true;
    }

    public boolean AF_Re2(int number) {
        for (Integer e : Pesos) {
            if (e == number) {
                return false;
            }
        }
        return true;
    }

    public void centrar_datos(int i, JTable jtable) {
        DefaultTableCellRenderer modelocentrar = new DefaultTableCellRenderer();
        modelocentrar.setHorizontalAlignment(SwingConstants.CENTER);
        jtable.getColumnModel().getColumn(i).setCellRenderer(modelocentrar);
    }

    public void AF_Pos(int x, int y) {
        for (JLabel e : JLabels) {
            if ((e.getBounds().x <= x + 55 && e.getBounds().x >= x - 55) && (e.getBounds().y <= y + 55 && e.getBounds().y >= y - 55)) {
                JOptionPane.showMessageDialog(null, "Por favor, que no sea cercano a otro nodo.");
                return;
            }
        }
        JLabel nuevo = new JLabel(jTextField1.getText());
        jTextArea1.append(jTextField1.getText() + '\n');
        jTextArea1.setLineWrap(true);
        jTextField1.setText("");
        nuevo.setBounds(x, y, 30, 30);
        nuevo.setBackground(Color.black);
        ImageIcon prron = new ImageIcon(getClass().getResource("/prron.png"));
        nuevo.setIcon(prron);
        nuevo.setHorizontalTextPosition(JLabel.CENTER);
        nuevo.setForeground(Color.white);
        jPanel5.add(nuevo);
        jPanel5.repaint();
        JLabels.add(nuevo);
        jTextArea2.append("X: " + x + " Y: " + y + '\n');

    }

    private boolean AF_RE(String text) {
        for (JLabel j : JLabels) {
            if (j.getText().equals(text)) {
                return false;
            }
        }
        return true;
    }

    public boolean isNumeric(String g) {
        try {
            int e = Integer.parseInt(g);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Grafo().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables

}
