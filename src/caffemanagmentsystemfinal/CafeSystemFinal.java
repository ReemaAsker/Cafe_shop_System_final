package caffemanagmentsystemfinal;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

public class CafeSystemFinal extends JFrame implements ActionListener, MouseListener {

    JPanel titleP, drinkP, cakeP, costP, totalP, billP, buttonsP;
    JCheckBox lattleCB, cartoonHillCB, cofeeCakeCB, espressoCB, kilburnCB, lagosCB, queenCB, redRevCakeCB, icedCappCB, icedLatCB, blackForestCB, bostemCreamCB, cappCB;
    JTextField CappuccinoTX, EspressoTX, IcedCappTX, IcedLattleTX, lagosTX, blackFoTX, bostemTX, carltonTX, serviceChargeTX, kilburnTX, queenParkTX, redVelvetCakeTX, subTotalTX, lattleTX, totalTX, cofeeCakeTX, costCakeTX, costDrinkTX;
    JLabel titleL, costDrinkL, costCakeL, serviceChargeL, subTotalL, totalL;
    JButton exitB, receptB, resetB, totalB;
    JScrollPane billSP;
    JTextArea billTA;
    Border bord = new LineBorder(Color.black, 3);
    Font f = new Font(Font.SERIF, Font.BOLD, 15);
    CafeMangnage cM = new CafeMangnage();

