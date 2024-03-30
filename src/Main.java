import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Date data = new Date();

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(data);

        int ultimoDiaDoMes = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);

        calendar.set(Calendar.DAY_OF_MONTH, ultimoDiaDoMes);

        Date dataFinal = calendar.getTime();

        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

        String dataFormatada = formato.format(dataFinal);
        System.out.println("O último dia do mês é: " + dataFormatada);
    }
}