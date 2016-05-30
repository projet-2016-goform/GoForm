/**
 * 
 */
package fr.iutvalence.info.dut.m2107.ihm;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

import org.dyno.visual.swing.layouts.Constraints;
import org.dyno.visual.swing.layouts.GroupLayout;
import org.dyno.visual.swing.layouts.Leading;

//VS4E -- DO NOT REMOVE THIS LINE!
public class CreerUneSceance extends JFrame {

	private static final long serialVersionUID = 1L;
	private JLabel jTitre;
	private JLabel jNomSceance;
	private JTextField jTextFieldNomSceance;
	private JLabel jNbExo;
	private JComboBox jComboBox0;
	private JButton bTerminer;
	private JLabel jNomExo;
	private JLabel jNbRep;
	private JTextField jTextField1;
	private JSpinner jSpinnerRep1;
	private JTextField jTextField2;
	private JSpinner jSpinnerRep2;
	private JTextField jTextField3;
	private JSpinner jSpinnerRep3;
	private static final String PREFERRED_LOOK_AND_FEEL = "javax.swing.plaf.metal.MetalLookAndFeel";
	public CreerUneSceance() {
		initComponents();
		
		
		
	}

	private void initComponents() {
		setLayout(new GroupLayout());
		add(getJLabel1(), new Constraints(new Leading(25, 10, 10), new Leading(107, 12, 12)));
		add(getJTextFieldNomSceance(), new Constraints(new Leading(164, 269, 10, 10), new Leading(105, 10, 10)));
		add(getJNbExo(), new Constraints(new Leading(23, 10, 10), new Leading(192, 12, 12)));
		add(getJButton0(), new Constraints(new Leading(400, 10, 10), new Leading(660, 10, 10)));
		add(getJComboBox0(), new Constraints(new Leading(184, 10, 10), new Leading(188, 12, 12)));
		add(getJNomExo(), new Constraints(new Leading(34, 10, 10), new Leading(251, 12, 12)));
		add(getJNbRep(), new Constraints(new Leading(254, 10, 10), new Leading(251, 12, 12)));
		add(getJTextField1(), new Constraints(new Leading(44, 88, 12, 12), new Leading(293, 10, 10)));
		add(getJSpinnerRep1(), new Constraints(new Leading(291, 50, 12, 12), new Leading(293, 12, 12)));
		add(getJTextField2(), new Constraints(new Leading(44, 88, 12, 12), new Leading(347, 10, 10)));
		add(getJSpinnerRep2(), new Constraints(new Leading(291, 50, 12, 12), new Leading(347, 12, 12)));
		add(getJTextField3(), new Constraints(new Leading(44, 88, 12, 12), new Leading(406, 10, 10)));
		add(getJSpinnerRep3(), new Constraints(new Leading(291, 50, 12, 12), new Leading(406, 12, 12)));
		add(getJLabel0(), new Constraints(new Leading(95, 278, 10, 10), new Leading(21, 10, 10)));
		setSize(500, 700);
	}

	private JSpinner getJSpinnerRep3() {
		if (jSpinnerRep3 == null) {
			jSpinnerRep3 = new JSpinner();
		}
		return jSpinnerRep3;
	}

	private JTextField getJTextField3() {
		if (jTextField3 == null) {
			jTextField3 = new JTextField();
			jTextField3.setText("nom de l'exo3");
		}
		return jTextField3;
	}

	private JSpinner getJSpinnerRep2() {
		if (jSpinnerRep2 == null) {
			jSpinnerRep2 = new JSpinner();
		}
		return jSpinnerRep2;
	}

	private JTextField getJTextField2() {
		if (jTextField2 == null) {
			jTextField2 = new JTextField();
			jTextField2.setText("nom del'exo 2");
		}
		return jTextField2;
	}

	private JSpinner getJSpinnerRep1() {
		if (jSpinnerRep1 == null) {
			jSpinnerRep1 = new JSpinner();
		}
		return jSpinnerRep1;
	}

	private JTextField getJTextField1() {
		if (jTextField1 == null) {
			jTextField1 = new JTextField();
			jTextField1.setText("nom de l'exo1");
		}
		return jTextField1;
	}

	private JLabel getJNbRep() {
		if (jNbRep == null) {
			jNbRep = new JLabel();
			jNbRep.setText("Nombre de r�p�tition :");
		}
		return jNbRep;
	}

	private JLabel getJNomExo() {
		if (jNomExo == null) {
			jNomExo = new JLabel();
			jNomExo.setText("Nom de l'exercice :");
		}
		return jNomExo;
	}

	private JButton getJButton0() {
		if (bTerminer == null) {
			bTerminer = new JButton();
			bTerminer.setText("Terminer");
		}
		return bTerminer;
	}

	private JComboBox getJComboBox0() {
		if (jComboBox0 == null) {
			jComboBox0 = new JComboBox();
			jComboBox0.setModel(new DefaultComboBoxModel(new Object[] { "0", "1", "2", "3", "4", "5" }));
			jComboBox0.setDoubleBuffered(false);
			jComboBox0.setBorder(null);
		}
		return jComboBox0;
	}

	private JLabel getJNbExo() {
		if (jNbExo == null) {
			jNbExo = new JLabel();
			jNbExo.setText("Nombre d'exercices :");
		}
		return jNbExo;
	}

	private JTextField getJTextFieldNomSceance() {
		if (jTextFieldNomSceance == null) {
			jTextFieldNomSceance = new JTextField();
			jTextFieldNomSceance.setText("nom de la sc�ance");
		}
		return jTextFieldNomSceance;
	}

	private JLabel getJLabel1() {
		if (jNomSceance == null) {
			jNomSceance = new JLabel();
			jNomSceance.setText("Nom de la sc�ance :");
		}
		return jNomSceance;
	}

	private JLabel getJLabel0() {
		if (jTitre == null) {
			jTitre = new JLabel();
			jTitre.setText("<html><h2>Cr�ez votre sc�ance d'enfer</h2></html>");
		}
		return jTitre;
	}

	private static void installLnF() {
		try {
			String lnfClassname = PREFERRED_LOOK_AND_FEEL;
			if (lnfClassname == null)
				lnfClassname = UIManager.getCrossPlatformLookAndFeelClassName();
			UIManager.setLookAndFeel(lnfClassname);
		} catch (Exception e) {
			System.err.println("Cannot install " + PREFERRED_LOOK_AND_FEEL
					+ " on this platform:" + e.getMessage());
		}
	}

	/**
	 * Main entry of the class.
	 * Note: This class is only created so that you can easily preview the result at runtime.
	 * It is not expected to be managed by the designer.
	 * You can modify it as you like.
	 */
	public static void main(String[] args) {
		installLnF();
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				CreerUneSceance frame = new CreerUneSceance();
				frame.setDefaultCloseOperation(CreerUneSceance.EXIT_ON_CLOSE);
				frame.setTitle("CreerUneSceance");
				frame.getContentPane().setPreferredSize(frame.getSize());
				frame.pack();
				frame.setLocationRelativeTo(null);
				frame.setVisible(true);
			}
		});
	}

}