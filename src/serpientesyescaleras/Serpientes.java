/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SerpientesYEscaleras;

/**
 *
 * @author KarimePamela
 */

    import java.awt.BorderLayout;
import java.awt.Checkbox;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

import com.sun.xml.internal.ws.client.sei.ResponseBuilder;
import java.awt.*;
import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.border.LineBorder;


public class Serpientes extends JFrame implements MouseListener{
    //variables y comtenedores
  
  
    
    private JButton b;    
    private JScrollPane s;
    private JLabel l,la;
    private JTextField t;
    private ImageIcon i ;
    private ImageIcon m;
    private JButton n;
    private JLabel    u,x,can;
    private ImageIcon e;
    private ImageIcon p;
    private JButton y;  
    
    private Posicion pf[]= new Posicion[13];
    private Posicion pd[]= new Posicion[55];
    private Posicion pm[]= new Posicion[31];
    Random rnd = new Random();
    int dado=0;
    Usuarios j1=new Usuarios("Janeth",0,new ImageIcon("src/SerpientesYEscaleras/logo.png"),0);
    
    private JLabel etiquetaSu;
    private JPanel panelIzquierdo, panelDerecho, panelInferior,panelcentral, PanelReglas;
    
      private JButton JbJugar, JbReglas, JbNivelJuego, JbAbandonar;
    private JLabel JLinfJugador, JLniveles, JLpuntaje, JLnivel, logo,fondo;    
    private JPanel panel1, Panel2, Panel3, Panel4, Panel5,PanelJugador, PanelNivel, PanelParticipantes;    
    
    private Container contenedorP, contReglas;
    private Checkbox Nivel;
    private ImageIcon imaLogo, bot;
        
        // ============== COLOR ===========
        Color panel = new Color (131,68,0);
        Color cont = new Color (233,150,122);
        Color PAN1 = new Color (213,143,129);
        Color PAN2 = new Color (255,160,122);
        Color tit = new Color(199,0,57);
        Color panPeq = new Color(218,247,166);
        Color PanBaj = new Color(255,87,51);
    //imagenes
   
        //============== IMAGENES ==============
        
     
    
        
        
        
    
