# Java RMI String Operations GUI

A distributed Java application using **Remote Method Invocation (RMI)** with a **Swing GUI** for string operations.

## Features
- Convert string to **UPPERCASE**
- Convert string to **lowercase**
- Check if string is a **Palindrome**
- Clean GUI with buttons, labels, and dialog boxes

## Technologies Used
- **Java RMI** (Remote Method Invocation)
- **Java Swing** (JFrame, JPanel, JButton, JLabel)
- **Layout Managers** (BorderLayout, FlowLayout, GridLayout)
- **Event Handling** (External ActionListener class)
- **JOptionPane** (Input, Message, Confirm dialogs)

## Project Structure
| File | Purpose |
|------|---------|
| `RemoteMethod.java` | RMI Interface defining remote methods |
| `ConvertRemoteMethods.java` | Server-side implementation |
| `RmiServer.java` | Creates RMI registry on port 8006 |
| `RmiClientGui.java` | Swing GUI client application |
| `Handler.java` | External event handler for button clicks |

## How to Run

### 1. Compile all files
    ```bash
           javac rmiguiapplication/*.java
###2. Start the RMI Server (keep this terminal open)
      
            ```bash
          java rmiguiapplication.RmiServer
           
  3. Start the GUI Client (open a new terminal)

     ```bash
      java rmiguiapplication.RmiClientGui

Author
Nitish Kumar KC
