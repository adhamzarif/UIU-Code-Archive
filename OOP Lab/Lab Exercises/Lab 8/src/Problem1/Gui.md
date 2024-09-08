
### Import Statements

```java
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
```

- **`import javax.swing.*;`**: Imports the Swing components such as `JFrame`, `JLabel`, `JButton`, and `JTextField`. Swing is a part of Java's standard library used for creating graphical user interfaces (GUIs).
- **`import java.awt.event.ActionEvent;`** and **`import java.awt.event.ActionListener;`**: Imports the event handling classes. `ActionEvent` represents an action event (like clicking a button), and `ActionListener` is an interface that listens for such events.

### Class Declaration

```java
public class Gui extends JFrame {
```

- **`public class Gui`**: Defines a public class named `Gui`. In Java, classes are the fundamental building blocks of the code.
- **`extends JFrame`**: Indicates that `Gui` is a subclass of `JFrame`. `JFrame` is a top-level container that represents a window in Swing.

### Instance Variables

```java
JLabel jLabel = new JLabel("Count");
JButton jButton = new JButton("Click");
JButton jButton1 = new JButton("Reset");
JTextField jTextField = new JTextField("0");
JTextField jTextField1 = new JTextField("0");
```

- **`JLabel jLabel`**: A label displaying the text "Count".
- **`JButton jButton`**: A button labeled "Click" that will be used to increment a value.
- **`JButton jButton1`**: A button labeled "Reset" that will be used to reset the text fields.
- **`JTextField jTextField`** and **`JTextField jTextField1`**: Text fields for displaying and modifying text. They are initialized with the value "0".

### Constructor

```java
Gui() {
    setVisible(true);
    setSize(500, 300); // declaring frame size
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // the program will get close when we click the exit button
    setLocationRelativeTo(null); // to see the frame in the front
```

- **`Gui()`**: The constructor for the `Gui` class, which is executed when an instance of `Gui` is created.
- **`setVisible(true);`**: Makes the window visible.
- **`setSize(500, 300);`**: Sets the size of the window to 500 pixels wide and 300 pixels tall.
- **`setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);`**: Ensures that the application terminates when the window is closed.
- **`setLocationRelativeTo(null);`**: Centers the window on the screen.

### Layout and Component Placement

```java
setLayout(null);
jLabel.setBounds(10, 5, 50, 50);
jButton.setBounds(30, 50, 70, 20);
jButton1.setBounds(200, 10, 90, 30);
jTextField.setBounds(50, 10, 80, 30);
```

- **`setLayout(null);`**: Sets the layout manager to `null`, allowing for absolute positioning of components.
- **`setBounds(x, y, width, height);`**: Positions and sizes each component using coordinates `(x, y)` and dimensions `(width, height)`.

### Adding Components to the Frame

```java
add(jLabel);
add(jButton);
add(jButton1);
add(jTextField);
add(jTextField1);
```

- **`add(component);`**: Adds each component to the frame so they are displayed.

### Action Listeners

#### For the "Click" Button

```java
jButton.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        String value = jTextField.getText();
        int i = Integer.parseInt(value);
        i++;
        jTextField.setText(i + "");
    }
});
```

- **`addActionListener(new ActionListener() { ... });`**: Registers an action listener for the "Click" button. This listener performs an action when the button is clicked.
- **`actionPerformed(ActionEvent e)`**: This method is called when the button is clicked.
- **`jTextField.getText()`**: Retrieves the current text from `jTextField`.
- **`Integer.parseInt(value)`**: Converts the text from the text field into an integer.
- **`i++`**: Increments the integer value by 1.
- **`jTextField.setText(i + "")`**: Sets the updated integer value back to `jTextField` as a string.

#### For the "Reset" Button

```java
jButton1.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        jTextField.setText("0");
        jTextField1.setText("0");
    }
});
```

- **`addActionListener(new ActionListener() { ... });`**: Registers an action listener for the "Reset" button.
- **`actionPerformed(ActionEvent e)`**: This method is called when the button is clicked.
- **`jTextField.setText("0")`** and **`jTextField1.setText("0")`**: Sets both text fields to "0", effectively resetting them.

### Summary

- The `Gui` class extends `JFrame` to create a window with a simple layout.
- It contains a label, two buttons, and two text fields.
- Clicking the "Click" button increments the number in the first text field.
- Clicking the "Reset" button sets both text fields to "0".

By organizing components and their respective actions in this way, you create an interactive GUI where users can manipulate the values and reset them as needed.