package Exercicio1;
public class Exercicio {

    String arquivo;
    String console;

    public static void main(String[] args) {
        
        if (args.length!=1 || (!args[0].equals("arquivo") && !args[0].equals("console"))) {
            System.out.println("Uso: java Main [arquivo|console]");
            return;
        }

        LoggerFactory loggerFactory;

        if (args[0].equals("arquivo")) {
            loggerFactory = new ArquivoLoggerFactory();
        }
        else {
            loggerFactory = new ConsoleLoggerFactory();
        }

        Logger logger =  loggerFactory.createLogger();

        for(int i=1; i<=10; i++){
            logger.log("número: " + i);
        }
        System.out.println(logger);
    }
    
}