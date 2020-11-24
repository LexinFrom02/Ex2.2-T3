public class CreditPaymentService {
    public double creditPayment(double creditAmount, double creditPeriod, double creditRate) {

        // Размер аннуитетного платежа рассчитывается по формуле
        // A = K * S, где A - ежемесячный платеж, K - коэффициент аннуитета, S - сумма выдаваемого кредита.
        // K = i * (1 + i)n / ((1 + i)n - 1), где
        //i — месячная процентная ставка (годовая ставка / 12 / 100);
        //n — количество месяцев, в течение которых выплачивается кредит.
        // т.к. метод Math.pow на вход принимает только примитивные типы, объявим переменные
        double toPrimitive1 = 1 + (creditRate / 12 / 100);
        double toPrimitive2 = Math.pow(toPrimitive1, creditPeriod);

        double annuitetCoef = ((creditRate / 12 / 100) * toPrimitive2) / (toPrimitive2 - 1);
        double monthlyPayment = annuitetCoef * creditAmount;

        return monthlyPayment;
    }
}
