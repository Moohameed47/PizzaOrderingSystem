package pizzaorderingsystem;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Vector;
import javax.swing.JButton;

public class MAIN extends javax.swing.JFrame {
    //<editor-fold defaultstate="collapsed" desc=" Pizza Project ">
    //Dooody ♥♥ 
    //</editor-fold>
    static public MAIN m;
    static public MENU mm = new MENU();

    static public class Data {

        String Name = "";
        String No_Phone = "";
        String Address = "";
    }
    static public Vector vec = new Vector(); //Have Selected From Menu
    static public long Total = 0;
    static public int[] distance;
    static public int TIME[] = new int[9];
    static public String No_Phone;
    static public ArrayList<Data> DataBase = new ArrayList<>();
    static public boolean IsExist = false;

    public MAIN() {
        Total = 0;
        initComponents();
        jTextField1.setBackground(new java.awt.Color(0, 0, 0, 0));
        MENU.setBackground(new java.awt.Color(0, 0, 0, 0));
    }

    static class ListNode {

        int vertex, weight;

        ListNode(int v, int w) {
            vertex = v;
            weight = w;
        }

        int getVertex() {
            return vertex;
        }

        int getWeight() {
            return weight;
        }
    }

    public static int[] dijkstra(int V, ArrayList<ArrayList<ListNode>> graph, int src) {
        int[] distance = new int[V];
        for (int i = 0; i < V; i++) {
            distance[i] = Integer.MAX_VALUE;
        }
        distance[src] = 0;

        PriorityQueue<ListNode> pq = new PriorityQueue<>((v1, v2) -> v1.getWeight() - v2.getWeight());
        pq.add(new ListNode(src, 0));

        while (pq.size() > 0) {
            ListNode current = pq.poll();
            for (ListNode n : graph.get(current.getVertex())) {
                if (distance[current.getVertex()] + n.getWeight() < distance[n.getVertex()]) {
                    distance[n.getVertex()] = n.getWeight() + distance[current.getVertex()];
                    pq.add(new ListNode(n.getVertex(), distance[n.getVertex()]));
                }
            }
        }
        return distance;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Menu = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        MENU = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        Background = new javax.swing.JLabel();

        Menu.setIcon(new javax.swing.ImageIcon("C:\\Users\\DE\\Downloads\\wallpaperflare.com_wallpaper (6).jpg")); // NOI18N
        Menu.setText("Menu");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Snap ITC", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 0));
        jLabel1.setText("PIZZAKO");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 0, 330, 50);

        MENU.setFont(new java.awt.Font("Snap ITC", 3, 36)); // NOI18N
        MENU.setForeground(new java.awt.Color(0, 102, 0));
        MENU.setText("MENU");
        MENU.setMargin(new java.awt.Insets(0, 0, 0, 0));
        MENU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MENUActionPerformed(evt);
            }
        });
        jPanel1.add(MENU);
        MENU.setBounds(10, 320, 170, 40);

        jLabel2.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("No.Phone:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(20, 60, 230, 50);

        jTextField1.setFont(new java.awt.Font("Tempus Sans ITC", 0, 20)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setBorder(null);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1);
        jTextField1.setBounds(70, 100, 200, 30);

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pizzaorderingsystem/pizaa.jpg"))); // NOI18N
        jPanel1.add(Background);
        Background.setBounds(0, -460, 1470, 1380);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 726, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 457, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MENUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MENUActionPerformed
        No_Phone = jTextField1.getText();
        for (int i = 0; i < DataBase.size(); i++) {
            if (DataBase.get(i).No_Phone.equals(No_Phone)) {
                IsExist = true;
            }
        }
        MAIN.Total = 0;
        this.setVisible(false);
        mm.setVisible(true);
    }//GEN-LAST:event_MENUActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed

    }//GEN-LAST:event_jTextField1ActionPerformed

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(MAIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MAIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MAIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MAIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
            1- Helwan 
            2- Maadi
            3- Zahraa
            4- West El Bald
            5- El Tagamoo3
            6- Hadaye2 El Zaytoon
            7- Ain Shams
            8- Masr El Gdeda
         */
        int V = 9;
        ArrayList<ArrayList<ListNode>> graph = new ArrayList<>();
        for (int i = 1; i <= V; i++) {
            graph.add(new ArrayList<>());
        }
        int source = 8;
        graph.get(1).add(new ListNode(2, 20));
        graph.get(1).add(new ListNode(8, 33));
        graph.get(2).add(new ListNode(1, 15));
        graph.get(2).add(new ListNode(3, 10));
        graph.get(3).add(new ListNode(4, 24));
        graph.get(3).add(new ListNode(5, 15));
        graph.get(4).add(new ListNode(3, 24));
        graph.get(4).add(new ListNode(6, 8));
        graph.get(5).add(new ListNode(3, 15));
        graph.get(6).add(new ListNode(7, 14));
        graph.get(6).add(new ListNode(5, 10));
        graph.get(6).add(new ListNode(4, 8));
        graph.get(7).add(new ListNode(5, 30));
        graph.get(7).add(new ListNode(8, 37));
        graph.get(8).add(new ListNode(4, 30));
        graph.get(8).add(new ListNode(6, 20));
        graph.get(8).add(new ListNode(7, 37));
        graph.get(8).add(new ListNode(1, 33));
        distance = dijkstra(V, graph, source);
        for (int i = 1; i < V; i++) {
            TIME[i] = distance[i];
            distance[i] *= 2;
            System.out.println(distance[i]);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                m = new MAIN();
                m.setVisible(true);
            }
        }
        );
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JButton MENU;
    private javax.swing.JButton Menu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
