package exclusionmutua;
import javax.swing.*;
public class Consumidor extends Thread{
    private RC rc;
    private JTextArea area;
    public Consumidor(JTextArea area, RC rc){
        this.area=area;
        this.rc=rc;
    }
    public void run(){
        while(true){
            area.append("Consumir = "+rc.getRc()+"\n");
            try{
                sleep((int)(Math.random()*500));
            }catch(Exception e){}
        }
    }
    
}
