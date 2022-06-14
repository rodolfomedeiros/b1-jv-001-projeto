package presentation.frames;

import java.util.ArrayList;
import java.util.List;

import presentation.navigation.Frame;
import presentation.navigation.Navigator;

public class Home extends Frame {
    private List<String> options = new ArrayList<>();

    public Home(String key, Navigator navigator) {
        super(key, navigator);
    }

    @Override
    public void render() throws Exception {
        options.add("1. Clientes");
        options.add("2. Contas");
        options.add("3. Encerrar");
        
        for (String option : options) {
            System.out.println(option);
        }
        System.out.println();

        System.out.print("Digite a opção desejada: ");

        int option = this.scanner.nextInt();
        this.scanner.nextLine();

        switch (option) {
            case 1:
                navigator.navigate("clientes");
                break;
            case 2:
                navigator.navigate("contas");
                break;
            case 3:
                System.exit(0);
                break;
            default:
                throw new Exception("Opção invalida!");
        }
    }
}
