import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Calculadora implements ActionListener{

    private JFrame janela;
    private JPanel painel;

    private JLabel lblTitulo;
    private JLabel lblNum1;
    private JLabel lblNum2;
    private JLabel lblResultado;

    private JTextField txtNum1;
    private JTextField txtNum2;

    private JButton btnSomar;
    private JButton btnDividir;

    public Calculadora()
    {
        janela = new JFrame();

        painel = new JPanel();
        painel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        painel.setLayout(new GridLayout(0,1));

        //componentes da tela    
        lblTitulo = new JLabel("Calculadora");
        lblTitulo.setFont(new Font("Verdana", Font.BOLD, 20));
        painel.add(lblTitulo);

        lblNum1 = new JLabel("Num1:");
        painel.add(lblNum1);

        txtNum1 = new JTextField("0");
        painel.add(txtNum1);

        lblNum2 = new JLabel("Num2:");
        painel.add(lblNum2);

        txtNum2 = new JTextField("0");
        painel.add(txtNum2);

        btnSomar = new JButton("Somar");
        btnSomar.addActionListener(this);
        
        btnDividir = new JButton("Dividir");
        btnDividir.addActionListener(this);
        
        painel.add(btnSomar);
        painel.add(btnDividir);

        lblResultado = new JLabel("Resultado = ");
        lblResultado.setFont(new Font("Verdana", Font.BOLD, 18));
        lblResultado.setForeground(Color.RED);
        painel.add(lblResultado);


        janela.add(painel, BorderLayout.CENTER);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setTitle("Tela1 - Calculadora");
        janela.setSize(300,300);
        janela.pack();
        janela.setVisible(true);



    }

    public static void main(String[] args) {
        new Calculadora();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Matematica mat = new Matematica();

        try {

            Integer num1 =  Integer.parseInt( txtNum1.getText() );
            Integer num2 =  Integer.parseInt( txtNum2.getText() );
            
            if(e.getActionCommand().equalsIgnoreCase("dividir"))
                lblResultado.setText("Resultado = " + mat.dividir(num1, num2));
            else
                lblResultado.setText("Resultado = " + mat.somar(num1, num2));
                
        } catch (NumberFormatException e1) {
            lblResultado.setText("Digite apenas números");
            System.out.println(e1.getMessage());
            
        } catch(Exception e2)
        {
            System.out.println(e2.getMessage());
        }

    }
}