import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import com.intellij.uiDesigner.core.*;
/*
 * Created by JFormDesigner on Mon Apr 09 16:54:45 PDT 2018
 */



/**
 * @author Henriette Beigh
 */
public class clsPrmRslt {
  public clsPrmRslt(Frame owner) {
    super(owner);
    initComponents();
  }

  public clsPrmRslt(Dialog owner) {
    super(owner);
    initComponents();
  }

  private void initComponents() {
    // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
    // Generated using JFormDesigner non-commercial license
    dlgPrmRslt = new JDialog();
    dialogPane = new JPanel();
    pnlRslts = new JPanel();
    scrollPane1 = new JScrollPane();
    txtRslts = new JTextArea();
    buttonBar = new JPanel();
    btnOK = new JButton();

    //======== dlgPrmRslt ========
    {
      dlgPrmRslt.setBackground(new Color(255, 255, 204));
      dlgPrmRslt.setForeground(new Color(0, 0, 102));
      dlgPrmRslt.setFont(new Font("Lucida Grande", Font.BOLD, 14));
      dlgPrmRslt.setAlwaysOnTop(true);
      dlgPrmRslt.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
      dlgPrmRslt.setTitle("Calculated Prime Results");
      Container dlgPrmRsltContentPane = dlgPrmRslt.getContentPane();
      dlgPrmRsltContentPane.setLayout(new BorderLayout());

      //======== dialogPane ========
      {
        dialogPane.setBorder(null);
        dialogPane.setForeground(new Color(0, 0, 102));
        dialogPane.setBackground(new Color(255, 255, 204));
        dialogPane.setMinimumSize(new Dimension(122, 190));
        dialogPane.setMaximumSize(new Dimension(122, 190));
        dialogPane.setPreferredSize(new Dimension(122, 190));
        dialogPane.setLayout(new BorderLayout());

        //======== pnlRslts ========
        {
          pnlRslts.setBorder(new LineBorder(new Color(0, 0, 102)));
          pnlRslts.setForeground(new Color(0, 0, 102));
          pnlRslts.setBackground(new Color(255, 255, 204));
          pnlRslts.setLayout(new GridLayoutManager(1, 1, new Insets(0, 0, 0, 0), -1, -1));

          //======== scrollPane1 ========
          {
            scrollPane1.setBackground(new Color(255, 255, 204));
            scrollPane1.setPreferredSize(new Dimension(90, 112));
            scrollPane1.setForeground(new Color(0, 0, 102));
            scrollPane1.setFont(new Font("sansserif", Font.PLAIN, 14));
            scrollPane1.setBorder(null);

            //---- txtRslts ----
            txtRslts.setBackground(new Color(255, 255, 204));
            txtRslts.setForeground(new Color(0, 0, 102));
            txtRslts.setFont(new Font("sansserif", Font.PLAIN, 14));
            txtRslts.setBorder(null);
            scrollPane1.setViewportView(txtRslts);
          }
          pnlRslts.add(scrollPane1, new GridConstraints(0, 0, 1, 1,
            GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_NONE,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW,
            new Dimension(385, 225), new Dimension(385, 225), new Dimension(385, 225)));
        }
        dialogPane.add(pnlRslts, BorderLayout.CENTER);

        //======== buttonBar ========
        {
          buttonBar.setBorder(new EmptyBorder(12, 0, 0, 0));
          buttonBar.setBackground(new Color(255, 255, 204));
          buttonBar.setLayout(new GridBagLayout());
          ((GridBagLayout)buttonBar.getLayout()).columnWidths = new int[] {0, 80};
          ((GridBagLayout)buttonBar.getLayout()).rowHeights = new int[] {39};
          ((GridBagLayout)buttonBar.getLayout()).columnWeights = new double[] {1.0, 0.0};

          //---- btnOK ----
          btnOK.setText("OK");
          btnOK.setBackground(new Color(0, 0, 102));
          btnOK.setForeground(Color.cyan);
          btnOK.setMaximumSize(new Dimension(32, 32));
          btnOK.setMinimumSize(new Dimension(32, 32));
          btnOK.setPreferredSize(new Dimension(32, 32));
          btnOK.setFont(new Font("sansserif", Font.BOLD, 14));
          btnOK.setHorizontalTextPosition(SwingConstants.CENTER);
          btnOK.setBorder(new LineBorder(Color.cyan, 2, true));
          buttonBar.add(btnOK, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0,
            GridBagConstraints.CENTER, GridBagConstraints.BOTH,
            new Insets(0, 0, 0, 0), 0, 0));
        }
        dialogPane.add(buttonBar, BorderLayout.SOUTH);
      }
      dlgPrmRsltContentPane.add(dialogPane, BorderLayout.CENTER);
      dlgPrmRslt.pack();
      dlgPrmRslt.setLocationRelativeTo(null);
    }
    // JFormDesigner - End of component initialization  //GEN-END:initComponents
  }

  // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
  // Generated using JFormDesigner non-commercial license
  private JDialog dlgPrmRslt;
  private JPanel dialogPane;
  private JPanel pnlRslts;
  private JScrollPane scrollPane1;
  private JTextArea txtRslts;
  private JPanel buttonBar;
  private JButton btnOK;
  // JFormDesigner - End of variables declaration  //GEN-END:variables
}