    public CafeSystemFinal() {
        super("Coffe System (Java Course Project)");
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setBounds(200, 70, 1000, 650);
        super.setLayout(null);

        titleP = new JPanel(null);
        drinkP = new JPanel(new GridLayout(5, 2, 0, 50));
        cakeP = new JPanel(new GridLayout(8, 2, 5, 20));
        costP = new JPanel(null);
        totalP = new JPanel(null);
        billP = new JPanel(null);
        buttonsP = new JPanel(new FlowLayout(1, 10, 10));
        lattleCB = new JCheckBox("Lattle");
        cartoonHillCB = new JCheckBox("Cariton Hill Chocolate ");
        cofeeCakeCB = new JCheckBox("Coffe Cake");
        espressoCB = new JCheckBox("Espresso");
        kilburnCB = new JCheckBox("Kilbrun Chocolate Cake");
        lagosCB = new JCheckBox("Lagos Chocolate Cake");
        queenCB = new JCheckBox("Queen's Park Chocolate ");
        redRevCakeCB = new JCheckBox("Red Velvet Cake");
        icedCappCB = new JCheckBox("Iced Cappuccino");
        icedLatCB = new JCheckBox("Iced Lattle");
        blackForestCB = new JCheckBox("Black Forest Cake");
        bostemCreamCB = new JCheckBox("Bostom Cream Ple");
        cappCB = new JCheckBox("Cappuccino");

        CappuccinoTX = new JTextField("0");
        EspressoTX = new JTextField("0");
        IcedCappTX = new JTextField("0");
        IcedLattleTX = new JTextField("0");
        blackFoTX = new JTextField("0");
        bostemTX = new JTextField("0");
        lagosTX = new JTextField("0");
        carltonTX = new JTextField("0");
        lattleTX = new JTextField("0");
        kilburnTX = new JTextField("0");

        queenParkTX = new JTextField("0");
        redVelvetCakeTX = new JTextField("0");
        subTotalTX = new JTextField("0");
        totalTX = new JTextField("0");
        cofeeCakeTX = new JTextField("0");
        costCakeTX = new JTextField("0");
        costDrinkTX = new JTextField("0");
        serviceChargeTX = new JTextField("1.50");

        titleL = new JLabel("Cafe Managment Systems");
        costDrinkL = new JLabel("Cost of Drinks");
        costCakeL = new JLabel("Cost of Cakes");
        serviceChargeL = new JLabel("Service Charge");
        subTotalL = new JLabel("Sub Total");
        totalL = new JLabel("Total");
        exitB = new JButton("Exit");
        receptB = new JButton("Receipt");
        resetB = new JButton("Reset");
        totalB = new JButton("Total");
         billTA = new JTextArea();
        billSP = new JScrollPane(billTA);
       

        IcedLattleTX.setHorizontalAlignment(JTextField.CENTER);
        lattleTX.setHorizontalAlignment(JTextField.CENTER);
        IcedLattleTX.setHorizontalAlignment(JTextField.CENTER);
        EspressoTX.setHorizontalAlignment(JTextField.CENTER);
        CappuccinoTX.setHorizontalAlignment(JTextField.CENTER);
        IcedCappTX.setHorizontalAlignment(JTextField.CENTER);
        cofeeCakeTX.setHorizontalAlignment(JTextField.CENTER);
        redVelvetCakeTX.setHorizontalAlignment(JTextField.CENTER);
        bostemTX.setHorizontalAlignment(JTextField.CENTER);
        blackFoTX.setHorizontalAlignment(JTextField.CENTER);
        lagosTX.setHorizontalAlignment(JTextField.CENTER);
        kilburnTX.setHorizontalAlignment(JTextField.CENTER);
        carltonTX.setHorizontalAlignment(JTextField.CENTER);
        queenParkTX.setHorizontalAlignment(JTextField.CENTER);
        costDrinkTX.setHorizontalAlignment(JTextField.CENTER);
        costCakeTX.setHorizontalAlignment(JTextField.CENTER);
        serviceChargeTX.setHorizontalAlignment(JTextField.CENTER);
        subTotalTX.setHorizontalAlignment(JTextField.CENTER);
        totalTX.setHorizontalAlignment(JTextField.CENTER);
        costDrinkL.setFont(f);
        costCakeL.setFont(f);
        serviceChargeL.setFont(f);
        serviceChargeTX.setForeground(Color.red);
        serviceChargeTX.setFont(new Font("Arial", Font.BOLD, 15));
        subTotalL.setFont(f);
        totalL.setFont(f);
        totalL.setForeground(Color.blue);
        totalTX.setFont(f);
        totalTX.setForeground(Color.blue);
        billTA.setEditable(false);

        titleL.setFont(new Font("Arial", Font.BOLD, 40));
        titleP.setBorder(bord);
        drinkP.setBorder(bord);
        costP.setBorder(bord);
        cakeP.setBorder(bord);
        totalP.setBorder(bord);
        billP.setBorder(bord);
        buttonsP.setBorder(bord);
        costDrinkTX.setEditable(false);
        costCakeTX.setEditable(false);
        subTotalTX.setEditable(false);
        totalTX.setEditable(false);
        serviceChargeTX.setEditable(false);
        billTA.setFont(new Font("Arial", Font.BOLD, 12));
//
        exitB.addActionListener(this);
        receptB.addActionListener(this);
        resetB.addActionListener(this);
        totalB.addActionListener(this);
        lattleCB.addMouseListener(this);
        cartoonHillCB.addMouseListener(this);
        cofeeCakeCB.addMouseListener(this);
        espressoCB.addMouseListener(this);
        kilburnCB.addMouseListener(this);
        lagosCB.addMouseListener(this);
        queenCB.addMouseListener(this);
        redRevCakeCB.addMouseListener(this);
        icedCappCB.addMouseListener(this);
        icedLatCB.addMouseListener(this);
        blackForestCB.addMouseListener(this);
        bostemCreamCB.addMouseListener(this);
        cappCB.addMouseListener(this);

        billSP.setBounds(10, 10, 300, 435);
        titleL.setBounds(150, 0, 500, 75);
        titleP.setBounds(0, 0, 983, 75);
        drinkP.setBounds(0, 80, 300, 350);
        costP.setBounds(0, 435, 300, 170);
        cakeP.setBounds(305, 80, 340, 400);
        totalP.setBounds(305, 485, 340, 120);
        billP.setBounds(657, 80, 324, 460);
        buttonsP.setBounds(657, 549, 323, 55);
        costDrinkL.setBounds(20, 30, 130, 25);
        costDrinkTX.setBounds(155, 30, 130, 25);
        costCakeL.setBounds(20, 70, 130, 25);
        costCakeTX.setBounds(155, 70, 130, 25);
        serviceChargeL.setBounds(20, 110, 130, 25);
        serviceChargeTX.setBounds(155, 110, 130, 25);

        subTotalL.setBounds(30, 20, 130, 25);
        subTotalTX.setBounds(160, 20, 130, 25);
        totalL.setBounds(30, 60, 130, 25);
        totalTX.setBounds(160, 60, 130, 25);
        titleP.add(titleL);

        drinkP.add(lattleCB);
        drinkP.add(lattleTX);
        drinkP.add(icedLatCB);
        drinkP.add(IcedLattleTX);
        drinkP.add(espressoCB);
        drinkP.add(EspressoTX);
        drinkP.add(cappCB);
        drinkP.add(CappuccinoTX);
        drinkP.add(icedCappCB);
        drinkP.add(IcedCappTX);
        cakeP.add(cofeeCakeCB);
        cakeP.add(cofeeCakeTX);
        cakeP.add(redRevCakeCB);
        cakeP.add(redVelvetCakeTX);
        cakeP.add(bostemCreamCB);
        cakeP.add(bostemTX);
        cakeP.add(blackForestCB);
        cakeP.add(blackFoTX);
        cakeP.add(lagosCB);
        cakeP.add(lagosTX);
        cakeP.add(kilburnCB);
        cakeP.add(kilburnTX);
        cakeP.add(cartoonHillCB);
        cakeP.add(carltonTX);
        cakeP.add(queenCB);
        cakeP.add(queenParkTX);
        costP.add(costDrinkL);
        costP.add(costDrinkTX);
        costP.add(costCakeL);
        costP.add(costCakeTX);
        costP.add(serviceChargeL);
        costP.add(serviceChargeTX);
        totalP.add(subTotalL);
        totalP.add(subTotalTX);
        totalP.add(totalL);
        totalP.add(totalTX);
        buttonsP.add(totalB);
        buttonsP.add(receptB);
        buttonsP.add(resetB);
        buttonsP.add(exitB);
        billP.add(billSP);

        add(titleP);
        add(drinkP);
        add(costP);
        add(cakeP);
        add(totalP);
        add(billP);
        add(buttonsP);

        super.setVisible(true);
    }

