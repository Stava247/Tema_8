

import javax.swing.JOptionPane;

public class Form1 extends javax.swing.JFrame {

    public Form1() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton_Random = new javax.swing.JButton();
        jButton_Task = new javax.swing.JButton();
        jButton_Clear = new javax.swing.JButton();
        jButton_Exit = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Работа с классами в JAVA");
        setIconImage(java.awt.Toolkit.getDefaultToolkit().createImage(getClass().getResource("icon.png")));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/task.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-30, 210, 350, 120);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                { new Integer(1), null},
                { new Integer(2), null},
                { new Integer(3), null},
                { new Integer(4), null},
                { new Integer(5), null},
                { new Integer(6), null},
                { new Integer(7), null},
                { new Integer(8), null},
                { new Integer(9), null},
                { new Integer(10), null}
            },
            new String [] {
                "K(i)", "Y(i)"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);
        jTable1.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
        }

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 20, 120, 190);

        jButton_Random.setText("Заполнить ");
        jButton_Random.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_RandomActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Random);
        jButton_Random.setBounds(140, 130, 172, 23);

        jButton_Task.setText("Расчет");
        jButton_Task.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_TaskActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Task);
        jButton_Task.setBounds(140, 150, 172, 23);

        jButton_Clear.setText("Очистить");
        jButton_Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ClearActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Clear);
        jButton_Clear.setBounds(140, 170, 172, 23);

        jButton_Exit.setText("Выход");
        jButton_Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ExitActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Exit);
        jButton_Exit.setBounds(140, 190, 172, 23);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("A");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(140, 90, 20, 17);

        jTextField2.setText(jTextField2.getText());
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField2);
        jTextField2.setBounds(150, 80, 70, 40);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("B");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(230, 90, 20, 17);

        jTextField3.setText(jTextField3.getText());
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField3);
        jTextField3.setBounds(240, 80, 70, 40);

        setSize(new java.awt.Dimension(349, 351));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_RandomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_RandomActionPerformed

        // Заполнение случайными числами
        for (int i = 0; i < jTable1.getRowCount(); i++) {
            jTable1.setValueAt((int) (Math.random() * 11), i, 0);
        }
    }//GEN-LAST:event_jButton_RandomActionPerformed

    private void jButton_TaskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_TaskActionPerformed
        // Выполнение задания
        float a, b;
            a = Float.parseFloat(jTextField2.getText()); // Получение данных
            b = Float.parseFloat(jTextField3.getText()); // Получение данных
        // Проверка заполнения таблицы
        for (int i = 0; i < jTable1.getRowCount(); i++) {
            if (jTable1.getValueAt(i, 0) == null) {
                JOptionPane.showMessageDialog(rootPane, "Проверьте правильность заполнения столбца К(i)", "Ошибка ввода", JOptionPane.ERROR_MESSAGE);
                return;
            }
        }

        int rowCount = jTable1.getRowCount(); // Количество строк в таблице
        int[] inArray = new int[rowCount]; // Создаем исходный массив целых чисел

        for (int i = 0; i < rowCount; i++) { // Заполняем исходный массив из первого столбца таблицы
            inArray[i] = (int) jTable1.getModel().getValueAt(i, 0);
        }

        TSN01_Calc ma = new TSN01_Calc(); // СОЗДАЕМ ОБЪЕКТ-РЕШАТЕЛЬ ЗАДАНИЯ !!!
        
        ma.SetMass(inArray); // ПЕРЕДАЕМ В ОБЪЕКТ-РЕШАТЕЛЬ ИСХОДНЫЙ МАССИВ
        
        double[] outArray = ma.GetMass(a,b); // ПОЛУЧАЕМ С ОБЪЕКТА РЕШАТЕЛЯ ЗНАЧЕНИЕ РЕЗУЛЬТИРУЮЩЕГО МАССИВА

        for (int i = 0; i < rowCount; i++) { // Заносим во второй столбец таблицы значения из результирующего массива
            jTable1.getModel().setValueAt(String.format("%.3f", outArray[i]), i, 1);
        }

    }//GEN-LAST:event_jButton_TaskActionPerformed

    private void jButton_ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ClearActionPerformed
        // Очистка таблицы
        for (int i = 0; i < jTable1.getRowCount(); i++) {
            for (int j = 0; j < jTable1.getColumnCount(); j++) {
                jTable1.setValueAt(null, i, j);
            }
        }
    }//GEN-LAST:event_jButton_ClearActionPerformed

    private void jButton_ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ExitActionPerformed
        // Выход из программы
        System.exit(0);
    }//GEN-LAST:event_jButton_ExitActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

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
            java.util.logging.Logger.getLogger(Form1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form1().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Clear;
    private javax.swing.JButton jButton_Exit;
    private javax.swing.JButton jButton_Random;
    private javax.swing.JButton jButton_Task;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    public javax.swing.JTextField jTextField2;
    public javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}
