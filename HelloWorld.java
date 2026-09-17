import javax.swing.JOptionPane;

public class HelloWorld {

    public static void main(String[] args){
        
        /*
        * 1ª Opção
        * Utilizando interface gráfica
        */
        JOptionPane.showMessageDialog(
            null,
            "Hello World!",
            "Minha primeira janela",
            JOptionPane.ERROR_MESSAGE);

        /*
        * 2ª Opção
        * Usando a saída padrão (texto no terminal)
        */
        System.out.println("Seu 'Hello World' funcionou!");

    }
}
