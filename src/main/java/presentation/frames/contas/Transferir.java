package presentation.frames.contas;

import java.math.BigDecimal;

import presentation.navigation.Frame;
import presentation.navigation.Navigator;

public class Transferir extends Frame {
    private BigDecimal valor;
    private String codigoContaDestino;

    public Transferir(String key, Navigator navigator) {
        super(key, navigator);
    }

    @Override
    public void render() {
        System.out.print("Digite o valor a ser transferido: ");
        valor = scanner.nextBigDecimal();
        scanner.nextLine();
        
        System.out.println("Digite o código da conta destino: ");
        codigoContaDestino = scanner.nextLine();

        // TODO: implementar o lógica de transferência

        System.out.println("Transferência realizada com sucesso!");
        System.out.println("Aperte ENTER para continuar...");

        if(this.scanner.hasNextLine()) {
            this.scanner.nextLine();
            navigator.goBack();
        }
    }
    
}
