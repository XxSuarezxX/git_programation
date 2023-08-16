package view;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class View  extends JFrame{
    private JTextField rowsField;
    private  JTextField columnsField;
    private JButton transpuestaButton;
    private JButton matrixButton;

    public View(){
        setTitle("matriz transpuesta");
        setSize(150, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        rowsField = new JTextField(10);
        columnsField = new JTextField(10);
        transpuestaButton = new JButton("generar transpuesta:");
        matrixButton = new JButton("generar matriz");

        JPanel panel = new JPanel();


        panel.add(new JLabel("filas:"));
        panel.add(rowsField);
        panel.add(new JLabel("columnas:"));
        panel.add(columnsField);
        panel.add(transpuestaButton);
        panel.add(matrixButton);

        //personalizacion del boton de generar transpuesta.
        transpuestaButton.setLocation(500, 100);
        transpuestaButton.setSize(200, 35);
        add(transpuestaButton);

        //personalizacion del boton de generar matriz.
        matrixButton.setLocation(100, 100);
        matrixButton.setSize(200, 35);
        add(matrixButton);

        add(panel);
    }

    public int getRowsField(){
        return Integer.parseInt(rowsField.getText());
    }

    public int getColumnsField(){
        return Integer.parseInt(columnsField.getText());
    }


    public void transpuestaListener(ActionListener listener){
        transpuestaButton.addActionListener(listener);
    }
}