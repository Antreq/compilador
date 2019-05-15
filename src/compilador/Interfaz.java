package compilador;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Interfaz extends javax.swing.JFrame 
{
    public Interfaz() 
    {
        setResizable(false); //bloquea maximizar pantalla
        initComponents();
        cerrar();
        setTitle("Compilador");
        setLocationRelativeTo(null); //centra la pantalla    
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        codigo = new javax.swing.JTextField();
        btn_limpiar = new javax.swing.JButton();
        btn_validar = new javax.swing.JButton();
        btn_guardar = new javax.swing.JButton();
        btn_abrir = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(codigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 460, 390));

        btn_limpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn_limpiar.png"))); // NOI18N
        getContentPane().add(btn_limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 50, 160, 60));

        btn_validar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn_validar.png"))); // NOI18N
        getContentPane().add(btn_validar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 60, 150, 50));

        btn_guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn_guardar.png"))); // NOI18N
        getContentPane().add(btn_guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 60, 150, 50));

        btn_abrir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/btn_abrir.png"))); // NOI18N
        getContentPane().add(btn_abrir, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 60, 120, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/img.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 560));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void cerrar()
    {
        try
        {
            this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
            addWindowListener(new WindowAdapter()
            {
                public void windowClosing(WindowEvent e)
                {
                    int v = JOptionPane.showConfirmDialog(null,"¿Estas seguro de cerrar sesión?");
                    if(v==JOptionPane.YES_OPTION)
                    {
                        JOptionPane.showMessageDialog(null,"BYE, BYE");
                        System.exit(0);
                    }
                }
            });
            this.setVisible(true);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_abrir;
    private javax.swing.JButton btn_guardar;
    private javax.swing.JButton btn_limpiar;
    private javax.swing.JButton btn_validar;
    private javax.swing.JTextField codigo;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
