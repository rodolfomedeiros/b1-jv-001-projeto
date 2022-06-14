package presentation.frames.clientes;

import presentation.navigation.Frame;
import presentation.navigation.Navigator;

public class CadastrarClientePF extends Frame {
    private String nome;
    private String cpf;

    public CadastrarClientePF(String key, Navigator navigator) {
        super(key, navigator);
    }

    @Override
    public void render() {
        System.out.println("-- CADASTRAR CLIENTE PJ --");
        System.out.println();
        System.out.print("Nome: ");
        nome = scanner.nextLine();
        System.out.print("CPF: ");
        cpf = scanner.nextLine();


    }
}
