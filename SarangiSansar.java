package cw2;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class SarangiSansar {

    private final ArrayList<Instrument> instruments;
    private final JFrame frame;

    private final JTextField InstrumentNameRentTF;
    private final JTextField instrumentNameSellTF;
    private final JTextField priceTF;
    private final JTextField ChargePerDayTF;
    private final JTextField CustomersNameRentTF;

    private final JTextField customerNameSellTF;
    private final JTextField CustomersPhoneRentTF;
    private final JTextField customersPhoneSellTF;
    private final JTextField PANNoRentTF;
    private final JTextField panNoSellTF;
    private final JTextField DiscountPercentageTF;

    private final JTextField rentingDaysTF;
    private final JTextField InstrumentNameRent1TF;

    private final JTextField InstrumentNameRent2TF;

    private final JTextField InstrumentNameSellOutTF;

    public SarangiSansar() {

        instruments = new ArrayList<>();
        frame = new JFrame("The Rhythm Beats");
        frame.setSize(1200, 800);
        frame.setLayout(new GridLayout());
        InstrumentNameRentTF = new JTextField(15);
        instrumentNameSellTF = new JTextField(15);
        priceTF = new JTextField(15);
        ChargePerDayTF = new JTextField(15);
        CustomersNameRentTF = new JTextField(15);
        customerNameSellTF = new JTextField(15);
        CustomersPhoneRentTF = new JTextField(15);
        customersPhoneSellTF = new JTextField(15);
        PANNoRentTF = new JTextField(15);
        panNoSellTF = new JTextField(15);
        DiscountPercentageTF = new JTextField(15);
        rentingDaysTF = new JTextField(15);
        InstrumentNameRent1TF = new JTextField(15);
        InstrumentNameRent2TF = new JTextField(15);
        InstrumentNameSellOutTF = new JTextField(15);


    }

    public void instrumentToRent() {

        JPanel panel = new JPanel();
        panel.setSize(400, 400);
        panel.setLayout(new GridBagLayout());
        panel.setBorder(BorderFactory.createLineBorder(Color.black));
        GridBagConstraints gbc = new GridBagConstraints();

        JLabel noResultLabel = new JLabel("No Result to display");
        noResultLabel.setVisible(false);
        noResultLabel.setForeground(Color.RED);

        JTable displayTable = new JTable();
        displayTable.setBackground(Color.CYAN);
        JScrollPane scrollPane = new JScrollPane(displayTable);
        scrollPane.setMinimumSize(new Dimension(400, 100));
        scrollPane.setVisible(false);

        JLabel instrumentH = new JLabel("Add instrument for rent");
        JLabel rent = new JLabel("Rent the instrument");
        JLabel returnI = new JLabel("Return instrument");
        Font font = new Font("serif", Font.BOLD, 18);

        JButton add = new JButton("Add");
        JButton display = new JButton("Display");
        JButton clear = new JButton("Clear");
        JButton returnS = new JButton("Return");
        JButton rentA = new JButton("Rent");

        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(0, 0, 8, 0);
        instrumentH.setFont(font);
        panel.add(instrumentH, gbc);

        gbc.gridy++;
        panel.add(new JLabel("Instrument Name:"), gbc);

        gbc.gridx++;
        panel.add(InstrumentNameRentTF, gbc);

        gbc.gridx--;
        gbc.gridy++;
        panel.add(new JLabel("Charge Per Day:"), gbc);

        gbc.gridx++;
        panel.add(ChargePerDayTF, gbc);


        gbc.gridy++;
        panel.add(add, gbc);

        gbc.gridx = 0;
        gbc.gridy++;
        rent.setFont(font);
        panel.add(rent, gbc);

        gbc.gridx = 0;
        gbc.gridy++;
        panel.add(new JLabel("Instrument Name:"), gbc);

        gbc.gridx++;
        panel.add(InstrumentNameRent1TF, gbc);

        gbc.gridx++;
        panel.add(new JLabel("Customer Name:"), gbc);

        gbc.gridx++;
        panel.add(CustomersNameRentTF, gbc);

        gbc.gridx = 0;
        gbc.gridy++;
        panel.add(new JLabel("Customer Phone:"), gbc);

        gbc.gridx++;
        panel.add(CustomersPhoneRentTF, gbc);

        gbc.gridx++;
        panel.add(new JLabel("Customer PAN NO:"), gbc);

        gbc.gridx++;
        panel.add(PANNoRentTF, gbc);

        JLabel dateLabel = new JLabel("Date");
        String years[] = {"Select Year", "2022", "2023", "2024", "2025", "2026"};
        String months[] = {"Select Month", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12"};
        String days[] = {"Select Day", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12",
                "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26",

                "27", "28", "29", "30", "31"};

        JComboBox yearsComboBox = new JComboBox(years);
        JComboBox monthsComboBox = new JComboBox(months);
        JComboBox daysComboBox = new JComboBox(days);

        JComboBox yearComboBox = new JComboBox(years);
        JComboBox monthComboBox = new JComboBox(months);
        JComboBox dayComboBox = new JComboBox(days);

        gbc.gridx = 0;
        gbc.gridy++;
        panel.add(new JLabel("Rent Date"), gbc);

        gbc.gridx++;
        panel.add(yearsComboBox, gbc);

        gbc.gridx++;
        panel.add(monthsComboBox, gbc);

        gbc.gridx++;
        panel.add(daysComboBox, gbc);

        gbc.gridx = 0;
        gbc.gridy++;
        panel.add(new JLabel("Return Date"), gbc);

        gbc.gridx++;
        panel.add(yearComboBox, gbc);

        gbc.gridx++;
        panel.add(monthComboBox, gbc);

        gbc.gridx++;
        panel.add(dayComboBox, gbc);

        gbc.gridx = 0;
        gbc.gridy++;
        panel.add(new JLabel("No of Days:"), gbc);

        gbc.gridx++;
        panel.add(rentingDaysTF, gbc);

        gbc.gridx++;
        panel.add(rentA, gbc);


        gbc.gridx = 0;
        gbc.gridy++;
        returnI.setFont(font);
        panel.add(returnI, gbc);

        gbc.gridx = 0;
        gbc.gridy++;
        panel.add(new JLabel("Instrument Name:"), gbc);

        gbc.gridx++;
        panel.add(InstrumentNameRent2TF, gbc);

        gbc.gridx++;
        panel.add(returnS, gbc);

        gbc.gridx = 0;
        gbc.gridy++;
        panel.add(display, gbc);

        gbc.gridx++;
        panel.add(clear, gbc);

        gbc.gridy++;
        gbc.gridx = 0;
        panel.add(noResultLabel, gbc);

        gbc.gridy++;
        gbc.gridwidth = 4;
        panel.add(scrollPane, gbc);

        InstrumentNameRent1TF.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                try {
                    String name = InstrumentNameRent1TF.getText();
                    InstrumentToRent instrumentToRent = getInstrumentToRentByName(name);
                    instrumentToRent.display();
                    if (instrumentToRent != null) {
                        JOptionPane.showMessageDialog(frame, "Instrument Name : " + instrumentToRent.getInstrumentName() + "\n" + "Charge per day : " + instrumentToRent.getChargePerDay());
                    }
                } catch (Exception ex) {

                }
            }

            @Override
            public void removeUpdate(DocumentEvent e) {

            }

            @Override
            public void changedUpdate(DocumentEvent e) {

            }
        });

        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (InstrumentNameRentTF.getText().isEmpty() || ChargePerDayTF.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(frame, "Empty Text Fields");
                } else {
                    try {
                        String name = InstrumentNameRentTF.getText();
                        int chargePerDay = Integer.parseInt(ChargePerDayTF.getText());
                        InstrumentToRent instrumentToRent = new InstrumentToRent(chargePerDay, name);
                        instrumentToRent.setIsRented(false);
                        instrumentToRent.display();
                        instruments.add(instrumentToRent);
                        instrumentToRent.setInstrumentName(name);
                        JOptionPane.showMessageDialog(frame, "Instrument " + InstrumentNameRentTF.getText() + " Added for rent");
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(frame, "Enter valid Charge per day");
                    }
                }
            }
        });

        rentA.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (InstrumentNameRent1TF.getText().isEmpty() || CustomersNameRentTF.getText().isEmpty() || PANNoRentTF.getText().isEmpty() || CustomersPhoneRentTF.getText().isEmpty() || rentingDaysTF.getText().isEmpty() ||
                        yearsComboBox.getSelectedIndex() == 0 || monthsComboBox.getSelectedIndex() == 0 || daysComboBox.getSelectedIndex() == 0 || yearComboBox.getSelectedIndex() == 0 || monthComboBox.getSelectedIndex() == 0 || dayComboBox.getSelectedIndex() == 0) {
                    JOptionPane.showMessageDialog(frame, "Fill up all the Fields");
                } else {
                    try {
                        String name = InstrumentNameRentTF.getText();
                        String rentDate = yearsComboBox.getSelectedItem() + "-" + monthsComboBox.getSelectedItem() + "-" + daysComboBox.getSelectedItem();
                        String returnDate = yearComboBox.getSelectedItem() + "-" + monthComboBox.getSelectedItem() + "-" + dayComboBox.getSelectedItem();
                        InstrumentToRent instrumentToRent = getInstrumentToRentByName(name);
                        instrumentToRent.toRentOut(CustomersNameRentTF.getText(), CustomersPhoneRentTF.getText(), Integer.parseInt(PANNoRentTF.getText()), rentDate, returnDate, Integer.parseInt(rentingDaysTF.getText()));
                        JOptionPane.showMessageDialog(frame, InstrumentNameRent1TF.getText() + " has been rented to " + CustomersNameRentTF.getText());

                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(frame, "Enter valid Inputs");
                    }
                }
            }
        });

        clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                rentClearTF();
                yearsComboBox.setSelectedIndex(0);
                monthsComboBox.setSelectedIndex(0);
                daysComboBox.setSelectedIndex(0);
                yearComboBox.setSelectedIndex(0);
                monthComboBox.setSelectedIndex(0);
                dayComboBox.setSelectedIndex(0);
                scrollPane.setVisible(false);
                noResultLabel.setVisible(false);
                frame.revalidate();
            }
        });

        display.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String[] columns = {"Instrument name", "Charge Per Day", "Customer Name", "Phone No", "PAN NO", "Rent Date", "Return Date", "No. of Days Rented"};
                Object[][] data = new Object[instruments.size()][8];
                scrollPane.setVisible(true);

                int row = 0;
                int column = 0;
                boolean hasInstrumentToRentObject = false;
                DefaultTableModel tableModel = new DefaultTableModel();
                for (Instrument instrument : instruments) {
                    if (instrument instanceof InstrumentToRent) {
                        InstrumentToRent instrumentToRent = (InstrumentToRent) instrument;

                        data[row][column++] = instrumentToRent.getInstrumentName();
                        data[row][column++] = instrumentToRent.getChargePerDay();
                        data[row][column++] = instrumentToRent.getCustomerName();
                        data[row][column++] = instrumentToRent.getCustomerPhoneNumber();
                        data[row][column++] = instrumentToRent.getCustomerPAN();
                        data[row][column++] = instrumentToRent.getDateOfRent();
                        data[row][column++] = instrumentToRent.getDateOfReturn();
                        data[row][column++] = instrumentToRent.getNoOfDays();
                        column = 0;
                        row++;
                        hasInstrumentToRentObject = true;
                        instrumentToRent.display();
                    }
                }
                if (hasInstrumentToRentObject) {
                    tableModel.setDataVector(data, columns);
                    displayTable.setModel(tableModel);
                    noResultLabel.setVisible(false);
                } else {
                    noResultLabel.setVisible(true);
                    scrollPane.setVisible(false);
                }

                frame.revalidate();
            }
        });

        InstrumentNameRent2TF.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                try {
                    String name = InstrumentNameRent2TF.getText();
                    InstrumentToRent instrumentToRent = getInstrumentToRentByName(name);
                    if (instrumentToRent.getIsRented()) {
                        JOptionPane.showMessageDialog(frame, "Instrument Name : " + instrumentToRent.getInstrumentName() + "\n" + "Customer Name : " + instrumentToRent.getCustomerName() + "\n" + "Customer Phone : " + instrumentToRent.getCustomerPhoneNumber() + "\n" + "Customer PAN : " + instrumentToRent.getCustomerPAN() + "\n" + "Rent Date : " + instrumentToRent.getDateOfRent() + "\n" + "Return Date : " + instrumentToRent.getDateOfReturn() + "\n" + "Number of rented days :" + instrumentToRent.getNoOfDays());
                    }


                } catch (Exception ex) {

                }
            }

            @Override
            public void removeUpdate(DocumentEvent e) {

            }

            @Override
            public void changedUpdate(DocumentEvent e) {

            }
        });

        returnS.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String name = InstrumentNameRent2TF.getText();
                    InstrumentToRent instrumentToRent = getInstrumentToRentByName(name);
                    instrumentToRent.setCustomerName("");
                    instrumentToRent.setCustomerPhoneNumber("");
                    instrumentToRent.setCustomerPAN(0);
                    instrumentToRent.setDateOfRent("");
                    instrumentToRent.setDateOfReturn("");
                    instrumentToRent.setNoOfDays(0);


                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(frame, "Invalid values entered");

                }
            }
        });

        frame.add(panel);
        frame.setVisible(true);
    }

    public void instrumentToSell() {

        JPanel panel = new JPanel();
        panel.setSize(400, 400);
        panel.setLayout(new GridBagLayout());
        panel.setBorder(BorderFactory.createLineBorder(Color.black));
        GridBagConstraints gbc = new GridBagConstraints();

        JButton addSell = new JButton("Add");
        JButton displaySell = new JButton("Display");
        JButton clearSell = new JButton("Clear");
        JButton sellB = new JButton("Sell");

        JLabel SellH = new JLabel("Add instrument for sell");
        JLabel sell = new JLabel("Sell the instrument");
        Font font = new Font("serif", Font.BOLD, 18);

        JTable displayTable = new JTable();
        displayTable.setBackground(Color.CYAN);
        JScrollPane scrollPane = new JScrollPane(displayTable);
        scrollPane.setMinimumSize(new Dimension(400, 100));
        scrollPane.setVisible(false);

        JLabel SellResultLabel = new JLabel("No Result to display");
        SellResultLabel.setVisible(false);
        SellResultLabel.setForeground(Color.RED);

        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(0, 0, 8, 0);
        SellH.setFont(font);
        panel.add(SellH, gbc);

        gbc.gridy++;
        panel.add(new JLabel("Instrument Name:"), gbc);

        gbc.gridx++;
        panel.add(instrumentNameSellTF, gbc);

        gbc.gridx--;
        gbc.gridy++;
        panel.add(new JLabel("Price:"), gbc);

        gbc.gridx++;
        panel.add(priceTF, gbc);


        gbc.gridy++;
        panel.add(addSell, gbc);

        gbc.gridx = 0;
        gbc.gridy++;
        sell.setFont(font);
        panel.add(sell, gbc);

        gbc.gridx = 0;
        gbc.gridy++;
        panel.add(new JLabel("Instrument Name:"), gbc);

        gbc.gridx++;
        panel.add(InstrumentNameSellOutTF, gbc);

        gbc.gridx++;
        panel.add(new JLabel("Customer Name:"), gbc);

        gbc.gridx++;
        panel.add(customerNameSellTF, gbc);

        gbc.gridx = 0;
        gbc.gridy++;
        panel.add(new JLabel("Customer Phone:"), gbc);

        gbc.gridx++;
        panel.add(customersPhoneSellTF, gbc);

        gbc.gridx++;
        panel.add(new JLabel("Customer PAN NO:"), gbc);

        gbc.gridx++;
        panel.add(panNoSellTF, gbc);

        JLabel dateLabel = new JLabel("Date");
        String years[] = {"Select year", "2022", "2023", "2024", "2025", "2026"};
        String months[] = {"Select Month", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12"};
        String days[] = {"Select Day", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12",
                "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26",

                "27", "28", "29", "30", "31"};

        JComboBox yearsComboBoxSell = new JComboBox(years);
        JComboBox monthsComboBoxSell = new JComboBox(months);
        JComboBox daysComboBoxSell = new JComboBox(days);

        gbc.gridx = 0;
        gbc.gridy++;
        panel.add(new JLabel("Sell Date"), gbc);

        gbc.gridx++;
        panel.add(yearsComboBoxSell, gbc);

        gbc.gridx++;
        panel.add(monthsComboBoxSell, gbc);

        gbc.gridx++;
        panel.add(daysComboBoxSell, gbc);

        gbc.gridx = 0;
        gbc.gridy++;
        panel.add(new JLabel("Discount Percentage:"), gbc);

        gbc.gridx++;
        panel.add(DiscountPercentageTF, gbc);

        gbc.gridx++;
        panel.add(sellB, gbc);

        gbc.gridx = 0;
        gbc.gridy++;
        panel.add(displaySell, gbc);

        gbc.gridx++;
        panel.add(clearSell, gbc);

        gbc.gridy++;
        gbc.gridx = 0;
        panel.add(SellResultLabel, gbc);

        gbc.gridy++;
        gbc.gridwidth = 4;
        panel.add(scrollPane, gbc);

        InstrumentNameSellOutTF.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                try {
                    String name = InstrumentNameSellOutTF.getText();
                    InstrumentToSell instrumentToSell = getInstrumentToSellByName(name);
                    if (instrumentToSell != null) {
                        JOptionPane.showMessageDialog(frame, "Instrument Name : " + instrumentToSell.getInstrumentName() + "\n" + "Price : " + instrumentToSell.getPrice());
                    }
                } catch (Exception ex) {

                }
            }

            @Override
            public void removeUpdate(DocumentEvent e) {

            }

            @Override
            public void changedUpdate(DocumentEvent e) {

            }
        });

        addSell.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (instrumentNameSellTF.getText().isEmpty() || priceTF.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(frame, "Empty Text Field(s)");
                } else {
                    try {
                        InstrumentToSell instrumentToSell = new InstrumentToSell(instrumentNameSellTF.getText(), Integer.parseInt(priceTF.getText()));
                        instruments.add(instrumentToSell);
                        JOptionPane.showMessageDialog(frame, "Instrument " + instrumentNameSellTF.getText() + " Added for sale");
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(frame, "Enter valid Price");
                    }
                }

            }
        });

        sellB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (InstrumentNameSellOutTF.getText().isEmpty() || customerNameSellTF.getText().isEmpty() || customersPhoneSellTF.getText().isEmpty() || panNoSellTF.getText().isEmpty()
                        || yearsComboBoxSell.getSelectedIndex() == 0 || monthsComboBoxSell.getSelectedIndex() == 0 || daysComboBoxSell.getSelectedIndex() == 0 || DiscountPercentageTF.getText().isEmpty()) {

                    JOptionPane.showMessageDialog(frame, "Fill up all the fields");
                } else {
                    try {
                        String name = InstrumentNameSellOutTF.getText();
                        String sellDate = yearsComboBoxSell.getSelectedItem() + "-" + monthsComboBoxSell.getSelectedItem() + "-" + daysComboBoxSell.getSelectedItem();
                        InstrumentToSell instrumentToSell = getInstrumentToSellByName(name);
                        instrumentToSell.toSell(customerNameSellTF.getText(), customersPhoneSellTF.getText(), Integer.parseInt(panNoSellTF.getText()), sellDate, Integer.parseInt(DiscountPercentageTF.getText()));
                        instrumentToSell.setInstrumentName(name);
                        JOptionPane.showMessageDialog(frame, "Instrument " + InstrumentNameSellOutTF.getText() + " is sold");
                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(frame, "Enter valid Inputs");
                    }

                }
            }
        });

        displaySell.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String[] columns = {"Instrument name", "Price", "Customer Name", "Customer Phone", "Customer PAN", "Sell Date", "Discount%"};
                Object[][] data = new Object[instruments.size()][7];
                scrollPane.setVisible(true);

                int row = 0;
                int column = 0;
                boolean hasInstrumentToSellObject = false;
                DefaultTableModel tableModel = new DefaultTableModel();
                for (Instrument instrument : instruments) {
                    if (instrument instanceof InstrumentToSell) {
                        InstrumentToSell instrumentToSell = (InstrumentToSell) instrument;

                        data[row][column++] = instrumentToSell.getInstrumentName();
                        data[row][column++] = instrumentToSell.getPrice();
                        data[row][column++] = instrumentToSell.getCustomerName();
                        data[row][column++] = instrumentToSell.getCustomerPhoneNumber();
                        data[row][column++] = instrumentToSell.getCustomerPAN();
                        data[row][column++] = instrumentToSell.getSellDate();
                        data[row][column++] = instrumentToSell.getDiscountPercent();
                        column = 0;
                        row++;
                        hasInstrumentToSellObject = true;
                        instrumentToSell.display();
                    }
                }
                if (hasInstrumentToSellObject) {
                    tableModel.setDataVector(data, columns);
                    displayTable.setModel(tableModel);
                    SellResultLabel.setVisible(false);
                } else {
                    SellResultLabel.setVisible(true);
                    scrollPane.setVisible(false);
                }

                frame.revalidate();
            }
        });

        clearSell.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sellClearTF();
                yearsComboBoxSell.setSelectedIndex(0);
                monthsComboBoxSell.setSelectedIndex(0);
                daysComboBoxSell.setSelectedIndex(0);
                scrollPane.setVisible(false);
                SellResultLabel.setVisible(false);
                frame.revalidate();
            }
        });

        frame.add(panel);

    }

    public InstrumentToSell getInstrumentToSellByName(String name) {

        for (Instrument instrument : instruments) {
            if (instrument.getInstrumentName().equalsIgnoreCase(name) && instrument instanceof InstrumentToSell) {
                InstrumentToSell instrumentToSell = (InstrumentToSell) instrument;
                return instrumentToSell;
            }
        }
        return null;
    }

    public InstrumentToRent getInstrumentToRentByName(String name) {
        for (Instrument instrument : instruments) {
            if (instrument.getInstrumentName().equals(name) && instrument instanceof InstrumentToRent) {
                InstrumentToRent instrumentToRent = (InstrumentToRent) instrument;
                return instrumentToRent;

            }
        }
        return null;
    }

    public void rentClearTF() {
        InstrumentNameRentTF.setText("");
        ChargePerDayTF.setText("");
        InstrumentNameRent1TF.setText("");
        CustomersNameRentTF.setText("");
        PANNoRentTF.setText("");
        CustomersPhoneRentTF.setText("");
        rentingDaysTF.setText("");
        InstrumentNameRent2TF.setText("");

    }

    public void sellClearTF() {
        instrumentNameSellTF.setText("");
        priceTF.setText("");
        InstrumentNameSellOutTF.setText("");
        customerNameSellTF.setText("");
        customersPhoneSellTF.setText("");
        panNoSellTF.setText("");
        DiscountPercentageTF.setText("");

    }


    public String getInstrumentNameRentTF() {
        return InstrumentNameRentTF.getText();
    }

    public String getInstrumentNameSellTF() {
        return instrumentNameSellTF.getText();
    }

    public Integer getPriceTF() {
        try {
            return Integer.parseInt(priceTF.getText());
        } catch (NumberFormatException ex) {
            return null;
        }
    }

    public Integer getChargePerDayTF() {
        try {
            return Integer.parseInt(ChargePerDayTF.getText());
        } catch (NumberFormatException ex) {
            return null;
        }
    }


    public String getCustomersNameRentTF() {
        return CustomersNameRentTF.getName();
    }

    public String getCustomerNameSellTF() {
        return customerNameSellTF.getText();
    }



    public Integer getCustomersPhoneRentTF() {
        try {
            return Integer.parseInt(CustomersPhoneRentTF.getText());
        } catch (NumberFormatException ex) {
            return null;
        }
    }

    public Integer getCustomersPhoneSellTF() {
        try {
            return Integer.parseInt(customersPhoneSellTF.getText());
        } catch (NumberFormatException ex) {
            return null;
        }
    }

    public Integer getPANNoRentTF() {
        try {
            return Integer.parseInt(PANNoRentTF.getText());
        } catch (NumberFormatException ex) {
            return null;
        }
    }

    public Integer getPanNoSellTF() {
        try {
            return Integer.parseInt(panNoSellTF.getText());
        } catch (NumberFormatException ex) {
            return null;
        }
    }

    public Integer getDiscountPercentageTF() {
        try {
            return Integer.parseInt(DiscountPercentageTF.getText());
        } catch (NumberFormatException ex) {
            return null;
        }
    }

    public Integer getRentingDaysTF() {
        try {
            return Integer.parseInt(rentingDaysTF.getText());
        } catch (NumberFormatException ex) {
            return null;
        }
    }

    public String getInstrumentNameRent1TF() {
        return InstrumentNameRent1TF.getText();
    }

    public String getInstrumentNameRent2TF() {
        return InstrumentNameRent2TF.getText();
    }

    public String getInstrumentNameSellOutTF() {
        return InstrumentNameSellOutTF.getText();
    }

    public static void main(String[] args) {
        SarangiSansar myGridlayout = new SarangiSansar();
        myGridlayout.instrumentToRent();
        myGridlayout.instrumentToSell();
        myGridlayout.frame.setVisible(true);
    }
}