    public void asignarposicion(){
        pf[0]=new Posicion(0,500);
        pf[1]=new Posicion(140,385);
        pf[2]=new Posicion(320,385);
        pf[3]=new Posicion(510,385);
        pf[4]=new Posicion(695,385);
        pf[5]=new Posicion(140,220);
        pf[6]=new Posicion(320,220);
        pf[7]=new Posicion(510,220);
        pf[8]=new Posicion(695,220);
        pf[9]=new Posicion(140,60);
        pf[10]=new Posicion(320,60);
        pf[11]=new Posicion(510,60);
        pf[12]=new Posicion(695,60);
        
         pm[0]=new Posicion(0,0);
         pm[1]=new Posicion(105,450);
         pm[2]=new Posicion(205,450);
         pm[3]=new Posicion(305,450);
         pm[4]=new Posicion(405,450);
         pm[5]=new Posicion(505,450);
         pm[6]=new Posicion(605,450);
         
         pm[7]=new Posicion(605,350);
         pm[8]=new Posicion(505,350);
         pm[9]=new Posicion(405,350);
         pm[10]=new Posicion(305,350);
         pm[11]=new Posicion(205,350);
         pm[12]=new Posicion(105,350);
         
         
         pm[13]=new Posicion(105,250);
         pm[14]=new Posicion(205,250);
         pm[15]=new Posicion(305,250);
         pm[16]=new Posicion(405,250);
         pm[17]=new Posicion(505,250);
         pm[18]=new Posicion(605,250);
         
         pm[19]=new Posicion(605,150);
         pm[20]=new Posicion(505,150);
         pm[21]=new Posicion(405,150);
         pm[22]=new Posicion(305,150);
         pm[23]=new Posicion(205,150);
         pm[24]=new Posicion(105,150);
        
         pm[30]=new Posicion(605,50);
         pm[29]=new Posicion(505,50);
         pm[28]=new Posicion(405,50);
         pm[27]=new Posicion(305,50);
         pm[26]=new Posicion(205,50);
         pm[25]=new Posicion(105,50);
          
        
        pd[0]=new Posicion(180,0);
        pd[1]=new Posicion(785,455);
        pd[2]=new Posicion(700,455);
        pd[3]=new Posicion(610,455);
        pd[4]=new Posicion(520,455);
        pd[5]=new Posicion(430,455);
        pd[6]=new Posicion(345,455);
        pd[7]=new Posicion(260,455);
        pd[8]=new Posicion(175,455);
        pd[9]=new Posicion(90,455);
        
        pd[10]=new Posicion(90,370);
        pd[11]=new Posicion(175,370);
        pd[12]=new Posicion(260,370);
        pd[13]=new Posicion(345,370);
        pd[14]=new Posicion(430,370);
        pd[15]=new Posicion(520,370);
        pd[16]=new Posicion(610,370);
        pd[17]=new Posicion(700,370);
        pd[18]=new Posicion(785,370);
        
        pd[19]=new Posicion(785,285);
        pd[20]=new Posicion(700,285);
        pd[21]=new Posicion(610,285);
        pd[22]=new Posicion(520,285);
        pd[23]=new Posicion(430,285);
        pd[24]=new Posicion(345,285);
        pd[25]=new Posicion(260,285);
        pd[26]=new Posicion(175,285);
        pd[27]=new Posicion(90,285);
        
        pd[28]=new Posicion(90,200);
        pd[29]=new Posicion(175,200);
        pd[30]=new Posicion(260,200);
        pd[31]=new Posicion(345,200);
        pd[32]=new Posicion(430,200);
        pd[33]=new Posicion(520,200);
        pd[34]=new Posicion(610,200);
        pd[35]=new Posicion(700,200);
        pd[36]=new Posicion(785,200);
        
        pd[37]=new Posicion(785,115);
        pd[38]=new Posicion(700,115);
        pd[39]=new Posicion(610,115);
        pd[40]=new Posicion(520,115);
        pd[41]=new Posicion(430,115);
        pd[42]=new Posicion(345,115);
        pd[43]=new Posicion(260,115);
        pd[44]=new Posicion(175,115);
        pd[45]=new Posicion(90,115);
        
        pd[46]=new Posicion(90,30);
        pd[47]=new Posicion(175,30);
        pd[48]=new Posicion(260,30);
        pd[49]=new Posicion(345,30);
        pd[50]=new Posicion(430,30);
        pd[51]=new Posicion(520,30);
        pd[52]=new Posicion(610,30);
        pd[53]=new Posicion(700,30);
        pd[54]=new Posicion(785,30);
    }
   

    public void contruyeVentana(){
        
        contenedorP  = this.getContentPane();
        contenedorP.add(panel1, BorderLayout.CENTER);
        contenedorP.add(Panel2, BorderLayout.WEST);
        contenedorP.add(Panel3, BorderLayout.EAST);
        contenedorP.add(Panel4, BorderLayout.NORTH);
        contenedorP.add(Panel5, BorderLayout.SOUTH);
        
        //configuracion del panel central:
        
               m=new ImageIcon("src/images/medio.jpg");
        l=new JLabel(m);
        can = new JLabel(j1.getIcono());
        //contenedorP.getContentPane().add(can);
        
        can.setBounds(pm[j1.getPosicion()].getX(),pm[j1.getPosicion()].getY(),60,60);
        //contenedorP.getContentPane().add(l);
        l.setBounds(0, 0, 750,500);
        
        
        
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1200,750);
        
        
        asignarposicion();
        JFrame frame = new JFrame();
        etiquetaSu = new JLabel("Titulo o logo");
        Font aux=etiquetaSu.getFont();
        etiquetaSu.setFont(new Font(aux.getFontName(), aux.getStyle(), 20));
        frame.setLayout(new BorderLayout());
        frame.setSize(1250, 700);

