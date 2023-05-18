import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import java.util.Arrays;
import java.util.Random;


public class Gui extends JFrame implements ActionListener{
    Random random = new Random();
    JLabel l;
    int[] numEstratti= new int[90];
    int cont= 0;

    //SECONDO FRAME
    JLabel l1, gio1, gio2, numero;

    JLabel ambo, terna, quaterna, cinquina;


    JLabel a1,a2,a3,a4,a5,a6,a7,a8,a9,a10,a11,a12,a13,a14,a15,a16,a17,a18,a19,a20,a21,a22,a23,a24,a25,a26,a27,a28,a29,a30,a31,a32,a33,a34,a35,a36,a37,a38,a39,a40,
            a41,a42,a43,a44,a45,a46,a47,a48,a49,a50,a51,a52,a53,a54,a55,a56,a57,a58,a59,a60,a61,a62,a63,a64,a65,a66,a67,a68,a69,a70,a71,a72,a73,a74,a75,a76,a77,a78,a79,a80,
            a81,a82,a83,a84,a85,a86,a87,a88,a89,a90;

    JLabel[][] tabella= {{a1,a2,a3,a4,a5,a6,a7,a8,a9,a10},{a11,a12,a13,a14,a15,a16,a17,a18,a19,a20},{a21,a22,a23,a24,a25,a26,a27,a28,a29,a30},
            {a31,a32,a33,a34,a35,a36,a37,a38,a39,a40},{a41,a42,a43,a44,a45,a46,a47,a48,a49,a50},{a51,a52,a53,a54,a55,a56,a57,a58,a59,a60},
            {a61,a62,a63,a64,a65,a66,a67,a68,a69,a70},{a71,a72,a73,a74,a75,a76,a77,a78,a79,a80},{a81,a82,a83,a84,a85,a86,a87,a88,a89,a90}};

    JPanel[][] panel= new JPanel[9][10];
    JPanel[][] tabellaGio1= new JPanel[3][9];
    JPanel[][] tabellaGio2= new JPanel[3][9];

    JLabel g1,g2,g3,g4,g5,g6,g7,g8,g9,g10,g11,g12,g13,g14,g15,g16,g17,g18,g19,g20,g21,g22,g23,g24,g25,g26,g27;

    JLabel[][] tabellaG1= {{g1,g2,g3,g4,g5,g6,g7,g8,g9},{g10,g11,g12,g13,g14,g15,g16,g17,g18},{g19,g20,g21,g22,g23,g24,g25,g26,g27}};

    JLabel s1,s2,s3,s4,s5,s6,s7,s8,s9,s10,sg11,s12,s13,s14,s15,s16,s17,s18,s19,s20,s21,s22,s23,s24,s25,s26,s27;

    JLabel[][] tabellaG2= {{s1,s2,s3,s4,s5,s6,s7,s8,s9},{s10,sg11,s12,s13,s14,s15,s16,s17,s18},{s19,s20,s21,s22,s23,s24,s25,s26,s27}};


    Font font1, font2, font3, font4, font5;

    Color sfondo, titoli, bottoni;

    JButton estrai;

    JTextArea estrazione;

    //PRIMO FRAME
    JFrame inizio;
    JLabel titolo, lp;
    JButton gioca;

