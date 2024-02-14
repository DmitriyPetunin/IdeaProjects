package ru.itis.inf304.homeWork0612;

import java.math.BigDecimal;
import java.math.RoundingMode;
public class TradeRequest {

    private int amount;// кол-во товара
    private BigDecimal total; // полная стоимость

    public TradeRequest(int amount, BigDecimal total)  {
        setAmount(amount);
        setTotal(total);
        setTotalScale(total);
        this.amount = amount;
        this.total = total;
    }
    public int getAmount() {
        return amount;
    }
    public int getTotalPrice() {
        return (int) (amount * total.doubleValue());
    }

    public void setAmount(int amount) throws InvalidAmountException {
        if (amount <= 0) {
            throw new InvalidAmountException();
        }
        this.amount = amount;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) throws InvalidTotalException {
        if (total.compareTo(BigDecimal.ZERO) < 0) {
            throw new InvalidTotalException();
        }
        this.total = total;
    }
    public void setTotalScale(BigDecimal total) throws InvalidTotalScaleException {
        if (total.scale() > 2) {
            throw new InvalidTotalScaleException(total.scale(),2);
        }
    }
    public int getTotalScale() {
        return total.scale();
    }
}