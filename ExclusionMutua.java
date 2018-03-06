package exclusionmutua;
import javax.swing.*;
import java.awt.*;

public class ExclusionMutua extends JFrame{
    private JTextArea areaProductor;
    private JTextArea areaConsumidor;
    private JScrollPane jspProductor;
    private JScrollPane jspConsumidor;
    private Productor p;
    private Consumidor c;
    private RC rc;
    public ExclusionMutua(){
        setSize(400,400);
        areaProductor = new JTextArea();
        areaConsumidor = new JTextArea();
        jspProductor = new JScrollPane(areaProductor);
        jspConsumidor = new JScrollPane(areaConsumidor);
        getContentPane().setLayout(null);
        getContentPane().add(jspProductor);
        jspProductor.setBounds(50,50,100,300);
        getContentPane().add(jspConsumidor);
        jspConsumidor.setBounds(200,50,100,300);
        rc = new RC();
        p = new Productor(areaProductor,rc);
        c = new Consumidor(areaConsumidor,rc);
        p.start();
        c.start();
    }
    public static void main(String[] args) {
       ExclusionMutua fr = new ExclusionMutua();
       fr.setVisible(true);
       fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
