package br.edu.curso.secao25.Helper;

import java.text.*;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class Utils {

    static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    static NumberFormat nf = new DecimalFormat("R$ #, ##0.00",
            new DecimalFormatSymbols(new Locale("pt", "BR")));

    public static String dateParaString(Date data){
        return Utils.sdf.format(data);
    }

    public static String doubleParaString(Double valor){
        return Utils.nf.format(valor);
    }

    public static Double stringParaDouble(String valor){
        try{
            return(Double)Utils.nf.parse(valor);
        }catch(ParseException e){
            return null;
        }
    }

    public static void pausar(int segundos){
        try{
            TimeUnit.SECONDS.sleep(segundos);
        }catch (InterruptedException e){
            System.out.println("Erro ao pausar por " + segundos + " segundos.");
        }
    }
}
