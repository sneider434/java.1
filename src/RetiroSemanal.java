public class RetiroSemanal {
    public static void main(String[] args) {
        double saldoInicial = 1000.0;
        double retiroSemanal = 200.0;
        int semanasEnUnMes = 4;

        double saldoFinal = saldoInicial - (retiroSemanal * semanasEnUnMes);

        System.out.println("Saldo inicial: $" + saldoInicial);
        System.out.println("Retiro semanal: $" + retiroSemanal);
        System.out.println("Semanas en un mes: " + semanasEnUnMes);
        System.out.println("Saldo final al final del mes: $" + saldoFinal);
    }
}
