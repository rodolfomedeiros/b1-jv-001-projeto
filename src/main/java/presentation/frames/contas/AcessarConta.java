package presentation.frames.contas;

import java.util.HashMap;

import presentation.navigation.Frame;
import presentation.navigation.Navigator;

public class AcessarConta extends Frame {

    public AcessarConta(String key, Navigator navigator, HashMap<String, Object> params) {
        super(key, navigator, params);
    }

    @Override
    public void setup() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void render() {
        System.out.println(this.params);
        
    }
    
}