    void calcsubTotal() {
        
        subTotalTX.setText(String.format("%.2f", cM.subTotal()));
        totalTX.setText(String.format("%.2f", cM.Total()));
    }

    public void clearAll() {
        lattleCB.setSelected(false);
        cartoonHillCB.setSelected(false);
        cofeeCakeCB.setSelected(false);
        espressoCB.setSelected(false);
        kilburnCB.setSelected(false);
        lagosCB.setSelected(false);
        queenCB.setSelected(false);
        redRevCakeCB.setSelected(false);
        icedCappCB.setSelected(false);
        icedLatCB.setSelected(false);
        blackForestCB.setSelected(false);
        bostemCreamCB.setSelected(false);
        cappCB.setSelected(false);
        CappuccinoTX.setText("0");
        EspressoTX.setText("0");
        IcedCappTX.setText("0");
        IcedLattleTX.setText("0");
        blackFoTX.setText("0");
        bostemTX.setText("0");
        lagosTX.setText("0");
        carltonTX.setText("0");
        lattleTX.setText("0");
        kilburnTX.setText("0");
        queenParkTX.setText("0");
        redVelvetCakeTX.setText("0");
        subTotalTX.setText("0");
        totalTX.setText("0");
        cofeeCakeTX.setText("0");
        costCakeTX.setText("0");
        costDrinkTX.setText("0");
        billTA.setText("");
        cM = new CafeMangnage();
    }
    private void printInArea() {
     String billText = "\t Welcom\n===========================================\n";
                String completeBill =cM.drinks(billText);
                billTA.setText(completeBill);
        try {
            writeInFile(completeBill);
            billText = "";
        } catch (IOException ex) {
            System.out.println("error");
        }
    }

     void writeInFile(String bill ) throws IOException {
         String currentDate = LocalDate.now().getDayOfWeek().toString();
         String currentTime  =LocalTime.now().getMinute()+"";
         String fileName = currentDate+LocalTime.now().getHour()+currentTime;
           PrintWriter p =null;
        try {
            p =  new PrintWriter(new FileOutputStream(fileName+".txt"));
            p.println(bill);
            JOptionPane.showMessageDialog(this, "Saved in File with Name ( "+fileName+" ) Successfuly!");
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } finally {
            p.flush();
            p.close();
        }
    }


