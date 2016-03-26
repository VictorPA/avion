package GUI;

import Matos.Aeroport;
import Matos.VolPassager;
import airCountry.AbstractVol;
import airCountry.AirCountry;
import utilite.CoordonnéesCartésiennes;

import javax.swing.*;
import java.awt.*;
import java.util.Vector;

/**
 * Created by user on 22/03/2016.
 */
public class GuiAvion {




    JFrame fen;
    JTextField jtp;
    JMenuBar jmenubar;
    JMenu jmenu;
    JMenuItem ajouterAero = new JMenuItem("Ajouter Aéroport");
    JMenuItem ajouterVol = new JMenuItem("Ajouter Vol");
    JTextArea jtextarea = new JTextArea(20, 100);
    JComboBox<Vector<String>> combobbbbreaker;
    ComboBoxModel<Vector<String>> lolcombo;
    JPanel pain = new JPanel(new FlowLayout());
    JList<String> maliste;


    public GuiAvion() {
        Vector arrete = new Vector();
        AirCountry airCountry = new AirCountry();

        Aeroport cdg = new Aeroport("Charles de Gaulle",new CoordonnéesCartésiennes(1,2,1));
        Aeroport orly = new Aeroport("Orly",new CoordonnéesCartésiennes(17,180,50));
        Aeroport venizelos = new Aeroport("Venizelos",new CoordonnéesCartésiennes(70,46,89));



        VolPassager vol1 = new VolPassager(cdg, orly, "6969");

        VolPassager vol3 = new VolPassager(venizelos, orly, "1647");
        VolPassager vol4 = new VolPassager(cdg, venizelos, "9790");

        airCountry.addVol(vol1);

        airCountry.addVol(vol3);
        airCountry.addVol(vol4);

        try {
            System.out.println(airCountry);
            for(AbstractVol e : airCountry.getListeVols()){
                arrete.add(e.toString() + " " + airCountry.distanceVol(e));
            }


        } catch (Exception e) {
            e.printStackTrace();
        }

        fen = new JFrame();

        fen.setSize((int) (java.awt.Toolkit.getDefaultToolkit().getScreenSize().getWidth() / 1.5), (int) (java.awt.Toolkit.getDefaultToolkit().getScreenSize().getHeight() / 1.5));
        fen.setTitle("Mon Titre");
        fen.setLocationRelativeTo(null);

        jmenubar = new JMenuBar();
        jmenu = new JMenu("Action");
        jmenu.add(ajouterAero);
        jmenu.add(ajouterVol);
        jmenubar.add(jmenu);

        fen.setJMenuBar(jmenubar);

        maliste = new JList(arrete);

        Container contenu = fen.getContentPane();
    maliste.setPreferredSize(new Dimension(1000,500));
        pain.add(maliste);
        contenu.add(pain, BorderLayout.NORTH);


        fen.setVisible(true);


        fen.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);


    }


    public static void main(String[] args) {

        new GuiAvion();

    }

}
