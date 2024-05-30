package homeassignment3ashleigh;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 * @author Ashleigh Herman
 * Lecturer: Dr. Tatiana Myllari
 * COMP305 Home Assignment 3
 */
public class HomeAssignment3Ashleigh {

    //Creation of panel with test field components.
    public JPanel createPanel(){
        JPanel textPanel = new JPanel();
        textPanel.setLayout(new GridBagLayout());
        GridBagConstraints gridBag = new GridBagConstraints();
        gridBag.fill = GridBagConstraints.HORIZONTAL ;
        
        
        // Declaration of variables
        JLabel nameLabel = new JLabel("Username");
        JLabel passwordLabel = new JLabel("Password");
        ImageIcon userIcon = new ImageIcon("user.png");
        ImageIcon passwordIcon = new ImageIcon("password.png");
        
        //Text fields(15 is the parameter of name length)
        JTextField nameField = new JTextField(15);
        
        //Password fields (15 is the parameter of password length)
        JPasswordField passwordField = new JPasswordField(15);
        
        //Create button for login
        JButton loginButton = new JButton("Login");
        
        //add action listener for text field
        nameField.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e){
              passwordField.requestFocus();
          }
        });
        //add action listener for password field
        passwordField.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e){
              nameField.requestFocus();
          }
        });
        
        //mnemonics
        nameLabel.setDisplayedMnemonic('U');
        nameLabel.setLabelFor(nameField);
        
        
        passwordLabel.setDisplayedMnemonic('P');
        passwordLabel.setLabelFor(passwordField);
        
        //method to show the password
        JButton showPasswordButton = new JButton("Show password");
        
        //Action listener for show password
        showPasswordButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String password = new String(passwordField.getPassword());
                passwordField.setEchoChar((char) 0);
                passwordField.setText(password);
            }
        });
        
        //Tooltips
     
        nameLabel.setToolTipText("Username");
        
        passwordLabel.setToolTipText("Password");
       
        // Action listener for login button
        loginButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String userName = nameField.getText();
                String userPassword = new String(passwordField.getPassword());

                if (userName.equals("admin") && userPassword.equals("password")){
                    JOptionPane.showMessageDialog(null, 
                            "Username and Password are correct");

                    // code for assignment 3
                    createFrame();
                } else {
                    JOptionPane.showMessageDialog(null, 
                            "Incorrect Username or Password");
                }
                // end of if statement
            }
        });

        // Add components to panel

        // Name and name field
        gridBag.insets = new Insets(10, 10, 10, 10);
        gridBag.gridx = 0;
        gridBag.gridy = 0;
        textPanel.add(nameLabel, gridBag);
        nameLabel.setIcon(userIcon);

        gridBag.gridx = 2;
        gridBag.gridy = 0;
        gridBag.gridwidth = 2;
        textPanel.add(nameField, gridBag);

        // Password and password field
        gridBag.gridx = 0;
        gridBag.gridy = 1;
        textPanel.add(passwordLabel, gridBag);
        passwordLabel.setIcon(passwordIcon);

        gridBag.gridx = 2;
        gridBag.gridy = 1;
        gridBag.gridwidth = 2;
        textPanel.add(passwordField, gridBag);

        // Login button
        gridBag.gridx = 0;
        gridBag.gridy = 2;
        textPanel.add(loginButton, gridBag);
        
        // Show password
        gridBag.gridx = 1;
        gridBag.gridy = 2;
        textPanel.add(showPasswordButton, gridBag);

        return textPanel;
    }

    // Method to create the frame for assignment 3
    public void createFrame() {
        JFrame newFrame = new JFrame("Home Assignment 3 - Ashleigh Herman");
        newFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
        // Creating the main panel
        JPanel panel0 = new JPanel();
        panel0.setLayout(new GridBagLayout());
        GridBagConstraints gridBag = new GridBagConstraints();
        gridBag.fill = GridBagConstraints.BOTH;

        // Creating panel1 for input components
        JPanel panel1 = new JPanel();
        panel1.setLayout(new GridBagLayout());
        
        // Creating labels for input fields with icons
        JLabel firstNameLabel = createIconLabel("First Name:", "name.png");
        JLabel lastNameLabel = createIconLabel("Last Name:", "name.png");
        JLabel sexLabel = createIconLabel("Sex:", "sex.png");
        JLabel citizenshipLabel = createIconLabel("Citizenship:", "citizen.png");
        JLabel placeOfBirthLabel = createIconLabel("Place of Birth:", "birth.png");
        JLabel idLabel = createIconLabel("ID:", "id.png");
        JLabel mobileLabel = createIconLabel("Mobile:", "mobile.png");

        // Creating text fields for input
        JTextField firstNameField = new JTextField(15);
        JTextField lastNameField = new JTextField(15);
        JTextField placeOfBirthField = new JTextField(15);
        JTextField idField = new JTextField(15);
        JTextField mobileField = new JTextField(15);

        // Creating combo boxes for input
        String[] sexOptions = { "Male", "Female", "Other" };
        JComboBox<String> sexComboBox = new JComboBox<>(sexOptions);

        String[] citizenshipOptions = { "Grenada", "Trinidad", "St. Vincent",
            "St. Lucia", "Barbados" };
        JComboBox<String> citizenshipComboBox = new JComboBox<>
        (citizenshipOptions);

        // Adding labels and input fields to panel1
        gridBag.insets = new Insets(10, 10, 10, 10);

        gridBag.gridx = 0;
        gridBag.gridy = 0;
        panel1.add(firstNameLabel, gridBag);

        gridBag.gridx = 1;
        gridBag.gridy = 0;
        panel1.add(firstNameField, gridBag);

        gridBag.gridx = 0;
        gridBag.gridy = 1;
        panel1.add(lastNameLabel, gridBag);

        gridBag.gridx = 1;
        gridBag.gridy = 1;
        panel1.add(lastNameField, gridBag);

        gridBag.gridx = 0;
        gridBag.gridy = 2;
        panel1.add(sexLabel, gridBag);

        gridBag.gridx = 1;
        gridBag.gridy = 2;
        panel1.add(sexComboBox, gridBag);

        gridBag.gridx = 0;
        gridBag.gridy = 3;
        panel1.add(citizenshipLabel, gridBag);

        gridBag.gridx = 1;
        gridBag.gridy = 3;
        panel1.add(citizenshipComboBox, gridBag);

        gridBag.gridx = 0;
        gridBag.gridy = 4;
        panel1.add(placeOfBirthLabel, gridBag);

        gridBag.gridx = 1;
        gridBag.gridy = 4;
        panel1.add(placeOfBirthField, gridBag);

        gridBag.gridx = 0;
        gridBag.gridy = 5;
        panel1.add(idLabel, gridBag);

        gridBag.gridx = 1;
        gridBag.gridy = 5;
        panel1.add(idField, gridBag);

        gridBag.gridx = 0;
        gridBag.gridy = 6;
        panel1.add(mobileLabel, gridBag);

        gridBag.gridx = 1;
        gridBag.gridy = 6;
        panel1.add(mobileField, gridBag);

        // Creating panel2 for output
        JPanel panel2 = new JPanel();
        panel2.setLayout(new GridBagLayout());

        // Creating scroll pane
        JTextArea outputArea = new JTextArea(10, 30);
        JScrollPane scrollPane = new JScrollPane(outputArea);

        // Adding scroll pane to panel2
        gridBag.gridx = 0;
        gridBag.gridy = 0;
        panel2.add(scrollPane, gridBag);

        // Creating submit button
        JButton submitButton = new JButton("Submit");
        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String firstName = firstNameField.getText();
                String lastName = lastNameField.getText();
                String sex = (String) sexComboBox.getSelectedItem();
                String citizenship = (String) 
                        citizenshipComboBox.getSelectedItem();
                String placeOfBirth = placeOfBirthField.getText();
                String id = idField.getText();
                String mobile = mobileField.getText();

                // Check if all fields are filled
                if (firstName.isEmpty() || lastName.isEmpty() || 
                        placeOfBirth.isEmpty() || id.isEmpty()
                        || mobile.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please fill in all "
                            + "fields");
                } else {
                    // Add the information to the output area
                    outputArea.append("First Name: " + firstName + "\n");
                    outputArea.append("Last Name: " + lastName + "\n");
                    outputArea.append("Sex: " + sex + "\n");
                    outputArea.append("Citizenship: " + citizenship + "\n");
                    outputArea.append("Place of Birth: " + placeOfBirth + "\n");
                    outputArea.append("ID: " + id + "\n");
                    outputArea.append("Mobile: " + mobile + "\n");

                    // Clear input fields
                    firstNameField.setText("");
                    lastNameField.setText("");
                    sexComboBox.setSelectedIndex(0);
                    citizenshipComboBox.setSelectedIndex(0);
                    placeOfBirthField.setText("");
                    idField.setText("");
                    mobileField.setText("");
                }
            }
        });

        // Creating exit button
        JButton exitButton = new JButton("Exit");
        exitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Goodbye!");
                System.exit(0);
            }
        });

        // Adding components to panel0
        gridBag.insets = new Insets(10, 10, 10, 10);

        gridBag.gridx = 0;
        gridBag.gridy = 0;
        panel0.add(panel1, gridBag);

        gridBag.gridx = 1;
        gridBag.gridy = 0;
        panel0.add(panel2, gridBag);

        gridBag.gridx = 1;
        gridBag.gridy = 2;
        panel0.add(submitButton, gridBag);

        gridBag.gridx = 1;
        gridBag.gridy = 1;
        panel0.add(exitButton, gridBag);

        // Adding panel0 to frame
        newFrame.add(panel0);

        newFrame.setSize(800, 600);
        newFrame.setVisible(true);
    }
    
    private JLabel createIconLabel(String text, String iconPath) {
        JLabel label = new JLabel(text);
        ImageIcon icon = new ImageIcon(iconPath);
        label.setIcon(icon);
        return label;
    }

    public static void main(String[] args) {
        // Create JFrame
        
        JFrame ashFrame = new JFrame("Home Assignment 3"
                + " - Ashleigh Herman");
        ashFrame.setDefaultCloseOperation(ashFrame.EXIT_ON_CLOSE);
        //set size of the Frame, and set Frame to be visible
        
        
        
        HomeAssignment3Ashleigh myCode = new HomeAssignment3Ashleigh();
        JPanel panel1 = myCode.createPanel();
        ashFrame.add(panel1);
        
        ashFrame.setSize(600, 400);
        ashFrame.setVisible(true);
    }//end of main class
    
}