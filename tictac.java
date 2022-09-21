public class tictac {
    static String [] playArr = new String [9];
    static int iter = 0;
    public static String winner(){
        for(int i=0; i<8; i++){
            String l = null;
            switch(i){ //ways a player can win
                case 0:
                    l = playArr[0] + playArr[1] + playArr[2];
                    break;
                case 1:
                    l = playArr[3] + playArr[4] + playArr[5];
                    break;
                case 2:
                    l = playArr[6] + playArr[7] + playArr[8];
                    break;
                case 3: 
                    l = playArr[0] + playArr[3] + playArr[6]; 
                    break; 
                case 4: 
                    l = playArr[1] + playArr[4] + playArr[7]; 
                    break; 
                case 5: 
                    l = playArr[2] + playArr[5] + playArr[8]; 
                    break; 
                case 6: 
                    l = playArr[0] + playArr[4] + playArr[8]; 
                    break; 
                case 7: 
                    l = playArr[2] + playArr[4] + playArr[6]; 
                    break; 
            }
            if (l.equals("111")) { 
                return "1"; 
            } 
              
            else if (l.equals("222")) { 
                return "2"; 
            }
            else if(tictac.emptyArr()==9 && (l!="111" || l!="222")) return "Draw";
        }
        return null;
    }

    public static int emptyArr(){
        int s=0;
        for(int i=0; i<=8; i++){
            if(tictac.playArr[i]!=null) s++;
        }
        return s;
    }
}
