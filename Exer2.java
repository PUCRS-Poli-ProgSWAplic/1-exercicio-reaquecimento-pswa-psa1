import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

interface Logger {
    void log(String mensagem);
    }
    
    class ConsoleLogger implements Logger{
        @Override
        public void log(String mensagem){
            System.out.println(mensagem);
        }
    }
    
    class  ArquivoLogger implements Logger{
    
        private String nomeArquivo;
        
        public ArquivoLogger(String nomeArquivo){
            this.nomeArquivo = nomeArquivo;
        }
    
        @Override
        public void log(String mensagem){
            try(PrintWriter writer = new PrintWriter(new FileWriter(nomeArquivo,true))){
                writer.println(mensagem);
            }catch(IOException e){
                e.printStackTrace();
            }
        }
    }
    
    class LoggerFactory{
        public static Logger getLogger(String type){
            if ("console".equalsIgnoreCase(type)) {
                return new ConsoleLogger();
            }else if ("arquivo".equalsIgnoreCase(type)) {
                return new ArquivoLogger("log.txt");
            } else {
                throw new IllegalArgumentException("Tipo inválido de log: " + type);
            }
        }
    }
public class Exer2 {
    public static void main(String[] args) {
        if (args.length!=1 || !args[0].equalsIgnoreCase("arquivo") && !args[0].equalsIgnoreCase("console")) {
            System.out.println("Uso: java Main <Escolha o tipo de log: ARQUIVO OU CONSOLE>");
            return;
        }
        Logger logger = LoggerFactory.getLogger(args[0]);
        for(int i=1;i<=10;i++){
            logger.log("Contagem: " + i);
        }
    }
}