    @Override
    public void mouseClicked(MouseEvent e) {
        try{
        if (e.getSource() == lattleCB) {
            if (lattleCB.isSelected()) {
                cM.addPro(lattleCB.getText(), Integer.parseInt(lattleTX.getText()), CafeMangnage.LATTLE, 'D');
            } else {
                cM.removePro(lattleCB.getText());
            }

        } else if (e.getSource() == espressoCB) {

            if (espressoCB.isSelected()) {
                cM.addPro(espressoCB.getText(), Integer.parseInt(EspressoTX.getText()), CafeMangnage.ESPRESSO, 'D');
            } else {
                cM.removePro(espressoCB.getText());
            }
        }
        
else if (e.getSource() == icedLatCB) {

            if (icedLatCB.isSelected()) {
                cM.addPro(icedLatCB.getText(), Integer.parseInt(IcedLattleTX.getText()), CafeMangnage.ICED_LATTLE, 'D');
            } else {
                cM.removePro(icedLatCB.getText());
            }
        }
else if (e.getSource() == cappCB) {

            if (cappCB.isSelected()) {
                cM.addPro(cappCB.getText(), Integer.parseInt(CappuccinoTX.getText()), CafeMangnage.CAPP, 'D');
            } else {
                cM.removePro(cappCB.getText());
            }
        }
else if (e.getSource() == icedCappCB) {

            if (icedCappCB.isSelected()) {
                cM.addPro(icedCappCB.getText(), Integer.parseInt(IcedCappTX.getText()), CafeMangnage.ICED_CAPP, 'D');
            } else {
                cM.removePro(icedCappCB.getText());
            }
        }


else if (e.getSource() == cofeeCakeCB) {

            if (cofeeCakeCB.isSelected()) {
                cM.addPro(cofeeCakeCB.getText(), Integer.parseInt(cofeeCakeTX.getText()), CafeMangnage.COFFE_CAKE, 'C');
            } else {
                cM.removePro(cofeeCakeCB.getText());
            }
        }

else if (e.getSource() == redRevCakeCB) {

            if (redRevCakeCB.isSelected()) {
                cM.addPro(redRevCakeCB.getText(), Integer.parseInt(redVelvetCakeTX.getText()), CafeMangnage.RED_VEL_CAKE, 'C');
            } else {
                cM.removePro(redRevCakeCB.getText());
            }
        }
else if (e.getSource() == bostemCreamCB) {

            if (bostemCreamCB.isSelected()) {
                cM.addPro(bostemCreamCB.getText(), Integer.parseInt(bostemTX.getText()), CafeMangnage.BOSTOM_CREAM_PIE, 'C');
            } else {
                cM.removePro(bostemCreamCB.getText());
            }
        }
else if (e.getSource() == blackForestCB) {

            if (blackForestCB.isSelected()) {
                cM.addPro(blackForestCB.getText(), Integer.parseInt(blackFoTX.getText()), CafeMangnage.BLACK_FOREST_CAKE, 'C');
            } else {
                cM.removePro(blackForestCB.getText());
            }
        }
else if (e.getSource() == lagosCB) {

            if (lagosCB.isSelected()) {
                cM.addPro(lagosCB.getText(), Integer.parseInt(lagosTX.getText()), CafeMangnage.LAGOS_CHOCOLATE_CAKE, 'C');
            } else {
                cM.removePro(lagosCB.getText());
            }
        }
else if (e.getSource() == kilburnCB) {

            if (kilburnCB.isSelected()) {
                cM.addPro(kilburnCB.getText(), Integer.parseInt(kilburnTX.getText()), CafeMangnage.KILBURN_CAKE, 'C');
            } else {
                cM.removePro(kilburnCB.getText());
            }
        }
else if (e.getSource() == cartoonHillCB) {

            if (cartoonHillCB.isSelected()) {
                cM.addPro(cartoonHillCB.getText(), Integer.parseInt(carltonTX.getText()), CafeMangnage.CARLTON_CAKE, 'C');
            } else {
                cM.removePro(cartoonHillCB.getText());
            }
        }
else if (e.getSource() == queenCB) {

            if (queenCB.isSelected()) {
                cM.addPro(queenCB.getText(), Integer.parseInt(queenParkTX.getText()), CafeMangnage.QUEEN_CAKE, 'C');
            } else {
                cM.removePro(queenCB.getText());
            }
        }

        
        costCakeTX.setText(String.format("%.2f", CafeMangnage.costOfCake));
        costDrinkTX.setText(String.format("%.2f", CafeMangnage.costOfDrink ));
        }catch(Exception ex){
            JOptionPane.showMessageDialog(this, "Error");
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try{
        if (e.getSource() == exitB) {
            System.exit(0);
        } else if (e.getSource() == receptB) {
            if(cM.checkWriteORNot())
                printInArea();
            else
                JOptionPane.showMessageDialog(this, "No Product to Saved it");
        } else if (e.getSource() == resetB) {
            clearAll();
        } else if (e.getSource() == totalB) {
            calcsubTotal();
        }

    }
    catch(Exception ex){
                JOptionPane.showMessageDialog(this, "Error");
}
}

}
