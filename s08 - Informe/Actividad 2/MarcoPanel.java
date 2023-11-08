import java.awt.GridLayout;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
public class MarcoPanel extends JFrame
{
private final JPanel panelBotones; 
private final JButton[] botones;

public MarcoPanel()
{
super("Demostracion de Panel");
botones = new JButton[2];
panelBotones = new JPanel();
panelBotones.setLayout(new GridLayout(1, botones.length));

for (int cuenta = 0; cuenta < botones.length; cuenta++)
{
botones[cuenta] = new JButton("Boton " + (cuenta + 1));
panelBotones.add(botones[cuenta]); 
}
botones[0].setText("Jose  Condori");
botones[1].setText("Rodman Velazco");
add(panelBotones, BorderLayout.SOUTH); 
}
}