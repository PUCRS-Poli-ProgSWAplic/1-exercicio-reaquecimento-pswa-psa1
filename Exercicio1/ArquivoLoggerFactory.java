package Exercicio1;

public class ArquivoLoggerFactory implements LoggerFactory {
    @Override
    public Logger createLogger(){
        return new ArquivoLogger();
    }
}
