package presentation.frames.contas;

import java.util.ArrayList;
import java.util.List;

import presentation.navigation.Frame;
import presentation.navigation.Navigator;

public class Conta extends Frame {
    private List<String> options = new ArrayList<>();

    public Conta(String key, Navigator navigator) {
        super(key, navigator);
    }

    @Override
    public void render() {
        options.add("1. Voltar");

        for (String option : options) {
            System.out.println(option);
        }

        System.out.println();
        System.out.print("Digite a opção desejada: ");

        int option = this.scanner.nextInt();
        scanner.nextLine();

        switch (option) {
            case 1:
                navigator.goBack();
                break;
            default:
                break;
        }
    }
    
}
