import net.miginfocom.swing.MigLayout;
import org.jdesktop.layout.GroupLayout;
import org.jdesktop.layout.LayoutStyle;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 * @author Henriette Beigh
 */

class clsPrimeRslts
  {
  
  
  // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
  // Generated using JFormDesigner non-commercial license
  public JDialog dlgRslts;
  public JPanel pnlDlgRslts;
  public JScrollPane pnlScroll;
  public JTextArea txtPrmRslt;
  public JPanel pnlButton;
  public JButton btnOK;
  // JFormDesigner - End of variables declaration  //GEN-END:variables

  public clsPrimeRslts()
    {
    this.initComponents();
    this.btnOK.setOpaque(true);
    }

  public void OpenDlg()
    {
    this.dlgRslts.setVisible(true);
//    this.txtPrmRslt.setText("");
    }

  public void CloseDlg()
    {
    this.dlgRslts.setVisible(false);
    this.dlgRslts.dispose();
    }
  
  private void btnOKActionPerformed(ActionEvent e)
    {
    CloseDlg();
    }
  
  public void initComponents()
    {
    // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
    // Generated using JFormDesigner non-commercial license
    dlgRslts = new JDialog();
    pnlDlgRslts = new JPanel();
    pnlScroll = new JScrollPane();
    txtPrmRslt = new JTextArea();
    pnlButton = new JPanel();
    btnOK = new JButton();

    //======== dlgRslts ========
    {
      dlgRslts.setBackground(new Color(0, 0, 102));
      dlgRslts.setTitle("Results of Prime Number Calculation");
      dlgRslts.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
      dlgRslts.setAlwaysOnTop(true);
      dlgRslts.setForeground(Color.cyan);
      dlgRslts.setFont(new Font("Lucida Grande", Font.BOLD, 13));
      dlgRslts.setMinimumSize(new Dimension(550, 400));
      dlgRslts.setName("dlgRslts");
      dlgRslts.setModal(true);
      Container dlgRsltsContentPane = dlgRslts.getContentPane();

      //======== pnlDlgRslts ========
      {
        pnlDlgRslts.setBorder(new LineBorder(Color.cyan, 2));
        pnlDlgRslts.setBackground(new Color(0, 0, 102));
        pnlDlgRslts.setForeground(Color.cyan);
        pnlDlgRslts.setMinimumSize(new Dimension(550, 400));
        pnlDlgRslts.setPreferredSize(new Dimension(550, 400));

        //======== pnlScroll ========
        {
          pnlScroll.setBackground(new Color(0, 0, 102));
          pnlScroll.setForeground(Color.cyan);
          pnlScroll.setBorder(null);

          //---- txtPrmRslt ----
          txtPrmRslt.setBackground(new Color(0, 0, 102));
          txtPrmRslt.setForeground(Color.cyan);
          txtPrmRslt.setFont(new Font("sansserif", Font.BOLD, 12));
          txtPrmRslt.setBorder(null);
          txtPrmRslt.setTabSize(4);
          txtPrmRslt.setWrapStyleWord(true);
          txtPrmRslt.setLineWrap(true);
          pnlScroll.setViewportView(txtPrmRslt);
        }

        //======== pnlButton ========
        {
          pnlButton.setBackground(new Color(0, 0, 102));
          pnlButton.setBorder(null);
          pnlButton.setLayout(new MigLayout(
            "hidemode 3",
            // columns
            "[300!,fill]" +
            "[200!,right]",
            // rows
            "[]" +
            "[]"));

          //---- btnOK ----
          btnOK.setText("OK");
          btnOK.setBackground(new Color(0, 0, 102));
          btnOK.setForeground(Color.cyan);
          btnOK.setFont(new Font(".SF NS Text", Font.BOLD, 14));
          btnOK.setActionCommand("OK");
          btnOK.setBorder(new LineBorder(Color.cyan, 1, true));
          btnOK.setMaximumSize(new Dimension(45, 30));
          btnOK.setMinimumSize(new Dimension(45, 30));
          btnOK.setPreferredSize(new Dimension(45, 30));
          btnOK.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
              btnOKActionPerformed(e);
            }
          });
          pnlButton.add(btnOK, "cell 1 0");
        }

        GroupLayout pnlDlgRsltsLayout = new GroupLayout(pnlDlgRslts);
        pnlDlgRslts.setLayout(pnlDlgRsltsLayout);
        pnlDlgRsltsLayout.setHorizontalGroup(
          pnlDlgRsltsLayout.createParallelGroup()
            .add(pnlDlgRsltsLayout.createSequentialGroup()
              .add(pnlButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .addContainerGap(7, Short.MAX_VALUE))
            .add(GroupLayout.TRAILING, pnlDlgRsltsLayout.createSequentialGroup()
              .add(0, 14, Short.MAX_VALUE)
              .add(pnlScroll, GroupLayout.PREFERRED_SIZE, 532, GroupLayout.PREFERRED_SIZE))
        );
        pnlDlgRsltsLayout.setVerticalGroup(
          pnlDlgRsltsLayout.createParallelGroup()
            .add(pnlDlgRsltsLayout.createSequentialGroup()
              .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .add(pnlScroll, GroupLayout.PREFERRED_SIZE, 330, GroupLayout.PREFERRED_SIZE)
              .addPreferredGap(LayoutStyle.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .add(pnlButton, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
              .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
      }

      GroupLayout dlgRsltsContentPaneLayout = new GroupLayout(dlgRsltsContentPane);
      dlgRsltsContentPane.setLayout(dlgRsltsContentPaneLayout);
      dlgRsltsContentPaneLayout.setHorizontalGroup(
        dlgRsltsContentPaneLayout.createParallelGroup()
          .add(dlgRsltsContentPaneLayout.createSequentialGroup()
            .add(pnlDlgRslts, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
            .add(0, 0, Short.MAX_VALUE))
      );
      dlgRsltsContentPaneLayout.setVerticalGroup(
        dlgRsltsContentPaneLayout.createParallelGroup()
          .add(pnlDlgRslts, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
      );
      dlgRslts.pack();
      dlgRslts.setLocationRelativeTo(dlgRslts.getOwner());
    }
    // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }
    
  }
