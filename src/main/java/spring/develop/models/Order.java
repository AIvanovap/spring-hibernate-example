package spring.develop.models;

import javax.persistence.*;


@Entity(name = "orders")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Order
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int orderId;

    @Column(name = "clientEmail", length = 20, nullable = false)
    private String clientEmail;

    @Column(name = "clientName", length = 100, nullable = false)
    private String clientName;

    @Column(name = "message", length = 100, nullable = false)
    private String message;

    public Order() {
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getClientEmail() {
        return clientEmail;
    }

    public void setClientEmail(String clientEmail) {
        this.clientEmail = clientEmail;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    @Override
    public String toString(){
return " orderID: " +  getOrderId() +
        " clientName: " + getClientName() +
        " clientEmail: " + getClientEmail() +
        " message: " + getMessage();
    }
}
