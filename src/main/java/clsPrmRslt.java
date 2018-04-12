import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import com.intellij.uiDesigner.core.*;
/*
 * Created by JFormDesigner on Mon Apr 09 17:56:08 PDT 2018
 */



/**
 * @author Henriette Beigh
 */
public class clsPrmRslt  {

  private void initComponents() {
    // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
    // Generated using JFormDesigner non-commercial license
    dlgPrmRslt = new JDialog();
    dialogPane = new JPanel();
    pnlRslts = new JPanel();
    pnlBttn = new JPanel();
    barButton = new JPanel();
    btnOK = new JButton();

    //======== dlgPrmRslt ========
    {
      dlgPrmRslt.setBackground(new Color(255, 255, 204));
      dlgPrmRslt.setForeground(new Color(0, 0, 102));
      dlgPrmRslt.setFont(new Font("Lucida Grande", Font.BOLD, 14));
      dlgPrmRslt.setAlwaysOnTop(true);
      dlgPrmRslt.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
      dlgPrmRslt.setTitle("Results of Prime Number Calculation");
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
          pnlRslts.setBorder(null);
          pnlRslts.setForeground(new Color(0, 0, 102));
          pnlRslts.setBackground(new Color(255, 255, 204));
          pnlRslts.setLayout(new GridLayoutManager(1, 1, new Insets(0, 0, 0, 0), -1, -1));
        }
        dialogPane.add(pnlRslts, BorderLayout.CENTER);

        //======== pnlBttn ========
        {
          pnlBttn.setBorder(null);
          pnlBttn.setLayout(new BorderLayout());

          //======== barButton ========
          {
            barButton.setBorder(new EmptyBorder(12, 0, 0, 0));
            barButton.setBackground(new Color(255, 255, 204));
            barButton.setPreferredSize(new Dimension(130, 65));
            barButton.setLayout(new GridBagLayout());
            ((GridBagLayout)barButton.getLayout()).columnWidths = new int[] {0, 85, 0};
            ((GridBagLayout)barButton.getLayout()).rowHeights = new int[] {44, 5};
            ((GridBagLayout)barButton.getLayout()).columnWeights = new double[] {1.0, 0.0, 0.0};

            //---- btnOK ----
            btnOK.setText("OK");
            btnOK.setBackground(new Color(0, 0, 102));
            btnOK.setForeground(Color.cyan);
            btnOK.setMaximumSize(new Dimension(60, 32));
            btnOK.setMinimumSize(new Dimension(60, 32));
            btnOK.setPreferredSize(new Dimension(60, 32));
            btnOK.setFont(new Font("sansserif", Font.BOLD, 14));
            btnOK.setHorizontalTextPosition(SwingConstants.CENTER);
            btnOK.setBorder(new LineBorder(Color.cyan, 1, true));
            btnOK.setIconTextGap(2);
            barButton.add(btnOK, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0,
              GridBagConstraints.CENTER, GridBagConstraints.NONE,
              new Insets(0, 0, 5, 5), 0, 0));
          }
          pnlBttn.add(barButton, BorderLayout.NORTH);
        }
        dialogPane.add(pnlBttn, BorderLayout.SOUTH);
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
  private JPanel pnlBttn;
  private JPanel barButton;
  private JButton btnOK;
  // JFormDesigner - End of variables declaration  //GEN-END:variables
}
