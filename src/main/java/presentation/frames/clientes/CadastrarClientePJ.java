package presentation.frames.clientes;

import presentation.navigation.Frame;
import presentation.navigation.Navigator;

public class CadastrarClientePJ extends Frame {
    private String nome;
    private String cnpj;

    public CadastrarClientePJ(String key, Navigator navigator) {
        super(key, navigator);
    }

    @Override
    public void render() {
        System.out.println("-- CADASTRAR CLIENTE PJ --");
        System.out.println();
        System.out.print("Nome: ");
        nome = scanner.nextLine();
        System.out.print("CNPJ: ");
        cnpj = scanner.nextLine();

        
    }
}
