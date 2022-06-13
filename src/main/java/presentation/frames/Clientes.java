package presentation.frames;

import java.util.ArrayList;
import java.util.List;

import presentation.navigation.Frame;
import presentation.navigation.Navigator;

public class Clientes extends Frame {
    private List<String> options = new ArrayList<>();

    public Clientes(String key, Navigator navigator) {
        super(key, navigator);
    }

    @Override
    public void setup() {
        options.add("1. Cadastrar cliente");
        options.add("2. Listar clientes");
        options.add("3. Voltar");
    }

    @Override
    public void render() {
        for (String option : options) {
            System.out.println(option);
        }
        System.out.println();

        System.out.print("Digite a opção desejada: ");

        int option = this.scanner.nextInt();
        scanner.nextLine();

        switch (option) {
            case 1:
                navigator.navigate("cadastrar-cliente");
                break;
            case 2:
                navigator.navigate("listar-clientes");
                break;
            case 3:
                navigator.goBack();
                break;
            default:
                break;
        }
    }
    
}
