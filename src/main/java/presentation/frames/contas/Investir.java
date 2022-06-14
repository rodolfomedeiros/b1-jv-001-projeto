package presentation.frames.contas;

import java.math.BigDecimal;
import java.util.HashMap;

import presentation.navigation.Frame;
import presentation.navigation.Navigator;

public class Investir extends Frame {
    private BigDecimal valor;

    public Investir(String key, Navigator navigator, HashMap<String, Object> params) {
        super(key, navigator, params);
    }

    @Override
    public void render() throws Exception {
        printFrameTitle("SACAR");
        System.out.print("Digite o valor a ser investido: ");
        valor = scanner.nextBigDecimal();
        scanner.nextLine();

        // TODO: implementar o lógica de investimento
        
        System.out.println("Investimento realizado com sucesso!");
        System.out.println("Aperte ENTER para continuar...");

        if(this.scanner.hasNextLine()) {
            this.scanner.nextLine();
            navigator.goBack();
        }
    }
    
}