        //agregamos los paneles al frame principal
        frame.add(etiquetaSu,BorderLayout.NORTH);
        //frame.add(panelcentral, BorderLayout.CENTER);
        frame.add(panelIzquierdo,BorderLayout.WEST);
        frame.add(panelDerecho,BorderLayout.EAST);
        frame.add(panelInferior,BorderLayout.SOUTH);
        
        //------------AQUI EMPIEZA LA CONFIGUACION DEL CONGTENEDOR CENTRAL--------------ff

        //Configuramos el frame
        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    
                }

    
    public Serpientes(){
       
        super("Serpientes Y escaleras");
       
         bot = new ImageIcon("src/SerpientesYEscaleras/ctrl.png");
        fondo = new JLabel(new ImageIcon(this.getClass().getResource("FONDO1.jpg")));
        imaLogo = new ImageIcon("src/SerpientesYEscaleras/titulo.png");
        //fondo1 = new Color(new Color(this.getClass().getResource("FONDO1.jpg")));
       // fondo = new ImageIcon("src/SerpientesYEscaleras/FONDO1.jpg");
        
        
        //==================JLABEL'S  Y JBUTTON'S========
        JLinfJugador = new JLabel("JUGADOR: ");
        JLnivel = new JLabel("Nivel");
        JLpuntaje = new JLabel("Puntaje");
        JLniveles = new JLabel("Niveles del juego");
        
        logo = new JLabel(imaLogo);
        
        
//***************************BOTONES ***************************
        JbAbandonar = new JButton("Abandonar Juego");
        JbAbandonar.addMouseListener(this);
        JbAbandonar.setPreferredSize(new Dimension(350,55));
        
        JbJugar = new JButton("Iniciar juego",bot);
        JbJugar.setPreferredSize(new Dimension(300,70));
        JbJugar.addMouseListener(this);
        JbJugar.setOpaque(false);
        JbJugar.setContentAreaFilled(false);
        JbJugar.setBorderPainted(false);
    
        JbNivelJuego = new JButton("Niveles del juego");
        
        
        JbReglas = new JButton("REGLAS");
        JbReglas.setPreferredSize(new Dimension(100,45));
        JbReglas.addMouseListener(this);
        //================ CAJAS =================
      
    //================ PANELES ===============
        
        
        
       
        
        
        PanelJugador = new JPanel();
        PanelJugador.setBorder(BorderFactory.createTitledBorder("Jugador1"));
        PanelJugador.setPreferredSize(new Dimension (350,150));
        PanelJugador.setBackground(panPeq);
        
        PanelNivel = new JPanel();
        PanelNivel.setBorder(BorderFactory.createTitledBorder("Niveles superados"));
        PanelNivel.setPreferredSize(new Dimension (350,150));
        PanelNivel.setBackground(panPeq);
        
        PanelParticipantes = new JPanel();
        PanelParticipantes.setBorder(BorderFactory.createTitledBorder("Participantes"));
        PanelParticipantes.setPreferredSize(new Dimension(350,150));
        PanelParticipantes.setBackground(panPeq);
        
        //panel uno es el panel central
        panel1 = new JPanel();
        panel1.setPreferredSize(new Dimension(900,70));
        panel1.setBorder(BorderFactory.createTitledBorder("Juguemos"));
        panel1.setBackground(PAN2);
        
        Panel2 = new JPanel();
        Panel2.setBorder(BorderFactory.createDashedBorder(panel));
        Panel2.setBorder(BorderFactory.createTitledBorder("INICIAR JUEGO"));
        Panel2.setPreferredSize(new Dimension(170,150));
        Panel2.add(JbReglas);
        Panel2.add(JbNivelJuego);
        Panel2.add(JbAbandonar);
        Panel2.add(JbJugar);
        Panel2.setBackground(cont);
        
        Panel3 = new JPanel();
        Panel3.setBorder(BorderFactory.createTitledBorder("JUGADOR/ES"));
        Panel3.add(PanelJugador);
        Panel3.add(PanelNivel);
        Panel3.add(PanelParticipantes);
        Panel3.setBackground(cont);
        Panel3.setPreferredSize(new Dimension(400,300));
        
        Panel4 = new JPanel();
        Panel4.add(logo);
        Panel4.setPreferredSize(new Dimension(400,150));
        Panel4.setBackground(tit);
        
        Panel5 = new JPanel();
        Panel5.setPreferredSize(new Dimension(750,60));
        Panel5.setBorder(BorderFactory.createTitledBorder("SALIR DEL JUEGO"));
        Panel5.add(JbAbandonar);
        Panel5.setBackground(PanBaj);
       // contenedorP = new Container();
        
        contenedorP  = this.getContentPane();
        contenedorP.add(panel1, BorderLayout.CENTER);
        contenedorP.add(Panel2, BorderLayout.WEST);
        contenedorP.add(Panel3, BorderLayout.EAST);
        contenedorP.add(Panel4, BorderLayout.NORTH);
        contenedorP.add(Panel5, BorderLayout.SOUTH);
       
     
        
        //getContentPane().add(fondo);
        //fondo.setBounds(0,0,1200,800);
        
        
        
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1200,750);
        
        
        
       
       
    }
  
    public static void main (String [] inforux){
     Serpientes app =    new Serpientes();
    }

    

    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getSource()== JbJugar){
            JOptionPane.showMessageDialog(null,"bienvenida "+j1.getNombre());
            
            j1.setPosicion(j1.getPosicion()+((int)(rnd.nextDouble() * 6 + 1)));
            x.setText("dado"+j1.getPosicion());
            if(j1.getPosicion()>=30){
                JOptionPane.showMessageDialog(null,"Usted ha ganado");
                j1.setPosicion(0);
            }if(j1.getPosicion()==3){
                j1.setPosicion(22);
            can.setBounds(pm[j1.getPosicion()].getX(),pm[j1.getPosicion()].getY(),60,60);
            }if(j1.getPosicion()==5){
                j1.setPosicion(8);
            can.setBounds(pm[j1.getPosicion()].getX(),pm[j1.getPosicion()].getY(),60,60);
            }
            if(j1.getPosicion()==11){
                j1.setPosicion(26);
            can.setBounds(pm[j1.getPosicion()].getX(),pm[j1.getPosicion()].getY(),60,60);
            }
            if(j1.getPosicion()==20){
                j1.setPosicion(29);
            can.setBounds(pm[j1.getPosicion()].getX(),pm[j1.getPosicion()].getY(),60,60);
            }
            if(j1.getPosicion()==17){
                j1.setPosicion(4);
            can.setBounds(pm[j1.getPosicion()].getX(),pm[j1.getPosicion()].getY(),60,60);
            }
            if(j1.getPosicion()==19){
                j1.setPosicion(7);
            can.setBounds(pm[j1.getPosicion()].getX(),pm[j1.getPosicion()].getY(),60,60);
            }
            if(j1.getPosicion()==21){
                j1.setPosicion(9);
            can.setBounds(pm[j1.getPosicion()].getX(),pm[j1.getPosicion()].getY(),60,60);
            }
            if(j1.getPosicion()==27){
                j1.setPosicion(1);
            can.setBounds(pm[j1.getPosicion()].getX(),pm[j1.getPosicion()].getY(),60,60);
            }
            else
                can.setBounds(pm[j1.getPosicion()].getX(),pm[j1.getPosicion()].getY(),60,60);
            }
        
        if (e.getSource()== JbReglas){
          JOptionPane.showMessageDialog(null, "djfjghjhfgjfjgj \n"+
                 "jhdghfhghfhfghghfghhfghg\n"+"sdhjfhdhfjhd" +JOptionPane.INFORMATION_MESSAGE );
            
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseEntered(MouseEvent e) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseExited(MouseEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


}
