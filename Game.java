/****************************************************/
// Author:  Dinura Dissanayake
// Date:  2022-09-21
// E-Number: E/17/072
/****************************************************/

import javax.swing.*;



import java.awt.*;

public class Game extends JPanel {

    private static final long serialVersionUID = 1L;
    JButton b1, b2, b3, b4, b5, b6, b7, b8, b9;
    JPanel r1,r2;
    public static JLabel l1;
    public Game(){
        super(new BorderLayout());
        b1 = new JButton();
        b2 = new JButton();
        b3 = new JButton();
        b4 = new JButton();
        b5 = new JButton();
        b6 = new JButton();
        b7 = new JButton();
        b8 = new JButton();
        b9 = new JButton();
        b1.setPreferredSize(new Dimension(50, 50));
        b2.setPreferredSize(new Dimension(50, 50));
        b3.setPreferredSize(new Dimension(50, 50));
        b4.setPreferredSize(new Dimension(50, 50));
        b5.setPreferredSize(new Dimension(50, 50));
        b6.setPreferredSize(new Dimension(50, 50));
        b7.setPreferredSize(new Dimension(50, 50));
        b8.setPreferredSize(new Dimension(50, 50));
        b9.setPreferredSize(new Dimension(50, 50));

        b1.addActionListener(new ButtonAction(b1, 1));
        b2.addActionListener(new ButtonAction(b2, 2));
        b3.addActionListener(new ButtonAction(b3, 3));
        b4.addActionListener(new ButtonAction(b4, 4));
        b5.addActionListener(new ButtonAction(b5, 5));
        b6.addActionListener(new ButtonAction(b6, 6));
        b7.addActionListener(new ButtonAction(b7, 7));
        b8.addActionListener(new ButtonAction(b8, 8));
        b9.addActionListener(new ButtonAction(b9, 9));


        l1 = new JLabel(" ", JLabel.CENTER);
        l1.setFont(new Font("Serif", Font.PLAIN, 17));
        r1 = new JPanel(); //for buttons
        r2 = new JPanel(); //for the text.
        r2.setPreferredSize(new Dimension(150, 50));
        r1.add(b1, BorderLayout.WEST);
        r1.add(b2, BorderLayout.CENTER);
        r1.add(b3, BorderLayout.EAST);

        
        r1.add(b4, BorderLayout.WEST);
        r1.add(b5, BorderLayout.CENTER);
        r1.add(b6, BorderLayout.EAST);
        r1.add(b7, BorderLayout.WEST);
        r1.add(b8, BorderLayout.CENTER);
        r1.add(b9, BorderLayout.EAST);
        r2.add(l1, BorderLayout.CENTER);
        r1.setLayout(new GridLayout(3,3));
        add(r1, BorderLayout.NORTH);
        add(r2, BorderLayout.CENTER);
    }

    public static void updateLabel(String win, String play){
        if(win!=null){
            l1.setText("Game Over.");
        }else{
            l1.setText("Player "+play+"\'s Turn.");
        }
        l1.setAlignmentX(Component.CENTER_ALIGNMENT);
    }

    public static void main(String [] args) {
        JFrame frame = new JFrame("Tic-Tac-Toe");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Create and set up the content pane.
        JComponent newContentPane = new Game();
        newContentPane.setOpaque(true); //content panes must be opaque
        frame.setContentPane(newContentPane);

        //Display the window.
        frame.pack();
        frame.setSize(300, 300);
        frame.setVisible(true);

        String winner = null, temp;
        String player;
        while(winner == null){
            winner = tictac.winner();
            if(tictac.iter%2==0) player = "1";
            else player = "2";
            updateLabel(winner, player);
        }

        JDialog dialog = new JDialog(frame, "Winner");
        if(winner=="Draw"){
            temp = "Draw !!!.";
        }else{
            temp = "Player "+winner+" wins the game.";
        }

        JLabel l2 = new JLabel(temp, JLabel.CENTER);
        dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        
        l2.setFont(new Font("Serif", Font.PLAIN, 17));
        dialog.add(l2);
        dialog.setSize(200, 100);
        dialog.setVisible(true);
    } 
}