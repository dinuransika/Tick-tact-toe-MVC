import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;



public class ButtonAction implements ActionListener {
    JButton button = null;  
    public String lab;
    int n;
    public ButtonAction(JButton but, int n){
        this.button = but;
        this.n = n;
    }

    

    public void Action(){
        String temp = null;
        if(tictac.iter%2==0) temp = "1";
        else if(tictac.iter%2==1) temp = "2";
        if(tictac.playArr[n-1]==null){
            lab = temp;
            tictac.playArr[n-1] = temp;
            tictac.iter++;
        }else{lab=tictac.playArr[n-1];}
    }

    public void update_view() { 
        this.button.setText(lab);
        }

    
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        Action();
        update_view();
    }
    
}