    Gui(){
        font1= new Font("Bodoni MT", Font.PLAIN, 50);
        font2= new Font("Bodoni MT", Font.PLAIN, 20);
        font3= new Font("Bodoni MT", Font.PLAIN, 25);
        font4= new Font("Bodoni MT", Font.PLAIN, 35);
        font5= new Font("Bodoni MT", Font.BOLD, 35);

        sfondo= new Color(153, 204, 255);
        titoli= new Color(0, 89, 179);
        bottoni= new Color(51, 153, 255);

        //ESTRAZIONE NUMERI CASUALI
        int numeroU, suc= 0;
        for(int ij= 0; ij < numEstratti.length; ij++) {
            do {
                numeroU= random.nextInt(90)+1;
                for(int jj= 0; jj < numEstratti.length; jj++) {
                    if(numeroU==numEstratti[jj]) {
                        suc= 0;
                        break;
                    }else
                        suc=1;
                }
            }while(suc==0);
            numEstratti[ij]= numeroU;
        }

        //PRIMO FRAME
        inizio= new JFrame();
        inizio.setTitle("TOMBOLA");
        inizio.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        inizio.getContentPane().setBackground(sfondo);
        inizio.setSize(500, 300);
        inizio.setResizable(false);
        inizio.setVisible(true);

        gioca= new JButton("Gioca");
        gioca.setBounds(140, 100, 200, 75);
        gioca.setFont(font3);
        gioca.setBackground(bottoni);
        gioca.setForeground(sfondo);
        inizio.add(gioca);
        gioca.addActionListener(this);

        titolo= new JLabel("TOMBOLA");
        titolo.setBounds(160, 25, 200, 50);
        titolo.setFont(font5);
        titolo.setForeground(titoli);
        inizio.add(titolo);


        lp= new JLabel();
        inizio.add(lp);

        //SECONDO FRAME
        l1=new JLabel("TOMBOLA");
        l1.setBounds(625,15,250,100);
        l1.setFont(font1);
        l1.setForeground(titoli);
        this.add(l1);

        gio1=new JLabel("GIOCATORE 1");
        gio1.setBounds(245,575,150,100);
        gio1.setFont(font2);
        gio1.setForeground(titoli);
        this.add(gio1);

        gio2=new JLabel("GIOCATORE 2");
        gio2.setBounds(1100,575,150,100);
        gio2.setFont(font2);
        gio2.setForeground(titoli);
        this.add(gio2);

        //TABELLONE CENTRALE
        int contX= 378, contY= 120, contXP= 342;
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
                panel[i][j]= new JPanel();
                panel[i][j].setBounds(contXP, contY, 80, 50);
                panel[i][j].setFont(font2);
                panel[i][j].setBackground(sfondo);
                //panel[i][j].add(tabella[i][j]);
                this.add(panel[i][j]);
                contX += 80;
                contXP+=80;
                num++;
            }
            contY += 50;
            contX= 373;
            contXP= 341;
        }


        //TABELLA GIOCATORE 1
        int[][] g1= new int[3][9];
        creaTabellaG(100, 670, g1, tabellaG1, tabellaGio1, 81);
        //TABELLA GIOCATORE 2
        int[][] g2= new int[3][9];
        creaTabellaG(960, 670, g2, tabellaG2, tabellaGio2, 941);


        estrai= new JButton("ESTRAI");
        estrai.setFont(font2);
        estrai.setBackground(bottoni);
        estrai.setForeground(sfondo);
        estrai.setBounds(665, 670, 150, 50);
        this.add(estrai);
        estrai.addActionListener(this);


        numero= new JLabel("n°:");
        numero.setBounds(695, 730, 100, 50);
        numero.setFont(font2);
        numero.setForeground(titoli);
        this.add(numero);

        estrazione= new JTextArea();
        estrazione.setBounds(725, 743, 28, 30);
        estrazione.setText("");
        estrazione.setEditable(false);
        estrazione.setFont(font3);
        estrazione.setBackground(bottoni);
        estrazione.setForeground(sfondo);
        this.add(estrazione);


        ambo= new JLabel("AMBO");
        ambo.setBounds(120, 240, 150, 50);
        ambo.setFont(font4);
        ambo.setForeground(new Color(204, 82, 0));
        this.add(ambo);

        terna= new JLabel("TERNA");
        terna.setBounds(110, 395, 150, 50);
        terna.setFont(font4);
        terna.setForeground(new Color(36, 143, 36));
        this.add(terna);

        quaterna= new JLabel("QUATERNA");
        quaterna.setBounds(1210, 240, 250, 50);
        quaterna.setFont(font4);
        quaterna.setForeground(new Color(134, 89, 45));
        this.add(quaterna);

        cinquina= new JLabel("CINQUINA");
        cinquina.setBounds(1225, 395, 250, 50);
        cinquina.setFont(font4);
        cinquina.setForeground(new Color(128, 0, 255));
        this.add(cinquina);

        l= new JLabel();
        this.add(l);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setBackground(sfondo);
        this.setSize(1500, 1000);
        this.setResizable(false);
    }




    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == gioca) {
            inizio.setVisible(false);
            this.setVisible(true);
        }

        if(e.getSource() == estrai) {
            String numero= "";
            numero= numero + numEstratti[cont];
            int numJ= numEstratti[cont];
            cont++;
            estrazione.setText(numero);
            for(int z= 0; z < tabella.length; z++) {
                for(int p= 0; p < tabella[0].length; p++) {
                    if(Integer.parseInt(tabella[z][p].getText()) == numJ) {
                        panel[z][p].setBackground(bottoni);
                        tabella[z][p].setForeground(sfondo);
                    }
                    repaint();
                }
            }
            boolean tab1, tab2;
            for(int i= 0; i < 3; i++) {
                for(int j= 0; j < 9; j++) {
                    tab1= tabellaG1[i][j].getText().isEmpty();
                    tab2= tabellaG2[i][j].getText().isEmpty();
                    if(tab1 == false && numJ == Integer.parseInt(tabellaG1[i][j].getText())) {
                        tabellaGio1[i][j].setBackground(bottoni);
                        tabellaG1[i][j].setForeground(sfondo);
                    }
                    if(tab2 == false && numJ == Integer.parseInt(tabellaG2[i][j].getText())) {
                        tabellaGio2[i][j].setBackground(bottoni);
                        tabellaG2[i][j].setForeground(sfondo);
                    }
                }
            }
            repaint();
        }
    }

    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setStroke(new BasicStroke(2));
        g2d.setColor(new Color(0, 89, 179));
        //TABELLONE
        int tempX= 350, tempY= 150;
        for(int p= 0; p < tabella.length; p++) {
            for(int l= 0; l < tabella[0].length; l++) {
                g2d.drawRect(tempX, tempY, 80, 50);
                tempX+=80;
            }
            tempY+=50;
            tempX=350;
        }

        //TABELLA GIOCATORE 1
        int tempX2= 90, tempY2= 700;
        for(int k= 0; k < 3; k++) {
            for(int s= 0; s < 9; s++) {
                g2d.drawRect(tempX2, tempY2, 50, 40);
                tempX2+=50;
            }
            tempY2+=40;
            tempX2=90;
        }

        //TABELLA GIOCATORE 2
        int tempX3= 950, tempY3= 700;
        for(int k= 0; k < 3; k++) {
            for(int s= 0; s < 9; s++) {
                g2d.drawRect(tempX3, tempY3, 50, 40);
                tempX3+=50;
            }
            tempY3+=40;
            tempX3=950;
        }
    }

    public void creaTabellaG(int tempX, int tempY, int[][] tabellaG, JLabel[][] tabellaL, JPanel[][] pan, int contXP) {

        //RIGA 1
        int numero, cont= 0;
        int[] occupati= new int[9];
        for(int i= 0; i < 5; i++) {
            numero= random.nextInt(90)+1;
            for(int j= 0; j < tabellaG[0].length; j++) {
                if(numero == tabellaG[0][j])
                    cont++;

                if(tabellaG[0][j] != 0)
                    occupati[j]= 1;
            }
            if(cont == 0) {
                if(numero < 10) {
                    if(occupati[0]==0)
                        tabellaG[0][0]= numero;
                    else
                        i--;
                } else if(numero >= 10 && numero < 90) {
                    if(occupati[numero/10]==0)
                        tabellaG[0][numero/10]= numero;
                    else
                        i--;
                }else if(numero == 90){
                    if(occupati[8]==0)
                        tabellaG[0][8]= numero;
                }
            }else
                i--;

            cont=0;
        }

        //RIGA 2
        int[] occupati2= new int[9];
        int numero2, cont2=0;
        for(int m= 0; m < 5; m++) {
            numero2= random.nextInt(90)+1;
            for(int z= 0; z < tabellaG.length; z++) {
                for(int y= 0; y < tabellaG[0].length; y++) {
                    if(numero2 == tabellaG[z][y])
                        cont2++;
                }
            }
            for(int n= 0; n < tabellaG[0].length; n++) {
                if(tabellaG[1][n] != 0)
                    occupati2[n]= 1;
            }
            if(cont2 == 0) {
                if(numero2 < 10) {
                    if(occupati2[0]==0)
                        tabellaG[1][0]= numero2;
                    else
                        m--;
                } else if(numero2 >= 10 && numero2 < 90) {
                    if(occupati2[numero2/10]==0)
                        tabellaG[1][numero2/10]= numero2;
                    else
                        m--;
                }else if(numero2 == 90){
                    if(occupati2[8]==0)
                        tabellaG[1][8]= numero2;
                }
            }else
                m--;

            cont2=0;
        }

        //RIGA 3
        int[] occupati3= new int[9];
        int numero3, cont3=0;

        for(int ab= 0; ab < 5; ab++) {
            numero3= random.nextInt(90)+1;
            for(int zi= 0; zi < tabellaG.length; zi++) {
                for(int yo= 0; yo < tabellaG[0].length; yo++) {
                    if(numero3 == tabellaG[zi][yo])
                        cont3++;
                }
            }
            for(int ni= 0; ni < tabellaG[0].length; ni++) {
                if(tabellaG[2][ni] != 0)
                    occupati3[ni]= 1;
            }
            if(cont3 == 0) {
                if(numero3 < 10) {
                    if(occupati3[0]==0)
                        tabellaG[2][0]= numero3;
                    else
                        ab--;
                } else if(numero3 >= 10 && numero3 < 90) {
                    if(occupati3[numero3/10]==0)
                        tabellaG[2][numero3/10]= numero3;
                    else
                        ab--;
                }else if(numero3 == 90){
                    if(occupati3[8]==0)
                        tabellaG[2][8]= numero3;
                }
            }else
                ab--;

            cont3=0;
        }

        //PER RIRDINARE LE COLONNE DELLE CARTELLE
        int contZ=0, iZ=0;
        int[] arrZ= new int[3];
        for(int c= 0; c < tabellaG[0].length; c++) {
            for(int d= 0; d < tabellaG.length; d++) {
                arrZ[d]= tabellaG[d][c];
                if(arrZ[d] != 0)
                    contZ++;
            }
            int tempo= 0;
            if(contZ==2) {
                if(arrZ[0] == 0 && arrZ[1] > arrZ[2]) {
                    tempo= arrZ[1];
                    arrZ[1]= arrZ[2];
                    arrZ[2]= tempo;
                } else if(arrZ[1] == 0 && arrZ[0] > arrZ[2]) {
                    for(int an= 0; an < arrZ.length; an++) {
                        tempo= arrZ[0];
                        arrZ[0]= arrZ[2];
                        arrZ[2]= tempo;
                    }
                } else if(arrZ[2] == 0 && arrZ[0] > arrZ[1]) {
                    for(int al= 0; al < arrZ.length; al++) {
                        tempo= arrZ[0];
                        arrZ[0]= arrZ[1];
                        arrZ[1]= tempo;
                    }
                }

                for(int kk= 0; kk < arrZ.length; kk++) {
                    tabellaG[kk][c]= arrZ[kk];
                }

            }else if(contZ==3) {
                Arrays.sort(arrZ);
                for(int po= 0; po < arrZ.length; po++) {
                    tabellaG[po][c]= arrZ[po];
                }
            }
            contZ= 0;
        }

        //PRINT FINALE DELLA TABELLA METTENDOLI NEI LABEL
        String contatore= "";
        int tempXcont= tempX, uy= contXP;
        for(int k= 0; k < 3; k++) {
            for(int s= 0; s < 9; s++) {
                contatore= ""+tabellaG[k][s];
                tabellaL[k][s]= new JLabel();
                tabellaL[k][s].setBounds(tempX, tempY, 50, 40);
                tabellaL[k][s].setFont(font2);
                if(tabellaG[k][s] != 0)
                    tabellaL[k][s].setText(contatore);
                this.add(tabellaL[k][s]);
                pan[k][s]= new JPanel();
                pan[k][s].setBounds(contXP, tempY, 50, 40);
                pan[k][s].setFont(font2);
                pan[k][s].setBackground(sfondo);
                //panel[k][s].add(tabellaL[k][s]);
                this.add(pan[k][s]);

                contatore= "";
                tempX+=50;
                contXP+=50;
            }
            tempY+=40;
            tempX=tempXcont;
            contXP= uy;
        }
        repaint();
    }
}