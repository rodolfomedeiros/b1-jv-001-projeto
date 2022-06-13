package presentation.frames;

import java.util.ArrayList;
import java.util.List;

import presentation.navigation.Frame;
import presentation.navigation.Navigator;

public class Contas extends Frame {
    private List<String> options = new ArrayList<>();

    public Contas(String key, Navigator navigator) {
        super(key, navigator);
    }

    @Override
    public void setup() {
        options.add("1. Abrir conta");
        options.add("2. Listar contas");
        options.add("3. Acessar conta");
        options.add("4. Voltar");
    }

    @Override
    public void render() {
        for (String option : options) {
            System.out.println(option);
        }
        System.out.println();

        System.out.print("Digite a opção desejada: ");

        int option = this.scanner.nextInt();
        this.scanner.nextLine();

        switch (option) {
            case 1:
                navigator.navigate("abrir-conta");
                break;
            case 2:
                navigator.navigate("listar-contas");
                break;
            case 3:
                navigator.navigate("acessar-conta");
                break;
            case 4:
                navigator.goBack();
                break;
            default:
                break;
        }
    }
}
