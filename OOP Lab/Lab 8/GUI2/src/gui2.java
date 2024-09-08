package GUI2;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.PublicKey;
import java.util.ArrayList;
class Student{
    String name;
    int ID;
    double cgpa;

    public Student(String name, int ID, double cgpa)
    {
        this.name = name;
        this.ID = ID;
        this.cgpa = cgpa;
    }
}
public class gui2 extends JFrame{
    //Adding Additional Functions
    JLabel jLabel = new JLabel("id");
    JTextField jTextField = new JTextField("Enter Your ID");
    JLabel jLabel1 = new JLabel("Name");
    JTextField jTextField1 = new JTextField("User name will be shown here");
    JLabel jLabel2 = new JLabel("CGPA");
    JTextField jTextField2 = new JTextField("User cgpa will be shown here");
    JButton jButton = new JButton("Click");
    JTextField jTextField3 = new JTextField("0");

    ArrayList<Student> student = new ArrayList<>();

    gui2() {
        JFrame jFrame = new JFrame();
        setVisible(true);
        setSize(500,300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        //Adding Additional Functions
        setLayout(null);
        jLabel.setBounds(10,10,50,20);
        jTextField.setBounds(50,10,200, 20);
        jLabel1.setBounds(10,30,120,20);
        jTextField1.setBounds(50,30,200, 20);
        jLabel2.setBounds(10,60,120,20);
        jTextField2.setBounds(50,60,200, 20);
        jButton.setBounds(50,100,70,20);
        arrayOfStudent(student);
        add(jLabel1);
        add(jLabel2);
        add(jLabel);
        add(jButton);
        add(jTextField);
        add(jTextField1);
        add(jTextField2);
        add(jTextField3);
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
//                System.out.println("Button Clicked");
//                String value = jTextField.getText();
//                System.out.println(value);
//                int i = Integer.parseInt(value);
//                i++;
//                jTextField.setText(i+"");

//                jTextField.setText(student.get(0).name);
                String idStr = jTextField.getText();
                int ID = Integer.parseInt(idStr);

                for(Student st : student)
                {
                    if(st.ID == ID)
                    {
                        jTextField1.setText(st.name);
                        jTextField2.setText(st.cgpa+"");
                    }
                    else {
                        System.out.println("Enter a valid ID");
                    }
                }
            }
        });
    }

    ArrayList<Student> arrayOfStudent(ArrayList<Student> student)
    {
        student.add(new Student("Zarif", 123, 3.00));
        student.add(new Student("Adham", 456, 3.10));
        student.add(new Student("Seam", 789, 3.50));
        return student;
    }
}
