package Exercicio1;

import java.io.FileWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class ArquivoLogger implements Logger{
   @Override
   public void log(String mensagem){
    try(FileWriter writer = new FileWriter("log.txt",true)) {
        String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-mm-dd HH:mm:ss"));
        writer.write("[" + timestamp + "]" + mensagem + "\n");
    } catch (Exception e) {
        // TODO: handle exception
        System.err.println(mensagem);
    }
   } 
}
