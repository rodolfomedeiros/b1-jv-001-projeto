package presentation.frames.clientes;

import java.util.ArrayList;
import java.util.List;

import presentation.navigation.Frame;
import presentation.navigation.Navigator;

public class CadastrarCliente extends Frame {
    private List<String> options = new ArrayList<>();

    public CadastrarCliente(String key, Navigator navigator) {
        super(key, navigator);
    }

    @Override
    public void setup() {
        options.add("1. Cadastrar cliente PF");
        options.add("2. Cadastrar cliente PJ");
        options.add("3. Voltar");
    }

    @Override
    public void render() {
        for (String option : options) {
            System.out.println(option);
        }
        System.out.println();

        System.out.print("Digite a opção desejada: ");

        int option = scanner.nextInt();
        this.scanner.nextLine();

        switch (option) {
            case 1:
                navigator.navigate("cadastrar-cliente-pf");
                break;
            case 2:
                navigator.navigate("cadastrar-cliente-pj");
                break;
            case 3:
                navigator.goBack();
                break;
            default:
                break;
        }
    }
}
