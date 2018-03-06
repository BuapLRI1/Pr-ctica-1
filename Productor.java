package exclusionmutua;
import javax.swing.*;
public class Productor extends Thread{
    private JTextArea area;
    private RC rc;
    public Productor(JTextArea area, RC rc){
        this.area=area;        
        this.rc=rc;
    }
    public void run(){
        while(true){
            rc.setRc((int)(Math.random()*100));
            area.append("Producir = "+rc.getRc()+"\n");
            try{
                sleep((int)(Math.random()*500));
            }catch(Exception e){}
        }
    }
}
