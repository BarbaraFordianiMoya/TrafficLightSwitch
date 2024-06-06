
import javax.swing.JOptionPane;

public class TrafficLightSwitch {

    public static void main(String args[]) {
        int age = Integer.parseInt(JOptionPane.showInputDialog("Escolha um numero de 1 a 3"));
    switch (age) {
        case 1: System.out.println("O farol esta vermelho");
        break;
        case 2: System.out.println("O farol esta verde");
        break;
        case 3: System.out.println("O farol esta amarelo");
        break;
        default: System.out.println("Esse numero nao e valido");

       
    }
    }
}


