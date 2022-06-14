package presentation.frames.contas;

import java.util.ArrayList;
import java.util.List;

import presentation.navigation.Frame;
import presentation.navigation.Navigator;

public class AbrirConta extends Frame {
    private List<String> options = new ArrayList<>();

    public AbrirConta(String key, Navigator navigator) {
        super(key, navigator);
    }

    @Override
    public void render() {
        options.add("1. Abrir conta poupança");
        options.add("2. Abrir conta corrente");
        options.add("3. Abrir conta investimento");
        options.add("4. Voltar");
        
        for (String option : options) {
            System.out.println(option);
        }
        System.out.println();

        System.out.print("Digite a opção desejada: ");

        int option = scanner.nextInt();
        this.scanner.nextLine();

        switch (option) {
            case 1:
                navigator.navigate("abrir-conta-poupanca");
                break;
            case 2:
                navigator.navigate("abrir-conta-corrente");
                break;
            case 3:
                navigator.navigate("abrir-conta-investimento");
                break;
            case 4:
                navigator.goBack();
                break;
            default:
                break;
        }
    }
}
