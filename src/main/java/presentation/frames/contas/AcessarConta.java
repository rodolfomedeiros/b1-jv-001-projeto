package presentation.frames.contas;

import java.util.HashMap;

import br.bb.ContaCorrente;
import br.bb.ContaInvestimento;
import br.bb.ContaPoupanca;
import presentation.navigation.Frame;
import presentation.navigation.Navigator;

public class AcessarConta extends Frame {
    private String codigoConta;

    public AcessarConta(String key, Navigator navigator) {
        super(key, navigator);
    }

    @Override
    public void render() {
        System.out.println("-- ACESSAR CONTA --");
        System.out.println("Digite o código da conta: ");

        codigoConta = this.scanner.nextLine();

        // TODO: implementar o lógica de acesso à conta

        // HashMap<String, Object> params = new HashMap<>();
        // params.put("conta", conta);
        
        // this.navigator.navigate("conta", params);
    }
    
}
