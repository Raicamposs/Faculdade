
public class Temporizadores {
    
  long fistTime, lastTime, tempoUsado;
    
    void iniciarTemporizador() {
        fistTime = System.currentTimeMillis();
    }

    void terminarTemporizador() {
        lastTime = System.currentTimeMillis();
    }

    float tempoUsado() {
        tempoUsado = lastTime - fistTime;
        return tempoUsado;
    }
}
