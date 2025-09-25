
// import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
// import java.awt.event.*;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class login {

    login() {
        main2();
    }

    // ------- Frame & Panel & Button 1 -- >
    JFrame frame = new JFrame("Login Form");
    JPanel panel = new JPanel();
    JPanel panel_data = new JPanel();
    JButton button_login = new JButton("Login");
    Font font_1 = new Font("Century gothic", Font.PLAIN, 20);
    Font font_Loing_button = new Font("Century gothic", Font.PLAIN, 18);

    // Panel Elements of Username -- >
    JLabel label_User = new JLabel("Username");
    JTextField textField_User = new JTextField("Username");

    // Panel Elements of Password -- >
    JLabel label_passeord = new JLabel("Password");
    JTextField textField_password = new JTextField("Password");
    // ------- Frame & Panel & Button 1 END -- >

    // ------- Frame & Panel & Button 2 -- >
    JFrame frame2 = new JFrame("Password Conformation");
    JPanel frame2_Panel = new JPanel();

    JLabel label_Confirm = new JLabel("COMFIRMATION");
    JTextField textField_Confirm = new JTextField("Password");

    JButton button_Confirm = new JButton("CONfirm");

    Font frame2_font_Loing_button = new Font("Century gothic", Font.PLAIN, 20);
      Font frame2_font_1 = new Font("Century gothic", Font.BOLD, 25);

      ImageIcon image = new ImageIcon("png4.png");
    JLabel label_image =  new JLabel(image);

    { label_image.setIcon(image);
        label_image.setBounds(0, 0, 300, 300);
        panel.add(label_image);
    }
    // String Password & Username ---->
    String username, password;

    void main1() {
        // Set bounds & hight & width -- >
        frame.setSize(650, 400);
        panel.setBounds(frame.getWidth() / 2, 0, frame.getWidth() / 2, frame.getHeight());

        label_User.setBounds(20, 0, 100, 30);
        textField_User.setBounds(20, 30, 200, 30);

        label_passeord.setBounds(20, 90, 100, 30);
        textField_password.setBounds(20, 120, 200, 30);

        button_login.setBounds(20, 175, 100, 30);

        panel_data.setBounds(0, 0, panel.getWidth(), 220);
        panel_data.setBounds(0, ((panel.getHeight() - panel_data.getHeight()) / 2) - 25, panel.getWidth(), 220);

        System.out.println(panel.getHeight());
        System.out.println(panel_data.getHeight());
        System.out.println(panel.getHeight() - panel_data.getHeight());
        System.out.println(((panel.getHeight() - panel_data.getHeight()) / 2));

        // Add Freame Elements -- >
        frame.add(panel);
        panel.add(panel_data);

        label_User.setFont(font_1);
        label_passeord.setFont(font_1);

        panel_data.add(label_User);
        panel_data.add(textField_User);

        panel_data.add(label_passeord);
        panel_data.add(textField_password);

        panel_data.add(button_login);
        button_login.setFont(font_Loing_button);

        // Color & Background_Color -- >
        frame.getContentPane().setBackground(new Color(0x123456));
        panel.setBackground(new Color(211, 230, 236));
        panel_data.setBackground(new Color(211, 230, 236));

        button_login.setBackground(new Color(0x123456));
        button_login.setForeground(Color.white);
        button_login.setBorderPainted(false);

        textField_User.setBorder(BorderFactory.createEmptyBorder());
        textField_password.setBorder(BorderFactory.createEmptyBorder());

        // String username, password;

        // Action Listener Event -- >

        textField_User.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                // JOptionPane.showMessageDialog(null, "Welcome in userText");
                textField_User.setText("");
                textField_password.setText("");
            }
        });
        textField_password.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                show();
            }
        });

        button_login.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,
                        "Welcome  " + textField_User.getText() + "  " + textField_password.getText());
                frame2.setVisible(true);
                frame.setVisible(false);
            }
        });

        // Set Frame Size and endFunction -- >
        panel_data.setLayout(null);
        panel.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }

    void main2() {

        // Set Color & Backgorund Color --->
        frame2.getContentPane().setBackground(new Color(0x123456));
        frame2_Panel.setBackground(new Color(211, 230, 236));
        button_Confirm.setBackground(new Color(0x123456));
        button_Confirm.setForeground(Color.white);

        // Set bounds & hight & width -- >
        frame2.setSize(650, 400);
        frame2_Panel.setBounds(0, 0, 450, 200);
        frame2_Panel.setBounds(((frame2.getHeight() - frame2_Panel.getHeight()) / 2) + 10,
                ((frame2.getHeight() - frame2_Panel.getHeight()) / 2) - 25, 450, 200);

        label_Confirm.setBounds((frame2_Panel.getWidth() - 150) / 2, 10, 200, 30);
        textField_Confirm.setBounds((frame2_Panel.getWidth() - 150) / 2, 70, 200, 30);

        button_Confirm.setBounds((frame2_Panel.getWidth() - 150) / 2, frame2_Panel.getHeight() - 40, 200, 30);
        // Add Freame Elements -- >

        frame2.add(frame2_Panel);
        label_Confirm.setFont(frame2_font_1);

        frame2_Panel.add(label_Confirm);
        frame2_Panel.add(textField_Confirm);
        frame2_Panel.add(button_Confirm);
        button_Confirm.setFont(frame2_font_Loing_button);

        // Action Listener Event -- >
        button_Confirm.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent c){
                if(textField_password.getText().equals(textField_Confirm.getText())){
                    JOptionPane.showMessageDialog(null, "Password Matched");
                }
                else{
                    JOptionPane.showMessageDialog(null, "Password Not Matched");
                }
            }
        });

        // Set Frame Size and endFunction -- >
        frame2_Panel.setLayout(null);

        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame2.setLayout(null);
        frame2.setLocationRelativeTo(null);
        frame2.setVisible(true);

    }

    void show() {
        username = textField_User.getText();
        password = textField_password.getText();
        System.out.println("Username: " + username + " Password: " + password);
    }

    public static void main(String[] args) {
        login obj = new login();
        obj.main1();
    }
}