
package esercizio.pkg4.gioco.matrice;


import java.awt.event.ActionEvent;
    import java.awt.event.ActionListener;
    import javax.swing.JButton;
    import javax.swing.JFrame;
    import javax.swing.JLabel;
    import javax.swing.JTextField;


public class Esercizio4GiocoMatrice extends JFrame {

    JButton[][] A = new JButton[10][10];
    JLabel[][] B = new JLabel[10][10];
    JButton S = new JButton("Reset");

    GestBottone S1 = new GestBottone();

    public Esercizio4GiocoMatrice() {
        int i = -1, j = -1;

        this.setLayout(null);

        for (i = 0; i < 10; i++) {
            for (j = 0; j < 10; j++) {
                A[i][j] = new JButton();
                this.add(A[i][j]);
                A[i][j].setBounds(10 + (45 * i), 30 + (35 * j), 40, 30);
                A[i][j].addActionListener(S1);
                    B[i][j] = new JLabel("a");
                this.add(B[i][j]);
                B[i][j].setBounds(10 + (45 * i), 30 + (35 * j), 40, 30);

            }
        }

        this.add(S);
        
        S.setBounds(575, 300, 100, 30);
        S.addActionListener(S1);
        
        this.setLocation(200, 100);
        this.setSize(700, 500);
        this.setVisible(true);
    }

    public static void main(String[] s) {
        new Esercizio4GiocoMatrice();
    }

    class GestBottone implements ActionListener {

        public void actionPerformed(ActionEvent E) {
            int i = -1, j = -1, n = 0;
            
            if (E.getSource() == S) {
                for (i = 0; i < 10; i++) {
                    for (j = 0; j < 10; j++) {
                        A[i][j].setVisible(true);
                         B[i][j].setVisible(true);
                    }
                }
            }
            
            
            for (i = 0; i < 10; i++) {
               for (j = 0; j < 10; j++) {
                  if (E.getSource() == A[i][j]) {
                      A[i][j].setVisible(false);
                      
                  } 
                }
            }
           
        }
    }

}
