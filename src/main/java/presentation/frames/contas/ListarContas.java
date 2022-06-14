package presentation.frames.contas;

import presentation.navigation.Frame;
import presentation.navigation.Navigator;

public class ListarContas extends Frame {

    public ListarContas(String key, Navigator navigator) {
        super(key, navigator);
    }

    @Override
    public void render() {
        printFrameTitle("LISTAR CONTAS");
        
        // TODO: implementar a listagem de contas

        System.out.println("Aperte ENTER para continuar...");

        if(this.scanner.hasNextLine()) {
            this.scanner.nextLine();
            navigator.goBack();
        }
    }
}
