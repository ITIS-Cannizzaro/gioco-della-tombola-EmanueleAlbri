import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Gui extends JFrame implements ActionListener{

    JLabel l;
    JLabel l1, g1, g2, numero;
    
    JLabel a1,a2,a3,a4,a5,a6,a7,a8,a9,a10,a11,a12,a13,a14,a15,a16,a17,a18,a19,a20,a21,a22,a23,a24,a25,a26,a27,a28,a29,a30,a31,a32,a33,a34,a35,a36,a37,a38,a39,a40,
    a41,a42,a43,a44,a45,a46,a47,a48,a49,a50,a51,a52,a53,a54,a55,a56,a57,a58,a59,a60,a61,a62,a63,a64,a65,a66,a67,a68,a69,a70,a71,a72,a73,a74,a75,a76,a77,a78,a79,a80,
    a81,a82,a83,a84,a85,a86,a87,a88,a89,a90;
	
    
    JLabel[][] tabella= {{a1,a2,a3,a4,a5,a6,a7,a8,a9,a10},{a11,a12,a13,a14,a15,a16,a17,a18,a19,a20},{a21,a22,a23,a24,a25,a26,a27,a28,a29,a30},
    		{a31,a32,a33,a34,a35,a36,a37,a38,a39,a40},{a41,a42,a43,a44,a45,a46,a47,a48,a49,a50},{a51,a52,a53,a54,a55,a56,a57,a58,a59,a60},
    		{a61,a62,a63,a64,a65,a66,a67,a68,a69,a70},{a71,a72,a73,a74,a75,a76,a77,a78,a79,a80},{a81,a82,a83,a84,a85,a86,a87,a88,a89,a90}};;
    
    Font font1, font2, font3;
    
    JButton estrai;
    
    JTextArea estrazione;
    
    Gui(){
    	font1= new Font("TimesRoman", Font.PLAIN, 50);
    	font2= new Font("TimesRoman", Font.PLAIN, 20);
    	font3= new Font("TimesRoman", Font.PLAIN, 25);
    	
    	
        l1=new JLabel("TOMBOLA");
        l1.setBounds(625,25,250,100);
        l1.setFont(font1);
        this.add(l1);

        g1=new JLabel("GIOCATORE 1");
        g1.setBounds(250,575,150,100);
        g1.setFont(font2);
        this.add(g1);
        
        g2=new JLabel("GIOCATORE 2");
        g2.setBounds(1100,575,150,100);
        g2.setFont(font2);
        this.add(g2);
        
        int contX= 378, contY= 120;
        int num= 1;
        String temp= "";
        for(int i= 0; i < tabella.length; i++) {
        	for(int j= 0; j < tabella[0].length; j++) {
        		tabella[i][j]= new JLabel();
        		tabella[i][j].setBounds(contX, contY, 80, 50);
        		tabella[i][j].setFont(font2);
        		temp= ""+num;
        		tabella[i][j].setText(temp);;
        		this.add(tabella[i][j]);
        		contX += 80;
        		num++;
        	}
        	contY += 50;
        	contX= 373;
        }
        
        estrai= new JButton("ESTRAI");
        estrai.setFont(font2);
        estrai.setBounds(665, 670, 150, 50);
        this.add(estrai);
        estrai.addActionListener(this);
        
        numero= new JLabel("n°:");
        numero.setBounds(675, 730, 100, 50);
        numero.setFont(font2);
        this.add(numero);
        
        estrazione= new JTextArea();
        estrazione.setBounds(725, 743, 45, 30);
        estrazione.setText("5");
        estrazione.setEditable(false);
        estrazione.setFont(font3);
        this.add(estrazione);
        
        l= new JLabel();
        this.add(l);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1500, 1000);
        this.setResizable(false);
        this.setVisible(true);
    }




	@Override
    public void actionPerformed(ActionEvent e) {
        
    }
    
    public void paint(Graphics g) {
    	super.paint(g);
    	//TABELLONE
    	int tempX= 350, tempY= 150;
    	for(int p= 0; p < tabella.length; p++) {
    		for(int l= 0; l < tabella[0].length; l++) {
    			g.drawRect(tempX, tempY, 80, 50);
    			tempX+=80;
    		}
    		tempY+=50;
    		tempX=350;
    	}
    	
    	//TABELLA GIOCATORE 1
    	int tempX2= 90, tempY2= 700;
    	for(int k= 0; k < 3; k++) {
    		for(int s= 0; s < 9; s++) {
    			g.drawRect(tempX2, tempY2, 50, 40);
    			tempX2+=50;
    		}
    		tempY2+=40;
    		tempX2=90;
    	}
    	
    	//TABELLA GIOCATORE 2
    	int tempX3= 950, tempY3= 700;
    	for(int k= 0; k < 3; k++) {
    		for(int s= 0; s < 9; s++) {
    			g.drawRect(tempX3, tempY3, 50, 40);
    			tempX3+=50;
    		}
    		tempY3+=40;
    		tempX3=950;
    	}
    }
}